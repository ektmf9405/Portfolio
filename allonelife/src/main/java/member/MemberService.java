package member;

import java.util.List;

import item.PointhVO;

public interface MemberService {
	//CRUD
	boolean member_insert(MemberVO vo);//ȸ������
	MemberVO member_select(String userid); //�� ���� ����
	MemberVO member_login(String userid, String userpwd);//�α���
	boolean userid_usable(String userid);//���̵� �ߺ�Ȯ��
	boolean member_update(MemberVO vo);//�� ���� ����
	boolean member_delete();//ȸ��Ż��
	boolean nickname_usable(String nickname);
	boolean email_usable(String email);
	void nick_update(MemberVO vo);
	void userpwd_update(MemberVO vo);
	void user_info_delete(String userid);
	PointhPageVO mypage_point_list(PointhPageVO page);
	MyWritePageVO mypage_write_list(MyWritePageVO mypage);
	
	void member_join_point_insert(PointhVO pvo);
	
	List<MemberVO> mypage_member_list(MemberVO vo);
	}