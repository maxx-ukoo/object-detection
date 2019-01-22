package maxx.test;

public class Starter {

    //https://github.com/freearhey/iptv

    public static void main(String[] args) throws Exception {
        String url = "http://api.tv.ipnet.ua/api/v1/manifest/2007308341.m3u8?codec=mpeg4&app=playlist";
        url = "https://edge3.iptv.macc.com.ua/img/inter_3/index.m3u8";
        //url = "C:\\TOOLS\\tensorflow\\SampleVideo_720x480_20mb.mp4";
        url = "http://api.tv.ipnet.ua/api/v1/manifest/1442908080.m3u8";
        url = "http://app.live.112.events/hls/112hd_hi/index.m3u8";
        url = "rtsp://192.168.0.21:554/user=admin_password=6QNMIQGe_channel=1_stream=0.sdp?real_stream";
        VideoProcessor detector = new VideoProcessor(url);
        detector.start();
    }

}
