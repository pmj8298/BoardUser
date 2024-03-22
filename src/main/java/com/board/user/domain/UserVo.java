package com.board.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data: @Getter @Setter @ToString @EqualsAndHashCode @RequiredArgConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
	private String userid;
	private String passwd;
	private String username;
	private String email;
	private String upoint;
	private String indate;
}
