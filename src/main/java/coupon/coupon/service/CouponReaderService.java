package coupon.coupon.service;

import coupon.coupon.repository.CouponRepository;
import coupon.coupon.domain.Coupon;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CouponReaderService {

    private final CouponRepository couponRepository;

    public Optional<Coupon> getCoupon(long couponId) {
        return couponRepository.findById(couponId);
    }
}
