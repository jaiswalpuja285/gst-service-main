package com.gst.app.service;

import com.gst.app.entity.GSTDetail;
import com.gst.app.entity.IRNGeneration;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IRNGenerationServiceImpl implements IRNGenerationService{
    List<IRNGeneration> irnGenerations = Arrays.asList(new IRNGeneration[]{
            new IRNGeneration( "1120100002", "2020-08-05 15:18:00", "11f8ef701fe294d4a14aad0b12457e62775d0fdc41a0acf05b74fbb2ddc47acb", "eyJhbGciOiJSUzI1NiIsImtpZCI6IjExNUY0NDI2NjE3QTc5MzhCRTFCQTA2REJFRTkxQTQyNzU4NEVEQUIiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJFVjlFSm1GNmVUaS1HNkJ0dnVrYVFuV0U3YXMifQ.eyJkYXRhIjoie1wiQWNrTm9cIjoxMTIwMTAwMDAwMDIzMTUsXCJBY2tEdFwiOlwiMjAyMC0wOC0wNSAxNToxODowMFwiLFwiSXJuXCI6XCIxMWY4ZWY3MDFmZTI5NGQ0YTE0YWFkMGIxMjQ1N2U2Mjc3NWQwZmRjNDFhMGFjZjA1Yjc0ZmJiMmRkYzQ3YWNiXCIsXCJWZXJzaW9uXCI6XCIxLjAxXCIsXCJUcmFuRHRsc1wiOntcIlRheFNjaFwiOlwiR1NUXCIsXCJTdXBUeXBcIjpcIkIyQlwiLFwiUmVnUmV2XCI6XCJOXCIsXCJJZ3N0T25JbnRyYVwiOlwiWVwifSxcIkRvY0R0bHNcIjp7XCJUeXBcIjpcIklOVlwiLFwiTm9cIjpcIkRELTIwMjAwODA0LTlcIixcIkR0XCI6XCIwNC8wOC8yMDIwXCJ9LFwiU2VsbGVyRHRsc1wiOntcIkdzdGluXCI6XCIzN0FSWlBUNDM4NFExTVRcIixcIkxnbE5tXCI6XCIgQUJDIGNvbXBhbnkgcHZ0IGx0ZFwiLFwiVHJkTm1cIjpcInZpa2FzXCIsXCJBZGRyMVwiOlwiVEUgaFwiLFwiQWRkcjJcIjpcImFiY1wiLFwiTG9jXCI6XCJCYW5nYWxvcmVcIixcIlBpblwiOjUxNTMxMSxcIlN0Y2RcIjpcIjM3XCIsXCJQaFwiOlwiOTczODk3MTk3MFwiLFwiRW1cIjpcInZpa2FzQGdtYWlsLmNvbVwifSxcIkJ1eWVyRHRsc1wiOntcIkdzdGluXCI6XCIxMUFBQUNUMzkwNEYxWlpcIixcIkxnbE5tXCI6XCJYWVogY29tcGFueSBwdnQgbHRkXCIsXCJQb3NcIjpcIjM3XCIsXCJBZGRyMVwiOlwiN3RoIGJsb2NrLCBrdXZlbXB1IGxheW91dFwiLFwiTG9jXCI6XCJHQU5ESElOQUdBUlwiLFwiUGluXCI6NzM3MTAxLFwiU3RjZFwiOlwiMTFcIn0sXCJEaXNwRHRsc1wiOntcIk5tXCI6XCJuYW1lIG9mIHRoZSBjb21wYW55IGZyb20gd2hpY2ggZ29vZHMgZGlzcGF0Y2hlZFwiLFwiQWRkcjFcIjpcImFkZHJlc3NcIixcIkFkZHIyXCI6XCJCYW5nYWxvcmVcIixcIkxvY1wiOlwia3prXCIsXCJQaW5cIjo2OTA1MTMsXCJTdGNkXCI6XCIzMlwifSxcIlNoaXBEdGxzXCI6e1wiR3N0aW5cIjpcIjMyRElVUFAxMTc1RzFaMVwiLFwiTGdsTm1cIjpcInNoaXAgdHJhZGVcIixcIlRyZE5tXCI6XCJ2aWthc1wiLFwiQWRkcjFcIjpcInNoaXAgYiBub1wiLFwiQWRkcjJcIjpcIkJhbmdhbG9yZVwiLFwiTG9jXCI6XCJCYW5nYWxvcmVcIixcIlBpblwiOjY5MDUxMyxcIlN0Y2RcIjpcIjMyXCJ9LFwiSXRlbUxpc3RcIjpbe1wiSXRlbU5vXCI6MSxcIlNsTm9cIjpcIjFcIixcIklzU2VydmNcIjpcIk5cIixcIlByZERlc2NcIjpcIlN0ZWVsXCIsXCJIc25DZFwiOlwiMTAwMVwiLFwiUXR5XCI6MTAsXCJVbml0XCI6XCJCQUdcIixcIlVuaXRQcmljZVwiOjIwMC4wMCxcIlRvdEFtdFwiOjIwMDAuMDAsXCJEaXNjb3VudFwiOjEwLFwiQXNzQW10XCI6MTk5MC4wMCxcIkdzdFJ0XCI6MTIuMDAsXCJJZ3N0QW10XCI6MjM4LjgsXCJDZ3N0QW10XCI6MCxcIlNnc3RBbXRcIjowLFwiQ2VzUnRcIjo1LFwiQ2VzQW10XCI6OTkuNSxcIkNlc05vbkFkdmxBbXRcIjoxMCxcIlN0YXRlQ2VzUnRcIjoxMixcIlN0YXRlQ2VzQW10XCI6MjM4LjgwLFwiU3RhdGVDZXNOb25BZHZsQW10XCI6NSxcIk90aENocmdcIjoxMCxcIlRvdEl0ZW1WYWxcIjoyNTkyLjF9LHtcIkl0ZW1Ob1wiOjIsXCJTbE5vXCI6XCIyXCIsXCJJc1NlcnZjXCI6XCJOXCIsXCJQcmREZXNjXCI6XCJTdGVlbFwiLFwiSHNuQ2RcIjpcIjEwMDFcIixcIlF0eVwiOjEwLFwiVW5pdFwiOlwiQkFHXCIsXCJVbml0UHJpY2VcIjoyMDAuMDAsXCJUb3RBbXRcIjoyMDAwLjAwLFwiRGlzY291bnRcIjoxMCxcIkFzc0FtdFwiOjE5OTAuMDAsXCJHc3RSdFwiOjEyLjAwLFwiSWdzdEFtdFwiOjIzOC44LFwiQ2dzdEFtdFwiOjAsXCJTZ3N0QW10XCI6MCxcIkNlc1J0XCI6NSxcIkNlc0FtdFwiOjk5LjUsXCJDZXNOb25BZHZsQW10XCI6MTAsXCJTdGF0ZUNlc1J0XCI6MTIsXCJTdGF0ZUNlc0FtdFwiOjIzOC44MCxcIlN0YXRlQ2VzTm9uQWR2bEFtdFwiOjUsXCJPdGhDaHJnXCI6MTAsXCJUb3RJdGVtVmFsXCI6MjU5Mi4xfSx7XCJJdGVtTm9cIjozLFwiU2xOb1wiOlwiM1wiLFwiSXNTZXJ2Y1wiOlwiTlwiLFwiUHJkRGVzY1wiOlwiU3RlZWxcIixcIkhzbkNkXCI6XCIxMDAxXCIsXCJRdHlcIjoxMCxcIlVuaXRcIjpcIkJBR1wiLFwiVW5pdFByaWNlXCI6MjAwLjAwLFwiVG90QW10XCI6MjAwMC4wMCxcIkRpc2NvdW50XCI6MTAsXCJBc3NBbXRcIjoxOTkwLjAwLFwiR3N0UnRcIjoxMi4wMCxcIklnc3RBbXRcIjoyMzguOCxcIkNnc3RBbXRcIjowLFwiU2dzdEFtdFwiOjAsXCJDZXNSdFwiOjUsXCJDZXNBbXRcIjo5OS41LFwiQ2VzTm9uQWR2bEFtdFwiOjEwLFwiU3RhdGVDZXNSdFwiOjEyLFwiU3RhdGVDZXNBbXRcIjoyMzguODAsXCJTdGF0ZUNlc05vbkFkdmxBbXRcIjo1LFwiT3RoQ2hyZ1wiOjEwLFwiVG90SXRlbVZhbFwiOjI1OTIuMX1dLFwiVmFsRHRsc1wiOntcIkFzc1ZhbFwiOjU5NzAuMCxcIkNnc3RWYWxcIjowLFwiU2dzdFZhbFwiOjAsXCJJZ3N0VmFsXCI6NzE2LjQsXCJDZXNWYWxcIjozMjguNSxcIlN0Q2VzVmFsXCI6NzMxLjQsXCJSbmRPZmZBbXRcIjowLFwiVG90SW52VmFsXCI6Nzc3Ni4zfSxcIlJlZkR0bHNcIjp7XCJJbnZSbVwiOlwiMTIzXCIsXCJQcmVjRG9jRHRsc1wiOlt7XCJJbnZOb1wiOlwiQUJDXCIsXCJJbnZEdFwiOlwiMDIvMDIvMjAyMFwiLFwiT3RoUmVmTm9cIjpcIjEyQVwifV0sXCJDb250ckR0bHNcIjpbe1wiUmVjQWR2UmVmclwiOlwiMTIzXCIsXCJSZWNBZHZEdFwiOlwiMTIvMDIvMjAyMFwiLFwiVGVuZFJlZnJcIjpcImFiY1wiLFwiQ29udHJSZWZyXCI6XCJhYmNcIixcIkV4dFJlZnJcIjpcImFiY1wiLFwiUHJvalJlZnJcIjpcImFiY1wiLFwiUE9SZWZyXCI6XCJhYmNcIixcIlBPUmVmRHRcIjpcIjEyLzAyLzIwMjBcIn1dfSxcIkFkZGxEb2NEdGxzXCI6W3tcIlVybFwiOlwiaHR0cHM6Ly9laW52LWFwaXNhbmRib3gubmljLmluL2dzdGNvcmVfdGVzdC92MS4wMS9pbnZvaWNlXCIsXCJEb2NzXCI6XCJ2aWthc1wiLFwiSW5mb1wiOlwidmlrYXNcIn1dLFwiRXdiRHRsc1wiOntcIlRyYW5zSWRcIjpcIjEyQVdHUFY3MTA3QjFaMVwiLFwiVHJhbnNOYW1lXCI6XCJYWVogRVhQT1JUU1wiLFwiVHJhbnNNb2RlXCI6XCIxXCIsXCJEaXN0YW5jZVwiOjEwMCxcIlRyYW5zRG9jTm9cIjpcIkRPQzAxXCIsXCJUcmFuc0RvY0R0XCI6XCIwNC8wOC8yMDIwXCIsXCJWZWhOb1wiOlwia2ExMjM0NTZcIixcIlZlaFR5cGVcIjpcIlJcIn19IiwiaXNzIjoiTklDIn0.oesnTXdXgOEeRjYr6bRQ-_Ks-bnIpwtj7Zx8phzfjL6vsfuGqBokILz6ai0NHFKRxiX_bTLrgrWmwXyBdEFmt88myf4n-NP5JvwqFx4OIf0gYMFTKGLx4AQsxwXER836FDxyS33K_7Erkm7_yHsITR5sBkYrZYOWimYl5cgh4EFN2mEq0B8oIp9pSXAU2RGvuirV6Rnl902sWj1Zv_2UK8e9C7cS7maeuFvEgAHrwBjxqLVvRGDz93oRVgQcavhdNTmBr8LQo2yRQkwtZKCMY_NGDsIoJx3orAKEUE7D1RbAM6xh-uxGOlqxur50826y0sk6OuG2WB9K5g5gumxIpg","\"eyJhbGciOiJSUzI1NiIsImtpZCI6IjExNUY0NDI2NjE3QTc5MzhCRTFCQTA2REJFRTkxQTQyNzU4NEVEQUIiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJFVjlFSm1GNmVUaS1HNkJ0dnVrYVFuV0U3YXMifQ.eyJkYXRhIjoie1wiU2VsbGVyR3N0aW5cIjpcIjM3QVJaUFQ0Mzg0UTFNVFwiLFwiQnV5ZXJHc3RpblwiOlwiMTFBQUFDVDM5MDRGMVpaXCIsXCJEb2NOb1wiOlwiREQtMjAyMDA4MDQtOVwiLFwiRG9jVHlwXCI6XCJJTlZcIixcIkRvY0R0XCI6XCIwNC8wOC8yMDIwXCIsXCJUb3RJbnZWYWxcIjo3Nzc2LjMsXCJJdGVtQ250XCI6MyxcIk1haW5Ic25Db2RlXCI6XCIxMDAxXCIsXCJJcm5cIjpcIjExZjhlZjcwMWZlMjk0ZDRhMTRhYWQwYjEyNDU3ZTYyNzc1ZDBmZGM0MWEwYWNmMDViNzRmYmIyZGRjNDdhY2JcIn0iLCJpc3MiOiJOSUMifQ.fya8oD85f2_K8pDWSf8N94_T24O1lA9OPpIuUwk14el_r1lhL13OFxGkklhiewSMUom8DvO9JKu4jjz2l5farRTJhiBWJ43EtEky2SLzRhJf23JYW_6PyLErYL2RTzv2PlZ75eXIBZzPkxc2erCx61T50oHmExLgl1Q6HclvgiQUAVxysq1VFv96zEZVH8I0xDNqjdvqdtsW74ZHqzpV28kDIvuyV4Z5j3bR39GE6YKMetext_x3bJ4Wt4F1z3DOzfUjuKGdEjP0fTSwNg1RpiDoH4wcaMP7RJgtbQYXn4j3YoppCEw916AmbihiT2gSODPn04vhCbBecI7oOZvxpw","ACT","191008688443","2020-08-05 15:18:00","2020-08-06 23:59:00"),
            new IRNGeneration( "1120100002", "2020-08-05 15:18:00", "11f8ef701fe294d4a14aad0b12457e62775d0fdc41a0acf05b74fbb2ddc47acb", "eyJhbGciOiJSUzI1NiIsImtpZCI6IjExNUY0NDI2NjE3QTc5MzhCRTFCQTA2REJFRTkxQTQyNzU4NEVEQUIiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJFVjlFSm1GNmVUaS1HNkJ0dnVrYVFuV0U3YXMifQ.eyJkYXRhIjoie1wiQWNrTm9cIjoxMTIwMTAwMDAwMDIzMTUsXCJBY2tEdFwiOlwiMjAyMC0wOC0wNSAxNToxODowMFwiLFwiSXJuXCI6XCIxMWY4ZWY3MDFmZTI5NGQ0YTE0YWFkMGIxMjQ1N2U2Mjc3NWQwZmRjNDFhMGFjZjA1Yjc0ZmJiMmRkYzQ3YWNiXCIsXCJWZXJzaW9uXCI6XCIxLjAxXCIsXCJUcmFuRHRsc1wiOntcIlRheFNjaFwiOlwiR1NUXCIsXCJTdXBUeXBcIjpcIkIyQlwiLFwiUmVnUmV2XCI6XCJOXCIsXCJJZ3N0T25JbnRyYVwiOlwiWVwifSxcIkRvY0R0bHNcIjp7XCJUeXBcIjpcIklOVlwiLFwiTm9cIjpcIkRELTIwMjAwODA0LTlcIixcIkR0XCI6XCIwNC8wOC8yMDIwXCJ9LFwiU2VsbGVyRHRsc1wiOntcIkdzdGluXCI6XCIzN0FSWlBUNDM4NFExTVRcIixcIkxnbE5tXCI6XCIgQUJDIGNvbXBhbnkgcHZ0IGx0ZFwiLFwiVHJkTm1cIjpcInZpa2FzXCIsXCJBZGRyMVwiOlwiVEUgaFwiLFwiQWRkcjJcIjpcImFiY1wiLFwiTG9jXCI6XCJCYW5nYWxvcmVcIixcIlBpblwiOjUxNTMxMSxcIlN0Y2RcIjpcIjM3XCIsXCJQaFwiOlwiOTczODk3MTk3MFwiLFwiRW1cIjpcInZpa2FzQGdtYWlsLmNvbVwifSxcIkJ1eWVyRHRsc1wiOntcIkdzdGluXCI6XCIxMUFBQUNUMzkwNEYxWlpcIixcIkxnbE5tXCI6XCJYWVogY29tcGFueSBwdnQgbHRkXCIsXCJQb3NcIjpcIjM3XCIsXCJBZGRyMVwiOlwiN3RoIGJsb2NrLCBrdXZlbXB1IGxheW91dFwiLFwiTG9jXCI6XCJHQU5ESElOQUdBUlwiLFwiUGluXCI6NzM3MTAxLFwiU3RjZFwiOlwiMTFcIn0sXCJEaXNwRHRsc1wiOntcIk5tXCI6XCJuYW1lIG9mIHRoZSBjb21wYW55IGZyb20gd2hpY2ggZ29vZHMgZGlzcGF0Y2hlZFwiLFwiQWRkcjFcIjpcImFkZHJlc3NcIixcIkFkZHIyXCI6XCJCYW5nYWxvcmVcIixcIkxvY1wiOlwia3prXCIsXCJQaW5cIjo2OTA1MTMsXCJTdGNkXCI6XCIzMlwifSxcIlNoaXBEdGxzXCI6e1wiR3N0aW5cIjpcIjMyRElVUFAxMTc1RzFaMVwiLFwiTGdsTm1cIjpcInNoaXAgdHJhZGVcIixcIlRyZE5tXCI6XCJ2aWthc1wiLFwiQWRkcjFcIjpcInNoaXAgYiBub1wiLFwiQWRkcjJcIjpcIkJhbmdhbG9yZVwiLFwiTG9jXCI6XCJCYW5nYWxvcmVcIixcIlBpblwiOjY5MDUxMyxcIlN0Y2RcIjpcIjMyXCJ9LFwiSXRlbUxpc3RcIjpbe1wiSXRlbU5vXCI6MSxcIlNsTm9cIjpcIjFcIixcIklzU2VydmNcIjpcIk5cIixcIlByZERlc2NcIjpcIlN0ZWVsXCIsXCJIc25DZFwiOlwiMTAwMVwiLFwiUXR5XCI6MTAsXCJVbml0XCI6XCJCQUdcIixcIlVuaXRQcmljZVwiOjIwMC4wMCxcIlRvdEFtdFwiOjIwMDAuMDAsXCJEaXNjb3VudFwiOjEwLFwiQXNzQW10XCI6MTk5MC4wMCxcIkdzdFJ0XCI6MTIuMDAsXCJJZ3N0QW10XCI6MjM4LjgsXCJDZ3N0QW10XCI6MCxcIlNnc3RBbXRcIjowLFwiQ2VzUnRcIjo1LFwiQ2VzQW10XCI6OTkuNSxcIkNlc05vbkFkdmxBbXRcIjoxMCxcIlN0YXRlQ2VzUnRcIjoxMixcIlN0YXRlQ2VzQW10XCI6MjM4LjgwLFwiU3RhdGVDZXNOb25BZHZsQW10XCI6NSxcIk90aENocmdcIjoxMCxcIlRvdEl0ZW1WYWxcIjoyNTkyLjF9LHtcIkl0ZW1Ob1wiOjIsXCJTbE5vXCI6XCIyXCIsXCJJc1NlcnZjXCI6XCJOXCIsXCJQcmREZXNjXCI6XCJTdGVlbFwiLFwiSHNuQ2RcIjpcIjEwMDFcIixcIlF0eVwiOjEwLFwiVW5pdFwiOlwiQkFHXCIsXCJVbml0UHJpY2VcIjoyMDAuMDAsXCJUb3RBbXRcIjoyMDAwLjAwLFwiRGlzY291bnRcIjoxMCxcIkFzc0FtdFwiOjE5OTAuMDAsXCJHc3RSdFwiOjEyLjAwLFwiSWdzdEFtdFwiOjIzOC44LFwiQ2dzdEFtdFwiOjAsXCJTZ3N0QW10XCI6MCxcIkNlc1J0XCI6NSxcIkNlc0FtdFwiOjk5LjUsXCJDZXNOb25BZHZsQW10XCI6MTAsXCJTdGF0ZUNlc1J0XCI6MTIsXCJTdGF0ZUNlc0FtdFwiOjIzOC44MCxcIlN0YXRlQ2VzTm9uQWR2bEFtdFwiOjUsXCJPdGhDaHJnXCI6MTAsXCJUb3RJdGVtVmFsXCI6MjU5Mi4xfSx7XCJJdGVtTm9cIjozLFwiU2xOb1wiOlwiM1wiLFwiSXNTZXJ2Y1wiOlwiTlwiLFwiUHJkRGVzY1wiOlwiU3RlZWxcIixcIkhzbkNkXCI6XCIxMDAxXCIsXCJRdHlcIjoxMCxcIlVuaXRcIjpcIkJBR1wiLFwiVW5pdFByaWNlXCI6MjAwLjAwLFwiVG90QW10XCI6MjAwMC4wMCxcIkRpc2NvdW50XCI6MTAsXCJBc3NBbXRcIjoxOTkwLjAwLFwiR3N0UnRcIjoxMi4wMCxcIklnc3RBbXRcIjoyMzguOCxcIkNnc3RBbXRcIjowLFwiU2dzdEFtdFwiOjAsXCJDZXNSdFwiOjUsXCJDZXNBbXRcIjo5OS41LFwiQ2VzTm9uQWR2bEFtdFwiOjEwLFwiU3RhdGVDZXNSdFwiOjEyLFwiU3RhdGVDZXNBbXRcIjoyMzguODAsXCJTdGF0ZUNlc05vbkFkdmxBbXRcIjo1LFwiT3RoQ2hyZ1wiOjEwLFwiVG90SXRlbVZhbFwiOjI1OTIuMX1dLFwiVmFsRHRsc1wiOntcIkFzc1ZhbFwiOjU5NzAuMCxcIkNnc3RWYWxcIjowLFwiU2dzdFZhbFwiOjAsXCJJZ3N0VmFsXCI6NzE2LjQsXCJDZXNWYWxcIjozMjguNSxcIlN0Q2VzVmFsXCI6NzMxLjQsXCJSbmRPZmZBbXRcIjowLFwiVG90SW52VmFsXCI6Nzc3Ni4zfSxcIlJlZkR0bHNcIjp7XCJJbnZSbVwiOlwiMTIzXCIsXCJQcmVjRG9jRHRsc1wiOlt7XCJJbnZOb1wiOlwiQUJDXCIsXCJJbnZEdFwiOlwiMDIvMDIvMjAyMFwiLFwiT3RoUmVmTm9cIjpcIjEyQVwifV0sXCJDb250ckR0bHNcIjpbe1wiUmVjQWR2UmVmclwiOlwiMTIzXCIsXCJSZWNBZHZEdFwiOlwiMTIvMDIvMjAyMFwiLFwiVGVuZFJlZnJcIjpcImFiY1wiLFwiQ29udHJSZWZyXCI6XCJhYmNcIixcIkV4dFJlZnJcIjpcImFiY1wiLFwiUHJvalJlZnJcIjpcImFiY1wiLFwiUE9SZWZyXCI6XCJhYmNcIixcIlBPUmVmRHRcIjpcIjEyLzAyLzIwMjBcIn1dfSxcIkFkZGxEb2NEdGxzXCI6W3tcIlVybFwiOlwiaHR0cHM6Ly9laW52LWFwaXNhbmRib3gubmljLmluL2dzdGNvcmVfdGVzdC92MS4wMS9pbnZvaWNlXCIsXCJEb2NzXCI6XCJ2aWthc1wiLFwiSW5mb1wiOlwidmlrYXNcIn1dLFwiRXdiRHRsc1wiOntcIlRyYW5zSWRcIjpcIjEyQVdHUFY3MTA3QjFaMVwiLFwiVHJhbnNOYW1lXCI6XCJYWVogRVhQT1JUU1wiLFwiVHJhbnNNb2RlXCI6XCIxXCIsXCJEaXN0YW5jZVwiOjEwMCxcIlRyYW5zRG9jTm9cIjpcIkRPQzAxXCIsXCJUcmFuc0RvY0R0XCI6XCIwNC8wOC8yMDIwXCIsXCJWZWhOb1wiOlwia2ExMjM0NTZcIixcIlZlaFR5cGVcIjpcIlJcIn19IiwiaXNzIjoiTklDIn0.oesnTXdXgOEeRjYr6bRQ-_Ks-bnIpwtj7Zx8phzfjL6vsfuGqBokILz6ai0NHFKRxiX_bTLrgrWmwXyBdEFmt88myf4n-NP5JvwqFx4OIf0gYMFTKGLx4AQsxwXER836FDxyS33K_7Erkm7_yHsITR5sBkYrZYOWimYl5cgh4EFN2mEq0B8oIp9pSXAU2RGvuirV6Rnl902sWj1Zv_2UK8e9C7cS7maeuFvEgAHrwBjxqLVvRGDz93oRVgQcavhdNTmBr8LQo2yRQkwtZKCMY_NGDsIoJx3orAKEUE7D1RbAM6xh-uxGOlqxur50826y0sk6OuG2WB9K5g5gumxIpg","\"eyJhbGciOiJSUzI1NiIsImtpZCI6IjExNUY0NDI2NjE3QTc5MzhCRTFCQTA2REJFRTkxQTQyNzU4NEVEQUIiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJFVjlFSm1GNmVUaS1HNkJ0dnVrYVFuV0U3YXMifQ.eyJkYXRhIjoie1wiU2VsbGVyR3N0aW5cIjpcIjM3QVJaUFQ0Mzg0UTFNVFwiLFwiQnV5ZXJHc3RpblwiOlwiMTFBQUFDVDM5MDRGMVpaXCIsXCJEb2NOb1wiOlwiREQtMjAyMDA4MDQtOVwiLFwiRG9jVHlwXCI6XCJJTlZcIixcIkRvY0R0XCI6XCIwNC8wOC8yMDIwXCIsXCJUb3RJbnZWYWxcIjo3Nzc2LjMsXCJJdGVtQ250XCI6MyxcIk1haW5Ic25Db2RlXCI6XCIxMDAxXCIsXCJJcm5cIjpcIjExZjhlZjcwMWZlMjk0ZDRhMTRhYWQwYjEyNDU3ZTYyNzc1ZDBmZGM0MWEwYWNmMDViNzRmYmIyZGRjNDdhY2JcIn0iLCJpc3MiOiJOSUMifQ.fya8oD85f2_K8pDWSf8N94_T24O1lA9OPpIuUwk14el_r1lhL13OFxGkklhiewSMUom8DvO9JKu4jjz2l5farRTJhiBWJ43EtEky2SLzRhJf23JYW_6PyLErYL2RTzv2PlZ75eXIBZzPkxc2erCx61T50oHmExLgl1Q6HclvgiQUAVxysq1VFv96zEZVH8I0xDNqjdvqdtsW74ZHqzpV28kDIvuyV4Z5j3bR39GE6YKMetext_x3bJ4Wt4F1z3DOzfUjuKGdEjP0fTSwNg1RpiDoH4wcaMP7RJgtbQYXn4j3YoppCEw916AmbihiT2gSODPn04vhCbBecI7oOZvxpw","ACT","191008688443","2020-08-05 15:18:00","2020-08-06 23:59:00")
    });
    @Override
    public IRNGeneration getIRNGenerations(String invoice) {
        IRNGeneration neededIRNGenerations = new IRNGeneration();
        for(int i=0; i<irnGenerations.size(); i++) {
            if(irnGenerations.get(i).getIrn().equals(invoice))
                neededIRNGenerations = irnGenerations.get(i);
        }
        return neededIRNGenerations;

    }
}
