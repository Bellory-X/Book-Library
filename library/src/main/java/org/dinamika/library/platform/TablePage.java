package org.dinamika.library.platform;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;

@Schema(name = "Страница справочника")
public class TablePage<T> {

    public final List<T> rows;
    public final @Schema(description = "Номер страницы")
    @PositiveOrZero Integer pageNumber;
    public final @Schema(description = "Кол-во записей на странице")
    @Positive Integer pageSize;
    public final @Schema(description = "Кол-во страниц")
    @PositiveOrZero Integer pageCount;

    public TablePage(List<T> rows, Integer pageNumber, Integer pageSize, Integer pageCount) {
        this.rows = rows;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
    }

    public <R> TablePage(Page<R> page, Function<R, T> converter) {
        rows = page.stream()
                .map(converter)
                .toList();
        pageNumber = page.getNumber();
        pageSize = page.getNumberOfElements();
        pageCount = page.getTotalPages();
    }

    public TablePage(Page<T> page) {
        rows = page.getContent();
        pageNumber = page.getNumber();
        pageSize = page.getNumberOfElements();
        pageCount = page.getTotalPages();
    }

    public List<T> rows() {
        return rows;
    }

    public Integer pageNumber() {
        return pageNumber;
    }

    public Integer pageSize() {
        return pageSize;
    }

    public Integer pageCount() {
        return pageCount;
    }
}
