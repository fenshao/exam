package cn.ynni.exam.model;

import java.util.ArrayList;
import java.util.List;

public class PageUtil<E>{
    static final int usersPerPage = 10;

    private int totalUsers;
    private int totalPages;
    private int beginIndex;
    private int endIndex;
    private int page;
    private List<E> list;

    public static int getPerPage() {
        return usersPerPage;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers % usersPerPage == 0 ? totalUsers / usersPerPage : totalUsers / usersPerPage + 1;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = (page - 1) * usersPerPage;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getEndIndex() {
        int endIndex = getBeginIndex() + usersPerPage;
        if (endIndex > totalUsers) endIndex = totalPages;

        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}