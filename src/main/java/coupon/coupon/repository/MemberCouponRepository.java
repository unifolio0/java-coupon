package coupon.coupon.repository;

import coupon.coupon.entity.MemberCouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberCouponRepository extends JpaRepository<MemberCouponEntity, Long> {
}