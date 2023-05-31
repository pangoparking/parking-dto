package org.parking.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CarData implements Serializable{

	private static final long serialVersionUID = 1L;
	public long carID;
	public long parkingID;
	
}
