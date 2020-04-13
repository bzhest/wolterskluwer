import com.example.wolterskluwer.helpers.Patterns;
import com.example.wolterskluwer.pojo.JsonSample;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static com.example.wolterskluwer.helpers.MappingUtil.getObjectFromJson;
import static com.example.wolterskluwer.helpers.enums.Template.FIRST_SAMPLE;
import static com.example.wolterskluwer.helpers.enums.Template.SECOND_SAMPLE;
import static com.example.wolterskluwer.helpers.enums.Template.THIRD_SAMPLE;

public class FieldsValidityTest {
    private SoftAssertions softly = new SoftAssertions();


    @Test
    public void checkValidFields() {
        JsonSample jsonSample = getObjectFromJson(JsonSample.class, FIRST_SAMPLE);
        String unid = jsonSample.getData().getUnid();
        String email = jsonSample.getData().getEmailAddress();
        String phone = jsonSample.getData().getPhoneNumber();
        softly.assertThat(unid).matches(Patterns.USER_ID.getValuePattern());
        softly.assertThat(email).matches(Patterns.EMAIL_VALUE.getValuePattern());
        softly.assertThat(phone).matches(Patterns.PHONE_NUMBER_VALUE.getValuePattern());
        softly.assertAll();
    }

    @Test
    public void checkInvalidFields() {
        JsonSample jsonSample = getObjectFromJson(JsonSample.class, SECOND_SAMPLE);
        String unid = jsonSample.getData().getUnid();
        String email = jsonSample.getData().getEmailAddress();
        String phone = jsonSample.getData().getPhoneNumber();
        softly.assertThat(unid).matches(Patterns.USER_ID.getValuePattern());
        softly.assertThat(email).matches(Patterns.EMAIL_VALUE.getValuePattern());
        softly.assertThat(phone).matches(Patterns.PHONE_NUMBER_VALUE.getValuePattern());
        softly.assertAll();
    }

    @Test
    public void checkBothValidAndInvalidFields() {
        JsonSample jsonSample = getObjectFromJson(JsonSample.class, THIRD_SAMPLE);
        String unid = jsonSample.getData().getUnid();
        String email = jsonSample.getData().getEmailAddress();
        String phone = jsonSample.getData().getPhoneNumber();
        softly.assertThat(unid).matches(Patterns.USER_ID.getValuePattern());
        softly.assertThat(email).matches(Patterns.EMAIL_VALUE.getValuePattern());
        softly.assertThat(phone).matches(Patterns.PHONE_NUMBER_VALUE.getValuePattern());
        softly.assertAll();
    }


}
