import com.adarsh.hindi.message.HindiMessage;
import com.espark.message.Message;

module espark.hindi.message {
    requires espark.message;
    provides Message with HindiMessage;
}