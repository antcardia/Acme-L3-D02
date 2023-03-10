
package acme.entities.bulletin;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin extends AbstractEntity {

	@NotNull
	@Past
	protected Date		instantiation;

	@NotBlank
	@Length(max = 75)
	protected String	title;

	@NotEmpty
	@Length(max = 100)
	protected String	message;

	// 1 to indicate that the message is critical, 0 in another case
	@NotEmpty
	protected Boolean	flag;

	@URL
	protected String	link;
}
