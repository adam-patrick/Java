package com.example.game;

import java.util.ArrayList;
import java.util.List;

// imported from Section 9 Interfaces Challenge

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
