package sprintproject.smp.SocialMediaPlatform.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Friends {
	@Id
	private int friendshipID;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID1", referencedColumnName = "userID")
	private Users userID1;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID2", referencedColumnName = "userID")
	private Users userID2;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private FriendsStatus status;

}
