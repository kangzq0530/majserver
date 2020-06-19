package lq

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoId

val EMPTY_BYTE_ARRAY = ByteArray(0)

@Serializable 
class NotifyRoomGameStart (
    @ProtoId(1) @JvmField val game_url: String? = null,
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val location: String? = null
)

@Serializable 
class NotifyMatchGameStart (
    @ProtoId(1) @JvmField val game_url: String? = null,
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val match_mode_id: Int = 0,
    @ProtoId(5) @JvmField val location: String? = null
)

@Serializable 
class NotifyRoomPlayerReady (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val ready: Boolean = false
)

@Serializable 
class NotifyRoomPlayerDressing (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val dressing: Boolean = false
)

@Serializable 
class NotifyRoomPlayerUpdate (
    @ProtoId(1) @JvmField val update_list: List<PlayerBaseView> = emptyList(),
    @ProtoId(2) @JvmField val remove_list: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val owner_id: Int = 0,
    @ProtoId(4) @JvmField val robot_count: Int = 0
)

@Serializable 
class NotifyRoomKickOut ()

@Serializable 
class NotifyMatchTimeout ()

@Serializable 
class NotifyFriendStateChange (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val active_state: AccountActiveState? = null
)

@Serializable 
class NotifyFriendViewChange (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val base: PlayerBaseView? = null
)

@Serializable 
class NotifyFriendChange (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val friend: Friend? = null
)

@Serializable 
class NotifyNewFriendApply (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val apply_time: Int = 0,
    @ProtoId(3) @JvmField val removed_id: Int = 0
)

@Serializable 
class NotifyClientMessage (
    @ProtoId(1) @JvmField val sender: PlayerBaseView? = null,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val content: String? = null
)

@Serializable 
class NotifyAccountUpdate (
    @ProtoId(1) @JvmField val update: AccountUpdate? = null
)

@Serializable 
class NotifyAnotherLogin ()

@Serializable 
class NotifyAccountLogout ()

@Serializable 
class NotifyAnnouncementUpdate (
    @ProtoId(1) @JvmField val announcements: List<Announcement> = emptyList(),
    @ProtoId(2) @JvmField val sort: List<Int> = emptyList()
)

@Serializable 
class NotifyNewMail (
    @ProtoId(1) @JvmField val mail: Mail? = null
)

@Serializable 
class NotifyDeleteMail (
    @ProtoId(1) @JvmField val mail_id_list: List<Int> = emptyList()
)

@Serializable 
class NotifyReviveCoinUpdate (
    @ProtoId(1) @JvmField val has_gained: Boolean = false
)

@Serializable 
class NotifyDailyTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList(),
    @ProtoId(2) @JvmField val max_daily_task_count: Int = 0,
    @ProtoId(3) @JvmField val refresh_count: Int = 0
)

@Serializable 
class NotifyActivityTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
)

@Serializable 
class NotifyActivityPeriodTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
)

@Serializable 
class NotifyAccountRandomTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
)

@Serializable 
class NotifyNewComment ()

@Serializable 
class NotifyRollingNotice (
    @ProtoId(1) @JvmField val notice: RollingNotice? = null
)

@Serializable 
class NotifyGiftSendRefresh ()

@Serializable 
class NotifyShopUpdate (
    @ProtoId(1) @JvmField val shop_info: ShopInfo? = null
)

@Serializable 
class NotifyVipLevelChange (
    @ProtoId(1) @JvmField val gift_limit: Int = 0,
    @ProtoId(2) @JvmField val friend_max_count: Int = 0,
    @ProtoId(3) @JvmField val zhp_free_refresh_limit: Int = 0,
    @ProtoId(4) @JvmField val zhp_cost_refresh_limit: Int = 0,
    @ProtoId(5) @JvmField val buddy_bonus: Float = 0f,
    @ProtoId(6) @JvmField val record_collect_limit: Int = 0
)

@Serializable 
class NotifyServerSetting (
    @ProtoId(1) @JvmField val settings: ServerSettings? = null
)

@Serializable 
class NotifyPayResult (
    @ProtoId(1) @JvmField val pay_result: Int = 0,
    @ProtoId(2) @JvmField val order_id: String? = null,
    @ProtoId(3) @JvmField val goods_id: Int = 0,
    @ProtoId(4) @JvmField val new_month_ticket: Int = 0,
    @ProtoId(5) @JvmField val resource_modify: List<ResourceModify> = emptyList()
) {
@Serializable 
class ResourceModify (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val final: Int = 0
)

}

@Serializable 
class NotifyCustomContestAccountMsg (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val sender: String? = null,
    @ProtoId(4) @JvmField val content: String? = null,
    @ProtoId(5) @JvmField val verified: Int = 0
)

@Serializable 
class NotifyCustomContestSystemMsg (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val uuid: String? = null,
    @ProtoId(4) @JvmField val game_start: CustomizedContestGameStart? = null,
    @ProtoId(5) @JvmField val game_end: CustomizedContestGameEnd? = null
)

@Serializable 
class NotifyCustomContestState (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0
)

@Serializable 
class NotifyActivityChange (
    @ProtoId(1) @JvmField val new_activities: List<Activity> = emptyList(),
    @ProtoId(2) @JvmField val end_activities: List<Int> = emptyList()
)

@Serializable 
class NotifyAFKResult (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val ban_end_time: Int = 0,
    @ProtoId(3) @JvmField val game_uuid: String? = null
)

@Serializable 
class Error (
    @ProtoId(1) @JvmField val code: Int = 0,
    @ProtoId(2) @JvmField val u32_params: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val str_params: String? = null,
    @ProtoId(4) @JvmField val json_param: String? = null
)

@Serializable 
class Wrapper (
    @ProtoId(1) @JvmField val name: String? = null,
    @ProtoId(2) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY
)

@Serializable 
class NetworkEndpoint (
    @ProtoId(1) @JvmField val family: String? = null,
    @ProtoId(2) @JvmField val address: String? = null,
    @ProtoId(3) @JvmField val port: Int = 0
)

@Serializable 
class ReqCommon ()

@Serializable 
class ResCommon (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ResAccountUpdate (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val update: AccountUpdate? = null
)

@Serializable 
class AntiAddiction (
    @ProtoId(1) @JvmField val online_duration: Int = 0
)

@Serializable 
class AccountMahjongStatistic (
    @ProtoId(1) @JvmField val final_position_counts: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val recent_round: RoundSummary? = null,
    @ProtoId(3) @JvmField val recent_hu: HuSummary? = null,
    @ProtoId(4) @JvmField val highest_hu: HighestHuRecord? = null,
    @ProtoId(6) @JvmField val recent_20_hu_summary: Liqi20Summary? = null,
    @ProtoId(7) @JvmField val recent_10_hu_summary: LiQi10Summary? = null,
    @ProtoId(8) @JvmField val recent_10_game_result: List<GameResult> = emptyList()
) {
@Serializable 
class RoundSummary (
    @ProtoId(1) @JvmField val total_count: Int = 0,
    @ProtoId(2) @JvmField val rong_count: Int = 0,
    @ProtoId(3) @JvmField val zimo_count: Int = 0,
    @ProtoId(4) @JvmField val fangchong_count: Int = 0
)

@Serializable 
class HuSummary (
    @ProtoId(1) @JvmField val total_count: Int = 0,
    @ProtoId(2) @JvmField val dora_round_count: Int = 0,
    @ProtoId(3) @JvmField val total_fan: Int = 0
)

@Serializable 
class HighestHuRecord (
    @ProtoId(1) @JvmField val fanshu: Int = 0,
    @ProtoId(2) @JvmField val doranum: Int = 0,
    @ProtoId(3) @JvmField val title: String? = null,
    @ProtoId(4) @JvmField val hands: String? = null,
    @ProtoId(5) @JvmField val ming: String? = null,
    @ProtoId(6) @JvmField val hupai: String? = null,
    @ProtoId(7) @JvmField val title_id: Int = 0
)

@Serializable 
class Liqi20Summary (
    @ProtoId(1) @JvmField val total_count: Int = 0,
    @ProtoId(2) @JvmField val total_lidora_count: Int = 0,
    @ProtoId(3) @JvmField val average_hu_point: Int = 0
)

@Serializable 
class LiQi10Summary (
    @ProtoId(1) @JvmField val total_xuanshang: Int = 0,
    @ProtoId(2) @JvmField val total_fanshu: Int = 0
)

@Serializable 
class GameResult (
    @ProtoId(1) @JvmField val rank: Int = 0,
    @ProtoId(2) @JvmField val final_point: Int = 0
)

}

@Serializable 
class AccountStatisticData (
    @ProtoId(1) @JvmField val mahjong_category: Int = 0,
    @ProtoId(2) @JvmField val game_category: Int = 0,
    @ProtoId(3) @JvmField val statistic: AccountMahjongStatistic? = null
)

@Serializable 
class AccountLevel (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val score: Int = 0
)

@Serializable 
class ViewSlot (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val item_id: Int = 0
)

@Serializable 
class Account (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val nickname: String? = null,
    @ProtoId(3) @JvmField val login_time: Int = 0,
    @ProtoId(4) @JvmField val logout_time: Int = 0,
    @ProtoId(5) @JvmField val room_id: Int = 0,
    @ProtoId(6) @JvmField val anti_addiction: AntiAddiction? = null,
    @ProtoId(7) @JvmField val title: Int = 0,
    @ProtoId(8) @JvmField val signature: String? = null,
    @ProtoId(9) @JvmField val email: String? = null,
    @ProtoId(10) @JvmField val email_verify: Int = 0,
    @ProtoId(11) @JvmField val gold: Int = 0,
    @ProtoId(12) @JvmField val diamond: Int = 0,
    @ProtoId(13) @JvmField val avatar_id: Int = 0,
    @ProtoId(14) @JvmField val vip: Int = 0,
    @ProtoId(15) @JvmField val birthday: Int = 0,
    @ProtoId(16) @JvmField val phone: String? = null,
    @ProtoId(17) @JvmField val phone_verify: Int = 0,
    @ProtoId(18) @JvmField val platform_diamond: List<PlatformDiamond> = emptyList(),
    @ProtoId(21) @JvmField val level: AccountLevel? = null,
    @ProtoId(22) @JvmField val level3: AccountLevel? = null,
    @ProtoId(23) @JvmField val avatar_frame: Int = 0,
    @ProtoId(24) @JvmField val skin_ticket: Int = 0,
    @ProtoId(25) @JvmField val platform_skin_ticket: List<PlatformSkinTicket> = emptyList(),
    @ProtoId(26) @JvmField val verified: Int = 0
) {
@Serializable 
class PlatformDiamond (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class PlatformSkinTicket (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

}

@Serializable 
class AccountOwnerData (
    @ProtoId(1) @JvmField val unlock_characters: List<Int> = emptyList()
)

@Serializable 
class AccountUpdate (
    @ProtoId(1) @JvmField val numerical: List<NumericalUpdate> = emptyList(),
    @ProtoId(2) @JvmField val character: CharacterUpdate? = null,
    @ProtoId(3) @JvmField val bag: BagUpdate? = null,
    @ProtoId(4) @JvmField val achievement: AchievementUpdate? = null,
    @ProtoId(5) @JvmField val shilian: AccountShiLian? = null,
    @ProtoId(6) @JvmField val daily_task: DailyTaskUpdate? = null,
    @ProtoId(7) @JvmField val title: TitleUpdate? = null,
    @ProtoId(8) @JvmField val new_recharged_list: List<Int> = emptyList(),
    @ProtoId(9) @JvmField val activity_task: TaskUpdate? = null,
    @ProtoId(10) @JvmField val activity_flip_task: TaskUpdate? = null,
    @ProtoId(11) @JvmField val activity_period_task: TaskUpdate? = null,
    @ProtoId(12) @JvmField val activity_random_task: TaskUpdate? = null
) {
@Serializable 
class NumericalUpdate (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(3) @JvmField val final: Int = 0
)

@Serializable 
class CharacterUpdate (
    @ProtoId(2) @JvmField val characters: List<Character> = emptyList(),
    @ProtoId(3) @JvmField val skins: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val finished_endings: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val rewarded_endings: List<Int> = emptyList()
)

@Serializable 
class AchievementUpdate (
    @ProtoId(1) @JvmField val progresses: List<AchievementProgress> = emptyList()
)

@Serializable 
class DailyTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
)

@Serializable 
class TitleUpdate (
    @ProtoId(1) @JvmField val new_titles: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val remove_titles: List<Int> = emptyList()
)

@Serializable 
class TaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
)

}

@Serializable 
class GameMetaData (
    @ProtoId(1) @JvmField val room_id: Int = 0,
    @ProtoId(2) @JvmField val mode_id: Int = 0,
    @ProtoId(3) @JvmField val contest_uid: Int = 0
)

@Serializable 
class AccountPlayingGame (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val category: Int = 0,
    @ProtoId(3) @JvmField val meta: GameMetaData? = null
)

@Serializable 
class AccountCacheView (
    @ProtoId(1) @JvmField val cache_version: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val nickname: String? = null,
    @ProtoId(4) @JvmField val login_time: Int = 0,
    @ProtoId(5) @JvmField val logout_time: Int = 0,
    @ProtoId(6) @JvmField val is_online: Boolean = false,
    @ProtoId(7) @JvmField val room_id: Int = 0,
    @ProtoId(8) @JvmField val title: Int = 0,
    @ProtoId(9) @JvmField val avatar_id: Int = 0,
    @ProtoId(10) @JvmField val vip: Int = 0,
    @ProtoId(11) @JvmField val level: AccountLevel? = null,
    @ProtoId(12) @JvmField val playing_game: AccountPlayingGame? = null,
    @ProtoId(13) @JvmField val level3: AccountLevel? = null,
    @ProtoId(14) @JvmField val avatar_frame: Int = 0,
    @ProtoId(15) @JvmField val verified: Int = 0,
    @ProtoId(16) @JvmField val ban_deadline: Int = 0,
    @ProtoId(17) @JvmField val comment_ban: Int = 0
)

@Serializable 
class PlayerBaseView (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val avatar_id: Int = 0,
    @ProtoId(3) @JvmField val title: Int = 0,
    @ProtoId(4) @JvmField val nickname: String? = null,
    @ProtoId(5) @JvmField val level: AccountLevel? = null,
    @ProtoId(6) @JvmField val level3: AccountLevel? = null,
    @ProtoId(7) @JvmField val avatar_frame: Int = 0,
    @ProtoId(8) @JvmField val verified: Int = 0
)

@Serializable 
class PlayerGameView (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val avatar_id: Int = 0,
    @ProtoId(3) @JvmField val title: Int = 0,
    @ProtoId(4) @JvmField val nickname: String? = null,
    @ProtoId(5) @JvmField val level: AccountLevel? = null,
    @ProtoId(6) @JvmField val character: Character? = null,
    @ProtoId(7) @JvmField val level3: AccountLevel? = null,
    @ProtoId(8) @JvmField val avatar_frame: Int = 0,
    @ProtoId(9) @JvmField val verified: Int = 0,
    @ProtoId(10) @JvmField val views: List<ViewSlot> = emptyList()
)

@Serializable 
class GameMode (
    @ProtoId(1) @JvmField val mode: Int = 0,
    @ProtoId(4) @JvmField val ai: Boolean = false,
    @ProtoId(5) @JvmField val extendinfo: String? = null,
    @ProtoId(6) @JvmField val detail_rule: GameDetailRule? = null,
    @ProtoId(7) @JvmField val testing_environment: GameTestingEnvironmentSet? = null
)

@Serializable 
class GameTestingEnvironmentSet (
    @ProtoId(1) @JvmField val paixing: Int = 0,
    @ProtoId(2) @JvmField val left_count: Int = 0
)

@Serializable 
class GameDetailRule (
    @ProtoId(1) @JvmField val time_fixed: Int = 0,
    @ProtoId(2) @JvmField val time_add: Int = 0,
    @ProtoId(3) @JvmField val dora_count: Int = 0,
    @ProtoId(4) @JvmField val shiduan: Int = 0,
    @ProtoId(5) @JvmField val init_point: Int = 0,
    @ProtoId(6) @JvmField val fandian: Int = 0,
    @ProtoId(7) @JvmField val can_jifei: Boolean = false,
    @ProtoId(8) @JvmField val tianbian_value: Int = 0,
    @ProtoId(9) @JvmField val liqibang_value: Int = 0,
    @ProtoId(10) @JvmField val changbang_value: Int = 0,
    @ProtoId(11) @JvmField val noting_fafu_1: Int = 0,
    @ProtoId(12) @JvmField val noting_fafu_2: Int = 0,
    @ProtoId(13) @JvmField val noting_fafu_3: Int = 0,
    @ProtoId(14) @JvmField val have_liujumanguan: Boolean = false,
    @ProtoId(15) @JvmField val have_qieshangmanguan: Boolean = false,
    @ProtoId(16) @JvmField val have_biao_dora: Boolean = false,
    @ProtoId(17) @JvmField val have_gang_biao_dora: Boolean = false,
    @ProtoId(18) @JvmField val ming_dora_immediately_open: Boolean = false,
    @ProtoId(19) @JvmField val have_li_dora: Boolean = false,
    @ProtoId(20) @JvmField val have_gang_li_dora: Boolean = false,
    @ProtoId(21) @JvmField val have_sifenglianda: Boolean = false,
    @ProtoId(22) @JvmField val have_sigangsanle: Boolean = false,
    @ProtoId(23) @JvmField val have_sijializhi: Boolean = false,
    @ProtoId(24) @JvmField val have_jiuzhongjiupai: Boolean = false,
    @ProtoId(25) @JvmField val have_sanjiahele: Boolean = false,
    @ProtoId(26) @JvmField val have_toutiao: Boolean = false,
    @ProtoId(27) @JvmField val have_helelianzhuang: Boolean = false,
    @ProtoId(28) @JvmField val have_helezhongju: Boolean = false,
    @ProtoId(29) @JvmField val have_tingpailianzhuang: Boolean = false,
    @ProtoId(30) @JvmField val have_tingpaizhongju: Boolean = false,
    @ProtoId(31) @JvmField val have_yifa: Boolean = false,
    @ProtoId(32) @JvmField val have_nanruxiru: Boolean = false,
    @ProtoId(33) @JvmField val jingsuanyuandian: Int = 0,
    @ProtoId(34) @JvmField val shunweima_2: Int = 0,
    @ProtoId(35) @JvmField val shunweima_3: Int = 0,
    @ProtoId(36) @JvmField val shunweima_4: Int = 0,
    @ProtoId(37) @JvmField val bianjietishi: Boolean = false,
    @ProtoId(38) @JvmField val ai_level: Int = 0,
    @ProtoId(39) @JvmField val have_zimosun: Boolean = false,
    @ProtoId(40) @JvmField val disable_multi_yukaman: Boolean = false,
    @ProtoId(41) @JvmField val fanfu: Int = 0,
    @ProtoId(42) @JvmField val guyi_mode: Int = 0,
    @ProtoId(43) @JvmField val dora3_mode: Int = 0,
    @ProtoId(44) @JvmField val begin_open_mode: Int = 0,
    @ProtoId(45) @JvmField val jiuchao_mode: Int = 0,
    @ProtoId(46) @JvmField val muyu_mode: Int = 0,
    @ProtoId(47) @JvmField val open_hand: Int = 0
)

@Serializable 
class Room (
    @ProtoId(1) @JvmField val room_id: Int = 0,
    @ProtoId(2) @JvmField val owner_id: Int = 0,
    @ProtoId(3) @JvmField val mode: GameMode? = null,
    @ProtoId(4) @JvmField val max_player_count: Int = 0,
    @ProtoId(5) @JvmField val persons: List<PlayerGameView> = emptyList(),
    @ProtoId(6) @JvmField val ready_list: List<Int> = emptyList(),
    @ProtoId(7) @JvmField val is_playing: Boolean = false,
    @ProtoId(8) @JvmField val public_live: Boolean = false,
    @ProtoId(9) @JvmField val robot_count: Int = 0,
    @ProtoId(10) @JvmField val tournament_id: Int = 0
)

@Serializable 
class GameEndResult (
    @ProtoId(1) @JvmField val players: List<PlayerItem> = emptyList()
) {
@Serializable 
class PlayerItem (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val total_point: Int = 0,
    @ProtoId(3) @JvmField val part_point_1: Int = 0,
    @ProtoId(4) @JvmField val part_point_2: Int = 0,
    @ProtoId(5) @JvmField val grading_score: Int = 0,
    @ProtoId(6) @JvmField val gold: Int = 0
)

}

@Serializable 
class GameConnectInfo (
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val location: String? = null
)

@Serializable 
class ItemGainRecord (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ItemGainRecords (
    @ProtoId(1) @JvmField val record_time: Int = 0,
    @ProtoId(2) @JvmField val limit_source_id: Int = 0,
    @ProtoId(3) @JvmField val records: List<ItemGainRecord> = emptyList()
)

@Serializable 
class Item (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val stack: Int = 0
)

@Serializable 
class Bag (
    @ProtoId(1) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(2) @JvmField val daily_gain_record: List<ItemGainRecords> = emptyList()
)

@Serializable 
class BagUpdate (
    @ProtoId(1) @JvmField val update_items: List<Item> = emptyList(),
    @ProtoId(2) @JvmField val update_daily_gain_record: List<ItemGainRecords> = emptyList()
)

@Serializable 
class RewardSlot (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class OpenResult (
    @ProtoId(1) @JvmField val reward: RewardSlot? = null,
    @ProtoId(2) @JvmField val replace: RewardSlot? = null
)

@Serializable 
class RewardPlusResult (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val exchange: Exchange? = null
) {
@Serializable 
class Exchange (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val exchange: Int = 0
)

}

@Serializable 
class ExecuteReward (
    @ProtoId(1) @JvmField val reward: RewardSlot? = null,
    @ProtoId(2) @JvmField val replace: RewardSlot? = null,
    @ProtoId(3) @JvmField val replace_count: Int = 0
)

@Serializable 
class Mail (
    @ProtoId(1) @JvmField val mail_id: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0,
    @ProtoId(3) @JvmField val take_attachment: Boolean = false,
    @ProtoId(4) @JvmField val title: String? = null,
    @ProtoId(5) @JvmField val content: String? = null,
    @ProtoId(6) @JvmField val attachments: List<RewardSlot> = emptyList(),
    @ProtoId(7) @JvmField val create_time: Int = 0,
    @ProtoId(8) @JvmField val expire_time: Int = 0,
    @ProtoId(9) @JvmField val reference_id: Int = 0
)

@Serializable 
class AchievementProgress (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val counter: Int = 0,
    @ProtoId(3) @JvmField val achieved: Boolean = false,
    @ProtoId(4) @JvmField val date: Int = 0
)

@Serializable 
class AccountStatisticByGameMode (
    @ProtoId(1) @JvmField val mode: Int = 0,
    @ProtoId(2) @JvmField val game_count_sum: Int = 0,
    @ProtoId(3) @JvmField val game_final_position: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val fly_count: Int = 0,
    @ProtoId(5) @JvmField val gold_earn_sum: Float = 0f,
    @ProtoId(6) @JvmField val round_count_sum: Int = 0,
    @ProtoId(7) @JvmField val dadian_sum: Float = 0f,
    @ProtoId(8) @JvmField val round_end: List<RoundEndData> = emptyList(),
    @ProtoId(9) @JvmField val ming_count_sum: Int = 0,
    @ProtoId(10) @JvmField val liqi_count_sum: Int = 0,
    @ProtoId(11) @JvmField val xun_count_sum: Int = 0,
    @ProtoId(12) @JvmField val highest_lianzhuang: Int = 0,
    @ProtoId(13) @JvmField val score_earn_sum: Int = 0,
    @ProtoId(14) @JvmField val rank_score: List<RankScore> = emptyList()
) {
@Serializable 
class RoundEndData (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val sum: Int = 0
)

@Serializable 
class RankScore (
    @ProtoId(1) @JvmField val rank: Int = 0,
    @ProtoId(2) @JvmField val score_sum: Int = 0,
    @ProtoId(3) @JvmField val count: Int = 0
)

}

@Serializable 
class AccountStatisticByFan (
    @ProtoId(1) @JvmField val fan_id: Int = 0,
    @ProtoId(2) @JvmField val sum: Int = 0
)

@Serializable 
class AccountFanAchieved (
    @ProtoId(1) @JvmField val mahjong_category: Int = 0,
    @ProtoId(2) @JvmField val fan: List<AccountStatisticByFan> = emptyList(),
    @ProtoId(3) @JvmField val liujumanguan: Int = 0
)

@Serializable 
class AccountDetailStatistic (
    @ProtoId(1) @JvmField val game_mode: List<AccountStatisticByGameMode> = emptyList(),
    @ProtoId(2) @JvmField val fan: List<AccountStatisticByFan> = emptyList(),
    @ProtoId(3) @JvmField val liujumanguan: Int = 0,
    @ProtoId(4) @JvmField val fan_achieved: List<AccountFanAchieved> = emptyList()
)

@Serializable 
class AccountDetailStatisticByCategory (
    @ProtoId(1) @JvmField val category: Int = 0,
    @ProtoId(2) @JvmField val detail_statistic: AccountDetailStatistic? = null
)

@Serializable 
class AccountDetailStatisticV2 (
    @ProtoId(1) @JvmField val friend_room_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val rank_statistic: RankStatistic? = null,
    @ProtoId(3) @JvmField val customized_contest_statistic: CustomizedContestStatistic? = null,
    @ProtoId(4) @JvmField val leisure_match_statistic: AccountDetailStatistic? = null
) {
@Serializable 
class RankStatistic (
    @ProtoId(1) @JvmField val total_statistic: RankData? = null,
    @ProtoId(2) @JvmField val month_statistic: RankData? = null,
    @ProtoId(3) @JvmField val month_refresh_time: Int = 0
) {
@Serializable 
class RankData (
    @ProtoId(1) @JvmField val all_level_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val level_data_list: List<RankLevelData> = emptyList()
) {
@Serializable 
class RankLevelData (
    @ProtoId(1) @JvmField val rank_level: Int = 0,
    @ProtoId(2) @JvmField val statistic: AccountDetailStatistic? = null
)

}

}

@Serializable 
class CustomizedContestStatistic (
    @ProtoId(1) @JvmField val total_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val month_statistic: AccountDetailStatistic? = null,
    @ProtoId(3) @JvmField val month_refresh_time: Int = 0
)

}

@Serializable 
class AccountShiLian (
    @ProtoId(1) @JvmField val step: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0
)

@Serializable 
class ClientDeviceInfo (
    @ProtoId(1) @JvmField val device_type: String? = null,
    @ProtoId(2) @JvmField val os: String? = null,
    @ProtoId(3) @JvmField val os_version: String? = null,
    @ProtoId(4) @JvmField val browser: String? = null
)

@Serializable 
class GamePlayerState ()

@Serializable 
class Announcement (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val title: String? = null,
    @ProtoId(3) @JvmField val content: String? = null
)

@Serializable 
class TaskProgress (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val counter: Int = 0,
    @ProtoId(3) @JvmField val achieved: Boolean = false,
    @ProtoId(4) @JvmField val rewarded: Boolean = false
)

@Serializable 
class GameConfig (
    @ProtoId(1) @JvmField val category: Int = 0,
    @ProtoId(2) @JvmField val mode: GameMode? = null,
    @ProtoId(3) @JvmField val meta: GameMetaData? = null
)

@Serializable 
class AccountActiveState (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val login_time: Int = 0,
    @ProtoId(3) @JvmField val logout_time: Int = 0,
    @ProtoId(4) @JvmField val is_online: Boolean = false,
    @ProtoId(5) @JvmField val playing: AccountPlayingGame? = null
)

@Serializable 
class Friend (
    @ProtoId(1) @JvmField val base: PlayerBaseView? = null,
    @ProtoId(2) @JvmField val state: AccountActiveState? = null
)

@Serializable 
class GameLiveUnit (
    @ProtoId(1) @JvmField val timestamp: Int = 0,
    @ProtoId(2) @JvmField val action_category: Int = 0,
    @ProtoId(3) @JvmField val action_data: ByteArray = EMPTY_BYTE_ARRAY
)

@Serializable 
class GameLiveSegment (
    @ProtoId(1) @JvmField val actions: List<GameLiveUnit> = emptyList()
)

@Serializable 
class GameLiveSegmentUri (
    @ProtoId(1) @JvmField val segment_id: Int = 0,
    @ProtoId(2) @JvmField val segment_uri: String? = null
)

@Serializable 
class GameLiveHead (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val game_config: GameConfig? = null,
    @ProtoId(4) @JvmField val players: List<PlayerGameView> = emptyList(),
    @ProtoId(5) @JvmField val seat_list: List<Int> = emptyList()
)

@Serializable 
class GameNewRoundState (
    @ProtoId(1) @JvmField val seat_states: List<Int> = emptyList()
)

@Serializable 
class GameEndAction (
    @ProtoId(1) @JvmField val state: Int = 0
)

@Serializable 
class GameNoopAction ()

@Serializable 
class CommentItem (
    @ProtoId(1) @JvmField val comment_id: Int = 0,
    @ProtoId(2) @JvmField val timestamp: Int = 0,
    @ProtoId(3) @JvmField val commenter: PlayerBaseView? = null,
    @ProtoId(4) @JvmField val content: String? = null,
    @ProtoId(5) @JvmField val is_banned: Int = 0
)

@Serializable 
class RollingNotice (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0,
    @ProtoId(5) @JvmField val repeat_interval: Int = 0
)

@Serializable 
class BillingGoods (
    @ProtoId(1) @JvmField val id: String? = null,
    @ProtoId(2) @JvmField val name: String? = null,
    @ProtoId(3) @JvmField val desc: String? = null,
    @ProtoId(4) @JvmField val icon: String? = null,
    @ProtoId(5) @JvmField val resource_id: Int = 0,
    @ProtoId(6) @JvmField val resource_count: Int = 0
)

@Serializable 
class BillShortcut (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val dealPrice: Int = 0
)

@Serializable 
class BillingProduct (
    @ProtoId(1) @JvmField val goods: BillingGoods? = null,
    @ProtoId(2) @JvmField val currency_code: String? = null,
    @ProtoId(3) @JvmField val currency_price: Int = 0,
    @ProtoId(4) @JvmField val sort_weight: Int = 0
)

@Serializable 
class Character (
    @ProtoId(1) @JvmField val charid: Int = 0,
    @ProtoId(2) @JvmField val level: Int = 0,
    @ProtoId(3) @JvmField val exp: Int = 0,
    @ProtoId(4) @JvmField val views: List<ViewSlot> = emptyList(),
    @ProtoId(5) @JvmField val skin: Int = 0,
    @ProtoId(6) @JvmField val is_upgraded: Boolean = false,
    @ProtoId(7) @JvmField val extra_emoji: List<Int> = emptyList()
)

@Serializable 
class BuyRecord (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ZHPShop (
    @ProtoId(1) @JvmField val goods: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val buy_records: List<BuyRecord> = emptyList(),
    @ProtoId(3) @JvmField val free_refresh: RefreshCount? = null,
    @ProtoId(4) @JvmField val cost_refresh: RefreshCount? = null
) {
@Serializable 
class RefreshCount (
    @ProtoId(1) @JvmField val count: Int = 0,
    @ProtoId(2) @JvmField val limit: Int = 0
)

}

@Serializable 
class MonthTicketInfo (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val end_time: Int = 0,
    @ProtoId(3) @JvmField val last_pay_time: Int = 0
)

@Serializable 
class ShopInfo (
    @ProtoId(1) @JvmField val zhp: ZHPShop? = null,
    @ProtoId(2) @JvmField val buy_records: List<BuyRecord> = emptyList(),
    @ProtoId(3) @JvmField val last_refresh_time: Int = 0
)

@Serializable 
class ChangeNicknameRecord (
    @ProtoId(1) @JvmField val from: String? = null,
    @ProtoId(2) @JvmField val to: String? = null,
    @ProtoId(3) @JvmField val time: Int = 0
)

@Serializable 
class ServerSettings (
    @ProtoId(3) @JvmField val payment_setting: PaymentSetting? = null
)

@Serializable 
class PaymentSetting (
    @ProtoId(1) @JvmField val open_payment: Int = 0,
    @ProtoId(2) @JvmField val payment_info_show_type: Int = 0,
    @ProtoId(3) @JvmField val payment_info: String? = null,
    @ProtoId(4) @JvmField val wechat: WechatData? = null,
    @ProtoId(5) @JvmField val alipay: AlipayData? = null
) {
@Serializable 
class WechatData (
    @ProtoId(1) @JvmField val disable_create: Boolean = false,
    @ProtoId(2) @JvmField val payment_source_platform: Int = 0,
    @ProtoId(3) @JvmField val enable_credit: Boolean = false
)

@Serializable 
class AlipayData (
    @ProtoId(1) @JvmField val disable_create: Boolean = false,
    @ProtoId(2) @JvmField val payment_source_platform: Int = 0
)

}

@Serializable 
class AccountSetting (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
)

@Serializable 
class ChestData (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val face_black_count: Int = 0
)

@Serializable 
class ChestDataV2 (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val face_black_count: Int = 0
)

@Serializable 
class FaithData (
    @ProtoId(1) @JvmField val faith_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val modify_count: Int = 0
)

@Serializable 
class CustomizedContestBase (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val contest_id: Int = 0,
    @ProtoId(3) @JvmField val contest_name: String? = null,
    @ProtoId(4) @JvmField val state: Int = 0,
    @ProtoId(5) @JvmField val creator_id: Int = 0,
    @ProtoId(6) @JvmField val create_time: Int = 0,
    @ProtoId(7) @JvmField val start_time: Int = 0,
    @ProtoId(8) @JvmField val finish_time: Int = 0,
    @ProtoId(9) @JvmField val open: Boolean = false,
    @ProtoId(10) @JvmField val contest_type: Int = 0
)

@Serializable 
class CustomizedContestExtend (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val public_notice: String? = null
)

@Serializable 
class CustomizedContestAbstract (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val contest_id: Int = 0,
    @ProtoId(3) @JvmField val contest_name: String? = null,
    @ProtoId(4) @JvmField val state: Int = 0,
    @ProtoId(5) @JvmField val creator_id: Int = 0,
    @ProtoId(6) @JvmField val create_time: Int = 0,
    @ProtoId(7) @JvmField val start_time: Int = 0,
    @ProtoId(8) @JvmField val finish_time: Int = 0,
    @ProtoId(9) @JvmField val open: Boolean = false,
    @ProtoId(10) @JvmField val public_notice: String? = null
)

@Serializable 
class CustomizedContestDetail (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val contest_id: Int = 0,
    @ProtoId(3) @JvmField val contest_name: String? = null,
    @ProtoId(4) @JvmField val state: Int = 0,
    @ProtoId(5) @JvmField val creator_id: Int = 0,
    @ProtoId(6) @JvmField val create_time: Int = 0,
    @ProtoId(7) @JvmField val start_time: Int = 0,
    @ProtoId(8) @JvmField val finish_time: Int = 0,
    @ProtoId(9) @JvmField val open: Boolean = false,
    @ProtoId(10) @JvmField val rank_rule: Int = 0,
    @ProtoId(11) @JvmField val game_mode: GameMode? = null,
    @ProtoId(12) @JvmField val private_notice: String? = null,
    @ProtoId(13) @JvmField val observer_switch: Int = 0
)

@Serializable 
class CustomizedContestPlayerReport (
    @ProtoId(1) @JvmField val rank_rule: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val point: Int = 0,
    @ProtoId(4) @JvmField val game_ranks: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val total_game_count: Int = 0
)

@Serializable 
class RecordGame (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val end_time: Int = 0,
    @ProtoId(5) @JvmField val config: GameConfig? = null,
    @ProtoId(11) @JvmField val accounts: List<AccountInfo> = emptyList(),
    @ProtoId(12) @JvmField val result: GameEndResult? = null
) {
@Serializable 
class AccountInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val seat: Int = 0,
    @ProtoId(3) @JvmField val nickname: String? = null,
    @ProtoId(4) @JvmField val avatar_id: Int = 0,
    @ProtoId(5) @JvmField val character: Character? = null,
    @ProtoId(6) @JvmField val title: Int = 0,
    @ProtoId(7) @JvmField val level: AccountLevel? = null,
    @ProtoId(8) @JvmField val level3: AccountLevel? = null,
    @ProtoId(9) @JvmField val avatar_frame: Int = 0,
    @ProtoId(10) @JvmField val verified: Int = 0,
    @ProtoId(11) @JvmField val views: List<ViewSlot> = emptyList()
)

}

@Serializable 
class CustomizedContestGameStart (
    @ProtoId(1) @JvmField val players: List<Item> = emptyList()
) {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val nickname: String? = null
)

}

@Serializable 
class CustomizedContestGameEnd (
    @ProtoId(1) @JvmField val players: List<Item> = emptyList()
) {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val nickname: String? = null,
    @ProtoId(3) @JvmField val total_point: Int = 0
)

}

@Serializable 
class Activity (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val end_time: Int = 0,
    @ProtoId(4) @JvmField val type: String? = null
)

@Serializable 
class ExchangeRecord (
    @ProtoId(1) @JvmField val exchange_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ActivityAccumulatedPointData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0,
    @ProtoId(3) @JvmField val gained_reward_list: List<Int> = emptyList()
)

@Serializable 
class ActivityRankPointData (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0,
    @ProtoId(3) @JvmField val gained_reward: Boolean = false,
    @ProtoId(4) @JvmField val gainable_time: Int = 0
)

@Serializable 
class GameRoundHuData (
    @ProtoId(1) @JvmField val hupai: HuPai? = null,
    @ProtoId(2) @JvmField val fans: List<Fan> = emptyList(),
    @ProtoId(3) @JvmField val score: Int = 0,
    @ProtoId(4) @JvmField val xun: Int = 0,
    @ProtoId(5) @JvmField val title_id: Int = 0,
    @ProtoId(6) @JvmField val fan_sum: Int = 0,
    @ProtoId(7) @JvmField val fu_sum: Int = 0,
    @ProtoId(8) @JvmField val yakuman_count: Int = 0,
    @ProtoId(9) @JvmField val biao_dora_count: Int = 0,
    @ProtoId(10) @JvmField val red_dora_count: Int = 0,
    @ProtoId(11) @JvmField val li_dora_count: Int = 0,
    @ProtoId(12) @JvmField val babei_count: Int = 0,
    @ProtoId(13) @JvmField val xuan_shang_count: Int = 0
) {
@Serializable 
class HuPai (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val seat: Int = 0,
    @ProtoId(3) @JvmField val liqi: Int = 0
)

@Serializable 
class Fan (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val fan: Int = 0
)

}

@Serializable 
class GameRoundPlayerResult (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val hands: String? = null,
    @ProtoId(3) @JvmField val ming: String? = null,
    @ProtoId(4) @JvmField val liqi_type: Int = 0,
    @ProtoId(5) @JvmField val is_fulu: Boolean = false,
    @ProtoId(6) @JvmField val is_liujumanguan: Boolean = false,
    @ProtoId(7) @JvmField val lian_zhuang: Int = 0,
    @ProtoId(8) @JvmField val hu: GameRoundHuData? = null
)

@Serializable 
class GameRoundPlayer (
    @ProtoId(1) @JvmField val score: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val result: GameRoundPlayerResult? = null
)

@Serializable 
class GameRoundSnapshot (
    @ProtoId(1) @JvmField val ju: Int = 0,
    @ProtoId(2) @JvmField val ben: Int = 0,
    @ProtoId(3) @JvmField val players: List<GameRoundPlayer> = emptyList()
)

@Serializable 
class GameFinalSnapshot (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val state: Int = 0,
    @ProtoId(3) @JvmField val category: Int = 0,
    @ProtoId(4) @JvmField val mode: GameMode? = null,
    @ProtoId(5) @JvmField val meta: GameMetaData? = null,
    @ProtoId(6) @JvmField val calculate_param: CalculateParam? = null,
    @ProtoId(7) @JvmField val create_time: Int = 0,
    @ProtoId(8) @JvmField val start_time: Int = 0,
    @ProtoId(9) @JvmField val finish_time: Int = 0,
    @ProtoId(10) @JvmField val seats: List<GameSeat> = emptyList(),
    @ProtoId(11) @JvmField val rounds: List<GameRoundSnapshot> = emptyList(),
    @ProtoId(12) @JvmField val account_views: List<PlayerGameView> = emptyList(),
    @ProtoId(13) @JvmField val final_players: List<FinalPlayer> = emptyList(),
    @ProtoId(14) @JvmField val afk_info: List<AFKInfo> = emptyList()
) {
@Serializable 
class CalculateParam (
    @ProtoId(1) @JvmField val init_point: Int = 0,
    @ProtoId(2) @JvmField val jingsuanyuandian: Int = 0,
    @ProtoId(3) @JvmField val rank_points: List<Int> = emptyList()
)

@Serializable 
class GameSeat (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val notify_endpoint: NetworkEndpoint? = null,
    @ProtoId(4) @JvmField val client_address: String? = null,
    @ProtoId(5) @JvmField val is_connected: Boolean = false
)

@Serializable 
class FinalPlayer (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val total_point: Int = 0,
    @ProtoId(3) @JvmField val part_point_1: Int = 0,
    @ProtoId(4) @JvmField val part_point_2: Int = 0,
    @ProtoId(5) @JvmField val grading_score: Int = 0,
    @ProtoId(6) @JvmField val gold: Int = 0
)

@Serializable 
class AFKInfo (
    @ProtoId(1) @JvmField val deal_tile_count: Int = 0,
    @ProtoId(2) @JvmField val moqie_count: Int = 0,
    @ProtoId(3) @JvmField val seat: Int = 0
)

}

@Serializable 
class RecordCollectedData (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0
)

@Serializable 
class ContestDetailRule (
    @ProtoId(5) @JvmField val init_point: Int = 0,
    @ProtoId(6) @JvmField val fandian: Int = 0,
    @ProtoId(7) @JvmField val can_jifei: Boolean = false,
    @ProtoId(8) @JvmField val tianbian_value: Int = 0,
    @ProtoId(9) @JvmField val liqibang_value: Int = 0,
    @ProtoId(10) @JvmField val changbang_value: Int = 0,
    @ProtoId(11) @JvmField val noting_fafu_1: Int = 0,
    @ProtoId(12) @JvmField val noting_fafu_2: Int = 0,
    @ProtoId(13) @JvmField val noting_fafu_3: Int = 0,
    @ProtoId(14) @JvmField val have_liujumanguan: Boolean = false,
    @ProtoId(15) @JvmField val have_qieshangmanguan: Boolean = false,
    @ProtoId(16) @JvmField val have_biao_dora: Boolean = false,
    @ProtoId(17) @JvmField val have_gang_biao_dora: Boolean = false,
    @ProtoId(18) @JvmField val ming_dora_immediately_open: Boolean = false,
    @ProtoId(19) @JvmField val have_li_dora: Boolean = false,
    @ProtoId(20) @JvmField val have_gang_li_dora: Boolean = false,
    @ProtoId(21) @JvmField val have_sifenglianda: Boolean = false,
    @ProtoId(22) @JvmField val have_sigangsanle: Boolean = false,
    @ProtoId(23) @JvmField val have_sijializhi: Boolean = false,
    @ProtoId(24) @JvmField val have_jiuzhongjiupai: Boolean = false,
    @ProtoId(25) @JvmField val have_sanjiahele: Boolean = false,
    @ProtoId(26) @JvmField val have_toutiao: Boolean = false,
    @ProtoId(27) @JvmField val have_helelianzhuang: Boolean = false,
    @ProtoId(28) @JvmField val have_helezhongju: Boolean = false,
    @ProtoId(29) @JvmField val have_tingpailianzhuang: Boolean = false,
    @ProtoId(30) @JvmField val have_tingpaizhongju: Boolean = false,
    @ProtoId(31) @JvmField val have_yifa: Boolean = false,
    @ProtoId(32) @JvmField val have_nanruxiru: Boolean = false,
    @ProtoId(33) @JvmField val jingsuanyuandian: Int = 0,
    @ProtoId(34) @JvmField val shunweima_2: Int = 0,
    @ProtoId(35) @JvmField val shunweima_3: Int = 0,
    @ProtoId(36) @JvmField val shunweima_4: Int = 0,
    @ProtoId(37) @JvmField val bianjietishi: Boolean = false,
    @ProtoId(38) @JvmField val ai_level: Int = 0,
    @ProtoId(39) @JvmField val have_zimosun: Boolean = false,
    @ProtoId(40) @JvmField val disable_multi_yukaman: Boolean = false,
    @ProtoId(41) @JvmField val guyi_mode: Int = 0
)

@Serializable 
class ContestDetailRuleV2 (
    @ProtoId(1) @JvmField val game_rule: ContestDetailRule? = null,
    @ProtoId(2) @JvmField val extra_rule: ExtraRule? = null
) {
@Serializable 
class ExtraRule (
    @ProtoId(1) @JvmField val required_level: Int = 0,
    @ProtoId(2) @JvmField val max_game_count: Int = 0
)

}

@Serializable 
class GameRuleSetting (
    @ProtoId(1) @JvmField val round_type: Int = 0,
    @ProtoId(2) @JvmField val shiduan: Boolean = false,
    @ProtoId(3) @JvmField val dora_count: Int = 0,
    @ProtoId(4) @JvmField val thinking_type: Int = 0,
    @ProtoId(5) @JvmField val use_detail_rule: Boolean = false,
    @ProtoId(6) @JvmField val detail_rule_v2: ContestDetailRuleV2? = null
)

interface Lobby {
    fun fetchConnectionInfo(req: ReqCommon) : ResConnectionInfo
    fun signup(req: ReqSignupAccount) : ResSignupAccount
    fun login(req: ReqLogin) : ResLogin
    fun emailLogin(req: ReqEmailLogin) : ResLogin
    fun oauth2Auth(req: ReqOauth2Auth) : ResOauth2Auth
    fun oauth2Check(req: ReqOauth2Check) : ResOauth2Check
    fun oauth2Signup(req: ReqOauth2Signup) : ResOauth2Signup
    fun oauth2Login(req: ReqOauth2Login) : ResLogin
    fun dmmPreLogin(req: ReqDMMPreLogin) : ResDMMPreLogin
    fun createPhoneVerifyCode(req: ReqCreatePhoneVerifyCode) : ResCommon
    fun createEmailVerifyCode(req: ReqCreateEmailVerifyCode) : ResCommon
    fun verfifyCodeForSecure(req: ReqVerifyCodeForSecure) : ResVerfiyCodeForSecure
    fun bindPhoneNumber(req: ReqBindPhoneNumber) : ResCommon
    fun unbindPhoneNumber(req: ReqUnbindPhoneNumber) : ResCommon
    fun fetchPhoneLoginBind(req: ReqCommon) : ResFetchPhoneLoginBind
    fun createPhoneLoginBind(req: ReqCreatePhoneLoginBind) : ResCommon
    fun bindEmail(req: ReqBindEmail) : ResCommon
    fun modifyPassword(req: ReqModifyPassword) : ResCommon
    fun bindAccount(req: ReqBindAccount) : ResCommon
    fun logout(req: ReqLogout) : ResLogout
    fun heatbeat(req: ReqHeatBeat) : ResCommon
    fun loginBeat(req: ReqLoginBeat) : ResCommon
    fun createNickname(req: ReqCreateNickname) : ResCommon
    fun modifyNickname(req: ReqModifyNickname) : ResCommon
    fun modifyBirthday(req: ReqModifyBirthday) : ResCommon
    fun fetchRoom(req: ReqCommon) : ResSelfRoom
    fun createRoom(req: ReqCreateRoom) : ResCreateRoom
    fun joinRoom(req: ReqJoinRoom) : ResJoinRoom
    fun leaveRoom(req: ReqCommon) : ResCommon
    fun readyPlay(req: ReqRoomReady) : ResCommon
    fun dressingStatus(req: ReqRoomDressing) : ResCommon
    fun startRoom(req: ReqRoomStart) : ResCommon
    fun kickPlayer(req: ReqRoomKick) : ResCommon
    fun modifyRoom(req: ReqModifyRoom) : ResCommon
    fun matchGame(req: ReqJoinMatchQueue) : ResCommon
    fun cancelMatch(req: ReqCancelMatchQueue) : ResCommon
    fun fetchAccountInfo(req: ReqAccountInfo) : ResAccountInfo
    fun changeAvatar(req: ReqChangeAvatar) : ResCommon
    fun fetchAccountStatisticInfo(req: ReqAccountStatisticInfo) : ResAccountStatisticInfo
    fun fetchAccountCharacterInfo(req: ReqCommon) : ResAccountCharacterInfo
    fun shopPurchase(req: ReqShopPurchase) : ResShopPurchase
    fun fetchGameRecord(req: ReqGameRecord) : ResGameRecord
    fun fetchGameRecordList(req: ReqGameRecordList) : ResGameRecordList
    fun fetchCollectedGameRecordList(req: ReqCommon) : ResCollectedGameRecordList
    fun fetchGameRecordsDetail(req: ReqGameRecordsDetail) : ResGameRecordsDetail
    fun addCollectedGameRecord(req: ReqAddCollectedGameRecord) : ResAddCollectedGameRecord
    fun removeCollectedGameRecord(req: ReqRemoveCollectedGameRecord) : ResRemoveCollectedGameRecord
    fun changeCollectedGameRecordRemarks(req: ReqChangeCollectedGameRecordRemarks) : ResChangeCollectedGameRecordRemarks
    fun fetchLevelLeaderboard(req: ReqLevelLeaderboard) : ResLevelLeaderboard
    fun fetchMultiAccountBrief(req: ReqMultiAccountId) : ResMultiAccountBrief
    fun fetchFriendList(req: ReqCommon) : ResFriendList
    fun fetchFriendApplyList(req: ReqCommon) : ResFriendApplyList
    fun applyFriend(req: ReqApplyFriend) : ResCommon
    fun handleFriendApply(req: ReqHandleFriendApply) : ResCommon
    fun removeFriend(req: ReqRemoveFriend) : ResCommon
    fun searchAccountById(req: ReqSearchAccountById) : ResSearchAccountById
    fun searchAccountByPattern(req: ReqSearchAccountByPattern) : ResSearchAccountByPattern
    fun fetchAccountState(req: ReqAccountList) : ResAccountStates
    fun fetchBagInfo(req: ReqCommon) : ResBagInfo
    fun useBagItem(req: ReqUseBagItem) : ResCommon
    fun openManualItem(req: ReqOpenManualItem) : ResCommon
    fun openRandomRewardItem(req: ReqOpenRandomRewardItem) : ResOpenRandomRewardItem
    fun composeShard(req: ReqComposeShard) : ResCommon
    fun fetchAnnouncement(req: ReqCommon) : ResAnnouncement
    fun readAnnouncement(req: ReqReadAnnouncement) : ResCommon
    fun fetchMailInfo(req: ReqCommon) : ResMailInfo
    fun readMail(req: ReqReadMail) : ResCommon
    fun deleteMail(req: ReqDeleteMail) : ResCommon
    fun takeAttachmentFromMail(req: ReqTakeAttachment) : ResCommon
    fun fetchAchievement(req: ReqCommon) : ResAchievement
    fun buyShiLian(req: ReqBuyShiLian) : ResCommon
    fun matchShiLian(req: ReqCommon) : ResCommon
    fun goNextShiLian(req: ReqCommon) : ResCommon
    fun updateClientValue(req: ReqUpdateClientValue) : ResCommon
    fun fetchClientValue(req: ReqCommon) : ResClientValue
    fun clientMessage(req: ReqClientMessage) : ResCommon
    fun fetchCurrentMatchInfo(req: ReqCurrentMatchInfo) : ResCurrentMatchInfo
    fun userComplain(req: ReqUserComplain) : ResCommon
    fun fetchReviveCoinInfo(req: ReqCommon) : ResReviveCoinInfo
    fun gainReviveCoin(req: ReqCommon) : ResCommon
    fun fetchDailyTask(req: ReqCommon) : ResDailyTask
    fun refreshDailyTask(req: ReqRefreshDailyTask) : ResRefreshDailyTask
    fun useGiftCode(req: ReqUseGiftCode) : ResUseGiftCode
    fun fetchTitleList(req: ReqCommon) : ResTitleList
    fun useTitle(req: ReqUseTitle) : ResCommon
    fun sendClientMessage(req: ReqSendClientMessage) : ResCommon
    fun fetchGameLiveInfo(req: ReqGameLiveInfo) : ResGameLiveInfo
    fun fetchGameLiveLeftSegment(req: ReqGameLiveLeftSegment) : ResGameLiveLeftSegment
    fun fetchGameLiveList(req: ReqGameLiveList) : ResGameLiveList
    fun fetchCommentSetting(req: ReqCommon) : ResCommentSetting
    fun updateCommentSetting(req: ReqUpdateCommentSetting) : ResCommon
    fun fetchCommentList(req: ReqFetchCommentList) : ResFetchCommentList
    fun fetchCommentContent(req: ReqFetchCommentContent) : ResFetchCommentContent
    fun leaveComment(req: ReqLeaveComment) : ResCommon
    fun deleteComment(req: ReqDeleteComment) : ResCommon
    fun updateReadComment(req: ReqUpdateReadComment) : ResCommon
    fun fetchRollingNotice(req: ReqCommon) : ReqRollingNotice
    fun fetchServerTime(req: ReqCommon) : ResServerTime
    fun fetchPlatformProducts(req: ReqPlatformBillingProducts) : ResPlatformBillingProducts
    fun cancelGooglePlayOrder(req: ReqCancelGooglePlayOrder) : ResCommon
    fun openChest(req: ReqOpenChest) : ResOpenChest
    fun buyFromChestShop(req: ReqBuyFromChestShop) : ResBuyFromChestShop
    fun fetchDailySignInInfo(req: ReqCommon) : ResDailySignInInfo
    fun doDailySignIn(req: ReqCommon) : ResCommon
    fun doActivitySignIn(req: ReqDoActivitySignIn) : ResDoActivitySignIn
    fun fetchCharacterInfo(req: ReqCommon) : ResCharacterInfo
    fun changeMainCharacter(req: ReqChangeMainCharacter) : ResCommon
    fun changeCharacterSkin(req: ReqChangeCharacterSkin) : ResCommon
    fun changeCharacterView(req: ReqChangeCharacterView) : ResCommon
    fun sendGiftToCharacter(req: ReqSendGiftToCharacter) : ResSendGiftToCharacter
    fun sellItem(req: ReqSellItem) : ResCommon
    fun fetchCommonView(req: ReqCommon) : ResCommonView
    fun changeCommonView(req: ReqChangeCommonView) : ResCommon
    fun saveCommonViews(req: ReqSaveCommonViews) : ResCommon
    fun fetchCommonViews(req: ReqCommonViews) : ResCommonViews
    fun fetchAllCommonViews(req: ReqCommon) : ResAllcommonViews
    fun useCommonView(req: ReqUseCommonView) : ResCommon
    fun upgradeCharacter(req: ReqUpgradeCharacter) : ResUpgradeCharacter
    fun addFinishedEnding(req: ReqFinishedEnding) : ResCommon
    fun receiveEndingReward(req: ReqFinishedEnding) : ResCommon
    fun gameMasterCommand(req: ReqGMCommand) : ResCommon
    fun fetchShopInfo(req: ReqCommon) : ResShopInfo
    fun buyFromShop(req: ReqBuyFromShop) : ResBuyFromShop
    fun buyFromZHP(req: ReqBuyFromZHP) : ResCommon
    fun refreshZHPShop(req: ReqReshZHPShop) : ResRefreshZHPShop
    fun fetchMonthTicketInfo(req: ReqCommon) : ResMonthTicketInfo
    fun payMonthTicket(req: ReqPayMonthTicket) : ResPayMonthTicket
    fun exchangeCurrency(req: ReqExchangeCurrency) : ResCommon
    fun exchangeChestStone(req: ReqExchangeCurrency) : ResCommon
    fun exchangeDiamond(req: ReqExchangeCurrency) : ResCommon
    fun fetchServerSettings(req: ReqCommon) : ResServerSettings
    fun fetchAccountSettings(req: ReqCommon) : ResAccountSettings
    fun updateAccountSettings(req: ReqUpdateAccountSettings) : ResCommon
    fun fetchModNicknameTime(req: ReqCommon) : ResModNicknameTime
    fun createWechatNativeOrder(req: ReqCreateWechatNativeOrder) : ResCreateWechatNativeOrder
    fun createWechatAppOrder(req: ReqCreateWechatAppOrder) : ResCreateWechatAppOrder
    fun createAlipayOrder(req: ReqCreateAlipayOrder) : ResCreateAlipayOrder
    fun createAlipayScanOrder(req: ReqCreateAlipayScanOrder) : ResCreateAlipayScanOrder
    fun createAlipayAppOrder(req: ReqCreateAlipayAppOrder) : ResCreateAlipayAppOrder
    fun createJPCreditCardOrder(req: ReqCreateJPCreditCardOrder) : ResCreateJPCreditCardOrder
    fun createJPPaypalOrder(req: ReqCreateJPPaypalOrder) : ResCreateJPPaypalOrder
    fun createJPAuOrder(req: ReqCreateJPAuOrder) : ResCreateJPAuOrder
    fun createJPDocomoOrder(req: ReqCreateJPDocomoOrder) : ResCreateJPDocomoOrder
    fun createJPWebMoneyOrder(req: ReqCreateJPWebMoneyOrder) : ResCreateJPWebMoneyOrder
    fun createJPSoftbankOrder(req: ReqCreateJPSoftbankOrder) : ResCreateJPSoftbankOrder
    fun createENPaypalOrder(req: ReqCreateENPaypalOrder) : ResCreateENPaypalOrder
    fun createENMasterCardOrder(req: ReqCreateENMasterCardOrder) : ResCreateENMasterCardOrder
    fun createENVisaOrder(req: ReqCreateENVisaOrder) : ResCreateENVisaOrder
    fun createENJCBOrder(req: ReqCreateENJCBOrder) : ResCreateENJCBOrder
    fun createENAlipayOrder(req: ReqCreateENAlipayOrder) : ResCreateENAlipayOrder
    fun createDMMOrder(req: ReqCreateDMMOrder) : ResCreateDmmOrder
    fun createIAPOrder(req: ReqCreateIAPOrder) : ResCreateIAPOrder
    fun createMyCardAndroidOrder(req: ReqCreateMyCardOrder) : ResCreateMyCardOrder
    fun createMyCardWebOrder(req: ReqCreateMyCardOrder) : ResCreateMyCardOrder
    fun verifyMyCardOrder(req: ReqVerifyMyCardOrder) : ResCommon
    fun verificationIAPOrder(req: ReqVerificationIAPOrder) : ResVerificationIAPOrder
    fun createYostarSDKOrder(req: ReqCreateYostarOrder) : ResCreateYostarOrder
    fun createBillingOrder(req: ReqCreateBillingOrder) : ResCreateBillingOrder
    fun solveGooglePlayOrder(req: ReqSolveGooglePlayOrder) : ResCommon
    fun solveGooglePayOrderV3(req: ReqSolveGooglePlayOrderV3) : ResCommon
    fun fetchMisc(req: ReqCommon) : ResMisc
    fun modifySignature(req: ReqModifySignature) : ResCommon
    fun fetchIDCardInfo(req: ReqCommon) : ResIDCardInfo
    fun updateIDCardInfo(req: ReqUpdateIDCardInfo) : ResCommon
    fun fetchVipReward(req: ReqCommon) : ResVipReward
    fun gainVipReward(req: ReqGainVipReward) : ResCommon
    fun fetchCustomizedContestList(req: ReqFetchCustomizedContestList) : ResFetchCustomizedContestList
    fun fetchCustomizedContestExtendInfo(req: ReqFetchCustomizedContestExtendInfo) : ResFetchCustomizedContestExtendInfo
    fun fetchCustomizedContestAuthInfo(req: ReqFetchCustomizedContestAuthInfo) : ResFetchCustomizedContestAuthInfo
    fun enterCustomizedContest(req: ReqEnterCustomizedContest) : ResEnterCustomizedContest
    fun leaveCustomizedContest(req: ReqCommon) : ResCommon
    fun fetchCustomizedContestOnlineInfo(req: ReqFetchCustomizedContestOnlineInfo) : ResFetchCustomizedContestOnlineInfo
    fun fetchCustomizedContestByContestId(req: ReqFetchCustomizedContestByContestId) : ResFetchCustomizedContestByContestId
    fun startCustomizedContest(req: ReqStartCustomizedContest) : ResCommon
    fun stopCustomizedContest(req: ReqCommon) : ResCommon
    fun joinCustomizedContestChatRoom(req: ReqJoinCustomizedContestChatRoom) : ResJoinCustomizedContestChatRoom
    fun leaveCustomizedContestChatRoom(req: ReqCommon) : ResCommon
    fun sayChatMessage(req: ReqSayChatMessage) : ResCommon
    fun fetchCustomizedContestGameRecords(req: ReqFetchCustomizedContestGameRecords) : ResFetchCustomizedContestGameRecords
    fun fetchCustomizedContestGameLiveList(req: ReqFetchCustomizedContestGameLiveList) : ResFetchCustomizedContestGameLiveList
    fun followCustomizedContest(req: ReqTargetCustomizedContest) : ResCommon
    fun unfollowCustomizedContest(req: ReqTargetCustomizedContest) : ResCommon
    fun fetchActivityList(req: ReqCommon) : ResActivityList
    fun fetchAccountActivityData(req: ReqCommon) : ResAccountActivityData
    fun exchangeActivityItem(req: ReqExchangeActivityItem) : ResExchangeActivityItem
    fun completeActivityTask(req: ReqCompleteActivityTask) : ResCommon
    fun completeActivityFlipTask(req: ReqCompleteActivityTask) : ResCommon
    fun completePeriodActivityTask(req: ReqCompleteActivityTask) : ResCommon
    fun completeRandomActivityTask(req: ReqCompleteActivityTask) : ResCommon
    fun receiveActivityFlipTask(req: ReqReceiveActivityFlipTask) : ResReceiveActivityFlipTask
    fun fetchActivityFlipInfo(req: ReqFetchActivityFlipInfo) : ResFetchActivityFlipInfo
    fun gainAccumulatedPointActivityReward(req: ReqGainAccumulatedPointActivityReward) : ResCommon
    fun fetchRankPointLeaderboard(req: ReqFetchRankPointLeaderboard) : ResFetchRankPointLeaderboard
    fun gainRankPointReward(req: ReqGainRankPointReward) : ResCommon
    fun richmanActivityNextMove(req: ReqRichmanNextMove) : ResRichmanNextMove
    fun richmanAcitivitySpecialMove(req: ReqRichmanSpecialMove) : ResRichmanNextMove
    fun richmanActivityChestInfo(req: ReqRichmanChestInfo) : ResRichmanChestInfo
    fun createGameObserveAuth(req: ReqCreateGameObserveAuth) : ResCreateGameObserveAuth
    fun refreshGameObserveAuth(req: ReqRefreshGameObserveAuth) : ResRefreshGameObserveAuth
}

@Serializable 
class ResConnectionInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val client_endpoint: NetworkEndpoint? = null
)

@Serializable 
class ReqSignupAccount (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val code: String? = null,
    @ProtoId(4) @JvmField val type: Int = 0
)

@Serializable 
class ResSignupAccount (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqLogin (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(7) @JvmField val gen_access_token: Boolean = false,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList(),
    @ProtoId(9) @JvmField val type: Int = 0
)

@Serializable 
class ResLogin (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val account: Account? = null,
    @ProtoId(4) @JvmField val game_info: GameConnectInfo? = null,
    @ProtoId(5) @JvmField val has_unread_announcement: Boolean = false,
    @ProtoId(6) @JvmField val access_token: String? = null,
    @ProtoId(7) @JvmField val signup_time: Int = 0,
    @ProtoId(8) @JvmField val is_id_card_authed: Boolean = false
)

@Serializable 
class ReqEmailLogin (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(7) @JvmField val gen_access_token: Boolean = false,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList()
)

@Serializable 
class ReqBindAccount (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null
)

@Serializable 
class ReqCreatePhoneVerifyCode (
    @ProtoId(1) @JvmField val phone: String? = null,
    @ProtoId(2) @JvmField val usage: Int = 0
)

@Serializable 
class ReqCreateEmailVerifyCode (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val usage: Int = 0
)

@Serializable 
class ReqVerifyCodeForSecure (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val operation: Int = 0
)

@Serializable 
class ResVerfiyCodeForSecure (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val secure_token: String? = null
)

@Serializable 
class ReqBindPhoneNumber (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val phone: String? = null,
    @ProtoId(3) @JvmField val password: String? = null,
    @ProtoId(4) @JvmField val multi_bind_version: Boolean = false
)

@Serializable 
class ReqUnbindPhoneNumber (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val phone: String? = null,
    @ProtoId(3) @JvmField val password: String? = null
)

@Serializable 
class ResFetchPhoneLoginBind (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val phone_login: Int = 0
)

@Serializable 
class ReqCreatePhoneLoginBind (
    @ProtoId(1) @JvmField val password: String? = null
)

@Serializable 
class ReqBindEmail (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val code: String? = null,
    @ProtoId(3) @JvmField val password: String? = null
)

@Serializable 
class ReqModifyPassword (
    @ProtoId(1) @JvmField val new_password: String? = null,
    @ProtoId(2) @JvmField val old_password: String? = null,
    @ProtoId(3) @JvmField val secure_token: String? = null
)

@Serializable 
class ReqOauth2Auth (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val code: String? = null,
    @ProtoId(3) @JvmField val uid: String? = null
)

@Serializable 
class ResOauth2Auth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val access_token: String? = null
)

@Serializable 
class ReqOauth2Check (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null
)

@Serializable 
class ResOauth2Check (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val has_account: Boolean = false
)

@Serializable 
class ReqOauth2Signup (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null,
    @ProtoId(3) @JvmField val email: String? = null,
    @ProtoId(4) @JvmField val advertise_str: String? = null
)

@Serializable 
class ResOauth2Signup (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqOauth2Login (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList()
)

@Serializable 
class ReqDMMPreLogin (
    @ProtoId(1) @JvmField val finish_url: String? = null
)

@Serializable 
class ResDMMPreLogin (
    @ProtoId(1) @JvmField val parameter: String? = null
)

@Serializable 
class ReqLogout ()

@Serializable 
class ResLogout (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqHeatBeat (
    @ProtoId(1) @JvmField val no_operation_counter: Int = 0
)

@Serializable 
class ReqLoginBeat (
    @ProtoId(1) @JvmField val contract: String? = null
)

@Serializable 
class ReqJoinMatchQueue (
    @ProtoId(1) @JvmField val match_mode: Int = 0
)

@Serializable 
class ReqCancelMatchQueue (
    @ProtoId(1) @JvmField val match_mode: Int = 0
)

@Serializable 
class ReqAccountInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0
)

@Serializable 
class ResAccountInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val account: Account? = null,
    @ProtoId(3) @JvmField val room: Room? = null
)

@Serializable 
class ReqCreateNickname (
    @ProtoId(1) @JvmField val nickname: String? = null,
    @ProtoId(2) @JvmField val advertise_str: String? = null
)

@Serializable 
class ReqModifyNickname (
    @ProtoId(1) @JvmField val nickname: String? = null,
    @ProtoId(2) @JvmField val use_item_id: Int = 0
)

@Serializable 
class ReqModifyBirthday (
    @ProtoId(1) @JvmField val birthday: Int = 0
)

@Serializable 
class ResSelfRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
)

@Serializable 
class ReqCreateRoom (
    @ProtoId(1) @JvmField val player_count: Int = 0,
    @ProtoId(2) @JvmField val mode: GameMode? = null,
    @ProtoId(3) @JvmField val public_live: Boolean = false
)

@Serializable 
class ResCreateRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
)

@Serializable 
class ReqJoinRoom (
    @ProtoId(1) @JvmField val room_id: Int = 0
)

@Serializable 
class ResJoinRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
)

@Serializable 
class ReqRoomReady (
    @ProtoId(1) @JvmField val ready: Boolean = false
)

@Serializable 
class ReqRoomDressing (
    @ProtoId(1) @JvmField val dressing: Boolean = false
)

@Serializable 
class ReqRoomStart ()

@Serializable 
class ReqRoomKick (
    @ProtoId(1) @JvmField val account_id: Int = 0
)

@Serializable 
class ReqModifyRoom (
    @ProtoId(1) @JvmField val robot_count: Int = 0
)

@Serializable 
class ReqChangeAvatar (
    @ProtoId(1) @JvmField val avatar_id: Int = 0
)

@Serializable 
class ReqAccountStatisticInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0
)

@Serializable 
class ResAccountStatisticInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val statistic_data: List<AccountStatisticData> = emptyList(),
    @ProtoId(3) @JvmField val detail_data: AccountDetailStatisticV2? = null
)

@Serializable 
class ResAccountCharacterInfo (
    @ProtoId(1) @JvmField val unlock_list: List<Int> = emptyList()
)

@Serializable 
class ReqShopPurchase (
    @ProtoId(1) @JvmField val type: String? = null,
    @ProtoId(2) @JvmField val id: Int = 0
)

@Serializable 
class ResShopPurchase (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val update: AccountUpdate? = null
)

@Serializable 
class ReqGameRecord (
    @ProtoId(1) @JvmField val game_uuid: String? = null
)

@Serializable 
class ResGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(3) @JvmField val head: RecordGame? = null,
    @ProtoId(4) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY,
    @ProtoId(5) @JvmField val data_url: String? = null
)

@Serializable 
class ReqGameRecordList (
    @ProtoId(1) @JvmField val start: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val type: Int = 0
)

@Serializable 
class ResGameRecordList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val total_count: Int = 0,
    @ProtoId(3) @JvmField val record_list: List<RecordGame> = emptyList()
)

@Serializable 
class ResCollectedGameRecordList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val record_list: List<RecordCollectedData> = emptyList(),
    @ProtoId(3) @JvmField val record_collect_limit: Int = 0
)

@Serializable 
class ReqGameRecordsDetail (
    @ProtoId(1) @JvmField val uuid_list: String? = null
)

@Serializable 
class ResGameRecordsDetail (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val record_list: List<RecordGame> = emptyList()
)

@Serializable 
class ReqAddCollectedGameRecord (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0
)

@Serializable 
class ResAddCollectedGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqRemoveCollectedGameRecord (
    @ProtoId(1) @JvmField val uuid: String? = null
)

@Serializable 
class ResRemoveCollectedGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqChangeCollectedGameRecordRemarks (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null
)

@Serializable 
class ResChangeCollectedGameRecordRemarks (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqLevelLeaderboard (
    @ProtoId(1) @JvmField val type: Int = 0
)

@Serializable 
class ResLevelLeaderboard (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(3) @JvmField val self_rank: Int = 0
) {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val level: AccountLevel? = null
)

}

@Serializable 
class ReqMultiAccountId (
    @ProtoId(1) @JvmField val account_id_list: List<Int> = emptyList()
)

@Serializable 
class ResMultiAccountBrief (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val players: List<PlayerBaseView> = emptyList()
)

@Serializable 
class ResFriendList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val friends: List<Friend> = emptyList(),
    @ProtoId(3) @JvmField val friend_max_count: Int = 0
)

@Serializable 
class ResFriendApplyList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val applies: List<FriendApply> = emptyList()
) {
@Serializable 
class FriendApply (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val apply_time: Int = 0
)

}

@Serializable 
class ReqApplyFriend (
    @ProtoId(1) @JvmField val target_id: Int = 0
)

@Serializable 
class ReqHandleFriendApply (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val method: Int = 0
)

@Serializable 
class ReqRemoveFriend (
    @ProtoId(1) @JvmField val target_id: Int = 0
)

@Serializable 
class ReqSearchAccountByPattern (
    @ProtoId(1) @JvmField val search_next: Boolean = false,
    @ProtoId(2) @JvmField val pattern: String? = null
)

@Serializable 
class ResSearchAccountByPattern (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_finished: Boolean = false,
    @ProtoId(3) @JvmField val match_accounts: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val decode_id: Int = 0
)

@Serializable 
class ReqAccountList (
    @ProtoId(1) @JvmField val account_id_list: List<Int> = emptyList()
)

@Serializable 
class ResAccountStates (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val states: List<AccountActiveState> = emptyList()
)

@Serializable 
class ReqSearchAccountById (
    @ProtoId(1) @JvmField val account_id: Int = 0
)

@Serializable 
class ResSearchAccountById (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val player: PlayerBaseView? = null
)

@Serializable 
class ResBagInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val bag: Bag? = null
)

@Serializable 
class ReqUseBagItem (
    @ProtoId(1) @JvmField val item_id: Int = 0
)

@Serializable 
class ReqOpenManualItem (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val select_id: Int = 0
)

@Serializable 
class ReqOpenRandomRewardItem (
    @ProtoId(1) @JvmField val item_id: Int = 0
)

@Serializable 
class ResOpenRandomRewardItem (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val results: List<OpenResult> = emptyList()
)

@Serializable 
class ReqComposeShard (
    @ProtoId(1) @JvmField val item_id: Int = 0
)

@Serializable 
class ResAnnouncement (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val announcements: List<Announcement> = emptyList(),
    @ProtoId(3) @JvmField val sort: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val read_list: List<Int> = emptyList()
)

@Serializable 
class ResMailInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val mails: List<Mail> = emptyList()
)

@Serializable 
class ReqReadMail (
    @ProtoId(1) @JvmField val mail_id: Int = 0
)

@Serializable 
class ReqDeleteMail (
    @ProtoId(1) @JvmField val mail_id: Int = 0
)

@Serializable 
class ReqTakeAttachment (
    @ProtoId(1) @JvmField val mail_id: Int = 0
)

@Serializable 
class ResAchievement (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progresses: List<AchievementProgress> = emptyList()
)

@Serializable 
class ResTitleList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val title_list: List<Int> = emptyList()
)

@Serializable 
class ReqUseTitle (
    @ProtoId(1) @JvmField val title: Int = 0
)

@Serializable 
class ReqBuyShiLian (
    @ProtoId(1) @JvmField val type: Int = 0
)

@Serializable 
class ReqUpdateClientValue (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
)

@Serializable 
class ResClientValue (
    @ProtoId(1) @JvmField val datas: List<Value> = emptyList(),
    @ProtoId(2) @JvmField val recharged_count: Int = 0
) {
@Serializable 
class Value (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
)

}

@Serializable 
class ReqClientMessage (
    @ProtoId(1) @JvmField val timestamp: Int = 0,
    @ProtoId(2) @JvmField val message: String? = null
)

@Serializable 
class ReqCurrentMatchInfo (
    @ProtoId(1) @JvmField val mode_list: List<Int> = emptyList()
)

@Serializable 
class ResCurrentMatchInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val matches: List<CurrentMatchInfo> = emptyList()
) {
@Serializable 
class CurrentMatchInfo (
    @ProtoId(1) @JvmField val mode_id: Int = 0,
    @ProtoId(2) @JvmField val playing_count: Int = 0
)

}

@Serializable 
class ReqUserComplain (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0
)

@Serializable 
class ReqReadAnnouncement (
    @ProtoId(1) @JvmField val announcement_id: Int = 0
)

@Serializable 
class ResReviveCoinInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val has_gained: Boolean = false
)

@Serializable 
class ResDailyTask (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progresses: List<TaskProgress> = emptyList(),
    @ProtoId(3) @JvmField val has_refresh_count: Boolean = false,
    @ProtoId(4) @JvmField val max_daily_task_count: Int = 0,
    @ProtoId(5) @JvmField val refresh_count: Int = 0
)

@Serializable 
class ReqRefreshDailyTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
)

@Serializable 
class ResRefreshDailyTask (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progress: TaskProgress? = null,
    @ProtoId(3) @JvmField val refresh_count: Int = 0
)

@Serializable 
class ReqUseGiftCode (
    @ProtoId(1) @JvmField val code: String? = null
)

@Serializable 
class ResUseGiftCode (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(6) @JvmField val rewards: List<RewardSlot> = emptyList()
)

@Serializable 
class ReqSendClientMessage (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val content: String? = null
)

@Serializable 
class ReqGameLiveInfo (
    @ProtoId(1) @JvmField val game_uuid: String? = null
)

@Serializable 
class ResGameLiveInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val left_start_seconds: Int = 0,
    @ProtoId(3) @JvmField val live_head: GameLiveHead? = null,
    @ProtoId(4) @JvmField val segments: List<GameLiveSegmentUri> = emptyList(),
    @ProtoId(5) @JvmField val now_millisecond: Int = 0
)

@Serializable 
class ReqGameLiveLeftSegment (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val last_segment_id: Int = 0
)

@Serializable 
class ResGameLiveLeftSegment (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_state: Int = 0,
    @ProtoId(4) @JvmField val segments: List<GameLiveSegmentUri> = emptyList(),
    @ProtoId(5) @JvmField val now_millisecond: Int = 0,
    @ProtoId(6) @JvmField val segment_end_millisecond: Int = 0
)

@Serializable 
class ReqGameLiveList (
    @ProtoId(1) @JvmField val filter_id: Int = 0
)

@Serializable 
class ResGameLiveList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_list: List<GameLiveHead> = emptyList()
)

@Serializable 
class ResCommentSetting (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comment_allow: Int = 0
)

@Serializable 
class ReqUpdateCommentSetting (
    @ProtoId(1) @JvmField val comment_allow: Int = 0
)

@Serializable 
class ReqFetchCommentList (
    @ProtoId(1) @JvmField val target_id: Int = 0
)

@Serializable 
class ResFetchCommentList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comment_allow: Int = 0,
    @ProtoId(3) @JvmField val comment_id_list: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val last_read_id: Int = 0
)

@Serializable 
class ReqFetchCommentContent (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val comment_id_list: List<Int> = emptyList()
)

@Serializable 
class ResFetchCommentContent (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comments: List<CommentItem> = emptyList()
)

@Serializable 
class ReqLeaveComment (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null
)

@Serializable 
class ReqDeleteComment (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val delete_list: List<Int> = emptyList()
)

@Serializable 
class ReqUpdateReadComment (
    @ProtoId(1) @JvmField val read_id: Int = 0
)

@Serializable 
class ReqRollingNotice (
    @ProtoId(1) @JvmField val notice: RollingNotice? = null
)

@Serializable 
class ResServerTime (
    @ProtoId(1) @JvmField val server_time: Int = 0
)

@Serializable 
class ReqPlatformBillingProducts (
    @ProtoId(1) @JvmField val shelves_id: Int = 0
)

@Serializable 
class ResPlatformBillingProducts (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val products: List<BillingProduct> = emptyList()
)

@Serializable 
class ReqCreateBillingOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val payment_platform: Int = 0,
    @ProtoId(3) @JvmField val client_type: Int = 0,
    @ProtoId(4) @JvmField val account_id: Int = 0
)

@Serializable 
class ResCreateBillingOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqSolveGooglePlayOrder (
    @ProtoId(2) @JvmField val inapp_purchase_data: String? = null,
    @ProtoId(3) @JvmField val inapp_data_signature: String? = null
)

@Serializable 
class ReqSolveGooglePlayOrderV3 (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val transaction_id: String? = null,
    @ProtoId(3) @JvmField val token: String? = null,
    @ProtoId(4) @JvmField val account_id: Int = 0
)

@Serializable 
class ReqCancelGooglePlayOrder (
    @ProtoId(1) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateWechatNativeOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val account_ip: String? = null
)

@Serializable 
class ResCreateWechatNativeOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val qrcode_buffer: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateWechatAppOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val account_ip: String? = null
)

@Serializable 
class ResCreateWechatAppOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val call_wechat_app_param: CallWechatAppParam? = null
) {
@Serializable 
class CallWechatAppParam (
    @ProtoId(1) @JvmField val appid: String? = null,
    @ProtoId(2) @JvmField val partnerid: String? = null,
    @ProtoId(3) @JvmField val prepayid: String? = null,
    @ProtoId(4) @JvmField val `package`: String? = null,
    @ProtoId(5) @JvmField val noncestr: String? = null,
    @ProtoId(6) @JvmField val timestamp: String? = null,
    @ProtoId(7) @JvmField val sign: String? = null
)

}

@Serializable 
class ReqCreateAlipayOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val alipay_trade_type: String? = null,
    @ProtoId(5) @JvmField val return_url: String? = null
)

@Serializable 
class ResCreateAlipayOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val alipay_url: String? = null
)

@Serializable 
class ReqCreateAlipayScanOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
)

@Serializable 
class ResCreateAlipayScanOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val qrcode_buffer: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null,
    @ProtoId(4) @JvmField val qr_code: String? = null
)

@Serializable 
class ReqCreateAlipayAppOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
)

@Serializable 
class ResCreateAlipayAppOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val alipay_url: String? = null
)

@Serializable 
class ReqCreateJPCreditCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateJPCreditCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateJPPaypalOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateJPPaypalOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateJPAuOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateJPAuOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateJPDocomoOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateJPDocomoOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateJPWebMoneyOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateJPWebMoneyOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateJPSoftbankOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateJPSoftbankOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateYostarOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val order_type: Int = 0
)

@Serializable 
class ResCreateYostarOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateENPaypalOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateENPaypalOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateENJCBOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateENJCBOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateENMasterCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateENMasterCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateENVisaOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateENVisaOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateENAlipayOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateENAlipayOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqCreateDMMOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val client_type: Int = 0
)

@Serializable 
class ResCreateDmmOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null,
    @ProtoId(3) @JvmField val transaction_id: String? = null,
    @ProtoId(4) @JvmField val dmm_user_id: String? = null,
    @ProtoId(5) @JvmField val token: String? = null,
    @ProtoId(6) @JvmField val callback_url: String? = null,
    @ProtoId(9) @JvmField val request_time: String? = null,
    @ProtoId(10) @JvmField val dmm_app_id: String? = null
)

@Serializable 
class ReqCreateIAPOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val access_token: String? = null
)

@Serializable 
class ResCreateIAPOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
)

@Serializable 
class ReqVerificationIAPOrder (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val transaction_id: String? = null,
    @ProtoId(3) @JvmField val receipt_data: String? = null,
    @ProtoId(4) @JvmField val account_id: Int = 0
)

@Serializable 
class ResVerificationIAPOrder (
    @ProtoId(1) @JvmField val error: Error? = null
)

@Serializable 
class ReqCreateMyCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
)

@Serializable 
class ResCreateMyCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val auth_code: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null
)

@Serializable 
class ReqVerifyMyCardOrder (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val account_id: Int = 0
)

@Serializable 
class ReqOpenChest (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val use_ticket: Boolean = false
)

@Serializable 
class ResOpenChest (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val results: List<OpenResult> = emptyList(),
    @ProtoId(3) @JvmField val total_open_count: Int = 0,
    @ProtoId(4) @JvmField val faith_count: Int = 0
)

@Serializable 
class ReqBuyFromChestShop (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ResBuyFromChestShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val chest_id: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val faith_count: Int = 0
)

@Serializable 
class ResDailySignInInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val sign_in_days: Int = 0
)

@Serializable 
class ReqDoActivitySignIn (
    @ProtoId(2) @JvmField val activity_id: Int = 0
)

@Serializable 
class ResDoActivitySignIn (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val rewards: List<RewardData> = emptyList(),
    @ProtoId(3) @JvmField val sign_in_count: Int = 0
) {
@Serializable 
class RewardData (
    @ProtoId(1) @JvmField val resource_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

}

@Serializable 
class ResCharacterInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val characters: List<Character> = emptyList(),
    @ProtoId(3) @JvmField val skins: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val main_character_id: Int = 0,
    @ProtoId(5) @JvmField val send_gift_count: Int = 0,
    @ProtoId(6) @JvmField val send_gift_limit: Int = 0,
    @ProtoId(7) @JvmField val finished_endings: List<Int> = emptyList(),
    @ProtoId(8) @JvmField val rewarded_endings: List<Int> = emptyList()
)

@Serializable 
class ReqChangeMainCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0
)

@Serializable 
class ReqChangeCharacterSkin (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val skin: Int = 0
)

@Serializable 
class ReqChangeCharacterView (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val slot: Int = 0,
    @ProtoId(3) @JvmField val item_id: Int = 0
)

@Serializable 
class ReqSendGiftToCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val gifts: List<Gift> = emptyList()
) {
@Serializable 
class Gift (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

}

@Serializable 
class ResSendGiftToCharacter (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val level: Int = 0,
    @ProtoId(3) @JvmField val exp: Int = 0
)

@Serializable 
class ReqSellItem (
    @ProtoId(1) @JvmField val sells: List<Item> = emptyList()
) {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

}

@Serializable 
class ResCommonView (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val slots: List<Slot> = emptyList()
) {
@Serializable 
class Slot (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
)

}

@Serializable 
class ReqChangeCommonView (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
)

@Serializable 
class ReqSaveCommonViews (
    @ProtoId(1) @JvmField val views: List<ViewSlot> = emptyList(),
    @ProtoId(2) @JvmField val save_index: Int = 0,
    @ProtoId(3) @JvmField val is_use: Int = 0
)

@Serializable 
class ReqCommonViews (
    @ProtoId(1) @JvmField val index: Int = 0
)

@Serializable 
class ResCommonViews (
    @ProtoId(1) @JvmField val views: List<ViewSlot> = emptyList()
)

@Serializable 
class ResAllcommonViews (
    @ProtoId(1) @JvmField val views: List<Views> = emptyList(),
    @ProtoId(2) @JvmField val use: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) {
@Serializable 
class Views (
    @ProtoId(1) @JvmField val values: List<ViewSlot> = emptyList(),
    @ProtoId(2) @JvmField val index: Int = 0
)

}

@Serializable 
class ReqUseCommonView (
    @ProtoId(3) @JvmField val index: Int = 0
)

@Serializable 
class ReqUpgradeCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0
)

@Serializable 
class ResUpgradeCharacter (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val character: Character? = null
)

@Serializable 
class ReqFinishedEnding (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val story_id: Int = 0,
    @ProtoId(3) @JvmField val ending_id: Int = 0
)

@Serializable 
class ReqGMCommand (
    @ProtoId(1) @JvmField val command: String? = null
)

@Serializable 
class ResShopInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val shop_info: ShopInfo? = null
)

@Serializable 
class ReqBuyFromShop (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val bill_short_cut: List<BillShortcut> = emptyList(),
    @ProtoId(4) @JvmField val deal_price: Int = 0
)

@Serializable 
class ResBuyFromShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val rewards: List<RewardSlot> = emptyList()
)

@Serializable 
class ReqBuyFromZHP (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ReqPayMonthTicket (
    @ProtoId(1) @JvmField val ticket_id: Int = 0
)

@Serializable 
class ResPayMonthTicket (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val resource_id: Int = 0,
    @ProtoId(3) @JvmField val resource_count: Int = 0
)

@Serializable 
class ReqReshZHPShop (
    @ProtoId(1) @JvmField val free_refresh: Int = 0,
    @ProtoId(2) @JvmField val cost_refresh: Int = 0
)

@Serializable 
class ResRefreshZHPShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val zhp: ZHPShop? = null
)

@Serializable 
class ResMonthTicketInfo (
    @ProtoId(1) @JvmField val month_ticket_info: List<MonthTicketInfo> = emptyList()
)

@Serializable 
class ReqExchangeCurrency (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ResServerSettings (
    @ProtoId(1) @JvmField val settings: ServerSettings? = null
)

@Serializable 
class ResAccountSettings (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val settings: List<AccountSetting> = emptyList()
)

@Serializable 
class ReqUpdateAccountSettings (
    @ProtoId(1) @JvmField val setting: AccountSetting? = null
)

@Serializable 
class ResModNicknameTime (
    @ProtoId(1) @JvmField val last_mod_time: Int = 0
)

@Serializable 
class ResMisc (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val recharged_list: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val faiths: List<MiscFaithData> = emptyList()
) {
@Serializable 
class MiscFaithData (
    @ProtoId(1) @JvmField val faith_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

}

@Serializable 
class ReqModifySignature (
    @ProtoId(1) @JvmField val signature: String? = null
)

@Serializable 
class ResIDCardInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_authed: Boolean = false,
    @ProtoId(3) @JvmField val country: String? = null
)

@Serializable 
class ReqUpdateIDCardInfo (
    @ProtoId(1) @JvmField val fullname: String? = null,
    @ProtoId(2) @JvmField val card_no: String? = null
)

@Serializable 
class ResVipReward (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val gained_vip_levels: List<Int> = emptyList()
)

@Serializable 
class ReqGainVipReward (
    @ProtoId(1) @JvmField val vip_level: Int = 0
)

@Serializable 
class ReqFetchCustomizedContestList (
    @ProtoId(1) @JvmField val start: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

@Serializable 
class ResFetchCustomizedContestList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val contests: List<CustomizedContestBase> = emptyList(),
    @ProtoId(3) @JvmField val follow_contests: List<CustomizedContestBase> = emptyList()
)

@Serializable 
class ReqFetchCustomizedContestExtendInfo (
    @ProtoId(1) @JvmField val uid_list: List<Int> = emptyList()
)

@Serializable 
class ResFetchCustomizedContestExtendInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val extend_list: List<CustomizedContestExtend> = emptyList()
)

@Serializable 
class ReqFetchCustomizedContestAuthInfo (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ResFetchCustomizedContestAuthInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val observer_level: Int = 0
)

@Serializable 
class ReqEnterCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ResEnterCustomizedContest (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val detail_info: CustomizedContestDetail? = null,
    @ProtoId(3) @JvmField val player_report: CustomizedContestPlayerReport? = null,
    @ProtoId(4) @JvmField val is_followed: Boolean = false
)

@Serializable 
class ReqFetchCustomizedContestOnlineInfo (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ResFetchCustomizedContestOnlineInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val online_player: Int = 0
)

@Serializable 
class ReqFetchCustomizedContestByContestId (
    @ProtoId(1) @JvmField val contest_id: Int = 0
)

@Serializable 
class ResFetchCustomizedContestByContestId (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val contest_info: CustomizedContestAbstract? = null
)

@Serializable 
class ReqStartCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ReqJoinCustomizedContestChatRoom (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ResJoinCustomizedContestChatRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val chat_history: ByteArray = EMPTY_BYTE_ARRAY
)

@Serializable 
class ReqSayChatMessage (
    @ProtoId(1) @JvmField val content: String? = null
)

@Serializable 
class ReqFetchCustomizedContestGameLiveList (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ResFetchCustomizedContestGameLiveList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_list: List<GameLiveHead> = emptyList()
)

@Serializable 
class ReqFetchCustomizedContestGameRecords (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val last_index: Int = 0
)

@Serializable 
class ResFetchCustomizedContestGameRecords (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val next_index: Int = 0,
    @ProtoId(3) @JvmField val record_list: List<RecordGame> = emptyList()
)

@Serializable 
class ReqTargetCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
)

@Serializable 
class ResActivityList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val activities: List<Activity> = emptyList()
)

@Serializable 
class ResAccountActivityData (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val exchange_records: List<ExchangeRecord> = emptyList(),
    @ProtoId(3) @JvmField val task_progress_list: List<TaskProgress> = emptyList(),
    @ProtoId(4) @JvmField val accumulated_point_list: List<ActivityAccumulatedPointData> = emptyList(),
    @ProtoId(5) @JvmField val rank_data_list: List<ActivityRankPointData> = emptyList(),
    @ProtoId(6) @JvmField val flip_task_progress_list: List<TaskProgress> = emptyList(),
    @ProtoId(7) @JvmField val sign_in_data: List<ActivitySignInData> = emptyList(),
    @ProtoId(8) @JvmField val richman_data: List<ActivityRichmanData> = emptyList(),
    @ProtoId(9) @JvmField val period_task_progress_list: List<TaskProgress> = emptyList(),
    @ProtoId(10) @JvmField val random_task_progress_list: List<TaskProgress> = emptyList()
) {
@Serializable 
class ActivitySignInData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val sign_in_count: Int = 0,
    @ProtoId(3) @JvmField val last_sign_in_time: Int = 0
)

@Serializable 
class BuffData (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val remain: Int = 0,
    @ProtoId(3) @JvmField val effect: Int = 0
)

@Serializable 
class ActivityRichmanData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val location: Int = 0,
    @ProtoId(3) @JvmField val finished_count: Int = 0,
    @ProtoId(4) @JvmField val chest_position: Int = 0,
    @ProtoId(5) @JvmField val bank_save: Int = 0,
    @ProtoId(6) @JvmField val exp: Int = 0,
    @ProtoId(7) @JvmField val buff: List<BuffData> = emptyList()
)

}

@Serializable 
class ReqExchangeActivityItem (
    @ProtoId(1) @JvmField val exchange_id: Int = 0
)

@Serializable 
class ResExchangeActivityItem (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val execute_reward: List<ExecuteReward> = emptyList()
)

@Serializable 
class ReqCompleteActivityTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
)

@Serializable 
class ReqReceiveActivityFlipTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
)

@Serializable 
class ResReceiveActivityFlipTask (
    @ProtoId(1) @JvmField val count: Int = 0,
    @ProtoId(2) @JvmField val error: Error? = null
)

@Serializable 
class ReqFetchActivityFlipInfo (
    @ProtoId(1) @JvmField val activity_id: Int = 0
)

@Serializable 
class ResFetchActivityFlipInfo (
    @ProtoId(1) @JvmField val rewards: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
)

@Serializable 
class ReqGainAccumulatedPointActivityReward (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val reward_id: Int = 0
)

@Serializable 
class ReqFetchRankPointLeaderboard (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0
)

@Serializable 
class ResFetchRankPointLeaderboard (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(3) @JvmField val last_refresh_time: Int = 0
) {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val view: PlayerBaseView? = null,
    @ProtoId(4) @JvmField val point: Int = 0
)

}

@Serializable 
class ReqGainRankPointReward (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val activity_id: Int = 0
)

@Serializable 
class ReqRichmanNextMove (
    @ProtoId(1) @JvmField val activity_id: Int = 0
)

@Serializable 
class ResRichmanNextMove (
    @ProtoId(1) @JvmField val paths: List<PathData> = emptyList(),
    @ProtoId(2) @JvmField val dice: Int = 0,
    @ProtoId(3) @JvmField val location: Int = 0,
    @ProtoId(4) @JvmField val finished_count: Int = 0,
    @ProtoId(5) @JvmField val step: Int = 0,
    @ProtoId(6) @JvmField val buff: List<BuffData> = emptyList(),
    @ProtoId(7) @JvmField val bank_save: Int = 0,
    @ProtoId(8) @JvmField val chest_position: Int = 0,
    @ProtoId(9) @JvmField val exp: Int = 0,
    @ProtoId(10) @JvmField val bank_save_add: Int = 0,
    @ProtoId(11) @JvmField val error: Error? = null
) {
@Serializable 
class RewardData (
    @ProtoId(1) @JvmField val resource_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val origin_count: Int = 0,
    @ProtoId(4) @JvmField val is_chest: Int = 0
)

@Serializable 
class PathData (
    @ProtoId(1) @JvmField val location: Int = 0,
    @ProtoId(2) @JvmField val rewards: List<RewardData> = emptyList(),
    @ProtoId(3) @JvmField val events: List<Int> = emptyList()
)

@Serializable 
class BuffData (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val remain: Int = 0,
    @ProtoId(3) @JvmField val effect: Int = 0
)

}

@Serializable 
class ReqRichmanSpecialMove (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val step: Int = 0
)

@Serializable 
class ReqRichmanChestInfo (
    @ProtoId(1) @JvmField val activity_id: Int = 0
)

@Serializable 
class ResRichmanChestInfo (
    @ProtoId(1) @JvmField val items: List<ItemData> = emptyList(),
    @ProtoId(2) @JvmField val error: Error? = null
) {
@Serializable 
class ItemData (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
)

}

@Serializable 
class ReqCreateGameObserveAuth (
    @ProtoId(1) @JvmField val game_uuid: String? = null
)

@Serializable 
class ResCreateGameObserveAuth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val token: String? = null,
    @ProtoId(3) @JvmField val location: String? = null
)

@Serializable 
class ReqRefreshGameObserveAuth (
    @ProtoId(1) @JvmField val token: String? = null
)

@Serializable 
class ResRefreshGameObserveAuth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val ttl: Int = 0
)

@Serializable 
class ActionMJStart ()

@Serializable 
class NewRoundOpenedTiles (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tiles: String? = null,
    @ProtoId(3) @JvmField val count: List<Int> = emptyList()
)

@Serializable 
class MuyuInfo (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val count_max: Int = 0,
    @ProtoId(4) @JvmField val id: Int = 0
)

@Serializable 
class ActionNewRound (
    @ProtoId(1) @JvmField val chang: Int = 0,
    @ProtoId(2) @JvmField val ju: Int = 0,
    @ProtoId(3) @JvmField val ben: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val dora: String? = null,
    @ProtoId(6) @JvmField val scores: List<Int> = emptyList(),
    @ProtoId(7) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(8) @JvmField val liqibang: Int = 0,
    @ProtoId(9) @JvmField val tingpais0: List<TingPaiDiscardInfo> = emptyList(),
    @ProtoId(10) @JvmField val tingpais1: List<TingPaiInfo> = emptyList(),
    @ProtoId(11) @JvmField val al: Boolean = false,
    @ProtoId(12) @JvmField val md5: String? = null,
    @ProtoId(13) @JvmField val left_tile_count: Int = 0,
    @ProtoId(14) @JvmField val doras: String? = null,
    @ProtoId(15) @JvmField val opens: List<NewRoundOpenedTiles> = emptyList(),
    @ProtoId(16) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordNewRound (
    @ProtoId(1) @JvmField val chang: Int = 0,
    @ProtoId(2) @JvmField val ju: Int = 0,
    @ProtoId(3) @JvmField val ben: Int = 0,
    @ProtoId(4) @JvmField val dora: String? = null,
    @ProtoId(5) @JvmField val scores: List<Int> = emptyList(),
    @ProtoId(6) @JvmField val liqibang: Int = 0,
    @ProtoId(7) @JvmField val tiles0: String? = null,
    @ProtoId(8) @JvmField val tiles1: String? = null,
    @ProtoId(9) @JvmField val tiles2: String? = null,
    @ProtoId(10) @JvmField val tiles3: String? = null,
    @ProtoId(11) @JvmField val tingpai: List<TingPai> = emptyList(),
    @ProtoId(12) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(13) @JvmField val md5: String? = null,
    @ProtoId(14) @JvmField val paishan: String? = null,
    @ProtoId(15) @JvmField val left_tile_count: Int = 0,
    @ProtoId(16) @JvmField val doras: String? = null,
    @ProtoId(17) @JvmField val opens: List<NewRoundOpenedTiles> = emptyList(),
    @ProtoId(18) @JvmField val muyu: MuyuInfo? = null
) {
@Serializable 
class TingPai (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tingpais1: List<TingPaiInfo> = emptyList()
)

}

@Serializable 
class GameSnapshot (
    @ProtoId(1) @JvmField val chang: Int = 0,
    @ProtoId(2) @JvmField val ju: Int = 0,
    @ProtoId(3) @JvmField val ben: Int = 0,
    @ProtoId(4) @JvmField val index_player: Int = 0,
    @ProtoId(5) @JvmField val left_tile_count: Int = 0,
    @ProtoId(6) @JvmField val hands: String? = null,
    @ProtoId(7) @JvmField val doras: String? = null,
    @ProtoId(8) @JvmField val liqibang: Int = 0,
    @ProtoId(9) @JvmField val players: List<PlayerSnapshot> = emptyList(),
    @ProtoId(10) @JvmField val zhenting: Boolean = false
) {
@Serializable 
class PlayerSnapshot (
    @ProtoId(1) @JvmField val score: Int = 0,
    @ProtoId(2) @JvmField val liqiposition: Int = 0,
    @ProtoId(3) @JvmField val tilenum: Int = 0,
    @ProtoId(4) @JvmField val qipais: String? = null,
    @ProtoId(5) @JvmField val mings: List<Fulu> = emptyList()
) {
@Serializable 
class Fulu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val from: List<Int> = emptyList()
)

}

}

@Serializable 
class ActionPrototype (
    @ProtoId(1) @JvmField val step: Int = 0,
    @ProtoId(2) @JvmField val name: String? = null,
    @ProtoId(3) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY
)

@Serializable 
class GameDetailRecords (
    @ProtoId(1) @JvmField val records: ByteArray = EMPTY_BYTE_ARRAY
)

@Serializable 
class OptionalOperation (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val combination: String? = null
)

@Serializable 
class OptionalOperationList (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val operation_list: List<OptionalOperation> = emptyList(),
    @ProtoId(4) @JvmField val time_add: Int = 0,
    @ProtoId(5) @JvmField val time_fixed: Int = 0
)

@Serializable 
class LiQiSuccess (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val score: Int = 0,
    @ProtoId(3) @JvmField val liqibang: Int = 0
)

@Serializable 
class FanInfo (
    @ProtoId(1) @JvmField val name: String? = null,
    @ProtoId(2) @JvmField val `val`: Int = 0,
    @ProtoId(3) @JvmField val id: Int = 0
)

@Serializable 
class HuleInfo (
    @ProtoId(1) @JvmField val hand: String? = null,
    @ProtoId(2) @JvmField val ming: String? = null,
    @ProtoId(3) @JvmField val hu_tile: String? = null,
    @ProtoId(4) @JvmField val seat: Int = 0,
    @ProtoId(5) @JvmField val zimo: Boolean = false,
    @ProtoId(6) @JvmField val qinjia: Boolean = false,
    @ProtoId(7) @JvmField val liqi: Boolean = false,
    @ProtoId(8) @JvmField val doras: String? = null,
    @ProtoId(9) @JvmField val li_doras: String? = null,
    @ProtoId(10) @JvmField val yiman: Boolean = false,
    @ProtoId(11) @JvmField val count: Int = 0,
    @ProtoId(12) @JvmField val fans: List<FanInfo> = emptyList(),
    @ProtoId(13) @JvmField val fu: Int = 0,
    @ProtoId(14) @JvmField val title: String? = null,
    @ProtoId(15) @JvmField val point_rong: Int = 0,
    @ProtoId(16) @JvmField val point_zimo_qin: Int = 0,
    @ProtoId(17) @JvmField val point_zimo_xian: Int = 0,
    @ProtoId(18) @JvmField val title_id: Int = 0,
    @ProtoId(19) @JvmField val point_sum: Int = 0
)

@Serializable 
class TingPaiInfo (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val haveyi: Boolean = false,
    @ProtoId(3) @JvmField val yiman: Boolean = false,
    @ProtoId(4) @JvmField val count: Int = 0,
    @ProtoId(5) @JvmField val fu: Int = 0,
    @ProtoId(6) @JvmField val biao_dora_count: Int = 0,
    @ProtoId(7) @JvmField val yiman_zimo: Boolean = false,
    @ProtoId(8) @JvmField val count_zimo: Int = 0,
    @ProtoId(9) @JvmField val fu_zimo: Int = 0
)

@Serializable 
class TingPaiDiscardInfo (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val zhenting: Boolean = false,
    @ProtoId(3) @JvmField val infos: List<TingPaiInfo> = emptyList()
)

@Serializable 
class GameEnd (
    @ProtoId(1) @JvmField val scores: List<Int> = emptyList()
)

@Serializable 
class ActionDiscardTile (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val is_liqi: Boolean = false,
    @ProtoId(4) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(5) @JvmField val moqie: Boolean = false,
    @ProtoId(6) @JvmField val zhenting: Boolean = false,
    @ProtoId(7) @JvmField val tingpais: List<TingPaiInfo> = emptyList(),
    @ProtoId(8) @JvmField val doras: String? = null,
    @ProtoId(9) @JvmField val is_wliqi: Boolean = false,
    @ProtoId(10) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordDiscardTile (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val is_liqi: Boolean = false,
    @ProtoId(5) @JvmField val moqie: Boolean = false,
    @ProtoId(6) @JvmField val zhenting: Boolean = false,
    @ProtoId(7) @JvmField val tingpais: List<TingPaiInfo> = emptyList(),
    @ProtoId(8) @JvmField val doras: String? = null,
    @ProtoId(9) @JvmField val is_wliqi: Boolean = false,
    @ProtoId(10) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(11) @JvmField val tile_state: Int = 0,
    @ProtoId(12) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class ActionDealTile (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val left_tile_count: Int = 0,
    @ProtoId(4) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val tingpais: List<TingPaiDiscardInfo> = emptyList(),
    @ProtoId(9) @JvmField val tile_state: Int = 0,
    @ProtoId(10) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordDealTile (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val left_tile_count: Int = 0,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(9) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class ActionChiPengGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(4) @JvmField val froms: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val tingpais: List<TingPaiDiscardInfo> = emptyList(),
    @ProtoId(9) @JvmField val tile_states: List<Int> = emptyList(),
    @ProtoId(10) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordChiPengGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(4) @JvmField val froms: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(9) @JvmField val tile_states: List<Int> = emptyList(),
    @ProtoId(10) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class ActionAnGangAddGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(4) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val tingpais: List<TingPaiInfo> = emptyList(),
    @ProtoId(9) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordAnGangAddGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class ActionBaBei (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val tingpais: List<TingPaiInfo> = emptyList(),
    @ProtoId(9) @JvmField val moqie: Boolean = false,
    @ProtoId(10) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordBaBei (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(8) @JvmField val moqie: Boolean = false,
    @ProtoId(10) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class ActionHule (
    @ProtoId(1) @JvmField val hules: List<HuleInfo> = emptyList(),
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val wait_timeout: Int = 0,
    @ProtoId(5) @JvmField val scores: List<Int> = emptyList(),
    @ProtoId(6) @JvmField val gameend: GameEnd? = null,
    @ProtoId(7) @JvmField val doras: String? = null,
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordHule (
    @ProtoId(1) @JvmField val hules: List<HuleInfo> = emptyList(),
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val wait_timeout: Int = 0,
    @ProtoId(5) @JvmField val scores: List<Int> = emptyList(),
    @ProtoId(6) @JvmField val gameend: GameEnd? = null,
    @ProtoId(7) @JvmField val doras: String? = null,
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class ActionLiuJu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val gameend: GameEnd? = null,
    @ProtoId(3) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val allplayertiles: String? = null,
    @ProtoId(7) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordLiuJu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val gameend: GameEnd? = null,
    @ProtoId(3) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val allplayertiles: String? = null,
    @ProtoId(7) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class NoTilePlayerInfo (
    @ProtoId(3) @JvmField val tingpai: Boolean = false,
    @ProtoId(4) @JvmField val hand: String? = null,
    @ProtoId(5) @JvmField val tings: List<TingPaiInfo> = emptyList()
)

@Serializable 
class NoTileScoreInfo (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val hand: String? = null,
    @ProtoId(5) @JvmField val ming: String? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val score: Int = 0
)

@Serializable 
class ActionNoTile (
    @ProtoId(1) @JvmField val liujumanguan: Boolean = false,
    @ProtoId(2) @JvmField val players: List<NoTilePlayerInfo> = emptyList(),
    @ProtoId(3) @JvmField val scores: List<NoTileScoreInfo> = emptyList(),
    @ProtoId(4) @JvmField val gameend: Boolean = false,
    @ProtoId(5) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class RecordNoTile (
    @ProtoId(1) @JvmField val liujumanguan: Boolean = false,
    @ProtoId(2) @JvmField val players: List<NoTilePlayerInfo> = emptyList(),
    @ProtoId(3) @JvmField val scores: List<NoTileScoreInfo> = emptyList(),
    @ProtoId(4) @JvmField val gameend: Boolean = false,
    @ProtoId(5) @JvmField val muyu: MuyuInfo? = null
)

@Serializable 
class PlayerLeaving (
    @ProtoId(1) @JvmField val seat: Int = 0
)

interface FastTest {
    fun authGame(req: ReqAuthGame) : ResAuthGame
    fun enterGame(req: ReqCommon) : ResEnterGame
    fun syncGame(req: ReqSyncGame) : ResSyncGame
    fun finishSyncGame(req: ReqCommon) : ResCommon
    fun terminateGame(req: ReqCommon) : ResCommon
    fun inputOperation(req: ReqSelfOperation) : ResCommon
    fun inputChiPengGang(req: ReqChiPengGang) : ResCommon
    fun confirmNewRound(req: ReqCommon) : ResCommon
    fun broadcastInGame(req: ReqBroadcastInGame) : ResCommon
    fun inputGameGMCommand(req: ReqGMCommandInGaming) : ResCommon
    fun fetchGamePlayerState(req: ReqCommon) : ResGamePlayerState
    fun checkNetworkDelay(req: ReqCommon) : ResCommon
    fun clearLeaving(req: ReqCommon) : ResCommon
    fun voteGameEnd(req: ReqVoteGameEnd) : ResGameEndVote
    fun authObserve(req: ReqAuthObserve) : ResCommon
    fun startObserve(req: ReqCommon) : ResStartObserve
    fun stopObserve(req: ReqCommon) : ResCommon
}

@Serializable 
class ReqAuthGame (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null
)

@Serializable 
class ResAuthGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val players: List<PlayerGameView> = emptyList(),
    @ProtoId(3) @JvmField val seat_list: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val is_game_start: Boolean = false,
    @ProtoId(5) @JvmField val game_config: GameConfig? = null,
    @ProtoId(6) @JvmField val ready_id_list: List<Int> = emptyList()
)

@Serializable 
class GameRestore (
    @ProtoId(1) @JvmField val snapshot: GameSnapshot? = null,
    @ProtoId(2) @JvmField val actions: List<ActionPrototype> = emptyList(),
    @ProtoId(3) @JvmField val passed_waiting_time: Int = 0,
    @ProtoId(4) @JvmField val game_state: Int = 0,
    @ProtoId(5) @JvmField val start_time: Int = 0,
    @ProtoId(6) @JvmField val last_pause_time_ms: Int = 0
)

@Serializable 
class ResEnterGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_end: Boolean = false,
    @ProtoId(3) @JvmField val step: Int = 0,
    @ProtoId(4) @JvmField val game_restore: GameRestore? = null
)

@Serializable 
class ReqSyncGame (
    @ProtoId(1) @JvmField val round_id: String? = null,
    @ProtoId(2) @JvmField val step: Int = 0
)

@Serializable 
class ResSyncGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_end: Boolean = false,
    @ProtoId(3) @JvmField val step: Int = 0,
    @ProtoId(4) @JvmField val game_restore: GameRestore? = null
)

@Serializable 
class ReqSelfOperation (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val index: Int = 0,
    @ProtoId(3) @JvmField val tile: String? = null,
    @ProtoId(4) @JvmField val cancel_operation: Boolean = false,
    @ProtoId(5) @JvmField val moqie: Boolean = false,
    @ProtoId(6) @JvmField val timeuse: Int = 0,
    @ProtoId(7) @JvmField val tile_state: Int = 0
)

@Serializable 
class ReqChiPengGang (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val index: Int = 0,
    @ProtoId(3) @JvmField val cancel_operation: Boolean = false,
    @ProtoId(6) @JvmField val timeuse: Int = 0
)

@Serializable 
class ReqBroadcastInGame (
    @ProtoId(1) @JvmField val content: String? = null,
    @ProtoId(2) @JvmField val except_self: Boolean = false
)

@Serializable 
class ReqGMCommandInGaming (
    @ProtoId(1) @JvmField val json_data: String? = null
)

@Serializable 
class ResGamePlayerState (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val state_list: List<GamePlayerState> = emptyList()
)

@Serializable 
class ReqVoteGameEnd (
    @ProtoId(1) @JvmField val yes: Boolean = false
)

@Serializable 
class ResGameEndVote (
    @ProtoId(1) @JvmField val success: Boolean = false,
    @ProtoId(2) @JvmField val vote_cd_end_time: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
)

@Serializable 
class ReqAuthObserve (
    @ProtoId(1) @JvmField val token: String? = null
)

@Serializable 
class ResStartObserve (
    @ProtoId(1) @JvmField val head: GameLiveHead? = null,
    @ProtoId(2) @JvmField val passed: GameLiveSegment? = null
)

@Serializable 
class NotifyNewGame (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val player_list: String? = null
)

@Serializable 
class NotifyPlayerLoadGameReady (
    @ProtoId(1) @JvmField val ready_id_list: List<Int> = emptyList()
)

@Serializable 
class NotifyGameBroadcast (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null
)

@Serializable 
class NotifyGameEndResult (
    @ProtoId(1) @JvmField val result: GameEndResult? = null
)

@Serializable 
class NotifyGameTerminate (
    @ProtoId(1) @JvmField val reason: String? = null
)

@Serializable 
class NotifyPlayerConnectionState (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val state: GamePlayerState? = null
)

@Serializable 
class NotifyAccountLevelChange (
    @ProtoId(1) @JvmField val origin: AccountLevel? = null,
    @ProtoId(2) @JvmField val final: AccountLevel? = null,
    @ProtoId(3) @JvmField val type: Int = 0
)

@Serializable 
class NotifyGameFinishReward (
    @ProtoId(1) @JvmField val mode_id: Int = 0,
    @ProtoId(2) @JvmField val level_change: LevelChange? = null,
    @ProtoId(3) @JvmField val match_chest: MatchChest? = null,
    @ProtoId(4) @JvmField val main_character: MainCharacter? = null,
    @ProtoId(5) @JvmField val character_gift: CharacterGift? = null
) {
@Serializable 
class LevelChange (
    @ProtoId(1) @JvmField val origin: AccountLevel? = null,
    @ProtoId(2) @JvmField val final: AccountLevel? = null,
    @ProtoId(3) @JvmField val type: Int = 0
)

@Serializable 
class MatchChest (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val origin: Int = 0,
    @ProtoId(3) @JvmField val final: Int = 0,
    @ProtoId(4) @JvmField val is_graded: Boolean = false,
    @ProtoId(5) @JvmField val rewards: List<RewardSlot> = emptyList()
)

@Serializable 
class MainCharacter (
    @ProtoId(1) @JvmField val level: Int = 0,
    @ProtoId(2) @JvmField val exp: Int = 0,
    @ProtoId(3) @JvmField val add: Int = 0
)

@Serializable 
class CharacterGift (
    @ProtoId(1) @JvmField val origin: Int = 0,
    @ProtoId(2) @JvmField val final: Int = 0,
    @ProtoId(3) @JvmField val add: Int = 0,
    @ProtoId(4) @JvmField val is_graded: Boolean = false
)

}

@Serializable 
class NotifyActivityReward (
    @ProtoId(1) @JvmField val activity_reward: List<ActivityReward> = emptyList()
) {
@Serializable 
class ActivityReward (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val rewards: List<RewardSlot> = emptyList()
)

}

@Serializable 
class NotifyActivityPoint (
    @ProtoId(1) @JvmField val activity_points: List<ActivityPoint> = emptyList()
) {
@Serializable 
class ActivityPoint (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0
)

}

@Serializable 
class NotifyLeaderboardPoint (
    @ProtoId(1) @JvmField val leaderboard_points: List<LeaderboardPoint> = emptyList()
) {
@Serializable 
class LeaderboardPoint (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0
)

}

@Serializable 
class NotifyGamePause (
    @ProtoId(1) @JvmField val paused: Boolean = false
)

@Serializable 
class NotifyEndGameVote (
    @ProtoId(1) @JvmField val results: List<VoteResult> = emptyList(),
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val duration_time: Int = 0
) {
@Serializable 
class VoteResult (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val yes: Boolean = false
)

}

@Serializable 
class NotifyObserveData (
    @ProtoId(1) @JvmField val unit: GameLiveUnit? = null
)

