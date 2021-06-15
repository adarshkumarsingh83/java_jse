import com.adarsh.english.message.EnglishMessage;
import com.espark.message.Message;

module espark.english.message {
    requires espark.message;
    provides Message with EnglishMessage;
}