import com.consol.citrus.*
import com.consol.citrus.variable.*
import com.consol.citrus.context.TestContext
import com.consol.citrus.validation.script.GroovyScriptExecutor
import groovy.json.JsonSlurper
import com.consol.citrus.message.Message

public class ValidationScript implements GroovyScriptExecutor{
    public void validate(Message receivedMessage, TestContext context){
        def json = new JsonSlurper().parseText(receivedMessage.getPayload().toString())
        @SCRIPTBODY@
    }
}