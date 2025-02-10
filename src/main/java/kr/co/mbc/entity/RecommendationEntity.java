package kr.co.mbc.entity;

public class RecommendationEntity {
	
    private Long id;

    /*
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private MenuEntity menu;
	*/
    private String recommendationReason; // 추천 이유 (예: 자주 마시는 음료)

}
