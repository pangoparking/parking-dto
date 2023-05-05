package org.parking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {

		    public String recipient;
		    public String msgBody;
		    public String subject;
		    public String attachment;
		}