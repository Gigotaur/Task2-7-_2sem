package com.company.utils;

import javax.swing.*;


/**
 * Набор функций для работы с оконными приложениями с ипользованием Swing
 * @author Дмитрий Соломатин (кафедра ПиИТ ФКН ВГУ)
 */
public class SwingUtils {

    /**
     * Показать диалоговое окно с сообщением об ошибке
     * @param message Сообщение
     * @param title Заголовок окна
     * @param ex Иcключение
     */
    public static void showErrorMessageBox(String message, String title, Throwable ex) {
        StringBuilder sb = new StringBuilder(ex.toString());
        if (message != null) {
            sb.append(message);
        }
        if (ex != null) {
            sb.append("\n");
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(ste);
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString(), title, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Показать диалоговое окно с сообщением об ошибке
     * @param message Сообщение
     * @param ex Иcключение
     */
    public static void showErrorMessageBox(String message, Throwable ex) {
        showErrorMessageBox(message, "Ошибка", ex);
    }

    /**
     * Показать диалоговое окно с сообщением об ошибке
     * @param ex Иcключение
     */
    public static void showErrorMessageBox(Throwable ex) {
        showErrorMessageBox(null, ex);
    }
}
