package com.josh.code.Samples;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ChallengeSnippetsTests {

    @Test
    public void testFibonacciSequence(){
        assertTrue(ChallengeSnippets.fib(3) == 2);
        assertTrue(ChallengeSnippets.fib(0) == 0);
        assertTrue(ChallengeSnippets.fib(10) == 55);

        System.out.print(ChallengeSnippets.fib(12));

    }


    public void testListNodeShit(){

    }

    @Test
    public void areStrUniques(){
        assertTrue(ChallengeSnippets.areAllCharactersUnique(null));
        assertTrue(ChallengeSnippets.areAllCharactersUnique("spdofi"));
        assertFalse(ChallengeSnippets.areAllCharactersUnique("aassddd"));

        assertTrue(ChallengeSnippets.altAreCharactersUnique(null));
        assertTrue(ChallengeSnippets.altAreCharactersUnique("spdofi"));
        assertFalse(ChallengeSnippets.altAreCharactersUnique("aassddd"));

    }
}
