package com.linkedin.sbet.landon.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkedin.sbet.landon.roomwebapp.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, Long> {

}
