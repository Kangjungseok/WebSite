package com.fullstack2.dotori.userEntity.chat;

import com.fullstack2.dotori.userEntity.BaseEntity;
import com.fullstack2.dotori.userEntity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class MessageEntity extends BaseEntity{

	@Id
	Long messageId;
	
	@ManyToOne
	@Column(nullable = false)
	User writer;
	
	@ManyToOne
	@Column(nullable = false)
	ChatRoomEntity chatRoom;
	
	@Column(nullable = false)
	String content;
	
	@Column(nullable = false)
	boolean isRead;
	
	//메세지 타입(텍스트,이미지,파일 등)
	String type;
	
}
