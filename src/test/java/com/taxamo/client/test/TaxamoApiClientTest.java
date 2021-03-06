package com.taxamo.client.test;

/*
*  Copyright 2014 Taxamo, Ltd.
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

import com.taxamo.client.api.TaxamoApi;
import com.taxamo.client.common.ApiException;
import com.taxamo.client.model.*;
import org.junit.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class TaxamoApiClientTest {

    TaxamoApi api = new TaxamoApi("SamplePrivateTestKey1");

    @Test
    public void testCreateTransaction() throws Exception {

        CreateTransactionOut createTransactionOut = api.createTransaction(new CreateTransactionIn()
                .setTransaction(new InputTransaction()
                        .setCurrencyCode("USD")
                        .setBuyerIp("127.0.0.1")
                        .setBillingCountryCode("IE")
                        .setForceCountryCode("FR")
                        .setBuyerEmail("test@taxamo.com")
                        .setOrderDate("2014-06-01")
                        .setTransactionLines(Arrays.asList(
                                new InputTransactionLine()
                                        .setAmount(new BigDecimal(200))
                                        .setCustomId("line1"),
                                new InputTransactionLine()
                                        .setAmount(new BigDecimal(100))
                                        .setCustomId("line2")
                                        .setProductType("e-book")))));
        Transaction transaction = createTransactionOut.getTransaction();
        TransactionLines line1 = null, line2 = null;

        for (TransactionLines line : transaction.getTransactionLines()) {
            if (line.getCustomId().equals("line1")) {
                line1 = line;
            }
            if (line.getCustomId().equals("line2")) {
                line2 = line;
            }
        }

        Assert.assertNotNull(line1);
        Assert.assertNotNull(line2);

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("IE", transaction.getCountries().getDetected().getCode());
        Assert.assertEquals(300.0, transaction.getAmount().doubleValue(), 0.1);
        Assert.assertEquals(45.50, transaction.getTaxAmount().doubleValue(), 0.1);
        Assert.assertEquals(345.50, transaction.getTotalAmount().doubleValue(), 0.1);
        Assert.assertEquals("N", transaction.getStatus());

        Assert.assertEquals("line1", line1.getCustomId());
        Assert.assertEquals(200, line1.getAmount().doubleValue(), 0.1);
        Assert.assertEquals("line2", line2.getCustomId());
        Assert.assertEquals(100, line2.getAmount().doubleValue(), 0.1);

        transaction = api.getTransaction(transaction.getKey()).getTransaction();

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals(300.0, transaction.getAmount().doubleValue(), 0.1);
        Assert.assertEquals(45.50, transaction.getTaxAmount().doubleValue(), 0.1);
        Assert.assertEquals(345.50, transaction.getTotalAmount().doubleValue(), 0.1);
        Assert.assertEquals("N", transaction.getStatus());
        Assert.assertEquals("test@taxamo.com", transaction.getBuyerEmail());

        Assert.assertEquals("IE", transaction.getEvidence().getByIp().getResolvedCountryCode());
        Assert.assertEquals("IE", transaction.getEvidence().getByBilling().getResolvedCountryCode());
        Assert.assertEquals("FR", transaction.getEvidence().getForced().getResolvedCountryCode());

        for (TransactionLines line : transaction.getTransactionLines()) {
            if (line.getCustomId().equals("line1")) {
                line1 = line;
            }
            if (line.getCustomId().equals("line2")) {
                line2 = line;
            }
        }

        Assert.assertNotNull(line1);
        Assert.assertNotNull(line2);

        Assert.assertEquals("line1", line1.getCustomId());
        Assert.assertEquals(200, line1.getAmount().doubleValue(), 0.1);
        Assert.assertEquals("line2", line2.getCustomId());
        Assert.assertEquals(100, line2.getAmount().doubleValue(), 0.1);

        transaction = api.updateTransaction(transaction.getKey(), new UpdateTransactionIn()
                .setTransaction(new Transaction()
                        .setBuyerName("Java Test #5")
                        .setCurrencyCode("CHF")
                        .setInvoiceAddress(new InvoiceAddress().setStreetName("Test street #5"))
                        .setTransactionLines(Arrays.asList(new TransactionLines[] {
                                new TransactionLines().setAmount(new BigDecimal(30)).setCustomId("line1"),
                                new TransactionLines().setAmount(new BigDecimal(40)).setCustomId("line2").setProductType("e-book")
                        }))
                )).getTransaction();

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("Java Test #5", transaction.getBuyerName());
        Assert.assertEquals("Test street #5", transaction.getInvoiceAddress().getStreetName());
        Assert.assertEquals(70.0, transaction.getAmount().doubleValue(), 0.1);
        Assert.assertEquals(8.2, transaction.getTaxAmount().doubleValue(), 0.1);
        Assert.assertEquals(78.2, transaction.getTotalAmount().doubleValue(), 0.1);
        Assert.assertEquals("N", transaction.getStatus());
        Assert.assertEquals("2014-06-01T00:00:00Z", transaction.getOrderDate());

        for (TransactionLines line : transaction.getTransactionLines()) {
            if (line.getCustomId().equals("line1")) {
                line1 = line;
            }
            if (line.getCustomId().equals("line2")) {
                line2 = line;
            }
        }

        Assert.assertNotNull(line1);
        Assert.assertNotNull(line2);

        Assert.assertEquals("line1", line1.getCustomId());
        Assert.assertEquals(30.0, line1.getAmount().doubleValue(), 0.1);
        Assert.assertEquals("line2", line2.getCustomId());
        Assert.assertEquals(40.0, line2.getAmount().doubleValue(), 0.1);


        transaction = api.getTransaction(transaction.getKey()).getTransaction();

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("Java Test #5", transaction.getBuyerName());
        Assert.assertEquals("Test street #5", transaction.getInvoiceAddress().getStreetName());
        Assert.assertEquals(70.0, transaction.getAmount().doubleValue(), 0.1);
        Assert.assertEquals(8.2, transaction.getTaxAmount().doubleValue(), 0.1);
        Assert.assertEquals(78.2, transaction.getTotalAmount().doubleValue(), 0.1);
        Assert.assertEquals("N", transaction.getStatus());
        Assert.assertEquals("2014-06-01T00:00:00Z", transaction.getOrderDate());

        Assert.assertEquals("IE", transaction.getEvidence().getByIp().getResolvedCountryCode());
        Assert.assertEquals("IE", transaction.getEvidence().getByBilling().getResolvedCountryCode());
        Assert.assertEquals("FR", transaction.getEvidence().getForced().getResolvedCountryCode());

        for (TransactionLines line : transaction.getTransactionLines()) {
            if (line.getCustomId().equals("line1")) {
                line1 = line;
            }
            if (line.getCustomId().equals("line2")) {
                line2 = line;
            }
        }

        Assert.assertNotNull(line1);
        Assert.assertNotNull(line2);

        Assert.assertEquals("line1", line1.getCustomId());
        Assert.assertEquals(30.0, line1.getAmount().doubleValue(), 0.1);
        Assert.assertEquals("line2", line2.getCustomId());
        Assert.assertEquals(40.0, line2.getAmount().doubleValue(), 0.1);

        transaction = api.confirmTransaction(transaction.getKey(), new ConfirmTransactionIn()).getTransaction();

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("Java Test #5", transaction.getBuyerName());
        Assert.assertEquals("Test street #5", transaction.getInvoiceAddress().getStreetName());
        Assert.assertEquals(70.0, transaction.getAmount().doubleValue(), 0.1);
        Assert.assertEquals(8.2, transaction.getTaxAmount().doubleValue(), 0.1);
        Assert.assertEquals(78.2, transaction.getTotalAmount().doubleValue(), 0.1);
        Assert.assertEquals("C", transaction.getStatus());
        Assert.assertEquals("2014-06-01T00:00:00Z", transaction.getOrderDate());

        transaction = api.getTransaction(transaction.getKey()).getTransaction();

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("Java Test #5", transaction.getBuyerName());
        Assert.assertEquals("Test street #5", transaction.getInvoiceAddress().getStreetName());
        Assert.assertEquals(70.0, transaction.getAmount().doubleValue(), 0.1);
        Assert.assertEquals(8.2, transaction.getTaxAmount().doubleValue(), 0.1);
        Assert.assertEquals(78.2, transaction.getTotalAmount().doubleValue(), 0.1);
        Assert.assertEquals("C", transaction.getStatus());
        Assert.assertEquals("2014-06-01T00:00:00Z", transaction.getOrderDate());

        Assert.assertEquals("IE", transaction.getEvidence().getByIp().getResolvedCountryCode());
        Assert.assertEquals("IE", transaction.getEvidence().getByBilling().getResolvedCountryCode());
        Assert.assertEquals("FR", transaction.getEvidence().getForced().getResolvedCountryCode());

        for (TransactionLines line : transaction.getTransactionLines()) {
            if (line.getCustomId().equals("line1")) {
                line1 = line;
            }
            if (line.getCustomId().equals("line2")) {
                line2 = line;
            }
        }

        Assert.assertNotNull(line1);
        Assert.assertNotNull(line2);

        Assert.assertEquals("line1", line1.getCustomId());
        Assert.assertEquals(30.0, line1.getAmount().doubleValue(), 0.1);
        Assert.assertEquals("line2", line2.getCustomId());
        Assert.assertEquals(40.0, line2.getAmount().doubleValue(), 0.1);
    }

    @Test()
    public void testErrorHandling() throws Exception {
        TaxamoApi badApi = new TaxamoApi("IncorrectToken");

        ApiException apiException = null;

        try {
            badApi.createTransaction(new CreateTransactionIn()
                    .setTransaction(new InputTransaction()
                            .setCurrencyCode("USD")
                            .setBuyerIp("127.0.0.1")
                            .setBillingCountryCode("IE")
                            .setForceCountryCode("FR")
                            .setOrderDate("2014-06-01")
                            .setTransactionLines(Arrays.asList(
                                    new InputTransactionLine()
                                            .setAmount(new BigDecimal(200))
                                            .setCustomId("line1"),
                                    new InputTransactionLine()
                                            .setAmount(new BigDecimal(100))
                                            .setCustomId("line2")
                                            .setProductType("e-book")))));
        } catch (ApiException e) {
            apiException = e;
        }
        Assert.assertNotNull(apiException);
        Assert.assertEquals(apiException.getCode(), 401);

        try {
            api.createTransaction(new CreateTransactionIn()
                    .setTransaction(new InputTransaction()
                            .setTransactionLines(Arrays.asList(
                                    new InputTransactionLine()
                                            .setAmount(new BigDecimal(200))
                                            .setCustomId("line1"),
                                    new InputTransactionLine()
                                            .setAmount(new BigDecimal(100))
                                            .setCustomId("line2")
                                            .setProductType("e-book")))));
        } catch (ApiException e) {
            apiException = e;
        }
        Assert.assertNotNull(apiException);
        Assert.assertEquals(apiException.getCode(), 400);

        Assert.assertNull(api.getTransaction("non_existing_key"));


        ApiException clientHandlerException = null;
        badApi.setBasePath("http://nonexisting.taxamo.com:3000/");
        try {
            badApi.createTransaction(new CreateTransactionIn()
                    .setTransaction(new InputTransaction()
                            .setCurrencyCode("USD")
                            .setBuyerIp("127.0.0.1")
                            .setBillingCountryCode("IE")
                            .setForceCountryCode("FR")
                            .setOrderDate("2014-06-01")
                            .setTransactionLines(Arrays.asList(
                                    new InputTransactionLine()
                                            .setAmount(new BigDecimal(200))
                                            .setCustomId("line1"),
                                    new InputTransactionLine()
                                            .setAmount(new BigDecimal(100))
                                            .setCustomId("line2")
                                            .setProductType("e-book")))));
        } catch (ApiException e) {
            clientHandlerException = e;
        }
        Assert.assertNotNull(clientHandlerException);
    }

    @Test
    public void testNewEvidenceFields() throws Exception {
        CreateTransactionOut createTransactionOut = api.createTransaction(new CreateTransactionIn()
                .setTransaction(new InputTransaction()
                        .setCurrencyCode("USD")
                        .setBillingCountryCode("GR")
                        .setEvidence(new Evidence()
                                .setOtherCommerciallyRelevantInfo(new EvidenceSchema().setEvidenceValue("GR"))
                                .setSelfDeclaration(new EvidenceSchema().setEvidenceValue("GR")))
                        .setBuyerEmail("test@taxamo.com")
                        .setOrderDate("2014-06-01")
                        .setTransactionLines(Arrays.asList(
                                new InputTransactionLine()
                                        .setAmount(new BigDecimal(200))
                                        .setCustomId("line1"),
                                new InputTransactionLine()
                                        .setAmount(new BigDecimal(100))
                                        .setCustomId("line2")
                                        .setProductType("e-book")))));
        Transaction transaction = createTransactionOut.getTransaction();
        TransactionLines line1 = null, line2 = null;

        for (TransactionLines line : transaction.getTransactionLines()) {
            if (line.getCustomId().equals("line1")) {
                line1 = line;
            }
            if (line.getCustomId().equals("line2")) {
                line2 = line;
            }
        }

        Assert.assertNotNull(line1);
        Assert.assertNotNull(line2);

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("GR", transaction.getCountries().getDetected().getCode());
        Assert.assertEquals("GR", transaction.getCountries().getOtherCommerciallyRelevantInfo().getCode());
        Assert.assertEquals("GR", transaction.getCountries().getSelfDeclaration().getCode());
        Assert.assertEquals("GR", transaction.getCountries().getByBilling().getCode());

        transaction = api.getTransaction(transaction.getKey()).getTransaction();

        Assert.assertNotNull(transaction.getKey());
        Assert.assertEquals("GR", transaction.getTaxCountryCode());
        Assert.assertEquals("GR", transaction.getEvidence().getOtherCommerciallyRelevantInfo().getEvidenceValue());
        Assert.assertEquals("GR", transaction.getEvidence().getSelfDeclaration().getEvidenceValue());
        Assert.assertEquals("GR", transaction.getEvidence().getByBilling().getEvidenceValue());


    }

    @Test
    public void testValidateVATNumber() throws Exception {
        ValidateTaxNumberOut validateTaxNumberOut = api.validateTaxNumber("IE", "6388047V");
        Assert.assertEquals(Boolean.TRUE, validateTaxNumberOut.getBuyerTaxNumberValid());
    }

    @Test
    public void testSimpleArrayDeserialization() throws Exception {
        GetCountriesDictOut countriesDict = api.getCountriesDict(false);
        for (CountrySchema cs : countriesDict.getDictionary()) {
            if ("PL".equals(cs.getCode())) {
                Assert.assertFalse(cs.getCallingCode().isEmpty());
            }
        }
    }

}
