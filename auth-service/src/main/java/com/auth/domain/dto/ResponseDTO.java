package com.auth.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO {
    private String message;
    private Integer code;
    private Object data;

    public static final class Code {
        public final static Integer OK = 200;
        public final static Integer CREATED = 201;
        public final static Integer ACCEPTED = 202;
        public final static Integer NON_AUTHORITATIVE_INFORMATION = 203;
        public final static Integer BAD_REQUEST = 400;
        public final static Integer UNAUTHORIZED = 401;
        public final static Integer FORBIDDEN = 403;
        public final static Integer NOT_FOUND = 404;
        public final static Integer CONFLICT = 409;
    }

}

