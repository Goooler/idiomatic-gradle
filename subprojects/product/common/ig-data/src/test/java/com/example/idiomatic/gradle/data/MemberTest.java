/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.idiomatic.gradle.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void basicMemberTest() {
        Member m = Member.member("ABC");
        assertEquals("ABC", m.getName());
    }
}
