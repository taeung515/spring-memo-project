package com.example.layered.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Memo {

    @Setter // 필드에 Setter는 해당속성인 id만 수정할 수 있도록 설정이 됨. 클래스레벨에선 전체속성! 꼭 변경해야하는 값만 필드위에Setter
    private Long id;
    private String title;
    private String contents;

    public Memo(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    // dto인 객체로 매개변수를 받을 수 있지만 이렇게 갈라서 쓰는것이 재사용성도 용이하다고 함.
    // 이유는 dto가 아니더라도 String이 들어오기만 한다면 쓸 수 있기때문
    public void update(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

}