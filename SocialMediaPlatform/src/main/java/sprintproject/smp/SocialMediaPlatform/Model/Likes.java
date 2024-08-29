package sprintproject.smp.SocialMediaPlatform.Model;

import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Likes {
	@Id
	private int likeID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID")
	private Users userID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "postID")
	private Posts postID;

	@Column(name = "timestamp", columnDefinition = "TIMESTAMP")
	private Timestamp timestamp;
}
