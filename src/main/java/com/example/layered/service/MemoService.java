package com.example.layered.service;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MemoService {
    MemoResponseDto saveMemo(MemoRequestDto dto);

    List<MemoResponseDto> findAllMemos();

    MemoResponseDto findMemoById(Long id);

    MemoResponseDto updateMemo(Long id, String title, String contents);
}
