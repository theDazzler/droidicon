package com.thedazzler.droidicon.typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Zhibo Wei (zweicmu@gmail.com), 2/3/15.
 */
public class EsocialTypefaceHolder extends TypefaceHolder {

    private final Map<String, Integer> esocialIconMap = new HashMap<String, Integer>();

    EsocialTypefaceHolder(String prefix, int resourceId) {
        super(prefix, resourceId);
        initIconMap();
        setIconMap(esocialIconMap);
    }

    private void initIconMap() {
        esocialIconMap.put("esocial-github", 0xF300);
        esocialIconMap.put("esocial-c-github", 0xF301);
        esocialIconMap.put("esocial-flickr", 0xF303);
        esocialIconMap.put("esocial-c-flickr", 0xF304);
        esocialIconMap.put("esocial-vimeo", 0xF306);
        esocialIconMap.put("esocial-c-vimeo", 0xF307);
        esocialIconMap.put("esocial-twitter", 0xF309);
        esocialIconMap.put("esocial-c-twitter", 0xF30A);
        esocialIconMap.put("esocial-facebook", 0xF30C);
        esocialIconMap.put("esocial-c-facebook", 0xF30D);
        esocialIconMap.put("esocial-s-facebook", 0xF30E);
        esocialIconMap.put("esocial-google-plus", 0xF30F);
        esocialIconMap.put("esocial-c-google-plus", 0xF310);
        esocialIconMap.put("esocial-pinterest", 0xF312);
        esocialIconMap.put("esocial-c-pinterest", 0xF313);
        esocialIconMap.put("esocial-tumblr", 0xF315);
        esocialIconMap.put("esocial-c-tumblr", 0xF316);
        esocialIconMap.put("esocial-linkedin", 0xF318);
        esocialIconMap.put("esocial-c-linkedin", 0xF319);
        esocialIconMap.put("esocial-dribble", 0xF31B);
        esocialIconMap.put("esocial-c-dribble", 0xF31C);
        esocialIconMap.put("esocial-stumbleupon", 0xF31E);
        esocialIconMap.put("esocial-c-stumbleupon", 0xF31F);
        esocialIconMap.put("esocial-lastfm", 0xF321);
        esocialIconMap.put("esocial-c-lastfm", 0xF322);
        esocialIconMap.put("esocial-rdio", 0xF324);
        esocialIconMap.put("esocial-c-rdio", 0xF325);
        esocialIconMap.put("esocial-spotify", 0xF327);
        esocialIconMap.put("esocial-c-spotify", 0xF328);
        esocialIconMap.put("esocial-qq", 0xF32A);
        esocialIconMap.put("esocial-instagram", 0xF32D);
        esocialIconMap.put("esocial-dropbox", 0xF330);
        esocialIconMap.put("esocial-evernote", 0xF333);
        esocialIconMap.put("esocial-flattr", 0xF336);
        esocialIconMap.put("esocial-skype", 0xF339);
        esocialIconMap.put("esocial-c-skype", 0xF33A);
        esocialIconMap.put("esocial-renren", 0xF33C);
        esocialIconMap.put("esocial-sina-weibo", 0xF33F);
        esocialIconMap.put("esocial-paypal", 0xF342);
        esocialIconMap.put("esocial-picasa", 0xF345);
        esocialIconMap.put("esocial-soundcloud", 0xF348);
        esocialIconMap.put("esocial-mixi", 0xF34B);
        esocialIconMap.put("esocial-behance", 0xF34E);
        esocialIconMap.put("esocial-google-circles", 0xF351);
        esocialIconMap.put("esocial-vk", 0xF354);
        esocialIconMap.put("esocial-smashing", 0xF357);
    }
}
