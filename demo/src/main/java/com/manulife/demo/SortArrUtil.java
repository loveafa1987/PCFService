package com.manulife.demo;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class SortArrUtil {

    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void sortArr() {
        int[] arr = {23, 1, 4, 20, 18, 9, 6, 0, -1};
        for(int i = 0; i < arr.length-1; i++){
        for(int j = 0; j < arr.length-1-i; j++){
            if(arr[j] >arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        String message1CN = this.messageSource.getMessage("msg", null, "Default", Locale.CHINA);
        StringBuilder stringBuilder = new StringBuilder(message1CN + "\n");
        for(int obj : arr){
            stringBuilder.append(obj + ",");
        }
        System.out.print(stringBuilder.substring(0, stringBuilder.length() - 1));
        /*String message2 = this.messageSource.getMessage("message2", new Object[] { "passed in value" }, "default", null);
        if (log.isInfoEnabled()) {
            log.info(message2);
        }*/
    }
}
