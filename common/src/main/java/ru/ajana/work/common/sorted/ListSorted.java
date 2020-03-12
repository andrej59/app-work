package ru.ajana.work.common.sorted;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сортировка списков.
 */
public class ListSorted {

    public static void main(String[] args) {
        List<Document> docList = new ArrayList<>();
        List<Document> docListSorted =
                docList.stream().sorted((d1, d2) -> {
                    if (d1.getDateFrom() == null) {
                        return 1;
                    }
                    if (d2.getDateFrom() == null) {
                        return -1;
                    }
                    return -d1.getDateFrom().compareTo(d2.getDateFrom());
                }).collect(Collectors.toList());

        docListSorted.forEach(d -> System.out.println(d.getDateFrom()));
    }

    public static class Document {

        private LocalDate dateFrom;

        public LocalDate getDateFrom() {
            return dateFrom;
        }

        public void setDateFrom(LocalDate dateFrom) {
            this.dateFrom = dateFrom;
        }
    }
}
