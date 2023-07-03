/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.reporting;

import java.util.HashMap;

public class ThreePMMapping {
    public static String get3PMIndicatorId(String indicatorDisaggr) {

        HashMap<String, String> map = new HashMap<String, String>();

       // Care & Treatment
        map.put("CTV3: Current on treatment-01", "FEyLrThIhS3-slGBtK9NsjZ");
        map.put("CTV3: Current on treatment-02", "FEyLrThIhS3-RL2LAAV8h9r");
        map.put("CTV3: Current on treatment-03", "FEyLrThIhS3-ja1pGb0xZqC");
        map.put("CTV3: Current on treatment-04", "FEyLrThIhS3-Aoyz53eT06v");
        map.put("CTV3: Current on treatment-05", "FEyLrThIhS3-B49DkRhRjFU");
        map.put("CTV3: Current on treatment-06", "FEyLrThIhS3-jWGYebQ1pCn");
        map.put("CTV3: Current on treatment-07", "FEyLrThIhS3-haYMHQSFfFi");
        map.put("CTV3: Current on treatment-08", "FEyLrThIhS3-ZhI3TLG2Iea");

        map.put("CTV3: On DTG-based regimen-01","NMk500a98zP-slGBtK9NsjZ");
        map.put("CTV3: On DTG-based regimen-02","NMk500a98zP-RL2LAAV8h9r");
        map.put("CTV3: On DTG-based regimen-03","NMk500a98zP-ja1pGb0xZqC");
        map.put("CTV3: On DTG-based regimen-04","NMk500a98zP-Aoyz53eT06v");
        map.put("CTV3: On DTG-based regimen-05","NMk500a98zP-B49DkRhRjFU");
        map.put("CTV3: On DTG-based regimen-06","NMk500a98zP-jWGYebQ1pCn");
        map.put("CTV3: On DTG-based regimen-07","NMk500a98zP-haYMHQSFfFi");
        map.put("CTV3: On DTG-based regimen-08","NMk500a98zP-ZhI3TLG2Iea");

        map.put("CTV3: Stopped treatment-01","a93ZnTk0bBs-slGBtK9NsjZ");
        map.put("CTV3: Stopped treatment-02","a93ZnTk0bBs-RL2LAAV8h9r");
        map.put("CTV3: Stopped treatment-03","a93ZnTk0bBs-ja1pGb0xZqC");
        map.put("CTV3: Stopped treatment-04","a93ZnTk0bBs-Aoyz53eT06v");
        map.put("CTV3: Stopped treatment-05","a93ZnTk0bBs-B49DkRhRjFU");
        map.put("CTV3: Stopped treatment-06","a93ZnTk0bBs-jWGYebQ1pCn");
        map.put("CTV3: Stopped treatment-07","a93ZnTk0bBs-haYMHQSFfFi");
        map.put("CTV3: Stopped treatment-08","a93ZnTk0bBs-ZhI3TLG2Iea");

        map.put("CTV3: Lost (LTFU) (> 30 days)-01","AceTOuNrxjX-slGBtK9NsjZ");
        map.put("CTV3: Lost (LTFU) (> 30 days)-02","AceTOuNrxjX-RL2LAAV8h9r");
        map.put("CTV3: Lost (LTFU) (> 30 days)-03","AceTOuNrxjX-ja1pGb0xZqC");
        map.put("CTV3: Lost (LTFU) (> 30 days)-04","AceTOuNrxjX-Aoyz53eT06v");
        map.put("CTV3: Lost (LTFU) (> 30 days)-05","AceTOuNrxjX-B49DkRhRjFU");
        map.put("CTV3: Lost (LTFU) (> 30 days)-06","AceTOuNrxjX-jWGYebQ1pCn");
        map.put("CTV3: Lost (LTFU) (> 30 days)-07","AceTOuNrxjX-haYMHQSFfFi");
        map.put("CTV3: Lost (LTFU) (> 30 days)-08","AceTOuNrxjX-ZhI3TLG2Iea");

        map.put("CTV3: Current on treatment - (Number with Hypertension)-01","kw898hEHmOr-slGBtK9NsjZ");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-02","kw898hEHmOr-RL2LAAV8h9r");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-03","kw898hEHmOr-ja1pGb0xZqC");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-04","kw898hEHmOr-Aoyz53eT06v");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-05","kw898hEHmOr-B49DkRhRjFU");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-06","kw898hEHmOr-jWGYebQ1pCn");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-07","kw898hEHmOr-haYMHQSFfFi");
        map.put("CTV3: Current on treatment - (Number with Hypertension)-08","kw898hEHmOr-ZhI3TLG2Iea");

        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-01","Ay7s58hdbxW-slGBtK9NsjZ");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-02","Ay7s58hdbxW-RL2LAAV8h9r");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-03","Ay7s58hdbxW-ja1pGb0xZqC");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-04","Ay7s58hdbxW-Aoyz53eT06v");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-05","Ay7s58hdbxW-B49DkRhRjFU");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-06","Ay7s58hdbxW-jWGYebQ1pCn");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-07","Ay7s58hdbxW-haYMHQSFfFi");
        map.put("CTV3: Current on treatment - (Number with Hypertension, well controlled)-08","Ay7s58hdbxW-ZhI3TLG2Iea");

        map.put("CTV3: Eligible for routine vl-01","Ag9cqaruIkv-slGBtK9NsjZ");
        map.put("CTV3: Eligible for routine vl-02","Ag9cqaruIkv-RL2LAAV8h9r");
        map.put("CTV3: Eligible for routine vl-03","Ag9cqaruIkv-ja1pGb0xZqC");
        map.put("CTV3: Eligible for routine vl-04","Ag9cqaruIkv-Aoyz53eT06v");
        map.put("CTV3: Eligible for routine vl-05","Ag9cqaruIkv-B49DkRhRjFU");
        map.put("CTV3: Eligible for routine vl-06","Ag9cqaruIkv-jWGYebQ1pCn");
        map.put("CTV3: Eligible for routine vl-07","Ag9cqaruIkv-haYMHQSFfFi");
        map.put("CTV3: Eligible for routine vl-08","Ag9cqaruIkv-ZhI3TLG2Iea");

        map.put("CTV3: Transfer outs-01","C1Vh1xi4yZw-slGBtK9NsjZ");
        map.put("CTV3: Transfer outs-02","C1Vh1xi4yZw-RL2LAAV8h9r");
        map.put("CTV3: Transfer outs-03","C1Vh1xi4yZw-ja1pGb0xZqC");
        map.put("CTV3: Transfer outs-04","C1Vh1xi4yZw-Aoyz53eT06v");
        map.put("CTV3: Transfer outs-05","C1Vh1xi4yZw-B49DkRhRjFU");
        map.put("CTV3: Transfer outs-06","C1Vh1xi4yZw-jWGYebQ1pCn");
        map.put("CTV3: Transfer outs-07","C1Vh1xi4yZw-haYMHQSFfFi");
        map.put("CTV3: Transfer outs-08","C1Vh1xi4yZw-ZhI3TLG2Iea");

        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-01","ENMPiMCwLdy-slGBtK9NsjZ");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-02","ENMPiMCwLdy-RL2LAAV8h9r");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-03","ENMPiMCwLdy-ja1pGb0xZqC");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-04","ENMPiMCwLdy-Aoyz53eT06v");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-05","ENMPiMCwLdy-B49DkRhRjFU");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-06","ENMPiMCwLdy-jWGYebQ1pCn");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-07","ENMPiMCwLdy-haYMHQSFfFi");
        map.put("CTV3: Current on treatment - (Number with Diabetes, well controlled)-08","ENMPiMCwLdy-ZhI3TLG2Iea");

        map.put("CTV3: With viral load results 200 - 999cp/ml-01","f7XdPzmNt5A-slGBtK9NsjZ");
        map.put("CTV3: With viral load results 200 - 999cp/ml-02","f7XdPzmNt5A-RL2LAAV8h9r");
        map.put("CTV3: With viral load results 200 - 999cp/ml-03","f7XdPzmNt5A-ja1pGb0xZqC");
        map.put("CTV3: With viral load results 200 - 999cp/ml-04","f7XdPzmNt5A-Aoyz53eT06v");
        map.put("CTV3: With viral load results 200 - 999cp/ml-05","f7XdPzmNt5A-B49DkRhRjFU");
        map.put("CTV3: With viral load results 200 - 999cp/ml-06","f7XdPzmNt5A-jWGYebQ1pCn");
        map.put("CTV3: With viral load results 200 - 999cp/ml-07","f7XdPzmNt5A-haYMHQSFfFi");
        map.put("CTV3: With viral load results 200 - 999cp/ml-08","f7XdPzmNt5A-ZhI3TLG2Iea");

        map.put("CTV3: On MMS/MMD/DSD-01","g2URVG9t2Zt-slGBtK9NsjZ");
        map.put("CTV3: On MMS/MMD/DSD-02","g2URVG9t2Zt-RL2LAAV8h9r");
        map.put("CTV3: On MMS/MMD/DSD-03","g2URVG9t2Zt-ja1pGb0xZqC");
        map.put("CTV3: On MMS/MMD/DSD-04","g2URVG9t2Zt-Aoyz53eT06v");
        map.put("CTV3: On MMS/MMD/DSD-05","g2URVG9t2Zt-B49DkRhRjFU");
        map.put("CTV3: On MMS/MMD/DSD-06","g2URVG9t2Zt-jWGYebQ1pCn");
        map.put("CTV3: On MMS/MMD/DSD-07","g2URVG9t2Zt-haYMHQSFfFi");
        map.put("CTV3: On MMS/MMD/DSD-08","g2URVG9t2Zt-ZhI3TLG2Iea");

        map.put("CTV3: New on treatment-01","jW4YS9IZ5xy-slGBtK9NsjZ");
        map.put("CTV3: New on treatment-02","jW4YS9IZ5xy-RL2LAAV8h9r");
        map.put("CTV3: New on treatment-03","jW4YS9IZ5xy-ja1pGb0xZqC");
        map.put("CTV3: New on treatment-04","jW4YS9IZ5xy-Aoyz53eT06v");
        map.put("CTV3: New on treatment-05","jW4YS9IZ5xy-B49DkRhRjFU");
        map.put("CTV3: New on treatment-06","jW4YS9IZ5xy-jWGYebQ1pCn");
        map.put("CTV3: New on treatment-07","jW4YS9IZ5xy-haYMHQSFfFi");
        map.put("CTV3: New on treatment-08","jW4YS9IZ5xy-ZhI3TLG2Iea");

        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-01","qRey76zo22U-slGBtK9NsjZ");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-02","qRey76zo22U-RL2LAAV8h9r");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-03","qRey76zo22U-ja1pGb0xZqC");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-04","qRey76zo22U-Aoyz53eT06v");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-05","qRey76zo22U-B49DkRhRjFU");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-06","qRey76zo22U-jWGYebQ1pCn");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-07","qRey76zo22U-haYMHQSFfFi");
        map.put("CTV3: Previously lost but returned to treatment (Tx_RTT)-08","qRey76zo22U-ZhI3TLG2Iea");

        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-01","Pa2rsZAcORE-slGBtK9NsjZ");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-02","Pa2rsZAcORE-RL2LAAV8h9r");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-03","Pa2rsZAcORE-ja1pGb0xZqC");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-04","Pa2rsZAcORE-Aoyz53eT06v");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-05","Pa2rsZAcORE-B49DkRhRjFU");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-06","Pa2rsZAcORE-jWGYebQ1pCn");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-07","Pa2rsZAcORE-haYMHQSFfFi");
        map.put("CTV3: With vl results < 400cp/ml (includes LDL)-08","Pa2rsZAcORE-ZhI3TLG2Iea");

        map.put("CTV3: Number switched to 3rd line-01","ZdrEgOTb0vy-slGBtK9NsjZ");
        map.put("CTV3: Number switched to 3rd line-02","ZdrEgOTb0vy-RL2LAAV8h9r");
        map.put("CTV3: Number switched to 3rd line-03","ZdrEgOTb0vy-ja1pGb0xZqC");
        map.put("CTV3: Number switched to 3rd line-04","ZdrEgOTb0vy-Aoyz53eT06v");
        map.put("CTV3: Number switched to 3rd line-05","ZdrEgOTb0vy-B49DkRhRjFU");
        map.put("CTV3: Number switched to 3rd line-06","ZdrEgOTb0vy-jWGYebQ1pCn");
        map.put("CTV3: Number switched to 3rd line-07","ZdrEgOTb0vy-haYMHQSFfFi");
        map.put("CTV3: Number switched to 3rd line-08","ZdrEgOTb0vy-ZhI3TLG2Iea");

        map.put("CTV3: With vl results >= 1000cp/ml-01","mCdYS5pHbVH-slGBtK9NsjZ");
        map.put("CTV3: With vl results >= 1000cp/ml-02","mCdYS5pHbVH-RL2LAAV8h9r");
        map.put("CTV3: With vl results >= 1000cp/ml-03","mCdYS5pHbVH-ja1pGb0xZqC");
        map.put("CTV3: With vl results >= 1000cp/ml-04","mCdYS5pHbVH-Aoyz53eT06v");
        map.put("CTV3: With vl results >= 1000cp/ml-05","mCdYS5pHbVH-B49DkRhRjFU");
        map.put("CTV3: With vl results >= 1000cp/ml-06","mCdYS5pHbVH-jWGYebQ1pCn");
        map.put("CTV3: With vl results >= 1000cp/ml-07","mCdYS5pHbVH-haYMHQSFfFi");
        map.put("CTV3: With vl results >= 1000cp/ml-08","mCdYS5pHbVH-ZhI3TLG2Iea");

        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-01","ueetqhbPA3s-slGBtK9NsjZ");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-02","ueetqhbPA3s-RL2LAAV8h9r");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-03","ueetqhbPA3s-ja1pGb0xZqC");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-04","ueetqhbPA3s-Aoyz53eT06v");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-05","ueetqhbPA3s-B49DkRhRjFU");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-06","ueetqhbPA3s-jWGYebQ1pCn");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-07","ueetqhbPA3s-haYMHQSFfFi");
        map.put("CTV3: Current on treatment - (Number with NCD well controlled)-08","ueetqhbPA3s-ZhI3TLG2Iea");

        map.put("CTV3: Number switched to 2nd line-01","qubwkZK8CxM-slGBtK9NsjZ");
        map.put("CTV3: Number switched to 2nd line-02","qubwkZK8CxM-RL2LAAV8h9r");
        map.put("CTV3: Number switched to 2nd line-03","qubwkZK8CxM-ja1pGb0xZqC");
        map.put("CTV3: Number switched to 2nd line-04","qubwkZK8CxM-Aoyz53eT06v");
        map.put("CTV3: Number switched to 2nd line-05","qubwkZK8CxM-B49DkRhRjFU");
        map.put("CTV3: Number switched to 2nd line-06","qubwkZK8CxM-jWGYebQ1pCn");
        map.put("CTV3: Number switched to 2nd line-07","qubwkZK8CxM-haYMHQSFfFi");
        map.put("CTV3: Number switched to 2nd line-08","qubwkZK8CxM-ZhI3TLG2Iea");

        map.put("CTV3: Transfer ins-01","PtWHwRBbvov-slGBtK9NsjZ");
        map.put("CTV3: Transfer ins-02","PtWHwRBbvov-RL2LAAV8h9r");
        map.put("CTV3: Transfer ins-03","PtWHwRBbvov-ja1pGb0xZqC");
        map.put("CTV3: Transfer ins-04","PtWHwRBbvov-Aoyz53eT06v");
        map.put("CTV3: Transfer ins-05","PtWHwRBbvov-B49DkRhRjFU");
        map.put("CTV3: Transfer ins-06","PtWHwRBbvov-jWGYebQ1pCn");
        map.put("CTV3: Transfer ins-07","PtWHwRBbvov-haYMHQSFfFi");
        map.put("CTV3: Transfer ins-08","PtWHwRBbvov-ZhI3TLG2Iea");

        map.put("CTV3: Current on treatment - (Number with Diabetes)-01","ysonYfgb8uf-slGBtK9NsjZ");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-02","ysonYfgb8uf-RL2LAAV8h9r");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-03","ysonYfgb8uf-ja1pGb0xZqC");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-04","ysonYfgb8uf-Aoyz53eT06v");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-05","ysonYfgb8uf-B49DkRhRjFU");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-06","ysonYfgb8uf-jWGYebQ1pCn");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-07","ysonYfgb8uf-haYMHQSFfFi");
        map.put("CTV3: Current on treatment - (Number with Diabetes)-08","ysonYfgb8uf-ZhI3TLG2Iea");

        map.put("CTV3: Died-01","p3Sa9IVj3CA-slGBtK9NsjZ");
        map.put("CTV3: Died-02","p3Sa9IVj3CA-RL2LAAV8h9r");
        map.put("CTV3: Died-03","p3Sa9IVj3CA-ja1pGb0xZqC");
        map.put("CTV3: Died-04","p3Sa9IVj3CA-Aoyz53eT06v");
        map.put("CTV3: Died-05","p3Sa9IVj3CA-B49DkRhRjFU");
        map.put("CTV3: Died-06","p3Sa9IVj3CA-jWGYebQ1pCn");
        map.put("CTV3: Died-07","p3Sa9IVj3CA-haYMHQSFfFi");
        map.put("CTV3: Died-08","p3Sa9IVj3CA-ZhI3TLG2Iea");

        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-01","zLhsbMB7rtv-slGBtK9NsjZ");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-02","zLhsbMB7rtv-RL2LAAV8h9r");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-03","zLhsbMB7rtv-ja1pGb0xZqC");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-04","zLhsbMB7rtv-Aoyz53eT06v");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-05","zLhsbMB7rtv-B49DkRhRjFU");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-06","zLhsbMB7rtv-jWGYebQ1pCn");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-07","zLhsbMB7rtv-haYMHQSFfFi");
        map.put("CTV3: With viral load results < 200cp/ml (includes LDL)-08","zLhsbMB7rtv-ZhI3TLG2Iea");

        map.put("CTV3: With vl results 400 - 999cp/ml-01","lfQdvUNwJiZ-slGBtK9NsjZ");
        map.put("CTV3: With vl results 400 - 999cp/ml-02","lfQdvUNwJiZ-RL2LAAV8h9r");
        map.put("CTV3: With vl results 400 - 999cp/ml-03","lfQdvUNwJiZ-ja1pGb0xZqC");
        map.put("CTV3: With vl results 400 - 999cp/ml-04","lfQdvUNwJiZ-Aoyz53eT06v");
        map.put("CTV3: With vl results 400 - 999cp/ml-05","lfQdvUNwJiZ-B49DkRhRjFU");
        map.put("CTV3: With vl results 400 - 999cp/ml-06","lfQdvUNwJiZ-jWGYebQ1pCn");
        map.put("CTV3: With vl results 400 - 999cp/ml-07","lfQdvUNwJiZ-haYMHQSFfFi");
        map.put("CTV3: With vl results 400 - 999cp/ml-08","lfQdvUNwJiZ-ZhI3TLG2Iea");

        //HTS - IPD
        map.put("HTSV3: IPD HP - eligible-01","Eovs26khBBu-slGBtK9NsjZ");
        map.put("HTSV3: IPD HP - eligible-02","Eovs26khBBu-RL2LAAV8h9r");
        map.put("HTSV3: IPD HP - eligible-03","Eovs26khBBu-ja1pGb0xZqC");
        map.put("HTSV3: IPD HP - eligible-04","Eovs26khBBu-Aoyz53eT06v");
        map.put("HTSV3: IPD HP - eligible-05","Eovs26khBBu-B49DkRhRjFU");
        map.put("HTSV3: IPD HP - eligible-06","Eovs26khBBu-jWGYebQ1pCn");
        map.put("HTSV3: IPD HP - eligible-07","Eovs26khBBu-haYMHQSFfFi");
        map.put("HTSV3: IPD HP - eligible-08","Eovs26khBBu-ZhI3TLG2Iea");

        map.put("HTSV3: IPD HP - known positive-01","bmBqZJh5Vj0-slGBtK9NsjZ");
        map.put("HTSV3: IPD HP - known positive-02","bmBqZJh5Vj0-RL2LAAV8h9r");
        map.put("HTSV3: IPD HP - known positive-03","bmBqZJh5Vj0-ja1pGb0xZqC");
        map.put("HTSV3: IPD HP - known positive-04","bmBqZJh5Vj0-Aoyz53eT06v");
        map.put("HTSV3: IPD HP - known positive-05","bmBqZJh5Vj0-B49DkRhRjFU");
        map.put("HTSV3: IPD HP - known positive-06","bmBqZJh5Vj0-jWGYebQ1pCn");
        map.put("HTSV3: IPD HP - known positive-07","bmBqZJh5Vj0-haYMHQSFfFi");
        map.put("HTSV3: IPD HP - known positive-08","bmBqZJh5Vj0-ZhI3TLG2Iea");

        map.put("HTSV3: IPD HP - linked-01","dD1WI0qgZv7-slGBtK9NsjZ");
        map.put("HTSV3: IPD HP - linked-02","dD1WI0qgZv7-RL2LAAV8h9r");
        map.put("HTSV3: IPD HP - linked-03","dD1WI0qgZv7-ja1pGb0xZqC");
        map.put("HTSV3: IPD HP - linked-04","dD1WI0qgZv7-Aoyz53eT06v");
        map.put("HTSV3: IPD HP - linked-05","dD1WI0qgZv7-B49DkRhRjFU");
        map.put("HTSV3: IPD HP - linked-06","dD1WI0qgZv7-jWGYebQ1pCn");
        map.put("HTSV3: IPD HP - linked-07","dD1WI0qgZv7-haYMHQSFfFi");
        map.put("HTSV3: IPD HP - linked-08","dD1WI0qgZv7-ZhI3TLG2Iea");

        map.put("HTSV3: IPD HP - newly identified positive-01","R1oPKzLXFYF-slGBtK9NsjZ");
        map.put("HTSV3: IPD HP - newly identified positive-02","R1oPKzLXFYF-RL2LAAV8h9r");
        map.put("HTSV3: IPD HP - newly identified positive-03","R1oPKzLXFYF-ja1pGb0xZqC");
        map.put("HTSV3: IPD HP - newly identified positive-04","R1oPKzLXFYF-Aoyz53eT06v");
        map.put("HTSV3: IPD HP - newly identified positive-05","R1oPKzLXFYF-B49DkRhRjFU");
        map.put("HTSV3: IPD HP - newly identified positive-06","R1oPKzLXFYF-jWGYebQ1pCn");
        map.put("HTSV3: IPD HP - newly identified positive-07","R1oPKzLXFYF-haYMHQSFfFi");
        map.put("HTSV3: IPD HP - newly identified positive-08","R1oPKzLXFYF-ZhI3TLG2Iea");

        map.put("HTSV3: IPD HP - screened-01","P7llYRP3JRR-slGBtK9NsjZ");
        map.put("HTSV3: IPD HP - screened-02","P7llYRP3JRR-RL2LAAV8h9r");
        map.put("HTSV3: IPD HP - screened-03","P7llYRP3JRR-ja1pGb0xZqC");
        map.put("HTSV3: IPD HP - screened-04","P7llYRP3JRR-Aoyz53eT06v");
        map.put("HTSV3: IPD HP - screened-05","P7llYRP3JRR-B49DkRhRjFU");
        map.put("HTSV3: IPD HP - screened-06","P7llYRP3JRR-jWGYebQ1pCn");
        map.put("HTSV3: IPD HP - screened-07","P7llYRP3JRR-haYMHQSFfFi");
        map.put("HTSV3: IPD HP - screened-08","P7llYRP3JRR-ZhI3TLG2Iea");

        map.put("HTSV3: IPD HP - tested-01","Y8gygWUrdIP-slGBtK9NsjZ");
        map.put("HTSV3: IPD HP - tested-02","Y8gygWUrdIP-RL2LAAV8h9r");
        map.put("HTSV3: IPD HP - tested-03","Y8gygWUrdIP-ja1pGb0xZqC");
        map.put("HTSV3: IPD HP - tested-04","Y8gygWUrdIP-Aoyz53eT06v");
        map.put("HTSV3: IPD HP - tested-05","Y8gygWUrdIP-B49DkRhRjFU");
        map.put("HTSV3: IPD HP - tested-06","Y8gygWUrdIP-jWGYebQ1pCn");
        map.put("HTSV3: IPD HP - tested-07","Y8gygWUrdIP-haYMHQSFfFi");
        map.put("HTSV3: IPD HP - tested-08","Y8gygWUrdIP-ZhI3TLG2Iea");
        //map.put("HTSV3: IPD HP - workload","fpqOh9xjohD-HllvX50cXC0");

        map.put("HTSV3: IPD NP - eligible-01","ABPJyymxDbV-slGBtK9NsjZ");
        map.put("HTSV3: IPD NP - eligible-02","ABPJyymxDbV-RL2LAAV8h9r");
        map.put("HTSV3: IPD NP - eligible-03","ABPJyymxDbV-ja1pGb0xZqC");
        map.put("HTSV3: IPD NP - eligible-04","ABPJyymxDbV-Aoyz53eT06v");
        map.put("HTSV3: IPD NP - eligible-05","ABPJyymxDbV-B49DkRhRjFU");
        map.put("HTSV3: IPD NP - eligible-06","ABPJyymxDbV-jWGYebQ1pCn");
        map.put("HTSV3: IPD NP - eligible-07","ABPJyymxDbV-haYMHQSFfFi");
        map.put("HTSV3: IPD NP - eligible-08","ABPJyymxDbV-ZhI3TLG2Iea");

        map.put("HTSV3: IPD NP - known positive-01","f53Yb4QHC5J-slGBtK9NsjZ");
        map.put("HTSV3: IPD NP - known positive-02","f53Yb4QHC5J-RL2LAAV8h9r");
        map.put("HTSV3: IPD NP - known positive-03","f53Yb4QHC5J-ja1pGb0xZqC");
        map.put("HTSV3: IPD NP - known positive-04","f53Yb4QHC5J-Aoyz53eT06v");
        map.put("HTSV3: IPD NP - known positive-05","f53Yb4QHC5J-B49DkRhRjFU");
        map.put("HTSV3: IPD NP - known positive-06","f53Yb4QHC5J-jWGYebQ1pCn");
        map.put("HTSV3: IPD NP - known positive-07","f53Yb4QHC5J-haYMHQSFfFi");
        map.put("HTSV3: IPD NP - known positive-08","f53Yb4QHC5J-ZhI3TLG2Iea");

        map.put("HTSV3: IPD NP - linked-01","YYjM4Z32q79-slGBtK9NsjZ");
        map.put("HTSV3: IPD NP - linked-02","YYjM4Z32q79-RL2LAAV8h9r");
        map.put("HTSV3: IPD NP - linked-03","YYjM4Z32q79-ja1pGb0xZqC");
        map.put("HTSV3: IPD NP - linked-04","YYjM4Z32q79-Aoyz53eT06v");
        map.put("HTSV3: IPD NP - linked-05","YYjM4Z32q79-B49DkRhRjFU");
        map.put("HTSV3: IPD NP - linked-06","YYjM4Z32q79-jWGYebQ1pCn");
        map.put("HTSV3: IPD NP - linked-07","YYjM4Z32q79-haYMHQSFfFi");
        map.put("HTSV3: IPD NP - linked-08","YYjM4Z32q79-ZhI3TLG2Iea");

        map.put("HTSV3: IPD NP - newly identified positive-01","Pz1p4oFoNWa-slGBtK9NsjZ");
        map.put("HTSV3: IPD NP - newly identified positive-02","Pz1p4oFoNWa-RL2LAAV8h9r");
        map.put("HTSV3: IPD NP - newly identified positive-03","Pz1p4oFoNWa-ja1pGb0xZqC");
        map.put("HTSV3: IPD NP - newly identified positive-04","Pz1p4oFoNWa-Aoyz53eT06v");
        map.put("HTSV3: IPD NP - newly identified positive-05","Pz1p4oFoNWa-B49DkRhRjFU");
        map.put("HTSV3: IPD NP - newly identified positive-06","Pz1p4oFoNWa-jWGYebQ1pCn");
        map.put("HTSV3: IPD NP - newly identified positive-07","Pz1p4oFoNWa-haYMHQSFfFi");
        map.put("HTSV3: IPD NP - newly identified positive-08","Pz1p4oFoNWa-ZhI3TLG2Iea");

        map.put("HTSV3: IPD NP - screened-01","b8Vwuvc5jha-slGBtK9NsjZ");
        map.put("HTSV3: IPD NP - screened-02","b8Vwuvc5jha-RL2LAAV8h9r");
        map.put("HTSV3: IPD NP - screened-03","b8Vwuvc5jha-ja1pGb0xZqC");
        map.put("HTSV3: IPD NP - screened-04","b8Vwuvc5jha-Aoyz53eT06v");
        map.put("HTSV3: IPD NP - screened-05","b8Vwuvc5jha-B49DkRhRjFU");
        map.put("HTSV3: IPD NP - screened-06","b8Vwuvc5jha-jWGYebQ1pCn");
        map.put("HTSV3: IPD NP - screened-07","b8Vwuvc5jha-haYMHQSFfFi");
        map.put("HTSV3: IPD NP - screened-08","b8Vwuvc5jha-ZhI3TLG2Iea");

        map.put("HTSV3: IPD NP - tested-01","snzfN6tm396-slGBtK9NsjZ");
        map.put("HTSV3: IPD NP - tested-02","snzfN6tm396-RL2LAAV8h9r");
        map.put("HTSV3: IPD NP - tested-03","snzfN6tm396-ja1pGb0xZqC");
        map.put("HTSV3: IPD NP - tested-04","snzfN6tm396-Aoyz53eT06v");
        map.put("HTSV3: IPD NP - tested-05","snzfN6tm396-B49DkRhRjFU");
        map.put("HTSV3: IPD NP - tested-06","snzfN6tm396-jWGYebQ1pCn");
        map.put("HTSV3: IPD NP - tested-07","snzfN6tm396-haYMHQSFfFi");
        map.put("HTSV3: IPD NP - tested-08","snzfN6tm396-ZhI3TLG2Iea");
        //map.put("HTSV3: IPD NP - workload","WiPU5c2SedB-HllvX50cXC0");

        //HTS - OPD
        map.put("HTSV3: OPD HP - eligible-01","Pmd0uEoGsuJ-slGBtK9NsjZ");
        map.put("HTSV3: OPD HP - eligible-02","Pmd0uEoGsuJ-RL2LAAV8h9r");
        map.put("HTSV3: OPD HP - eligible-03","Pmd0uEoGsuJ-ja1pGb0xZqC");
        map.put("HTSV3: OPD HP - eligible-04","Pmd0uEoGsuJ-Aoyz53eT06v");
        map.put("HTSV3: OPD HP - eligible-05","Pmd0uEoGsuJ-B49DkRhRjFU");
        map.put("HTSV3: OPD HP - eligible-06","Pmd0uEoGsuJ-jWGYebQ1pCn");
        map.put("HTSV3: OPD HP - eligible-07","Pmd0uEoGsuJ-haYMHQSFfFi");
        map.put("HTSV3: OPD HP - eligible-08","Pmd0uEoGsuJ-ZhI3TLG2Iea");

        map.put("HTSV3: OPD HP - known positive-01","j2G0lQSDNwY-slGBtK9NsjZ");
        map.put("HTSV3: OPD HP - known positive-02","j2G0lQSDNwY-RL2LAAV8h9r");
        map.put("HTSV3: OPD HP - known positive-03","j2G0lQSDNwY-ja1pGb0xZqC");
        map.put("HTSV3: OPD HP - known positive-04","j2G0lQSDNwY-Aoyz53eT06v");
        map.put("HTSV3: OPD HP - known positive-05","j2G0lQSDNwY-B49DkRhRjFU");
        map.put("HTSV3: OPD HP - known positive-06","j2G0lQSDNwY-jWGYebQ1pCn");
        map.put("HTSV3: OPD HP - known positive-07","j2G0lQSDNwY-haYMHQSFfFi");
        map.put("HTSV3: OPD HP - known positive-08","j2G0lQSDNwY-ZhI3TLG2Iea");

        map.put("HTSV3: OPD HP - linked-01","DE7b7KkSTqv-slGBtK9NsjZ");
        map.put("HTSV3: OPD HP - linked-02","DE7b7KkSTqv-RL2LAAV8h9r");
        map.put("HTSV3: OPD HP - linked-03","DE7b7KkSTqv-ja1pGb0xZqC");
        map.put("HTSV3: OPD HP - linked-04","DE7b7KkSTqv-Aoyz53eT06v");
        map.put("HTSV3: OPD HP - linked-05","DE7b7KkSTqv-B49DkRhRjFU");
        map.put("HTSV3: OPD HP - linked-06","DE7b7KkSTqv-jWGYebQ1pCn");
        map.put("HTSV3: OPD HP - linked-07","DE7b7KkSTqv-haYMHQSFfFi");
        map.put("HTSV3: OPD HP - linked-08","DE7b7KkSTqv-ZhI3TLG2Iea");

        map.put("HTSV3: OPD HP - newly identified positive-01","bhURcpGJGom-slGBtK9NsjZ");
        map.put("HTSV3: OPD HP - newly identified positive-02","bhURcpGJGom-RL2LAAV8h9r");
        map.put("HTSV3: OPD HP - newly identified positive-03","bhURcpGJGom-ja1pGb0xZqC");
        map.put("HTSV3: OPD HP - newly identified positive-04","bhURcpGJGom-Aoyz53eT06v");
        map.put("HTSV3: OPD HP - newly identified positive-05","bhURcpGJGom-B49DkRhRjFU");
        map.put("HTSV3: OPD HP - newly identified positive-06","bhURcpGJGom-jWGYebQ1pCn");
        map.put("HTSV3: OPD HP - newly identified positive-07","bhURcpGJGom-haYMHQSFfFi");
        map.put("HTSV3: OPD HP - newly identified positive-08","bhURcpGJGom-ZhI3TLG2Iea");

        map.put("HTSV3: OPD HP - screened-01","ss7ILGAdkHU-slGBtK9NsjZ");
        map.put("HTSV3: OPD HP - screened-02","ss7ILGAdkHU-RL2LAAV8h9r");
        map.put("HTSV3: OPD HP - screened-03","ss7ILGAdkHU-ja1pGb0xZqC");
        map.put("HTSV3: OPD HP - screened-04","ss7ILGAdkHU-Aoyz53eT06v");
        map.put("HTSV3: OPD HP - screened-05","ss7ILGAdkHU-B49DkRhRjFU");
        map.put("HTSV3: OPD HP - screened-06","ss7ILGAdkHU-jWGYebQ1pCn");
        map.put("HTSV3: OPD HP - screened-07","ss7ILGAdkHU-haYMHQSFfFi");
        map.put("HTSV3: OPD HP - screened-08","ss7ILGAdkHU-ZhI3TLG2Iea");

        map.put("HTSV3: OPD HP - tested-01","OoItp68AYPU-slGBtK9NsjZ");
        map.put("HTSV3: OPD HP - tested-02","OoItp68AYPU-RL2LAAV8h9r");
        map.put("HTSV3: OPD HP - tested-03","OoItp68AYPU-ja1pGb0xZqC");
        map.put("HTSV3: OPD HP - tested-04","OoItp68AYPU-Aoyz53eT06v");
        map.put("HTSV3: OPD HP - tested-05","OoItp68AYPU-B49DkRhRjFU");
        map.put("HTSV3: OPD HP - tested-06","OoItp68AYPU-jWGYebQ1pCn");
        map.put("HTSV3: OPD HP - tested-07","OoItp68AYPU-haYMHQSFfFi");
        map.put("HTSV3: OPD HP - tested-08","OoItp68AYPU-ZhI3TLG2Iea");

        map.put("HTSV3: OPD NP - eligible-01","JXz1rKH6PCb-slGBtK9NsjZ");
        map.put("HTSV3: OPD NP - eligible-02","JXz1rKH6PCb-RL2LAAV8h9r");
        map.put("HTSV3: OPD NP - eligible-03","JXz1rKH6PCb-ja1pGb0xZqC");
        map.put("HTSV3: OPD NP - eligible-04","JXz1rKH6PCb-Aoyz53eT06v");
        map.put("HTSV3: OPD NP - eligible-05","JXz1rKH6PCb-B49DkRhRjFU");
        map.put("HTSV3: OPD NP - eligible-06","JXz1rKH6PCb-jWGYebQ1pCn");
        map.put("HTSV3: OPD NP - eligible-07","JXz1rKH6PCb-haYMHQSFfFi");
        map.put("HTSV3: OPD NP - eligible-08","JXz1rKH6PCb-ZhI3TLG2Iea");

        map.put("HTSV3: OPD NP - known positive-01","hriOIHtb4Tz-slGBtK9NsjZ");
        map.put("HTSV3: OPD NP - known positive-02","hriOIHtb4Tz-RL2LAAV8h9r");
        map.put("HTSV3: OPD NP - known positive-03","hriOIHtb4Tz-ja1pGb0xZqC");
        map.put("HTSV3: OPD NP - known positive-04","hriOIHtb4Tz-Aoyz53eT06v");
        map.put("HTSV3: OPD NP - known positive-05","hriOIHtb4Tz-B49DkRhRjFU");
        map.put("HTSV3: OPD NP - known positive-06","hriOIHtb4Tz-jWGYebQ1pCn");
        map.put("HTSV3: OPD NP - known positive-07","hriOIHtb4Tz-haYMHQSFfFi");
        map.put("HTSV3: OPD NP - known positive-08","hriOIHtb4Tz-ZhI3TLG2Iea");

        map.put("HTSV3: OPD NP - linked-01","aNpMbgH354J-slGBtK9NsjZ");
        map.put("HTSV3: OPD NP - linked-02","aNpMbgH354J-RL2LAAV8h9r");
        map.put("HTSV3: OPD NP - linked-03","aNpMbgH354J-ja1pGb0xZqC");
        map.put("HTSV3: OPD NP - linked-04","aNpMbgH354J-Aoyz53eT06v");
        map.put("HTSV3: OPD NP - linked-05","aNpMbgH354J-B49DkRhRjFU");
        map.put("HTSV3: OPD NP - linked-06","aNpMbgH354J-jWGYebQ1pCn");
        map.put("HTSV3: OPD NP - linked-07","aNpMbgH354J-haYMHQSFfFi");
        map.put("HTSV3: OPD NP - linked-08","aNpMbgH354J-ZhI3TLG2Iea");

        map.put("HTSV3: OPD NP - newly identified positive-01","v6sFj11PpN6-slGBtK9NsjZ");
        map.put("HTSV3: OPD NP - newly identified positive-02","v6sFj11PpN6-RL2LAAV8h9r");
        map.put("HTSV3: OPD NP - newly identified positive-03","v6sFj11PpN6-ja1pGb0xZqC");
        map.put("HTSV3: OPD NP - newly identified positive-04","v6sFj11PpN6-Aoyz53eT06v");
        map.put("HTSV3: OPD NP - newly identified positive-05","v6sFj11PpN6-B49DkRhRjFU");
        map.put("HTSV3: OPD NP - newly identified positive-06","v6sFj11PpN6-jWGYebQ1pCn");
        map.put("HTSV3: OPD NP - newly identified positive-07","v6sFj11PpN6-haYMHQSFfFi");
        map.put("HTSV3: OPD NP - newly identified positive-08","v6sFj11PpN6-ZhI3TLG2Iea");

        map.put("HTSV3: OPD NP - screened-01","bxwwUG86Cs5-slGBtK9NsjZ");
        map.put("HTSV3: OPD NP - screened-02","bxwwUG86Cs5-RL2LAAV8h9r");
        map.put("HTSV3: OPD NP - screened-03","bxwwUG86Cs5-ja1pGb0xZqC");
        map.put("HTSV3: OPD NP - screened-04","bxwwUG86Cs5-Aoyz53eT06v");
        map.put("HTSV3: OPD NP - screened-05","bxwwUG86Cs5-B49DkRhRjFU");
        map.put("HTSV3: OPD NP - screened-06","bxwwUG86Cs5-jWGYebQ1pCn");
        map.put("HTSV3: OPD NP - screened-07","bxwwUG86Cs5-haYMHQSFfFi");
        map.put("HTSV3: OPD NP - screened-08","bxwwUG86Cs5-ZhI3TLG2Iea");

        map.put("HTSV3: OPD NP - tested-01","VGPv7IYRhW4-slGBtK9NsjZ");
        map.put("HTSV3: OPD NP - tested-02","VGPv7IYRhW4-RL2LAAV8h9r");
        map.put("HTSV3: OPD NP - tested-03","VGPv7IYRhW4-ja1pGb0xZqC");
        map.put("HTSV3: OPD NP - tested-04","VGPv7IYRhW4-Aoyz53eT06v");
        map.put("HTSV3: OPD NP - tested-05","VGPv7IYRhW4-B49DkRhRjFU");
        map.put("HTSV3: OPD NP - tested-06","VGPv7IYRhW4-jWGYebQ1pCn");
        map.put("HTSV3: OPD NP - tested-07","VGPv7IYRhW4-haYMHQSFfFi");
        map.put("HTSV3: OPD NP - tested-08","VGPv7IYRhW4-ZhI3TLG2Iea");

        //////HTS - PNS
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-01","jhF9Irc1Ax6-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-02","jhF9Irc1Ax6-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-03","jhF9Irc1Ax6-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-04","jhF9Irc1Ax6-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-05","jhF9Irc1Ax6-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-06","jhF9Irc1Ax6-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-07","jhF9Irc1Ax6-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - contacts eligible-08","jhF9Irc1Ax6-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - contacts identified-01","CuM1Jqw85xQ-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-02","CuM1Jqw85xQ-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-03","CuM1Jqw85xQ-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-04","CuM1Jqw85xQ-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-05","CuM1Jqw85xQ-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-06","CuM1Jqw85xQ-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-07","CuM1Jqw85xQ-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - contacts identified-08","CuM1Jqw85xQ-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - contacts known positive-01","W0RgYipxvpb-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-02","W0RgYipxvpb-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-03","W0RgYipxvpb-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-04","W0RgYipxvpb-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-05","W0RgYipxvpb-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-06","W0RgYipxvpb-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-07","W0RgYipxvpb-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - contacts known positive-08","W0RgYipxvpb-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - contacts linked-01","rpcVTczFqif-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-02","rpcVTczFqif-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-03","rpcVTczFqif-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-04","rpcVTczFqif-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-05","rpcVTczFqif-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-06","rpcVTczFqif-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-07","rpcVTczFqif-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - contacts linked-08","rpcVTczFqif-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-01","znm0VUSFkPz-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-02","znm0VUSFkPz-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-03","znm0VUSFkPz-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-04","znm0VUSFkPz-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-05","znm0VUSFkPz-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-06","znm0VUSFkPz-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-07","znm0VUSFkPz-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - contacts newly identified positive-08","znm0VUSFkPz-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - contacts tested-01","iu6u8Yg02Zu-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-02","iu6u8Yg02Zu-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-03","iu6u8Yg02Zu-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-04","iu6u8Yg02Zu-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-05","iu6u8Yg02Zu-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-06","iu6u8Yg02Zu-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-07","iu6u8Yg02Zu-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - contacts tested-08","iu6u8Yg02Zu-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - index clients-01","kdmVB7YBb0B-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - index clients-02","kdmVB7YBb0B-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - index clients-03","kdmVB7YBb0B-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - index clients-04","kdmVB7YBb0B-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - index clients-05","kdmVB7YBb0B-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - index clients-06","kdmVB7YBb0B-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - index clients-07","kdmVB7YBb0B-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - index clients-08","kdmVB7YBb0B-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-01","h2VUHhlYR2f-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-02","h2VUHhlYR2f-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-03","h2VUHhlYR2f-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-04","h2VUHhlYR2f-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-05","h2VUHhlYR2f-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-06","h2VUHhlYR2f-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-07","h2VUHhlYR2f-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - index clients accepting pns-08","h2VUHhlYR2f-ZhI3TLG2Iea");

        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-01","S0oFq66nArU-slGBtK9NsjZ");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-02","S0oFq66nArU-RL2LAAV8h9r");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-03","S0oFq66nArU-ja1pGb0xZqC");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-04","S0oFq66nArU-Aoyz53eT06v");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-05","S0oFq66nArU-B49DkRhRjFU");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-06","S0oFq66nArU-jWGYebQ1pCn");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-07","S0oFq66nArU-haYMHQSFfFi");
        map.put("HTSV3: Index Testing - FPNS - index clients offered pns-08","S0oFq66nArU-ZhI3TLG2Iea");

        ///HTS MNCH

        map.put("HTSV4: 1st ANC visit clients - eligible-01","ByGXtdCPH1Y-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - eligible-02","ByGXtdCPH1Y-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - eligible-03","ByGXtdCPH1Y-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - eligible-04","ByGXtdCPH1Y-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - eligible-05","ByGXtdCPH1Y-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - eligible-06","ByGXtdCPH1Y-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - eligible-07","ByGXtdCPH1Y-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - eligible-08","ByGXtdCPH1Y-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - eligible-09","ByGXtdCPH1Y-OhXK0yJVzGh");

        map.put("HTSV4: 1st ANC visit clients - known positive-01","TXYZhJLh6Tz-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - known positive-02","TXYZhJLh6Tz-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - known positive-03","TXYZhJLh6Tz-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - known positive-04","TXYZhJLh6Tz-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - known positive-05","TXYZhJLh6Tz-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - known positive-06","TXYZhJLh6Tz-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - known positive-07","TXYZhJLh6Tz-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - known positive-08","TXYZhJLh6Tz-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - known positive-09","TXYZhJLh6Tz-OhXK0yJVzGh");

        map.put("HTSV4: 1st ANC visit clients - newly identified positive-01","ihMHoulO1Gh-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-02","ihMHoulO1Gh-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-03","ihMHoulO1Gh-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-04","ihMHoulO1Gh-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-05","ihMHoulO1Gh-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-06","ihMHoulO1Gh-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-07","ihMHoulO1Gh-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-08","ihMHoulO1Gh-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - newly identified positive-09","ihMHoulO1Gh-OhXK0yJVzGh");

        map.put("HTSV4: 1st ANC visit clients - recent known negative-01","gibXBxEgKrD-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-02","gibXBxEgKrD-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-03","gibXBxEgKrD-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-04","gibXBxEgKrD-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-05","gibXBxEgKrD-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-06","gibXBxEgKrD-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-07","gibXBxEgKrD-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-08","gibXBxEgKrD-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - recent known negative-09","gibXBxEgKrD-OhXK0yJVzGh");

        map.put("HTSV4: 1st ANC visit clients - seen-01","FPPA6DDNmv8-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - seen-02","FPPA6DDNmv8-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - seen-03","FPPA6DDNmv8-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - seen-04","FPPA6DDNmv8-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - seen-05","FPPA6DDNmv8-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - seen-06","FPPA6DDNmv8-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - seen-07","FPPA6DDNmv8-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - seen-08","FPPA6DDNmv8-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - seen-09","FPPA6DDNmv8-OhXK0yJVzGh");

        map.put("HTSV4: 1st ANC visit clients - started on HAART-01","lUO5SALweiI-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-02","lUO5SALweiI-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-03","lUO5SALweiI-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-04","lUO5SALweiI-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-05","lUO5SALweiI-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-06","lUO5SALweiI-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-07","lUO5SALweiI-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-08","lUO5SALweiI-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - started on HAART-09","lUO5SALweiI-OhXK0yJVzGh");

        map.put("HTSV4: 1st ANC visit clients - tested-01","W4eMES8YQfK-HHi4QCudjWi");
        map.put("HTSV4: 1st ANC visit clients - tested-02","W4eMES8YQfK-D3mZDmazNsH");
        map.put("HTSV4: 1st ANC visit clients - tested-03","W4eMES8YQfK-td6m0SSDg2v");
        map.put("HTSV4: 1st ANC visit clients - tested-04","W4eMES8YQfK-nlm4rLKJfO5");
        map.put("HTSV4: 1st ANC visit clients - tested-05","W4eMES8YQfK-DakDU1heu55");
        map.put("HTSV4: 1st ANC visit clients - tested-06","W4eMES8YQfK-geadTIz117C");
        map.put("HTSV4: 1st ANC visit clients - tested-07","W4eMES8YQfK-HSsWSwcZWYq");
        map.put("HTSV4: 1st ANC visit clients - tested-08","W4eMES8YQfK-JyvzLAxuqAa");
        map.put("HTSV4: 1st ANC visit clients - tested-09","W4eMES8YQfK-OhXK0yJVzGh");

        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-01","HyURwUJJHxS-HHi4QCudjWi");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-02","HyURwUJJHxS-D3mZDmazNsH");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-03","HyURwUJJHxS-td6m0SSDg2v");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-04","HyURwUJJHxS-nlm4rLKJfO5");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-05","HyURwUJJHxS-DakDU1heu55");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-06","HyURwUJJHxS-geadTIz117C");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-07","HyURwUJJHxS-HSsWSwcZWYq");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-08","HyURwUJJHxS-JyvzLAxuqAa");
        map.put("HTSV4: Client Tested - Initial testing (Post ANC1)-09","HyURwUJJHxS-OhXK0yJVzGh");

        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-01","d1PJCRLL3S3-HHi4QCudjWi");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-02","d1PJCRLL3S3-D3mZDmazNsH");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-03","d1PJCRLL3S3-td6m0SSDg2v");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-04","d1PJCRLL3S3-nlm4rLKJfO5");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-05","d1PJCRLL3S3-DakDU1heu55");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-06","d1PJCRLL3S3-geadTIz117C");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-07","d1PJCRLL3S3-HSsWSwcZWYq");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-08","d1PJCRLL3S3-JyvzLAxuqAa");
        map.put("HTSV4: Client Tested - Retesting (Post ANC1)-09","d1PJCRLL3S3-OhXK0yJVzGh");

        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-01","sRj5sxU7X8G-HHi4QCudjWi");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-02","sRj5sxU7X8G-D3mZDmazNsH");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-03","sRj5sxU7X8G-td6m0SSDg2v");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-04","sRj5sxU7X8G-nlm4rLKJfO5");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-05","sRj5sxU7X8G-DakDU1heu55");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-06","sRj5sxU7X8G-geadTIz117C");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-07","sRj5sxU7X8G-HSsWSwcZWYq");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-08","sRj5sxU7X8G-JyvzLAxuqAa");
        map.put("HTSV4: Client Tested HIV Positive - Initial testing (Post ANC1)-09","sRj5sxU7X8G-OhXK0yJVzGh");

        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-01","CDzjbGTreaE-HHi4QCudjWi");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-02","CDzjbGTreaE-D3mZDmazNsH");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-03","CDzjbGTreaE-td6m0SSDg2v");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-04","CDzjbGTreaE-nlm4rLKJfO5");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-05","CDzjbGTreaE-DakDU1heu55");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-06","CDzjbGTreaE-geadTIz117C");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-07","CDzjbGTreaE-HSsWSwcZWYq");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-08","CDzjbGTreaE-JyvzLAxuqAa");
        map.put("HTSV4: Client Tested HIV Positive - Retesting (Post ANC1)-09","CDzjbGTreaE-OhXK0yJVzGh");

        map.put("HTSV4: Clients in maternity - known positive-01","XUGXvCXotRo-HHi4QCudjWi");
        map.put("HTSV4: Clients in maternity - known positive-02","XUGXvCXotRo-D3mZDmazNsH");
        map.put("HTSV4: Clients in maternity - known positive-03","XUGXvCXotRo-td6m0SSDg2v");
        map.put("HTSV4: Clients in maternity - known positive-04","XUGXvCXotRo-nlm4rLKJfO5");
        map.put("HTSV4: Clients in maternity - known positive-05","XUGXvCXotRo-DakDU1heu55");
        map.put("HTSV4: Clients in maternity - known positive-06","XUGXvCXotRo-geadTIz117C");
        map.put("HTSV4: Clients in maternity - known positive-07","XUGXvCXotRo-HSsWSwcZWYq");
        map.put("HTSV4: Clients in maternity - known positive-08","XUGXvCXotRo-JyvzLAxuqAa");
        map.put("HTSV4: Clients in maternity - known positive-09","XUGXvCXotRo-OhXK0yJVzGh");

        map.put("HTSV4: Clients in maternity - seen-01","uEHG1JAsGSO-HHi4QCudjWi");
        map.put("HTSV4: Clients in maternity - seen-02","uEHG1JAsGSO-D3mZDmazNsH");
        map.put("HTSV4: Clients in maternity - seen-03","uEHG1JAsGSO-td6m0SSDg2v");
        map.put("HTSV4: Clients in maternity - seen-04","uEHG1JAsGSO-nlm4rLKJfO5");
        map.put("HTSV4: Clients in maternity - seen-05","uEHG1JAsGSO-DakDU1heu55");
        map.put("HTSV4: Clients in maternity - seen-06","uEHG1JAsGSO-geadTIz117C");
        map.put("HTSV4: Clients in maternity - seen-07","uEHG1JAsGSO-HSsWSwcZWYq");
        map.put("HTSV4: Clients in maternity - seen-08","uEHG1JAsGSO-JyvzLAxuqAa");
        map.put("HTSV4: Clients in maternity - seen-09","uEHG1JAsGSO-OhXK0yJVzGh");

        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-01","FxATtoNWhJC-HHi4QCudjWi");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-02","FxATtoNWhJC-D3mZDmazNsH");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-03","FxATtoNWhJC-td6m0SSDg2v");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-04","FxATtoNWhJC-nlm4rLKJfO5");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-05","FxATtoNWhJC-DakDU1heu55");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-06","FxATtoNWhJC-geadTIz117C");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-07","FxATtoNWhJC-HSsWSwcZWYq");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-08","FxATtoNWhJC-JyvzLAxuqAa");
        map.put("HTSV4: Clients in maternity - started on HAART (Post ANC1)-09","FxATtoNWhJC-OhXK0yJVzGh");

        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-01","Zd2sWlJA26c-HHi4QCudjWi");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-02","Zd2sWlJA26c-D3mZDmazNsH");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-03","Zd2sWlJA26c-td6m0SSDg2v");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-04","Zd2sWlJA26c-nlm4rLKJfO5");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-05","Zd2sWlJA26c-DakDU1heu55");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-06","Zd2sWlJA26c-geadTIz117C");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-07","Zd2sWlJA26c-HSsWSwcZWYq");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-08","Zd2sWlJA26c-JyvzLAxuqAa");
        map.put("HTSV4: Clients in maternity - unknown HIV status at ANC-09","Zd2sWlJA26c-OhXK0yJVzGh");

        map.put("HTSV4: Clients in PNC - known positive-01","hTjCTxEuBCo-HHi4QCudjWi");
        map.put("HTSV4: Clients in PNC - known positive-02","hTjCTxEuBCo-D3mZDmazNsH");
        map.put("HTSV4: Clients in PNC - known positive-03","hTjCTxEuBCo-td6m0SSDg2v");
        map.put("HTSV4: Clients in PNC - known positive-04","hTjCTxEuBCo-nlm4rLKJfO5");
        map.put("HTSV4: Clients in PNC - known positive-05","hTjCTxEuBCo-DakDU1heu55");
        map.put("HTSV4: Clients in PNC - known positive-06","hTjCTxEuBCo-geadTIz117C");
        map.put("HTSV4: Clients in PNC - known positive-07","hTjCTxEuBCo-HSsWSwcZWYq");
        map.put("HTSV4: Clients in PNC - known positive-08","hTjCTxEuBCo-JyvzLAxuqAa");
        map.put("HTSV4: Clients in PNC - known positive-09","hTjCTxEuBCo-OhXK0yJVzGh");

        map.put("HTSV4: Clients in PNC - seen-01","sFEJp08ScVg-HHi4QCudjWi");
        map.put("HTSV4: Clients in PNC - seen-02","sFEJp08ScVg-D3mZDmazNsH");
        map.put("HTSV4: Clients in PNC - seen-03","sFEJp08ScVg-td6m0SSDg2v");
        map.put("HTSV4: Clients in PNC - seen-04","sFEJp08ScVg-nlm4rLKJfO5");
        map.put("HTSV4: Clients in PNC - seen-05","sFEJp08ScVg-DakDU1heu55");
        map.put("HTSV4: Clients in PNC - seen-06","sFEJp08ScVg-geadTIz117C");
        map.put("HTSV4: Clients in PNC - seen-07","sFEJp08ScVg-HSsWSwcZWYq");
        map.put("HTSV4: Clients in PNC - seen-08","sFEJp08ScVg-JyvzLAxuqAa");
        map.put("HTSV4: Clients in PNC - seen-09","sFEJp08ScVg-OhXK0yJVzGh");

        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-01","bGx245yns2e-HHi4QCudjWi");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-02","bGx245yns2e-D3mZDmazNsH");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-03","bGx245yns2e-td6m0SSDg2v");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-04","bGx245yns2e-nlm4rLKJfO5");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-05","bGx245yns2e-DakDU1heu55");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-06","bGx245yns2e-geadTIz117C");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-07","bGx245yns2e-HSsWSwcZWYq");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-08","bGx245yns2e-JyvzLAxuqAa");
        map.put("HTSV4: Clients in PNC - started on HAART (Post ANC1)-09","bGx245yns2e-OhXK0yJVzGh");

        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-01","CNtNTh5pnjk-HHi4QCudjWi");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-02","CNtNTh5pnjk-D3mZDmazNsH");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-03","CNtNTh5pnjk-td6m0SSDg2v");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-04","CNtNTh5pnjk-nlm4rLKJfO5");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-05","CNtNTh5pnjk-DakDU1heu55");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-06","CNtNTh5pnjk-geadTIz117C");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-07","CNtNTh5pnjk-HSsWSwcZWYq");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-08","CNtNTh5pnjk-JyvzLAxuqAa");
        map.put("HTSV4: Clients in PNC - unknown HIV status in ANC and/or maternity-09","CNtNTh5pnjk-OhXK0yJVzGh");

        map.put("HTSV4: MNCH clients - number issued with self-test kits-01","oKhanfN87ih-HHi4QCudjWi");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-02","oKhanfN87ih-D3mZDmazNsH");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-03","oKhanfN87ih-td6m0SSDg2v");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-04","oKhanfN87ih-nlm4rLKJfO5");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-05","oKhanfN87ih-DakDU1heu55");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-06","oKhanfN87ih-geadTIz117C");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-07","oKhanfN87ih-HSsWSwcZWYq");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-08","oKhanfN87ih-JyvzLAxuqAa");
        map.put("HTSV4: MNCH clients - number issued with self-test kits-09","oKhanfN87ih-OhXK0yJVzGh");

        map.put("HTSV4: MNCH clients - number with positive self-test results-01","smTTvXjVmOa-HHi4QCudjWi");
        map.put("HTSV4: MNCH clients - number with positive self-test results-02","smTTvXjVmOa-D3mZDmazNsH");
        map.put("HTSV4: MNCH clients - number with positive self-test results-03","smTTvXjVmOa-td6m0SSDg2v");
        map.put("HTSV4: MNCH clients - number with positive self-test results-04","smTTvXjVmOa-nlm4rLKJfO5");
        map.put("HTSV4: MNCH clients - number with positive self-test results-05","smTTvXjVmOa-DakDU1heu55");
        map.put("HTSV4: MNCH clients - number with positive self-test results-06","smTTvXjVmOa-geadTIz117C");
        map.put("HTSV4: MNCH clients - number with positive self-test results-07","smTTvXjVmOa-HSsWSwcZWYq");
        map.put("HTSV4: MNCH clients - number with positive self-test results-08","smTTvXjVmOa-JyvzLAxuqAa");
        map.put("HTSV4: MNCH clients - number with positive self-test results-09","smTTvXjVmOa-OhXK0yJVzGh");

        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-01","G6uCrMwmxTh-HHi4QCudjWi");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-02","G6uCrMwmxTh-D3mZDmazNsH");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-03","G6uCrMwmxTh-td6m0SSDg2v");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-04","G6uCrMwmxTh-nlm4rLKJfO5");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-05","G6uCrMwmxTh-DakDU1heu55");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-06","G6uCrMwmxTh-geadTIz117C");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-07","G6uCrMwmxTh-HSsWSwcZWYq");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-08","G6uCrMwmxTh-JyvzLAxuqAa");
        map.put("HTSV4: PNC - Client Tested - Initial testing (Post ANC1)-09","G6uCrMwmxTh-OhXK0yJVzGh");

        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-01","m6ESfc7RghN-HHi4QCudjWi");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-02","m6ESfc7RghN-D3mZDmazNsH");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-03","m6ESfc7RghN-td6m0SSDg2v");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-04","m6ESfc7RghN-nlm4rLKJfO5");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-05","m6ESfc7RghN-DakDU1heu55");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-06","m6ESfc7RghN-geadTIz117C");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-07","m6ESfc7RghN-HSsWSwcZWYq");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-08","m6ESfc7RghN-JyvzLAxuqAa");
        map.put("HTSV4: PNC - Client Tested - Retesting (Post ANC1)-09","m6ESfc7RghN-OhXK0yJVzGh");

        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-01","XIjWSTE8VmZ-HHi4QCudjWi");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-02","XIjWSTE8VmZ-D3mZDmazNsH");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-03","XIjWSTE8VmZ-td6m0SSDg2v");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-04","XIjWSTE8VmZ-nlm4rLKJfO5");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-05","XIjWSTE8VmZ-DakDU1heu55");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-06","XIjWSTE8VmZ-geadTIz117C");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-07","XIjWSTE8VmZ-HSsWSwcZWYq");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-08","XIjWSTE8VmZ-JyvzLAxuqAa");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Initial testing (Post ANC1)-09","XIjWSTE8VmZ-OhXK0yJVzGh");

        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-01","hFIXgbC2dRX-HHi4QCudjWi");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-02","hFIXgbC2dRX-D3mZDmazNsH");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-03","hFIXgbC2dRX-td6m0SSDg2v");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-04","hFIXgbC2dRX-nlm4rLKJfO5");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-05","hFIXgbC2dRX-DakDU1heu55");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-06","hFIXgbC2dRX-geadTIz117C");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-07","hFIXgbC2dRX-HSsWSwcZWYq");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-08","hFIXgbC2dRX-JyvzLAxuqAa");
        map.put("HTSV4: PNC - Client Tested HIV Positive - Retesting (Post ANC1)-09","hFIXgbC2dRX-OhXK0yJVzGh");

        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-01","ybwLq9mwFdQ-HHi4QCudjWi");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-02","ybwLq9mwFdQ-D3mZDmazNsH");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-03","ybwLq9mwFdQ-td6m0SSDg2v");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-04","ybwLq9mwFdQ-nlm4rLKJfO5");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-05","ybwLq9mwFdQ-DakDU1heu55");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-06","ybwLq9mwFdQ-geadTIz117C");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-07","ybwLq9mwFdQ-HSsWSwcZWYq");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-08","ybwLq9mwFdQ-JyvzLAxuqAa");
        map.put("HTSV4: Post ANC1 Client Tested(Initial testing)-09","ybwLq9mwFdQ-OhXK0yJVzGh");

        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-01","fWEQDKyCkjs-HHi4QCudjWi");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-02","fWEQDKyCkjs-D3mZDmazNsH");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-03","fWEQDKyCkjs-td6m0SSDg2v");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-04","fWEQDKyCkjs-nlm4rLKJfO5");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-05","fWEQDKyCkjs-DakDU1heu55");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-06","fWEQDKyCkjs-geadTIz117C");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-07","fWEQDKyCkjs-HSsWSwcZWYq");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-08","fWEQDKyCkjs-JyvzLAxuqAa");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Initial testing)-09","fWEQDKyCkjs-OhXK0yJVzGh");

        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-01","TcynXD3AoLs-HHi4QCudjWi");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-02","TcynXD3AoLs-D3mZDmazNsH");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-03","TcynXD3AoLs-td6m0SSDg2v");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-04","TcynXD3AoLs-nlm4rLKJfO5");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-05","TcynXD3AoLs-DakDU1heu55");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-06","TcynXD3AoLs-geadTIz117C");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-07","TcynXD3AoLs-HSsWSwcZWYq");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-08","TcynXD3AoLs-JyvzLAxuqAa");
        map.put("HTSV4: Post ANC1 Client Tested HIV Positive (Retesting)-09","TcynXD3AoLs-OhXK0yJVzGh");

        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-01","J8tLaO1UDfg-HHi4QCudjWi");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-02","J8tLaO1UDfg-D3mZDmazNsH");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-03","J8tLaO1UDfg-td6m0SSDg2v");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-04","J8tLaO1UDfg-nlm4rLKJfO5");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-05","J8tLaO1UDfg-DakDU1heu55");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-06","J8tLaO1UDfg-geadTIz117C");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-07","J8tLaO1UDfg-HSsWSwcZWYq");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-08","J8tLaO1UDfg-JyvzLAxuqAa");
        map.put("HTSV4: Post ANC1 Client Tested( Retesting)-09","J8tLaO1UDfg-OhXK0yJVzGh");

        map.put("HTSV4: Post ANC1 client: started on HAART-01","RhyAek8kWD2-HHi4QCudjWi");
        map.put("HTSV4: Post ANC1 client: started on HAART-02","RhyAek8kWD2-D3mZDmazNsH");
        map.put("HTSV4: Post ANC1 client: started on HAART-03","RhyAek8kWD2-td6m0SSDg2v");
        map.put("HTSV4: Post ANC1 client: started on HAART-04","RhyAek8kWD2-nlm4rLKJfO5");
        map.put("HTSV4: Post ANC1 client: started on HAART-05","RhyAek8kWD2-DakDU1heu55");
        map.put("HTSV4: Post ANC1 client: started on HAART-06","RhyAek8kWD2-geadTIz117C");
        map.put("HTSV4: Post ANC1 client: started on HAART-07","RhyAek8kWD2-HSsWSwcZWYq");
        map.put("HTSV4: Post ANC1 client: started on HAART-08","RhyAek8kWD2-JyvzLAxuqAa");
        map.put("HTSV4: Post ANC1 client: started on HAART-09","RhyAek8kWD2-OhXK0yJVzGh");

        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-01","OmIBkWUscO6-HHi4QCudjWi");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-02","OmIBkWUscO6-D3mZDmazNsH");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-03","OmIBkWUscO6-td6m0SSDg2v");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-04","OmIBkWUscO6-nlm4rLKJfO5");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-05","OmIBkWUscO6-DakDU1heu55");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-06","OmIBkWUscO6-geadTIz117C");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-07","OmIBkWUscO6-HSsWSwcZWYq");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-08","OmIBkWUscO6-JyvzLAxuqAa");
        map.put("HTSV4: Post ANC1 visit: started on HAART (missed opportunities)-09","OmIBkWUscO6-OhXK0yJVzGh");



        //HTS -STI
        map.put("HTSV3: STI - eligible-01","vCaeio8gUTK-slGBtK9NsjZ");
        map.put("HTSV3: STI - eligible-02","vCaeio8gUTK-RL2LAAV8h9r");
        map.put("HTSV3: STI - eligible-03","vCaeio8gUTK-ja1pGb0xZqC");
        map.put("HTSV3: STI - eligible-04","vCaeio8gUTK-Aoyz53eT06v");
        map.put("HTSV3: STI - eligible-05","vCaeio8gUTK-B49DkRhRjFU");
        map.put("HTSV3: STI - eligible-06","vCaeio8gUTK-jWGYebQ1pCn");
        map.put("HTSV3: STI - eligible-07","vCaeio8gUTK-haYMHQSFfFi");
        map.put("HTSV3: STI - eligible-08","vCaeio8gUTK-ZhI3TLG2Iea");

        map.put("HTSV3: STI - known positive-01","fJYh1O8Ue5X-slGBtK9NsjZ");
        map.put("HTSV3: STI - known positive-02","fJYh1O8Ue5X-RL2LAAV8h9r");
        map.put("HTSV3: STI - known positive-03","fJYh1O8Ue5X-ja1pGb0xZqC");
        map.put("HTSV3: STI - known positive-04","fJYh1O8Ue5X-Aoyz53eT06v");
        map.put("HTSV3: STI - known positive-05","fJYh1O8Ue5X-B49DkRhRjFU");
        map.put("HTSV3: STI - known positive-06","fJYh1O8Ue5X-jWGYebQ1pCn");
        map.put("HTSV3: STI - known positive-07","fJYh1O8Ue5X-haYMHQSFfFi");
        map.put("HTSV3: STI - known positive-08","fJYh1O8Ue5X-ZhI3TLG2Iea");

        map.put("HTSV3: STI - linked-01","VNUKWwHS5md-slGBtK9NsjZ");
        map.put("HTSV3: STI - linked-02","VNUKWwHS5md-RL2LAAV8h9r");
        map.put("HTSV3: STI - linked-03","VNUKWwHS5md-ja1pGb0xZqC");
        map.put("HTSV3: STI - linked-04","VNUKWwHS5md-Aoyz53eT06v");
        map.put("HTSV3: STI - linked-05","VNUKWwHS5md-B49DkRhRjFU");
        map.put("HTSV3: STI - linked-06","VNUKWwHS5md-jWGYebQ1pCn");
        map.put("HTSV3: STI - linked-07","VNUKWwHS5md-haYMHQSFfFi");
        map.put("HTSV3: STI - linked-08","VNUKWwHS5md-ZhI3TLG2Iea");

        map.put("HTSV3: STI - newly identified positive-01","bMpI3VVBNVr-slGBtK9NsjZ");
        map.put("HTSV3: STI - newly identified positive-02","bMpI3VVBNVr-RL2LAAV8h9r");
        map.put("HTSV3: STI - newly identified positive-03","bMpI3VVBNVr-ja1pGb0xZqC");
        map.put("HTSV3: STI - newly identified positive-04","bMpI3VVBNVr-Aoyz53eT06v");
        map.put("HTSV3: STI - newly identified positive-05","bMpI3VVBNVr-B49DkRhRjFU");
        map.put("HTSV3: STI - newly identified positive-06","bMpI3VVBNVr-jWGYebQ1pCn");
        map.put("HTSV3: STI - newly identified positive-07","bMpI3VVBNVr-haYMHQSFfFi");
        map.put("HTSV3: STI - newly identified positive-08","bMpI3VVBNVr-ZhI3TLG2Iea");

        map.put("HTSV3: STI - screened-01","S2yAz8dhNQN-slGBtK9NsjZ");
        map.put("HTSV3: STI - screened-02","S2yAz8dhNQN-RL2LAAV8h9r");
        map.put("HTSV3: STI - screened-03","S2yAz8dhNQN-ja1pGb0xZqC");
        map.put("HTSV3: STI - screened-04","S2yAz8dhNQN-Aoyz53eT06v");
        map.put("HTSV3: STI - screened-05","S2yAz8dhNQN-B49DkRhRjFU");
        map.put("HTSV3: STI - screened-06","S2yAz8dhNQN-jWGYebQ1pCn");
        map.put("HTSV3: STI - screened-07","S2yAz8dhNQN-haYMHQSFfFi");
        map.put("HTSV3: STI - screened-08","S2yAz8dhNQN-ZhI3TLG2Iea");

        map.put("HTSV3: STI - tested-01","rKY81yrNWwO-slGBtK9NsjZ");
        map.put("HTSV3: STI - tested-02","rKY81yrNWwO-RL2LAAV8h9r");
        map.put("HTSV3: STI - tested-03","rKY81yrNWwO-ja1pGb0xZqC");
        map.put("HTSV3: STI - tested-04","rKY81yrNWwO-Aoyz53eT06v");
        map.put("HTSV3: STI - tested-05","rKY81yrNWwO-B49DkRhRjFU");
        map.put("HTSV3: STI - tested-06","rKY81yrNWwO-jWGYebQ1pCn");
        map.put("HTSV3: STI - tested-07","rKY81yrNWwO-haYMHQSFfFi");
        map.put("HTSV3: STI - tested-08","rKY81yrNWwO-ZhI3TLG2Iea");

        ///HTS - TB
        map.put("HTSV3: TB - eligible-01","MkrNsZA4Kr1-slGBtK9NsjZ");
        map.put("HTSV3: TB - eligible-02","MkrNsZA4Kr1-RL2LAAV8h9r");
        map.put("HTSV3: TB - eligible-03","MkrNsZA4Kr1-ja1pGb0xZqC");
        map.put("HTSV3: TB - eligible-04","MkrNsZA4Kr1-Aoyz53eT06v");
        map.put("HTSV3: TB - eligible-05","MkrNsZA4Kr1-B49DkRhRjFU");
        map.put("HTSV3: TB - eligible-06","MkrNsZA4Kr1-jWGYebQ1pCn");
        map.put("HTSV3: TB - eligible-07","MkrNsZA4Kr1-haYMHQSFfFi");
        map.put("HTSV3: TB - eligible-08","MkrNsZA4Kr1-ZhI3TLG2Iea");

        map.put("HTSV3: TB - known positive-01","jQ5xa4F3BOn-slGBtK9NsjZ");
        map.put("HTSV3: TB - known positive-02","jQ5xa4F3BOn-RL2LAAV8h9r");
        map.put("HTSV3: TB - known positive-03","jQ5xa4F3BOn-ja1pGb0xZqC");
        map.put("HTSV3: TB - known positive-04","jQ5xa4F3BOn-Aoyz53eT06v");
        map.put("HTSV3: TB - known positive-05","jQ5xa4F3BOn-B49DkRhRjFU");
        map.put("HTSV3: TB - known positive-06","jQ5xa4F3BOn-jWGYebQ1pCn");
        map.put("HTSV3: TB - known positive-07","jQ5xa4F3BOn-haYMHQSFfFi");
        map.put("HTSV3: TB - known positive-08","jQ5xa4F3BOn-ZhI3TLG2Iea");

        map.put("HTSV3: TB - linked-01","hbfH9PQH3XG-slGBtK9NsjZ");
        map.put("HTSV3: TB - linked-02","hbfH9PQH3XG-RL2LAAV8h9r");
        map.put("HTSV3: TB - linked-03","hbfH9PQH3XG-ja1pGb0xZqC");
        map.put("HTSV3: TB - linked-04","hbfH9PQH3XG-Aoyz53eT06v");
        map.put("HTSV3: TB - linked-05","hbfH9PQH3XG-B49DkRhRjFU");
        map.put("HTSV3: TB - linked-06","hbfH9PQH3XG-jWGYebQ1pCn");
        map.put("HTSV3: TB - linked-07","hbfH9PQH3XG-haYMHQSFfFi");
        map.put("HTSV3: TB - linked-08","hbfH9PQH3XG-ZhI3TLG2Iea");

        map.put("HTSV3: TB - newly identified positive-01","lMNVKhEHEiM-slGBtK9NsjZ");
        map.put("HTSV3: TB - newly identified positive-02","lMNVKhEHEiM-RL2LAAV8h9r");
        map.put("HTSV3: TB - newly identified positive-03","lMNVKhEHEiM-ja1pGb0xZqC");
        map.put("HTSV3: TB - newly identified positive-04","lMNVKhEHEiM-Aoyz53eT06v");
        map.put("HTSV3: TB - newly identified positive-05","lMNVKhEHEiM-B49DkRhRjFU");
        map.put("HTSV3: TB - newly identified positive-06","lMNVKhEHEiM-jWGYebQ1pCn");
        map.put("HTSV3: TB - newly identified positive-07","lMNVKhEHEiM-haYMHQSFfFi");
        map.put("HTSV3: TB - newly identified positive-08","lMNVKhEHEiM-ZhI3TLG2Iea");

        map.put("HTSV3: TB - screened-01","zSTDVJi4svf-slGBtK9NsjZ");
        map.put("HTSV3: TB - screened-02","zSTDVJi4svf-RL2LAAV8h9r");
        map.put("HTSV3: TB - screened-03","zSTDVJi4svf-ja1pGb0xZqC");
        map.put("HTSV3: TB - screened-04","zSTDVJi4svf-Aoyz53eT06v");
        map.put("HTSV3: TB - screened-05","zSTDVJi4svf-B49DkRhRjFU");
        map.put("HTSV3: TB - screened-06","zSTDVJi4svf-jWGYebQ1pCn");
        map.put("HTSV3: TB - screened-07","zSTDVJi4svf-haYMHQSFfFi");
        map.put("HTSV3: TB - screened-08","zSTDVJi4svf-ZhI3TLG2Iea");

        map.put("HTSV3: TB - tested-01","cp8oDFcjpzg-slGBtK9NsjZ");
        map.put("HTSV3: TB - tested-02","cp8oDFcjpzg-RL2LAAV8h9r");
        map.put("HTSV3: TB - tested-03","cp8oDFcjpzg-ja1pGb0xZqC");
        map.put("HTSV3: TB - tested-04","cp8oDFcjpzg-Aoyz53eT06v");
        map.put("HTSV3: TB - tested-05","cp8oDFcjpzg-B49DkRhRjFU");
        map.put("HTSV3: TB - tested-06","cp8oDFcjpzg-jWGYebQ1pCn");
        map.put("HTSV3: TB - tested-07","cp8oDFcjpzg-haYMHQSFfFi");
        map.put("HTSV3: TB - tested-08","cp8oDFcjpzg-ZhI3TLG2Iea");

        ///HTS-VCT
        map.put("HTSV3: VCT - eligible-01","mV4CpSFHNuJ-slGBtK9NsjZ");
        map.put("HTSV3: VCT - eligible-02","mV4CpSFHNuJ-RL2LAAV8h9r");
        map.put("HTSV3: VCT - eligible-03","mV4CpSFHNuJ-ja1pGb0xZqC");
        map.put("HTSV3: VCT - eligible-04","mV4CpSFHNuJ-Aoyz53eT06v");
        map.put("HTSV3: VCT - eligible-05","mV4CpSFHNuJ-B49DkRhRjFU");
        map.put("HTSV3: VCT - eligible-06","mV4CpSFHNuJ-jWGYebQ1pCn");
        map.put("HTSV3: VCT - eligible-07","mV4CpSFHNuJ-haYMHQSFfFi");
        map.put("HTSV3: VCT - eligible-08","mV4CpSFHNuJ-ZhI3TLG2Iea");

        map.put("HTSV3: VCT - known positive-01","fe1E9fFs3pO-slGBtK9NsjZ");
        map.put("HTSV3: VCT - known positive-02","fe1E9fFs3pO-RL2LAAV8h9r");
        map.put("HTSV3: VCT - known positive-03","fe1E9fFs3pO-ja1pGb0xZqC");
        map.put("HTSV3: VCT - known positive-04","fe1E9fFs3pO-Aoyz53eT06v");
        map.put("HTSV3: VCT - known positive-05","fe1E9fFs3pO-B49DkRhRjFU");
        map.put("HTSV3: VCT - known positive-06","fe1E9fFs3pO-jWGYebQ1pCn");
        map.put("HTSV3: VCT - known positive-07","fe1E9fFs3pO-haYMHQSFfFi");
        map.put("HTSV3: VCT - known positive-08","fe1E9fFs3pO-ZhI3TLG2Iea");

        map.put("HTSV3: VCT - linked-01","fpHS4gF17fr-slGBtK9NsjZ");
        map.put("HTSV3: VCT - linked-02","fpHS4gF17fr-RL2LAAV8h9r");
        map.put("HTSV3: VCT - linked-03","fpHS4gF17fr-ja1pGb0xZqC");
        map.put("HTSV3: VCT - linked-04","fpHS4gF17fr-Aoyz53eT06v");
        map.put("HTSV3: VCT - linked-05","fpHS4gF17fr-B49DkRhRjFU");
        map.put("HTSV3: VCT - linked-06","fpHS4gF17fr-jWGYebQ1pCn");
        map.put("HTSV3: VCT - linked-07","fpHS4gF17fr-haYMHQSFfFi");
        map.put("HTSV3: VCT - linked-08","fpHS4gF17fr-ZhI3TLG2Iea");

        map.put("HTSV3: VCT - newly identified positive-01","LhsYUX8cSoq-slGBtK9NsjZ");
        map.put("HTSV3: VCT - newly identified positive-02","LhsYUX8cSoq-RL2LAAV8h9r");
        map.put("HTSV3: VCT - newly identified positive-03","LhsYUX8cSoq-ja1pGb0xZqC");
        map.put("HTSV3: VCT - newly identified positive-04","LhsYUX8cSoq-Aoyz53eT06v");
        map.put("HTSV3: VCT - newly identified positive-05","LhsYUX8cSoq-B49DkRhRjFU");
        map.put("HTSV3: VCT - newly identified positive-06","LhsYUX8cSoq-jWGYebQ1pCn");
        map.put("HTSV3: VCT - newly identified positive-07","LhsYUX8cSoq-haYMHQSFfFi");
        map.put("HTSV3: VCT - newly identified positive-08","LhsYUX8cSoq-ZhI3TLG2Iea");

        map.put("HTSV3: VCT - screened-01","VomTqrAsPvN-slGBtK9NsjZ");
        map.put("HTSV3: VCT - screened-02","VomTqrAsPvN-RL2LAAV8h9r");
        map.put("HTSV3: VCT - screened-03","VomTqrAsPvN-ja1pGb0xZqC");
        map.put("HTSV3: VCT - screened-04","VomTqrAsPvN-Aoyz53eT06v");
        map.put("HTSV3: VCT - screened-05","VomTqrAsPvN-B49DkRhRjFU");
        map.put("HTSV3: VCT - screened-06","VomTqrAsPvN-jWGYebQ1pCn");
        map.put("HTSV3: VCT - screened-07","VomTqrAsPvN-haYMHQSFfFi");
        map.put("HTSV3: VCT - screened-08","VomTqrAsPvN-ZhI3TLG2Iea");

        map.put("HTSV3: VCT - tested-01","GQuUKeAjOOZ-slGBtK9NsjZ");
        map.put("HTSV3: VCT - tested-02","GQuUKeAjOOZ-RL2LAAV8h9r");
        map.put("HTSV3: VCT - tested-03","GQuUKeAjOOZ-ja1pGb0xZqC");
        map.put("HTSV3: VCT - tested-04","GQuUKeAjOOZ-Aoyz53eT06v");
        map.put("HTSV3: VCT - tested-05","GQuUKeAjOOZ-B49DkRhRjFU");
        map.put("HTSV3: VCT - tested-06","GQuUKeAjOOZ-jWGYebQ1pCn");
        map.put("HTSV3: VCT - tested-07","GQuUKeAjOOZ-haYMHQSFfFi");
        map.put("HTSV3: VCT - tested-08","GQuUKeAjOOZ-ZhI3TLG2Iea");


        //HTS-SNS

        map.put("SNS: Number linked to ART treatment-01","EAbrI7ArAEq-v6qBP7jDqYa");
        map.put("SNS: Number linked to ART treatment-02","EAbrI7ArAEq-w6hTXXL0o3h");
        map.put("SNS: Number linked to ART treatment-03","EAbrI7ArAEq-odfTdG68YGm");
        map.put("SNS: Number linked to ART treatment-04","EAbrI7ArAEq-dhEH1NBaAjj");
        map.put("SNS: Number linked to ART treatment-05","EAbrI7ArAEq-q4OxynQU5QV");
        map.put("SNS: Number linked to ART treatment-06","EAbrI7ArAEq-XVBOQ9lykbZ");
        map.put("SNS: Number linked to ART treatment-07","EAbrI7ArAEq-rlLQv2E2hiu");
        map.put("SNS: Number linked to ART treatment-08","EAbrI7ArAEq-iq0RxIbVF8X");
        map.put("SNS: Number linked to ART treatment-09","EAbrI7ArAEq-H0ZKao4neWY");
        map.put("SNS: Number linked to ART treatment-10","EAbrI7ArAEq-LRioLyaKPFy");
        map.put("SNS: Number linked to ART treatment-11","EAbrI7ArAEq-aAV1Kbjd5nL");
        map.put("SNS: Number linked to ART treatment-12","EAbrI7ArAEq-FHjBVdZpife");
        map.put("SNS: Number linked to ART treatment-13","EAbrI7ArAEq-ZukpK6UkBnq");
        map.put("SNS: Number linked to ART treatment-14","EAbrI7ArAEq-KZRasA3TkMV");
        map.put("SNS: Number linked to ART treatment-15","EAbrI7ArAEq-L4x1PhCsNP8");
        map.put("SNS: Number linked to ART treatment-16","EAbrI7ArAEq-ahGrRQrdXtU");
        map.put("SNS: Number linked to ART treatment-17","EAbrI7ArAEq-AZ4i8HUDqPN");
        map.put("SNS: Number linked to ART treatment-18","EAbrI7ArAEq-phicvAYl3UX");

        map.put("SNS: Number linked to ART treatment-01","EAbrI7ArAEq-l6qiz8cWeUf");
        map.put("SNS: Number linked to ART treatment-02","EAbrI7ArAEq-rDyJ2I0f8Qw");
        map.put("SNS: Number linked to ART treatment-03","EAbrI7ArAEq-Benwaw4OySK");
        map.put("SNS: Number linked to ART treatment-04","EAbrI7ArAEq-Qcezzg0KVFQ");
        map.put("SNS: Number linked to ART treatment-05","EAbrI7ArAEq-XhsyEQlMigO");
        map.put("SNS: Number linked to ART treatment-06","EAbrI7ArAEq-iFcPrD07pto");
        map.put("SNS: Number linked to ART treatment-07","EAbrI7ArAEq-EGbTdrcb7LY");
        map.put("SNS: Number linked to ART treatment-08","EAbrI7ArAEq-mNExKTHFRnf");
        map.put("SNS: Number linked to ART treatment-09","EAbrI7ArAEq-spzzNhP2Qtv");
        map.put("SNS: Number linked to ART treatment-10","EAbrI7ArAEq-PkM3Dr7G7dv");
        map.put("SNS: Number linked to ART treatment-11","EAbrI7ArAEq-YI7jTMbfTDc");
        map.put("SNS: Number linked to ART treatment-12","EAbrI7ArAEq-fa5uGyo8Dem");
        map.put("SNS: Number linked to ART treatment-13","EAbrI7ArAEq-KguaO6rcMVZ");
        map.put("SNS: Number linked to ART treatment-14","EAbrI7ArAEq-jZmQNKKNtst");
        map.put("SNS: Number linked to ART treatment-15","EAbrI7ArAEq-kNopga63one");
        map.put("SNS: Number linked to ART treatment-16","EAbrI7ArAEq-dEiP911SPSp");
        map.put("SNS: Number linked to ART treatment-17","EAbrI7ArAEq-toXF9PqsUX9");
        map.put("SNS: Number linked to ART treatment-18","EAbrI7ArAEq-LybS0xvs6Rj");

        map.put("SNS: Number linked to ART treatment-01","EAbrI7ArAEq-osBiqn8qRp0");
        map.put("SNS: Number linked to ART treatment-02","EAbrI7ArAEq-ue3cLqckD9H");
        map.put("SNS: Number linked to ART treatment-03","EAbrI7ArAEq-qO9yEgJ5vnY");
        map.put("SNS: Number linked to ART treatment-04","EAbrI7ArAEq-bxXLe25O2Zl");
        map.put("SNS: Number linked to ART treatment-05","EAbrI7ArAEq-ECAPhMvBtaW");
        map.put("SNS: Number linked to ART treatment-06","EAbrI7ArAEq-lsNGeX5mix0");
        map.put("SNS: Number linked to ART treatment-07","EAbrI7ArAEq-nsAP7TAVsD4");
        map.put("SNS: Number linked to ART treatment-08","EAbrI7ArAEq-uUMPQhCmYYB");
        map.put("SNS: Number linked to ART treatment-09","EAbrI7ArAEq-gCBGc7xRyQZ");
        map.put("SNS: Number linked to ART treatment-10","EAbrI7ArAEq-bkk6a3yzYf3");
        map.put("SNS: Number linked to ART treatment-11","EAbrI7ArAEq-vTjSR8vVOQv");
        map.put("SNS: Number linked to ART treatment-12","EAbrI7ArAEq-GhWqdMhv3cQ");
        map.put("SNS: Number linked to ART treatment-13","EAbrI7ArAEq-ZiXmK1SFeCZ");
        map.put("SNS: Number linked to ART treatment-14","EAbrI7ArAEq-MyXJcL7l9Vw");
        map.put("SNS: Number linked to ART treatment-15","EAbrI7ArAEq-Dp0s8QenqEJ");
        map.put("SNS: Number linked to ART treatment-16","EAbrI7ArAEq-XM9mtTKCoRG");
        map.put("SNS: Number linked to ART treatment-17","EAbrI7ArAEq-iJfu71aDmrz");
        map.put("SNS: Number linked to ART treatment-18","EAbrI7ArAEq-oOcEmclLL4z");

        map.put("SNS: Number linked to ART treatment-01","EAbrI7ArAEq-dqyqxsMHdhT");
        map.put("SNS: Number linked to ART treatment-02","EAbrI7ArAEq-nmIXcuJVktj");
        map.put("SNS: Number linked to ART treatment-03","EAbrI7ArAEq-GaXA1cO6Sc0");
        map.put("SNS: Number linked to ART treatment-04","EAbrI7ArAEq-fGQ057ikKjw");
        map.put("SNS: Number linked to ART treatment-05","EAbrI7ArAEq-gkp3pYrfN2C");
        map.put("SNS: Number linked to ART treatment-06","EAbrI7ArAEq-GDy6mI4vqpA");
        map.put("SNS: Number linked to ART treatment-07","EAbrI7ArAEq-YxrLUIxvtvS");
        map.put("SNS: Number linked to ART treatment-08","EAbrI7ArAEq-St0Y4xJwpoF");
        map.put("SNS: Number linked to ART treatment-09","EAbrI7ArAEq-mXpC8uOkbo4");
        map.put("SNS: Number linked to ART treatment-10","EAbrI7ArAEq-LjpcduxMUHg");
        map.put("SNS: Number linked to ART treatment-11","EAbrI7ArAEq-cG0eKGm6sEc");
        map.put("SNS: Number linked to ART treatment-12","EAbrI7ArAEq-ZLorqQw6dGj");
        map.put("SNS: Number linked to ART treatment-13","EAbrI7ArAEq-wqFMoGQ8Ubp");
        map.put("SNS: Number linked to ART treatment-14","EAbrI7ArAEq-CS0t6VNkuBM");
        map.put("SNS: Number linked to ART treatment-15","EAbrI7ArAEq-kYFeOPrPKls");
        map.put("SNS: Number linked to ART treatment-16","EAbrI7ArAEq-UjA5773U71a");

        map.put("SNS: Number linked to ART treatment-01","EAbrI7ArAEq-jjAn4b9EuH5");
        map.put("SNS: Number linked to ART treatment-02","EAbrI7ArAEq-H8KdGrO5hD0");
        map.put("SNS: Number linked to ART treatment-03","EAbrI7ArAEq-wg8Mch3Sg52");
        map.put("SNS: Number linked to ART treatment-04","EAbrI7ArAEq-EB9n0cteLGM");
        map.put("SNS: Number linked to ART treatment-05","EAbrI7ArAEq-JGWdfsP9yPO");
        map.put("SNS: Number linked to ART treatment-06","EAbrI7ArAEq-bBr6xJNHzgE");
        map.put("SNS: Number linked to ART treatment-07","EAbrI7ArAEq-g85rjx11Iqy");
        map.put("SNS: Number linked to ART treatment-08","EAbrI7ArAEq-S093dAehczS");
        map.put("SNS: Number linked to ART treatment-09","EAbrI7ArAEq-pBRlLdWzh88");
        map.put("SNS: Number linked to ART treatment-10","EAbrI7ArAEq-qBTNpBJo5rt");
        map.put("SNS: Number linked to ART treatment-11","EAbrI7ArAEq-RMYQjO34ZrJ");
        map.put("SNS: Number linked to ART treatment-12","EAbrI7ArAEq-EX3EYrttElO");
        map.put("SNS: Number linked to ART treatment-13","EAbrI7ArAEq-PdNEnUOaNkM");
        map.put("SNS: Number linked to ART treatment-14","EAbrI7ArAEq-LMWqi3OUtAo");
        map.put("SNS: Number linked to ART treatment-15","EAbrI7ArAEq-JQDOlz4lMN9");
        map.put("SNS: Number linked to ART treatment-16","EAbrI7ArAEq-dakKIGwoYnF");
        map.put("SNS: Number linked to ART treatment-17","EAbrI7ArAEq-QfQNGRAFfX9");
        map.put("SNS: Number linked to ART treatment-18","EAbrI7ArAEq-zH8RdNvA9Ne");

        map.put("SNS: Number linked to ART treatment-01","EAbrI7ArAEq-GDTleTm8EEz");
        map.put("SNS: Number linked to ART treatment-02","EAbrI7ArAEq-r88noqMR7EO");
        map.put("SNS: Number linked to ART treatment-03","EAbrI7ArAEq-R6n9gfSTBWF");
        map.put("SNS: Number linked to ART treatment-04","EAbrI7ArAEq-FzQNyuinseI");
        map.put("SNS: Number linked to ART treatment-05","EAbrI7ArAEq-lcjzDxBNU8j");
        map.put("SNS: Number linked to ART treatment-06","EAbrI7ArAEq-c5QugMwP8w5");
        map.put("SNS: Number linked to ART treatment-07","EAbrI7ArAEq-iHCDjomG9zm");
        map.put("SNS: Number linked to ART treatment-08","EAbrI7ArAEq-bF48Lc4a2sr");
        map.put("SNS: Number linked to ART treatment-09","EAbrI7ArAEq-KFzAZrZqDOj");
        map.put("SNS: Number linked to ART treatment-10","EAbrI7ArAEq-f2pKXQ62ftf");
        map.put("SNS: Number linked to ART treatment-11","EAbrI7ArAEq-l9yfBmIn8cA");
        map.put("SNS: Number linked to ART treatment-12","EAbrI7ArAEq-y60iUOn7baa");
        map.put("SNS: Number linked to ART treatment-13","EAbrI7ArAEq-TkCP8oLnFfC");
        map.put("SNS: Number linked to ART treatment-14","EAbrI7ArAEq-os5oBOTvQ6u");
        map.put("SNS: Number linked to ART treatment-15","EAbrI7ArAEq-aaMY1byISax");
        map.put("SNS: Number linked to ART treatment-16","EAbrI7ArAEq-kt7tOtsGE3s");



        map.put("SNS: Number Tested for HIV-01","SbAxINYXIaD-v6qBP7jDqYa");
        map.put("SNS: Number Tested for HIV-02","SbAxINYXIaD-w6hTXXL0o3h");
        map.put("SNS: Number Tested for HIV-03","SbAxINYXIaD-odfTdG68YGm");
        map.put("SNS: Number Tested for HIV-04","SbAxINYXIaD-dhEH1NBaAjj");
        map.put("SNS: Number Tested for HIV-05","SbAxINYXIaD-q4OxynQU5QV");
        map.put("SNS: Number Tested for HIV-06","SbAxINYXIaD-XVBOQ9lykbZ");
        map.put("SNS: Number Tested for HIV-07","SbAxINYXIaD-rlLQv2E2hiu");
        map.put("SNS: Number Tested for HIV-08","SbAxINYXIaD-iq0RxIbVF8X");
        map.put("SNS: Number Tested for HIV-09","SbAxINYXIaD-H0ZKao4neWY");
        map.put("SNS: Number Tested for HIV-10","SbAxINYXIaD-LRioLyaKPFy");
        map.put("SNS: Number Tested for HIV-11","SbAxINYXIaD-aAV1Kbjd5nL");
        map.put("SNS: Number Tested for HIV-12","SbAxINYXIaD-FHjBVdZpife");
        map.put("SNS: Number Tested for HIV-13","SbAxINYXIaD-ZukpK6UkBnq");
        map.put("SNS: Number Tested for HIV-14","SbAxINYXIaD-KZRasA3TkMV");
        map.put("SNS: Number Tested for HIV-15","SbAxINYXIaD-L4x1PhCsNP8");
        map.put("SNS: Number Tested for HIV-16","SbAxINYXIaD-ahGrRQrdXtU");
        map.put("SNS: Number Tested for HIV-17","SbAxINYXIaD-AZ4i8HUDqPN");
        map.put("SNS: Number Tested for HIV-18","SbAxINYXIaD-phicvAYl3UX");

        map.put("SNS: Number Tested for HIV-01","SbAxINYXIaD-l6qiz8cWeUf");
        map.put("SNS: Number Tested for HIV-02","SbAxINYXIaD-rDyJ2I0f8Qw");
        map.put("SNS: Number Tested for HIV-03","SbAxINYXIaD-Benwaw4OySK");
        map.put("SNS: Number Tested for HIV-04","SbAxINYXIaD-Qcezzg0KVFQ");
        map.put("SNS: Number Tested for HIV-05","SbAxINYXIaD-XhsyEQlMigO");
        map.put("SNS: Number Tested for HIV-06","SbAxINYXIaD-iFcPrD07pto");
        map.put("SNS: Number Tested for HIV-07","SbAxINYXIaD-EGbTdrcb7LY");
        map.put("SNS: Number Tested for HIV-08","SbAxINYXIaD-mNExKTHFRnf");
        map.put("SNS: Number Tested for HIV-09","SbAxINYXIaD-spzzNhP2Qtv");
        map.put("SNS: Number Tested for HIV-10","SbAxINYXIaD-PkM3Dr7G7dv");
        map.put("SNS: Number Tested for HIV-11","SbAxINYXIaD-YI7jTMbfTDc");
        map.put("SNS: Number Tested for HIV-12","SbAxINYXIaD-fa5uGyo8Dem");
        map.put("SNS: Number Tested for HIV-13","SbAxINYXIaD-KguaO6rcMVZ");
        map.put("SNS: Number Tested for HIV-14","SbAxINYXIaD-jZmQNKKNtst");
        map.put("SNS: Number Tested for HIV-15","SbAxINYXIaD-kNopga63one");
        map.put("SNS: Number Tested for HIV-16","SbAxINYXIaD-dEiP911SPSp");
        map.put("SNS: Number Tested for HIV-17","SbAxINYXIaD-toXF9PqsUX9");
        map.put("SNS: Number Tested for HIV-18","SbAxINYXIaD-LybS0xvs6Rj");

        map.put("SNS: Number Tested for HIV-01","SbAxINYXIaD-osBiqn8qRp0");
        map.put("SNS: Number Tested for HIV-02","SbAxINYXIaD-ue3cLqckD9H");
        map.put("SNS: Number Tested for HIV-03","SbAxINYXIaD-ECAPhMvBtaW");
        map.put("SNS: Number Tested for HIV-04","SbAxINYXIaD-lsNGeX5mix0");
        map.put("SNS: Number Tested for HIV-05","SbAxINYXIaD-nsAP7TAVsD4");
        map.put("SNS: Number Tested for HIV-06","SbAxINYXIaD-uUMPQhCmYYB");
        map.put("SNS: Number Tested for HIV-07","SbAxINYXIaD-gCBGc7xRyQZ");
        map.put("SNS: Number Tested for HIV-08","SbAxINYXIaD-bkk6a3yzYf3");
        map.put("SNS: Number Tested for HIV-09","SbAxINYXIaD-vTjSR8vVOQv");
        map.put("SNS: Number Tested for HIV-10","SbAxINYXIaD-GhWqdMhv3cQ");
        map.put("SNS: Number Tested for HIV-11","SbAxINYXIaD-ZiXmK1SFeCZ");
        map.put("SNS: Number Tested for HIV-12","SbAxINYXIaD-MyXJcL7l9Vw");
        map.put("SNS: Number Tested for HIV-13","SbAxINYXIaD-Dp0s8QenqEJ");
        map.put("SNS: Number Tested for HIV-14","SbAxINYXIaD-XM9mtTKCoRG");
        map.put("SNS: Number Tested for HIV-15","SbAxINYXIaD-iJfu71aDmrz");
        map.put("SNS: Number Tested for HIV-16","SbAxINYXIaD-oOcEmclLL4z");

        map.put("SNS: Number Tested for HIV-01","SbAxINYXIaD-dqyqxsMHdhT");
        map.put("SNS: Number Tested for HIV-02","SbAxINYXIaD-nmIXcuJVktj");
        map.put("SNS: Number Tested for HIV-03","SbAxINYXIaD-GaXA1cO6Sc0");
        map.put("SNS: Number Tested for HIV-04","SbAxINYXIaD-fGQ057ikKjw");
        map.put("SNS: Number Tested for HIV-05","SbAxINYXIaD-gkp3pYrfN2C");
        map.put("SNS: Number Tested for HIV-06","SbAxINYXIaD-GDy6mI4vqpA");
        map.put("SNS: Number Tested for HIV-07","SbAxINYXIaD-YxrLUIxvtvS");
        map.put("SNS: Number Tested for HIV-08","SbAxINYXIaD-St0Y4xJwpoF");
        map.put("SNS: Number Tested for HIV-09","SbAxINYXIaD-mXpC8uOkbo4");
        map.put("SNS: Number Tested for HIV-10","SbAxINYXIaD-LjpcduxMUHg");
        map.put("SNS: Number Tested for HIV-11","SbAxINYXIaD-cG0eKGm6sEc");
        map.put("SNS: Number Tested for HIV-12","SbAxINYXIaD-ZLorqQw6dGj");
        map.put("SNS: Number Tested for HIV-13","SbAxINYXIaD-wqFMoGQ8Ubp");
        map.put("SNS: Number Tested for HIV-14","SbAxINYXIaD-CS0t6VNkuBM");
        map.put("SNS: Number Tested for HIV-15","SbAxINYXIaD-kYFeOPrPKls");
        map.put("SNS: Number Tested for HIV-16","SbAxINYXIaD-UjA5773U71a");
        map.put("SNS: Number Tested for HIV-17","SbAxINYXIaD-jjAn4b9EuH5");
        map.put("SNS: Number Tested for HIV-18","SbAxINYXIaD-H8KdGrO5hD0");

        map.put("SNS: Number Tested for HIV-01","SbAxINYXIaD-wg8Mch3Sg52");
        map.put("SNS: Number Tested for HIV-02","SbAxINYXIaD-EB9n0cteLGM");
        map.put("SNS: Number Tested for HIV-03","SbAxINYXIaD-JGWdfsP9yPO");
        map.put("SNS: Number Tested for HIV-04","SbAxINYXIaD-bBr6xJNHzgE");
        map.put("SNS: Number Tested for HIV-05","SbAxINYXIaD-g85rjx11Iqy");
        map.put("SNS: Number Tested for HIV-06","SbAxINYXIaD-S093dAehczS");
        map.put("SNS: Number Tested for HIV-07","SbAxINYXIaD-pBRlLdWzh88");
        map.put("SNS: Number Tested for HIV-08","SbAxINYXIaD-qBTNpBJo5rt");
        map.put("SNS: Number Tested for HIV-09","SbAxINYXIaD-RMYQjO34ZrJ");
        map.put("SNS: Number Tested for HIV-10","SbAxINYXIaD-EX3EYrttElO");
        map.put("SNS: Number Tested for HIV-11","SbAxINYXIaD-PdNEnUOaNkM");
        map.put("SNS: Number Tested for HIV-12","SbAxINYXIaD-LMWqi3OUtAo");
        map.put("SNS: Number Tested for HIV-13","SbAxINYXIaD-JQDOlz4lMN9");
        map.put("SNS: Number Tested for HIV-14","SbAxINYXIaD-dakKIGwoYnF");
        map.put("SNS: Number Tested for HIV-15","SbAxINYXIaD-QfQNGRAFfX9");
        map.put("SNS: Number Tested for HIV-16","SbAxINYXIaD-zH8RdNvA9Ne");

        map.put("SNS: Number Tested for HIV-01","SbAxINYXIaD-GDTleTm8EEz");
        map.put("SNS: Number Tested for HIV-02","SbAxINYXIaD-r88noqMR7EO");
        map.put("SNS: Number Tested for HIV-03","SbAxINYXIaD-R6n9gfSTBWF");
        map.put("SNS: Number Tested for HIV-04","SbAxINYXIaD-FzQNyuinseI");
        map.put("SNS: Number Tested for HIV-05","SbAxINYXIaD-lcjzDxBNU8j");
        map.put("SNS: Number Tested for HIV-06","SbAxINYXIaD-c5QugMwP8w5");
        map.put("SNS: Number Tested for HIV-07","SbAxINYXIaD-iHCDjomG9zm");
        map.put("SNS: Number Tested for HIV-08","SbAxINYXIaD-bF48Lc4a2sr");
        map.put("SNS: Number Tested for HIV-09","SbAxINYXIaD-KFzAZrZqDOj");
        map.put("SNS: Number Tested for HIV-10","SbAxINYXIaD-f2pKXQ62ftf");
        map.put("SNS: Number Tested for HIV-11","SbAxINYXIaD-l9yfBmIn8cA");
        map.put("SNS: Number Tested for HIV-12","SbAxINYXIaD-y60iUOn7baa");
        map.put("SNS: Number Tested for HIV-13","SbAxINYXIaD-TkCP8oLnFfC");
        map.put("SNS: Number Tested for HIV-14","SbAxINYXIaD-os5oBOTvQ6u");
        map.put("SNS: Number Tested for HIV-15","SbAxINYXIaD-aaMY1byISax");
        map.put("SNS: Number Tested for HIV-16","SbAxINYXIaD-kt7tOtsGE3s");


        map.put("SNS: SNS_SEED_NEGATIVE-01","l3IUxyGhMHL-v6qBP7jDqYa");
        map.put("SNS: SNS_SEED_NEGATIVE-02","l3IUxyGhMHL-w6hTXXL0o3h");
        map.put("SNS: SNS_SEED_NEGATIVE-03","l3IUxyGhMHL-odfTdG68YGm");
        map.put("SNS: SNS_SEED_NEGATIVE-04","l3IUxyGhMHL-dhEH1NBaAjj");
        map.put("SNS: SNS_SEED_NEGATIVE-05","l3IUxyGhMHL-q4OxynQU5QV");
        map.put("SNS: SNS_SEED_NEGATIVE-06","l3IUxyGhMHL-XVBOQ9lykbZ");
        map.put("SNS: SNS_SEED_NEGATIVE-07","l3IUxyGhMHL-rlLQv2E2hiu");
        map.put("SNS: SNS_SEED_NEGATIVE-08","l3IUxyGhMHL-iq0RxIbVF8X");
        map.put("SNS: SNS_SEED_NEGATIVE-09","l3IUxyGhMHL-H0ZKao4neWY");
        map.put("SNS: SNS_SEED_NEGATIVE-10","l3IUxyGhMHL-LRioLyaKPFy");
        map.put("SNS: SNS_SEED_NEGATIVE-11","l3IUxyGhMHL-aAV1Kbjd5nL");
        map.put("SNS: SNS_SEED_NEGATIVE-12","l3IUxyGhMHL-FHjBVdZpife");
        map.put("SNS: SNS_SEED_NEGATIVE-13","l3IUxyGhMHL-ZukpK6UkBnq");
        map.put("SNS: SNS_SEED_NEGATIVE-14","l3IUxyGhMHL-KZRasA3TkMV");
        map.put("SNS: SNS_SEED_NEGATIVE-15","l3IUxyGhMHL-L4x1PhCsNP8");
        map.put("SNS: SNS_SEED_NEGATIVE-16","l3IUxyGhMHL-ahGrRQrdXtU");
        map.put("SNS: SNS_SEED_NEGATIVE-17","l3IUxyGhMHL-AZ4i8HUDqPN");
        map.put("SNS: SNS_SEED_NEGATIVE-18","l3IUxyGhMHL-phicvAYl3UX");

        map.put("SNS: SNS_SEED_NEGATIVE-01","l3IUxyGhMHL-l6qiz8cWeUf");
        map.put("SNS: SNS_SEED_NEGATIVE-02","l3IUxyGhMHL-rDyJ2I0f8Qw");
        map.put("SNS: SNS_SEED_NEGATIVE-03","l3IUxyGhMHL-Benwaw4OySK");
        map.put("SNS: SNS_SEED_NEGATIVE-04","l3IUxyGhMHL-Qcezzg0KVFQ");
        map.put("SNS: SNS_SEED_NEGATIVE-05","l3IUxyGhMHL-XhsyEQlMigO");
        map.put("SNS: SNS_SEED_NEGATIVE-06","l3IUxyGhMHL-iFcPrD07pto");
        map.put("SNS: SNS_SEED_NEGATIVE-07","l3IUxyGhMHL-EGbTdrcb7LY");
        map.put("SNS: SNS_SEED_NEGATIVE-08","l3IUxyGhMHL-mNExKTHFRnf");
        map.put("SNS: SNS_SEED_NEGATIVE-09","l3IUxyGhMHL-spzzNhP2Qtv");
        map.put("SNS: SNS_SEED_NEGATIVE-10","l3IUxyGhMHL-PkM3Dr7G7dv");
        map.put("SNS: SNS_SEED_NEGATIVE-11","l3IUxyGhMHL-YI7jTMbfTDc");
        map.put("SNS: SNS_SEED_NEGATIVE-12","l3IUxyGhMHL-fa5uGyo8Dem");
        map.put("SNS: SNS_SEED_NEGATIVE-13","l3IUxyGhMHL-KguaO6rcMVZ");
        map.put("SNS: SNS_SEED_NEGATIVE-14","l3IUxyGhMHL-jZmQNKKNtst");
        map.put("SNS: SNS_SEED_NEGATIVE-15","l3IUxyGhMHL-kNopga63one");
        map.put("SNS: SNS_SEED_NEGATIVE-16","l3IUxyGhMHL-dEiP911SPSp");
        map.put("SNS: SNS_SEED_NEGATIVE-17","l3IUxyGhMHL-toXF9PqsUX9");
        map.put("SNS: SNS_SEED_NEGATIVE-18","l3IUxyGhMHL-LybS0xvs6Rj");

        map.put("SNS: SNS_SEED_NEGATIVE-01","l3IUxyGhMHL-osBiqn8qRp0");
        map.put("SNS: SNS_SEED_NEGATIVE-02","l3IUxyGhMHL-ue3cLqckD9H");
        map.put("SNS: SNS_SEED_NEGATIVE-03","l3IUxyGhMHL-qO9yEgJ5vnY");
        map.put("SNS: SNS_SEED_NEGATIVE-04","l3IUxyGhMHL-bxXLe25O2Zl");
        map.put("SNS: SNS_SEED_NEGATIVE-05","l3IUxyGhMHL-ECAPhMvBtaW");
        map.put("SNS: SNS_SEED_NEGATIVE-06","l3IUxyGhMHL-lsNGeX5mix0");
        map.put("SNS: SNS_SEED_NEGATIVE-07","l3IUxyGhMHL-nsAP7TAVsD4");
        map.put("SNS: SNS_SEED_NEGATIVE-08","l3IUxyGhMHL-uUMPQhCmYYB");
        map.put("SNS: SNS_SEED_NEGATIVE-09","l3IUxyGhMHL-gCBGc7xRyQZ");
        map.put("SNS: SNS_SEED_NEGATIVE-10","l3IUxyGhMHL-bkk6a3yzYf3");
        map.put("SNS: SNS_SEED_NEGATIVE-11","l3IUxyGhMHL-vTjSR8vVOQv");
        map.put("SNS: SNS_SEED_NEGATIVE-12","l3IUxyGhMHL-GhWqdMhv3cQ");
        map.put("SNS: SNS_SEED_NEGATIVE-13","l3IUxyGhMHL-ZiXmK1SFeCZ");
        map.put("SNS: SNS_SEED_NEGATIVE-14","l3IUxyGhMHL-MyXJcL7l9Vw");
        map.put("SNS: SNS_SEED_NEGATIVE-15","l3IUxyGhMHL-Dp0s8QenqEJ");
        map.put("SNS: SNS_SEED_NEGATIVE-16","l3IUxyGhMHL-XM9mtTKCoRG");
        map.put("SNS: SNS_SEED_NEGATIVE-17","l3IUxyGhMHL-iJfu71aDmrz");
        map.put("SNS: SNS_SEED_NEGATIVE-18","l3IUxyGhMHL-oOcEmclLL4z");

        map.put("SNS: SNS_SEED_NEGATIVE-01","l3IUxyGhMHL-dqyqxsMHdhT");
        map.put("SNS: SNS_SEED_NEGATIVE-02","l3IUxyGhMHL-nmIXcuJVktj");
        map.put("SNS: SNS_SEED_NEGATIVE-03","l3IUxyGhMHL-GaXA1cO6Sc0");
        map.put("SNS: SNS_SEED_NEGATIVE-04","l3IUxyGhMHL-fGQ057ikKjw");
        map.put("SNS: SNS_SEED_NEGATIVE-05","l3IUxyGhMHL-gkp3pYrfN2C");
        map.put("SNS: SNS_SEED_NEGATIVE-06","l3IUxyGhMHL-GDy6mI4vqpA");
        map.put("SNS: SNS_SEED_NEGATIVE-07","l3IUxyGhMHL-YxrLUIxvtvS");
        map.put("SNS: SNS_SEED_NEGATIVE-08","l3IUxyGhMHL-St0Y4xJwpoF");
        map.put("SNS: SNS_SEED_NEGATIVE-09","l3IUxyGhMHL-mXpC8uOkbo4");
        map.put("SNS: SNS_SEED_NEGATIVE-10","l3IUxyGhMHL-LjpcduxMUHg");
        map.put("SNS: SNS_SEED_NEGATIVE-11","l3IUxyGhMHL-cG0eKGm6sEc");
        map.put("SNS: SNS_SEED_NEGATIVE-12","l3IUxyGhMHL-ZLorqQw6dGj");
        map.put("SNS: SNS_SEED_NEGATIVE-13","l3IUxyGhMHL-wqFMoGQ8Ubp");
        map.put("SNS: SNS_SEED_NEGATIVE-14","l3IUxyGhMHL-CS0t6VNkuBM");
        map.put("SNS: SNS_SEED_NEGATIVE-15","l3IUxyGhMHL-kYFeOPrPKls");
        map.put("SNS: SNS_SEED_NEGATIVE-16","l3IUxyGhMHL-UjA5773U71a");
        map.put("SNS: SNS_SEED_NEGATIVE-17","l3IUxyGhMHL-jjAn4b9EuH5");
        map.put("SNS: SNS_SEED_NEGATIVE-18","l3IUxyGhMHL-H8KdGrO5hD0");

        map.put("SNS: SNS_SEED_NEGATIVE-01","l3IUxyGhMHL-wg8Mch3Sg52");
        map.put("SNS: SNS_SEED_NEGATIVE-02","l3IUxyGhMHL-EB9n0cteLGM");
        map.put("SNS: SNS_SEED_NEGATIVE-03","l3IUxyGhMHL-JGWdfsP9yPO");
        map.put("SNS: SNS_SEED_NEGATIVE-04","l3IUxyGhMHL-bBr6xJNHzgE");
        map.put("SNS: SNS_SEED_NEGATIVE-05","l3IUxyGhMHL-g85rjx11Iqy");
        map.put("SNS: SNS_SEED_NEGATIVE-06","l3IUxyGhMHL-S093dAehczS");
        map.put("SNS: SNS_SEED_NEGATIVE-07","l3IUxyGhMHL-pBRlLdWzh88");
        map.put("SNS: SNS_SEED_NEGATIVE-08","l3IUxyGhMHL-qBTNpBJo5rt");
        map.put("SNS: SNS_SEED_NEGATIVE-09","l3IUxyGhMHL-RMYQjO34ZrJ");
        map.put("SNS: SNS_SEED_NEGATIVE-10","l3IUxyGhMHL-EX3EYrttElO");
        map.put("SNS: SNS_SEED_NEGATIVE-11","l3IUxyGhMHL-PdNEnUOaNkM");
        map.put("SNS: SNS_SEED_NEGATIVE-12","l3IUxyGhMHL-LMWqi3OUtAo");
        map.put("SNS: SNS_SEED_NEGATIVE-13","l3IUxyGhMHL-JQDOlz4lMN9");
        map.put("SNS: SNS_SEED_NEGATIVE-14","l3IUxyGhMHL-dakKIGwoYnF");
        map.put("SNS: SNS_SEED_NEGATIVE-15","l3IUxyGhMHL-QfQNGRAFfX9");
        map.put("SNS: SNS_SEED_NEGATIVE-16","l3IUxyGhMHL-zH8RdNvA9Ne");

        map.put("SNS: SNS_SEED_NEGATIVE-01","l3IUxyGhMHL-GDTleTm8EEz");
        map.put("SNS: SNS_SEED_NEGATIVE-02","l3IUxyGhMHL-r88noqMR7EO");
        map.put("SNS: SNS_SEED_NEGATIVE-03","l3IUxyGhMHL-R6n9gfSTBWF");
        map.put("SNS: SNS_SEED_NEGATIVE-04","l3IUxyGhMHL-FzQNyuinseI");
        map.put("SNS: SNS_SEED_NEGATIVE-05","l3IUxyGhMHL-lcjzDxBNU8j");
        map.put("SNS: SNS_SEED_NEGATIVE-06","l3IUxyGhMHL-c5QugMwP8w5");
        map.put("SNS: SNS_SEED_NEGATIVE-07","l3IUxyGhMHL-iHCDjomG9zm");
        map.put("SNS: SNS_SEED_NEGATIVE-08","l3IUxyGhMHL-bF48Lc4a2sr");
        map.put("SNS: SNS_SEED_NEGATIVE-09","l3IUxyGhMHL-KFzAZrZqDOj");
        map.put("SNS: SNS_SEED_NEGATIVE-10","l3IUxyGhMHL-f2pKXQ62ftf");
        map.put("SNS: SNS_SEED_NEGATIVE-11","l3IUxyGhMHL-l9yfBmIn8cA");
        map.put("SNS: SNS_SEED_NEGATIVE-12","l3IUxyGhMHL-y60iUOn7baa");
        map.put("SNS: SNS_SEED_NEGATIVE-13","l3IUxyGhMHL-TkCP8oLnFfC");
        map.put("SNS: SNS_SEED_NEGATIVE-14","l3IUxyGhMHL-os5oBOTvQ6u");
        map.put("SNS: SNS_SEED_NEGATIVE-15","l3IUxyGhMHL-aaMY1byISax");
        map.put("SNS: SNS_SEED_NEGATIVE-16","l3IUxyGhMHL-kt7tOtsGE3s");



        map.put("SNS: SNS_SEED_POSITIVE-01","QfG0OKLUDDG-v6qBP7jDqYa");
        map.put("SNS: SNS_SEED_POSITIVE-02","QfG0OKLUDDG-w6hTXXL0o3h");
        map.put("SNS: SNS_SEED_POSITIVE-03","QfG0OKLUDDG-odfTdG68YGm");
        map.put("SNS: SNS_SEED_POSITIVE-04","QfG0OKLUDDG-dhEH1NBaAjj");
        map.put("SNS: SNS_SEED_POSITIVE-05","QfG0OKLUDDG-q4OxynQU5QV");
        map.put("SNS: SNS_SEED_POSITIVE-06","QfG0OKLUDDG-XVBOQ9lykbZ");
        map.put("SNS: SNS_SEED_POSITIVE-07","QfG0OKLUDDG-rlLQv2E2hiu");
        map.put("SNS: SNS_SEED_POSITIVE-08","QfG0OKLUDDG-iq0RxIbVF8X");
        map.put("SNS: SNS_SEED_POSITIVE-09","QfG0OKLUDDG-H0ZKao4neWY");
        map.put("SNS: SNS_SEED_POSITIVE-10","QfG0OKLUDDG-LRioLyaKPFy");
        map.put("SNS: SNS_SEED_POSITIVE-11","QfG0OKLUDDG-aAV1Kbjd5nL");
        map.put("SNS: SNS_SEED_POSITIVE-12","QfG0OKLUDDG-FHjBVdZpife");
        map.put("SNS: SNS_SEED_POSITIVE-13","QfG0OKLUDDG-ZukpK6UkBnq");
        map.put("SNS: SNS_SEED_POSITIVE-14","QfG0OKLUDDG-KZRasA3TkMV");
        map.put("SNS: SNS_SEED_POSITIVE-15","QfG0OKLUDDG-L4x1PhCsNP8");
        map.put("SNS: SNS_SEED_POSITIVE-16","QfG0OKLUDDG-ahGrRQrdXtU");
        map.put("SNS: SNS_SEED_POSITIVE-17","QfG0OKLUDDG-AZ4i8HUDqPN");
        map.put("SNS: SNS_SEED_POSITIVE-18","QfG0OKLUDDG-phicvAYl3UX");

        map.put("SNS: SNS_SEED_POSITIVE-01","QfG0OKLUDDG-l6qiz8cWeUf");
        map.put("SNS: SNS_SEED_POSITIVE-02","QfG0OKLUDDG-rDyJ2I0f8Qw");
        map.put("SNS: SNS_SEED_POSITIVE-03","QfG0OKLUDDG-Benwaw4OySK");
        map.put("SNS: SNS_SEED_POSITIVE-04","QfG0OKLUDDG-Qcezzg0KVFQ");
        map.put("SNS: SNS_SEED_POSITIVE-05","QfG0OKLUDDG-XhsyEQlMigO");
        map.put("SNS: SNS_SEED_POSITIVE-06","QfG0OKLUDDG-iFcPrD07pto");
        map.put("SNS: SNS_SEED_POSITIVE-07","QfG0OKLUDDG-EGbTdrcb7LY");
        map.put("SNS: SNS_SEED_POSITIVE-08","QfG0OKLUDDG-mNExKTHFRnf");
        map.put("SNS: SNS_SEED_POSITIVE-09","QfG0OKLUDDG-spzzNhP2Qtv");
        map.put("SNS: SNS_SEED_POSITIVE-10","QfG0OKLUDDG-PkM3Dr7G7dv");
        map.put("SNS: SNS_SEED_POSITIVE-11","QfG0OKLUDDG-YI7jTMbfTDc");
        map.put("SNS: SNS_SEED_POSITIVE-12","QfG0OKLUDDG-fa5uGyo8Dem");
        map.put("SNS: SNS_SEED_POSITIVE-13","QfG0OKLUDDG-KguaO6rcMVZ");
        map.put("SNS: SNS_SEED_POSITIVE-14","QfG0OKLUDDG-jZmQNKKNtst");
        map.put("SNS: SNS_SEED_POSITIVE-15","QfG0OKLUDDG-kNopga63one");
        map.put("SNS: SNS_SEED_POSITIVE-16","QfG0OKLUDDG-dEiP911SPSp");
        map.put("SNS: SNS_SEED_POSITIVE-17","QfG0OKLUDDG-toXF9PqsUX9");
        map.put("SNS: SNS_SEED_POSITIVE-18","QfG0OKLUDDG-LybS0xvs6Rj");

        map.put("SNS: SNS_SEED_POSITIVE-01","QfG0OKLUDDG-osBiqn8qRp0");
        map.put("SNS: SNS_SEED_POSITIVE-02","QfG0OKLUDDG-ue3cLqckD9H");
        map.put("SNS: SNS_SEED_POSITIVE-03","QfG0OKLUDDG-qO9yEgJ5vnY");
        map.put("SNS: SNS_SEED_POSITIVE-04","QfG0OKLUDDG-bxXLe25O2Zl");
        map.put("SNS: SNS_SEED_POSITIVE-05","QfG0OKLUDDG-ECAPhMvBtaW");
        map.put("SNS: SNS_SEED_POSITIVE-06","QfG0OKLUDDG-lsNGeX5mix0");
        map.put("SNS: SNS_SEED_POSITIVE-07","QfG0OKLUDDG-nsAP7TAVsD4");
        map.put("SNS: SNS_SEED_POSITIVE-08","QfG0OKLUDDG-uUMPQhCmYYB");
        map.put("SNS: SNS_SEED_POSITIVE-09","QfG0OKLUDDG-gCBGc7xRyQZ");
        map.put("SNS: SNS_SEED_POSITIVE-10","QfG0OKLUDDG-bkk6a3yzYf3");
        map.put("SNS: SNS_SEED_POSITIVE-11","QfG0OKLUDDG-vTjSR8vVOQv");
        map.put("SNS: SNS_SEED_POSITIVE-12","QfG0OKLUDDG-GhWqdMhv3cQ");
        map.put("SNS: SNS_SEED_POSITIVE-13","QfG0OKLUDDG-ZiXmK1SFeCZ");
        map.put("SNS: SNS_SEED_POSITIVE-14","QfG0OKLUDDG-MyXJcL7l9Vw");
        map.put("SNS: SNS_SEED_POSITIVE-15","QfG0OKLUDDG-Dp0s8QenqEJ");
        map.put("SNS: SNS_SEED_POSITIVE-16","QfG0OKLUDDG-XM9mtTKCoRG");
        map.put("SNS: SNS_SEED_POSITIVE-17","QfG0OKLUDDG-iJfu71aDmrz");
        map.put("SNS: SNS_SEED_POSITIVE-18","QfG0OKLUDDG-oOcEmclLL4z");

        map.put("SNS: SNS_SEED_POSITIVE-01","QfG0OKLUDDG-dqyqxsMHdhT");
        map.put("SNS: SNS_SEED_POSITIVE-02","QfG0OKLUDDG-nmIXcuJVktj");
        map.put("SNS: SNS_SEED_POSITIVE-03","QfG0OKLUDDG-GaXA1cO6Sc0");
        map.put("SNS: SNS_SEED_POSITIVE-04","QfG0OKLUDDG-fGQ057ikKjw");
        map.put("SNS: SNS_SEED_POSITIVE-05","QfG0OKLUDDG-gkp3pYrfN2C");
        map.put("SNS: SNS_SEED_POSITIVE-06","QfG0OKLUDDG-GDy6mI4vqpA");
        map.put("SNS: SNS_SEED_POSITIVE-07","QfG0OKLUDDG-YxrLUIxvtvS");
        map.put("SNS: SNS_SEED_POSITIVE-08","QfG0OKLUDDG-St0Y4xJwpoF");
        map.put("SNS: SNS_SEED_POSITIVE-09","QfG0OKLUDDG-mXpC8uOkbo4");
        map.put("SNS: SNS_SEED_POSITIVE-10","QfG0OKLUDDG-LjpcduxMUHg");
        map.put("SNS: SNS_SEED_POSITIVE-11","QfG0OKLUDDG-cG0eKGm6sEc");
        map.put("SNS: SNS_SEED_POSITIVE-12","QfG0OKLUDDG-ZLorqQw6dGj");
        map.put("SNS: SNS_SEED_POSITIVE-13","QfG0OKLUDDG-wqFMoGQ8Ubp");
        map.put("SNS: SNS_SEED_POSITIVE-14","QfG0OKLUDDG-CS0t6VNkuBM");
        map.put("SNS: SNS_SEED_POSITIVE-15","QfG0OKLUDDG-kYFeOPrPKls");
        map.put("SNS: SNS_SEED_POSITIVE-16","QfG0OKLUDDG-UjA5773U71a");

        map.put("SNS: SNS_SEED_POSITIVE-01","QfG0OKLUDDG-jjAn4b9EuH5");
        map.put("SNS: SNS_SEED_POSITIVE-02","QfG0OKLUDDG-H8KdGrO5hD0");
        map.put("SNS: SNS_SEED_POSITIVE-03","QfG0OKLUDDG-wg8Mch3Sg52");
        map.put("SNS: SNS_SEED_POSITIVE-04","QfG0OKLUDDG-EB9n0cteLGM");
        map.put("SNS: SNS_SEED_POSITIVE-05","QfG0OKLUDDG-JGWdfsP9yPO");
        map.put("SNS: SNS_SEED_POSITIVE-06","QfG0OKLUDDG-bBr6xJNHzgE");
        map.put("SNS: SNS_SEED_POSITIVE-07","QfG0OKLUDDG-g85rjx11Iqy");
        map.put("SNS: SNS_SEED_POSITIVE-08","QfG0OKLUDDG-S093dAehczS");
        map.put("SNS: SNS_SEED_POSITIVE-09","QfG0OKLUDDG-pBRlLdWzh88");
        map.put("SNS: SNS_SEED_POSITIVE-10","QfG0OKLUDDG-qBTNpBJo5rt");
        map.put("SNS: SNS_SEED_POSITIVE-11","QfG0OKLUDDG-RMYQjO34ZrJ");
        map.put("SNS: SNS_SEED_POSITIVE-12","QfG0OKLUDDG-EX3EYrttElO");
        map.put("SNS: SNS_SEED_POSITIVE-13","QfG0OKLUDDG-PdNEnUOaNkM");
        map.put("SNS: SNS_SEED_POSITIVE-14","QfG0OKLUDDG-LMWqi3OUtAo");
        map.put("SNS: SNS_SEED_POSITIVE-15","QfG0OKLUDDG-JQDOlz4lMN9");
        map.put("SNS: SNS_SEED_POSITIVE-16","QfG0OKLUDDG-dakKIGwoYnF");
        map.put("SNS: SNS_SEED_POSITIVE-17","QfG0OKLUDDG-QfQNGRAFfX9");
        map.put("SNS: SNS_SEED_POSITIVE-18","QfG0OKLUDDG-zH8RdNvA9Ne");

        map.put("SNS: SNS_SEED_POSITIVE-01","QfG0OKLUDDG-GDTleTm8EEz");
        map.put("SNS: SNS_SEED_POSITIVE-02","QfG0OKLUDDG-r88noqMR7EO");
        map.put("SNS: SNS_SEED_POSITIVE-03","QfG0OKLUDDG-R6n9gfSTBWF");
        map.put("SNS: SNS_SEED_POSITIVE-04","QfG0OKLUDDG-FzQNyuinseI");
        map.put("SNS: SNS_SEED_POSITIVE-05","QfG0OKLUDDG-lcjzDxBNU8j");
        map.put("SNS: SNS_SEED_POSITIVE-06","QfG0OKLUDDG-c5QugMwP8w5");
        map.put("SNS: SNS_SEED_POSITIVE-07","QfG0OKLUDDG-iHCDjomG9zm");
        map.put("SNS: SNS_SEED_POSITIVE-08","QfG0OKLUDDG-bF48Lc4a2sr");
        map.put("SNS: SNS_SEED_POSITIVE-09","QfG0OKLUDDG-KFzAZrZqDOj");
        map.put("SNS: SNS_SEED_POSITIVE-10","QfG0OKLUDDG-f2pKXQ62ftf");
        map.put("SNS: SNS_SEED_POSITIVE-11","QfG0OKLUDDG-l9yfBmIn8cA");
        map.put("SNS: SNS_SEED_POSITIVE-12","QfG0OKLUDDG-y60iUOn7baa");
        map.put("SNS: SNS_SEED_POSITIVE-13","QfG0OKLUDDG-TkCP8oLnFfC");
        map.put("SNS: SNS_SEED_POSITIVE-14","QfG0OKLUDDG-os5oBOTvQ6u");
        map.put("SNS: SNS_SEED_POSITIVE-15","QfG0OKLUDDG-aaMY1byISax");
        map.put("SNS: SNS_SEED_POSITIVE-16","QfG0OKLUDDG-kt7tOtsGE3s");


        map.put("SNS: Number HIV Positive-01","MOYyfH7taOU-v6qBP7jDqYa");
        map.put("SNS: Number HIV Positive-02","MOYyfH7taOU-w6hTXXL0o3h");
        map.put("SNS: Number HIV Positive-03","MOYyfH7taOU-odfTdG68YGm");
        map.put("SNS: Number HIV Positive-04","MOYyfH7taOU-dhEH1NBaAjj");
        map.put("SNS: Number HIV Positive-05","MOYyfH7taOU-q4OxynQU5QV");
        map.put("SNS: Number HIV Positive-06","MOYyfH7taOU-XVBOQ9lykbZ");
        map.put("SNS: Number HIV Positive-07","MOYyfH7taOU-rlLQv2E2hiu");
        map.put("SNS: Number HIV Positive-08","MOYyfH7taOU-iq0RxIbVF8X");
        map.put("SNS: Number HIV Positive-09","MOYyfH7taOU-H0ZKao4neWY");
        map.put("SNS: Number HIV Positive-10","MOYyfH7taOU-LRioLyaKPFy");
        map.put("SNS: Number HIV Positive-11","MOYyfH7taOU-aAV1Kbjd5nL");
        map.put("SNS: Number HIV Positive-12","MOYyfH7taOU-FHjBVdZpife");
        map.put("SNS: Number HIV Positive-13","MOYyfH7taOU-ZukpK6UkBnq");
        map.put("SNS: Number HIV Positive-14","MOYyfH7taOU-KZRasA3TkMV");
        map.put("SNS: Number HIV Positive-15","MOYyfH7taOU-L4x1PhCsNP8");
        map.put("SNS: Number HIV Positive-16","MOYyfH7taOU-ahGrRQrdXtU");
        map.put("SNS: Number HIV Positive-17","MOYyfH7taOU-AZ4i8HUDqPN");
        map.put("SNS: Number HIV Positive-18","MOYyfH7taOU-phicvAYl3UX");

        map.put("SNS: Number HIV Positive-01","MOYyfH7taOU-l6qiz8cWeUf");
        map.put("SNS: Number HIV Positive-02","MOYyfH7taOU-rDyJ2I0f8Qw");
        map.put("SNS: Number HIV Positive-03","MOYyfH7taOU-Benwaw4OySK");
        map.put("SNS: Number HIV Positive-04","MOYyfH7taOU-Qcezzg0KVFQ");
        map.put("SNS: Number HIV Positive-05","MOYyfH7taOU-XhsyEQlMigO");
        map.put("SNS: Number HIV Positive-06","MOYyfH7taOU-iFcPrD07pto");
        map.put("SNS: Number HIV Positive-07","MOYyfH7taOU-EGbTdrcb7LY");
        map.put("SNS: Number HIV Positive-08","MOYyfH7taOU-mNExKTHFRnf");
        map.put("SNS: Number HIV Positive-09","MOYyfH7taOU-spzzNhP2Qtv");
        map.put("SNS: Number HIV Positive-10","MOYyfH7taOU-PkM3Dr7G7dv");
        map.put("SNS: Number HIV Positive-11","MOYyfH7taOU-YI7jTMbfTDc");
        map.put("SNS: Number HIV Positive-12","MOYyfH7taOU-fa5uGyo8Dem");
        map.put("SNS: Number HIV Positive-13","MOYyfH7taOU-KguaO6rcMVZ");
        map.put("SNS: Number HIV Positive-14","MOYyfH7taOU-jZmQNKKNtst");
        map.put("SNS: Number HIV Positive-15","MOYyfH7taOU-kNopga63one");
        map.put("SNS: Number HIV Positive-16","MOYyfH7taOU-dEiP911SPSp");
        map.put("SNS: Number HIV Positive-17","MOYyfH7taOU-toXF9PqsUX9");
        map.put("SNS: Number HIV Positive-18","MOYyfH7taOU-LybS0xvs6Rj");

        map.put("SNS: Number HIV Positive-01","MOYyfH7taOU-osBiqn8qRp0");
        map.put("SNS: Number HIV Positive-02","MOYyfH7taOU-ue3cLqckD9H");
        map.put("SNS: Number HIV Positive-03","MOYyfH7taOU-ECAPhMvBtaW");
        map.put("SNS: Number HIV Positive-04","MOYyfH7taOU-lsNGeX5mix0");
        map.put("SNS: Number HIV Positive-05","MOYyfH7taOU-nsAP7TAVsD4");
        map.put("SNS: Number HIV Positive-06","MOYyfH7taOU-uUMPQhCmYYB");
        map.put("SNS: Number HIV Positive-07","MOYyfH7taOU-gCBGc7xRyQZ");
        map.put("SNS: Number HIV Positive-08","MOYyfH7taOU-bkk6a3yzYf3");
        map.put("SNS: Number HIV Positive-09","MOYyfH7taOU-vTjSR8vVOQv");
        map.put("SNS: Number HIV Positive-10","MOYyfH7taOU-GhWqdMhv3cQ");
        map.put("SNS: Number HIV Positive-11","MOYyfH7taOU-ZiXmK1SFeCZ");
        map.put("SNS: Number HIV Positive-12","MOYyfH7taOU-MyXJcL7l9Vw");
        map.put("SNS: Number HIV Positive-13","MOYyfH7taOU-Dp0s8QenqEJ");
        map.put("SNS: Number HIV Positive-14","MOYyfH7taOU-XM9mtTKCoRG");
        map.put("SNS: Number HIV Positive-15","MOYyfH7taOU-iJfu71aDmrz");
        map.put("SNS: Number HIV Positive-16","MOYyfH7taOU-oOcEmclLL4z");

        map.put("SNS: Number HIV Positive-01","MOYyfH7taOU-dqyqxsMHdhT");
        map.put("SNS: Number HIV Positive-02","MOYyfH7taOU-nmIXcuJVktj");
        map.put("SNS: Number HIV Positive-03","MOYyfH7taOU-GaXA1cO6Sc0");
        map.put("SNS: Number HIV Positive-04","MOYyfH7taOU-fGQ057ikKjw");
        map.put("SNS: Number HIV Positive-05","MOYyfH7taOU-gkp3pYrfN2C");
        map.put("SNS: Number HIV Positive-06","MOYyfH7taOU-GDy6mI4vqpA");
        map.put("SNS: Number HIV Positive-07","MOYyfH7taOU-YxrLUIxvtvS");
        map.put("SNS: Number HIV Positive-08","MOYyfH7taOU-St0Y4xJwpoF");
        map.put("SNS: Number HIV Positive-09","MOYyfH7taOU-mXpC8uOkbo4");
        map.put("SNS: Number HIV Positive-10","MOYyfH7taOU-LjpcduxMUHg");
        map.put("SNS: Number HIV Positive-11","MOYyfH7taOU-cG0eKGm6sEc");
        map.put("SNS: Number HIV Positive-12","MOYyfH7taOU-ZLorqQw6dGj");
        map.put("SNS: Number HIV Positive-13","MOYyfH7taOU-wqFMoGQ8Ubp");
        map.put("SNS: Number HIV Positive-14","MOYyfH7taOU-CS0t6VNkuBM");
        map.put("SNS: Number HIV Positive-15","MOYyfH7taOU-kYFeOPrPKls");
        map.put("SNS: Number HIV Positive-16","MOYyfH7taOU-UjA5773U71a");
        map.put("SNS: Number HIV Positive-17","MOYyfH7taOU-jjAn4b9EuH5");
        map.put("SNS: Number HIV Positive-18","MOYyfH7taOU-H8KdGrO5hD0");

        map.put("SNS: Number HIV Positive-01","MOYyfH7taOU-wg8Mch3Sg52");
        map.put("SNS: Number HIV Positive-02","MOYyfH7taOU-EB9n0cteLGM");
        map.put("SNS: Number HIV Positive-03","MOYyfH7taOU-JGWdfsP9yPO");
        map.put("SNS: Number HIV Positive-04","MOYyfH7taOU-bBr6xJNHzgE");
        map.put("SNS: Number HIV Positive-05","MOYyfH7taOU-g85rjx11Iqy");
        map.put("SNS: Number HIV Positive-06","MOYyfH7taOU-S093dAehczS");
        map.put("SNS: Number HIV Positive-07","MOYyfH7taOU-pBRlLdWzh88");
        map.put("SNS: Number HIV Positive-08","MOYyfH7taOU-qBTNpBJo5rt");
        map.put("SNS: Number HIV Positive-09","MOYyfH7taOU-RMYQjO34ZrJ");
        map.put("SNS: Number HIV Positive-10","MOYyfH7taOU-EX3EYrttElO");
        map.put("SNS: Number HIV Positive-11","MOYyfH7taOU-PdNEnUOaNkM");
        map.put("SNS: Number HIV Positive-12","MOYyfH7taOU-LMWqi3OUtAo");
        map.put("SNS: Number HIV Positive-13","MOYyfH7taOU-JQDOlz4lMN9");
        map.put("SNS: Number HIV Positive-14","MOYyfH7taOU-dakKIGwoYnF");
        map.put("SNS: Number HIV Positive-15","MOYyfH7taOU-QfQNGRAFfX9");
        map.put("SNS: Number HIV Positive-16","MOYyfH7taOU-zH8RdNvA9Ne");

        map.put("SNS: Number HIV Positive-01","MOYyfH7taOU-GDTleTm8EEz");
        map.put("SNS: Number HIV Positive-02","MOYyfH7taOU-r88noqMR7EO");
        map.put("SNS: Number HIV Positive-03","MOYyfH7taOU-R6n9gfSTBWF");
        map.put("SNS: Number HIV Positive-04","MOYyfH7taOU-FzQNyuinseI");
        map.put("SNS: Number HIV Positive-05","MOYyfH7taOU-lcjzDxBNU8j");
        map.put("SNS: Number HIV Positive-06","MOYyfH7taOU-c5QugMwP8w5");
        map.put("SNS: Number HIV Positive-07","MOYyfH7taOU-iHCDjomG9zm");
        map.put("SNS: Number HIV Positive-08","MOYyfH7taOU-bF48Lc4a2sr");
        map.put("SNS: Number HIV Positive-09","MOYyfH7taOU-KFzAZrZqDOj");
        map.put("SNS: Number HIV Positive-10","MOYyfH7taOU-f2pKXQ62ftf");
        map.put("SNS: Number HIV Positive-11","MOYyfH7taOU-l9yfBmIn8cA");
        map.put("SNS: Number HIV Positive-12","MOYyfH7taOU-y60iUOn7baa");
        map.put("SNS: Number HIV Positive-13","MOYyfH7taOU-TkCP8oLnFfC");
        map.put("SNS: Number HIV Positive-14","MOYyfH7taOU-os5oBOTvQ6u");
        map.put("SNS: Number HIV Positive-15","MOYyfH7taOU-aaMY1byISax");
        map.put("SNS: Number HIV Positive-16","MOYyfH7taOU-kt7tOtsGE3s");







        return map.get(indicatorDisaggr);
    }

}
