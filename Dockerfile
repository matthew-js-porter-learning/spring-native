FROM docker.io/library/spring-native-example:0.0.1-SNAPSHOT as build-image
FROM public.ecr.aws/lambda/provided:latest
COPY --from=build-image /workspace/* /var/runtime/bootstrap

CMD ["org.springframework.cloud.function.adapter.aws.SpringBootStreamHandler::handleRequest"]