package com.patika.bloghubindexservice.consumer;

import com.patika.bloghubindexservice.consumer.constants.KafkaTopicConstants;
import com.patika.bloghubindexservice.model.Blog;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final ElasticsearchOperations elasticsearchOperations;

    @KafkaListener(topics = KafkaTopicConstants.BLOG_INDEX_TOPIC, groupId = "${kafka.group-id}")
    public void listen(Blog blog) {
        log.info("Received Messasge: {}", blog);
        //elasticsearch'e kaydet
    }

}
