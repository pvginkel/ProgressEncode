package com.github.pvginkel.progressEncode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProgressFixture {
    @Test
    public void tests() throws IOException {
        try (
            InputStream is = getClass().getResourceAsStream("TestCases.txt");
            Reader reader = new InputStreamReader(is)
        ) {
            String line;

            while ((line = readLine(reader)) != null) {
                line = line.trim();
                String[] parts = line.split(":", 2);
                if (parts.length != 2) {
                    continue;
                }

                String encoded = parts[0].trim();
                List<Byte> bytes = new ArrayList<>();

                if (parts[1].trim().length() > 0) {
                    for (String string : parts[1].split(",")) {
                        byte b = (byte)Integer.parseInt(string.trim());
                        bytes.add(b);
                    }
                }

                byte[] rawBytes = new byte[bytes.size()];
                for (int i = 0; i < bytes.size(); i++) {
                    rawBytes[i] = bytes.get(i);
                }

                assertEquals(encoded, Progress.encode(rawBytes));
            }
        }
    }

    private String readLine(Reader reader) throws IOException {
        StringBuilder sb = new StringBuilder();

        int c;
        while ((c = reader.read()) != -1) {
            sb.append((char)c);
            if (c == '\n') {
                break;
            }
        }

        if (sb.length() == 0) {
            return null;
        }

        return sb.toString();
    }
}
