package learning.web.api.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String field) {
        super("%s field is required", field);
    }
}
