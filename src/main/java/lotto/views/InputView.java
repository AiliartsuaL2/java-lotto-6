package lotto.views;

import camp.nextstep.edu.missionutils.Console;
import java.util.HashSet;
import java.util.Set;
import lotto.global.Utils;

public class InputView {
    public static final String PURCHASE_AMOUNT_INPUT_MESSAGE = "구입금액을 입력해 주세요.";
    public static final String WINNING_NUMBER_INPUT_MESSAGE = "당첨 번호를 입력해 주세요.";
    public static final String BONUS_NUMBER_INPUT_MESSAGE = "보너스 번호를 입력해 주세요.";

    public long getPurchaseAmount() {
        System.out.println(PURCHASE_AMOUNT_INPUT_MESSAGE);
        String input = Console.readLine();
        Utils.checkNumber(input);
        return Long.parseLong(input);
    }

    public Set<Integer> getOriginalWinningNumbers() {
        System.out.println(WINNING_NUMBER_INPUT_MESSAGE);
        String[] input = Console.readLine().split(",");
        Set<Integer> originalWinningNumbers = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            String number = input[i];
            Utils.checkNumber(number);
            originalWinningNumbers.add(Integer.parseInt(number));
        }
        return originalWinningNumbers;
    }

    public int getBonusNumber() {
        System.out.println(BONUS_NUMBER_INPUT_MESSAGE);
        String input = Console.readLine();
        Utils.checkNumber(input);
        return Integer.parseInt(input);
    }
}
