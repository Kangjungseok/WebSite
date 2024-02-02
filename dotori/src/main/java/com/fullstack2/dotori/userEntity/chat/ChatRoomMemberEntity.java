package com.fullstack2.dotori.userEntity.chat;

import com.fullstack2.dotori.userEntity.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ChatRoomMemberEntity {

	@Id
	Long chatRoomMemberId;
	
	@ManyToOne
	ChatRoomEntity chatRoom;
	
	@OneToMany
	User user;
	
	
	
}
