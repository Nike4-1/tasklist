package validators;

import java.util.ArrayList;
import java.util.List;
import models.Tasks;

public class TasksValidator {
    // バリデーションを実行する
    public static List<String> validate(Tasks t) {
        List<String> errors = new ArrayList<String>();

        if (isEmpty(t.getContent())) {
            errors.add("タスクを入力してください。");
        }
        return errors;
    }


    // メッセージの必須入力チェック
    private static boolean isEmpty(String content) {
        if (content == null || content.equals("")) {
            return true;
        }

        return false;
    }
}
