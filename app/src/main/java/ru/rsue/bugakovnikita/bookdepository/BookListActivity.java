package ru.rsue.bugakovnikita.bookdepository;

import androidx.fragment.app.Fragment;

import ru.rsue.bugakovnikita.bookdepository.BookDepository.SingleFragmentActivity;


public class BookListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new BookListFragment();
    }
}
