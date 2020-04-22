package edu.xored.tracker.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
   final private String name;
   final private String email;
}
