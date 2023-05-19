package org.parking.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RawSqlData {

	public long ownerID;
	public String ownerName;
	public String ownerEmail;
	public long carID;
	public String parkingPlace;
	public LocalDateTime fineBeenIssuedTime;
	public float fineCost;
}
