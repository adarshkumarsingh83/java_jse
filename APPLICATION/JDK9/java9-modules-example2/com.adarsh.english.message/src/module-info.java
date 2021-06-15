import com.adarsh.english.message.EnglishMessage;
import com.espark.message.Message;

module com.adarsh.english.message {
    requires com.adarsh.message;
    provides Message with EnglishMessage;
}