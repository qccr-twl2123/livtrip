package com.livtrip.web.controller;


import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by xierongli on 17/6/29.
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {

        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        final String text = "字串文字";
        final byte[] textByte = text.getBytes("UTF-8");
//编码
//        final String encodedText = encoder.encodeToString(textByte);
//        System.out.println(encodedText);
        String encodedText ="yoKmv45iSOSLAZSZ2M/XTscaQyDrWzCsmzrt19NPsk9AfYVgXZfBgaKCmfojq0JigydCaZeAVymKvYCnKRk8qHQMSAGZgtMLQSAYMlbzsVTNjw/Zr4V7ptbwZ2Cf7ZoiRQXGFHJ32ZP+srVsLWMOJjLWeJdS+aeE2K2B8Pn7Lp/1S/hqOzLqi9qCOYFcSB4nsI2AknwrnAJ4jIRfBYGn0zozfMPRNc5wLIq3YPEuXiKd74BgEGjyHoDAy+RYrD84lktfs8+t9gEOGTK8dYVenZyfR0NoozyUAyNmXq+tLuII69yyZbD2YlWbEMYFwlfvCjfEVJ/JgTp0jq2Bj+Jv789BiH9XpITCrCcsd/Va3w8jZlmkF6JsY4ZNqQhKWznryqOYE+q0NbYgYCvNzSfmBk0U7mwjpXCiL3cA2bPy2tXGp18KCx3OH/Y05uG36QjU8B88gQ4RcyHFDPrVrRk6wDpmhp6paHLRbHaavaWHzcwKifaFlxSJnGmmUxIAVTaPaH+d7qTnF2zwZ1B8fU2hIURwrmmM3VIFbas/SGKdYOoJH8V2stRvYBwMy7TdMqLrexhSdoUOEmLyCbE1sPdaW8I0+H3mw3GVguIHP8WCXDqtbE+mZTLGUX9aV0q/xdlCzDkDCztP0dD7Ek+DnqTSRjBPwpgcSPG6mD2KBknt2Zk=";
//解码
        System.out.println(new String(decoder.decode(encodedText), "UTF-8"));

    }

}
