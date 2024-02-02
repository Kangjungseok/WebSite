package com.fullstack2.dotori.userEntity.chat;

import com.fullstack2.dotori.userEntity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChatRoomEntity extends BaseEntity{

	@Id
	Long chatRoomId;
	
	
	String roomName;
	
	//채팅 참여자 수
	int nop;
	
}
