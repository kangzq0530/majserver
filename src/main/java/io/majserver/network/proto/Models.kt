package io.majserver.network.proto

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoId

val EMPTY_BYTE_ARRAY = ByteArray(0)

@Serializable 
class NotifyRoomGameStart (
    @ProtoId(1) @JvmField val game_url: String? = null,
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val location: String? = null
) : IProtoMessage

@Serializable 
class NotifyMatchGameStart (
    @ProtoId(1) @JvmField val game_url: String? = null,
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val match_mode_id: Int = 0,
    @ProtoId(5) @JvmField val location: String? = null
) : IProtoMessage

@Serializable 
class NotifyRoomPlayerReady (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val ready: Boolean = false
) : IProtoMessage

@Serializable 
class NotifyRoomPlayerDressing (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val dressing: Boolean = false
) : IProtoMessage

@Serializable 
class NotifyRoomPlayerUpdate (
    @ProtoId(1) @JvmField val update_list: List<PlayerBaseView> = emptyList(),
    @ProtoId(2) @JvmField val remove_list: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val owner_id: Int = 0,
    @ProtoId(4) @JvmField val robot_count: Int = 0
) : IProtoMessage

@Serializable 
class NotifyRoomKickOut () : IProtoMessage

@Serializable 
class NotifyMatchTimeout () : IProtoMessage

@Serializable 
class NotifyFriendStateChange (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val active_state: AccountActiveState? = null
) : IProtoMessage

@Serializable 
class NotifyFriendViewChange (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val base: PlayerBaseView? = null
) : IProtoMessage

@Serializable 
class NotifyFriendChange (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val friend: Friend? = null
) : IProtoMessage

@Serializable 
class NotifyNewFriendApply (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val apply_time: Int = 0,
    @ProtoId(3) @JvmField val removed_id: Int = 0
) : IProtoMessage

@Serializable 
class NotifyClientMessage (
    @ProtoId(1) @JvmField val sender: PlayerBaseView? = null,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val content: String? = null
) : IProtoMessage

@Serializable 
class NotifyAccountUpdate (
    @ProtoId(1) @JvmField val update: AccountUpdate? = null
) : IProtoMessage

@Serializable 
class NotifyAnotherLogin () : IProtoMessage

@Serializable 
class NotifyAccountLogout () : IProtoMessage

@Serializable 
class NotifyAnnouncementUpdate (
    @ProtoId(1) @JvmField val announcements: List<Announcement> = emptyList(),
    @ProtoId(2) @JvmField val sort: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyNewMail (
    @ProtoId(1) @JvmField val mail: Mail? = null
) : IProtoMessage

@Serializable 
class NotifyDeleteMail (
    @ProtoId(1) @JvmField val mail_id_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyReviveCoinUpdate (
    @ProtoId(1) @JvmField val has_gained: Boolean = false
) : IProtoMessage

@Serializable 
class NotifyDailyTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList(),
    @ProtoId(2) @JvmField val max_daily_task_count: Int = 0,
    @ProtoId(3) @JvmField val refresh_count: Int = 0
) : IProtoMessage

@Serializable 
class NotifyActivityTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyActivityPeriodTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyAccountRandomTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyNewComment () : IProtoMessage

@Serializable 
class NotifyRollingNotice (
    @ProtoId(1) @JvmField val notice: RollingNotice? = null
) : IProtoMessage

@Serializable 
class NotifyGiftSendRefresh () : IProtoMessage

@Serializable 
class NotifyShopUpdate (
    @ProtoId(1) @JvmField val shop_info: ShopInfo? = null
) : IProtoMessage

@Serializable 
class NotifyVipLevelChange (
    @ProtoId(1) @JvmField val gift_limit: Int = 0,
    @ProtoId(2) @JvmField val friend_max_count: Int = 0,
    @ProtoId(3) @JvmField val zhp_free_refresh_limit: Int = 0,
    @ProtoId(4) @JvmField val zhp_cost_refresh_limit: Int = 0,
    @ProtoId(5) @JvmField val buddy_bonus: Float = 0f,
    @ProtoId(6) @JvmField val record_collect_limit: Int = 0
) : IProtoMessage

@Serializable 
class NotifyServerSetting (
    @ProtoId(1) @JvmField val settings: ServerSettings? = null
) : IProtoMessage

@Serializable 
class NotifyPayResult (
    @ProtoId(1) @JvmField val pay_result: Int = 0,
    @ProtoId(2) @JvmField val order_id: String? = null,
    @ProtoId(3) @JvmField val goods_id: Int = 0,
    @ProtoId(4) @JvmField val new_month_ticket: Int = 0,
    @ProtoId(5) @JvmField val resource_modify: List<ResourceModify> = emptyList()
) : IProtoMessage {
@Serializable 
class ResourceModify (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val final: Int = 0
) : IProtoMessage

}

@Serializable 
class NotifyCustomContestAccountMsg (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val sender: String? = null,
    @ProtoId(4) @JvmField val content: String? = null,
    @ProtoId(5) @JvmField val verified: Int = 0
) : IProtoMessage

@Serializable 
class NotifyCustomContestSystemMsg (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val uuid: String? = null,
    @ProtoId(4) @JvmField val game_start: CustomizedContestGameStart? = null,
    @ProtoId(5) @JvmField val game_end: CustomizedContestGameEnd? = null
) : IProtoMessage

@Serializable 
class NotifyCustomContestState (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0
) : IProtoMessage

@Serializable 
class NotifyActivityChange (
    @ProtoId(1) @JvmField val new_activities: List<Activity> = emptyList(),
    @ProtoId(2) @JvmField val end_activities: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyAFKResult (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val ban_end_time: Int = 0,
    @ProtoId(3) @JvmField val game_uuid: String? = null
) : IProtoMessage

@Serializable 
class Error (
    @ProtoId(1) @JvmField val code: Int = 0,
    @ProtoId(2) @JvmField val u32_params: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val str_params: String? = null,
    @ProtoId(4) @JvmField val json_param: String? = null
) : IProtoMessage

@Serializable 
class Wrapper (
    @ProtoId(1) @JvmField val name: String? = null,
    @ProtoId(2) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage

@Serializable 
class NetworkEndpoint (
    @ProtoId(1) @JvmField val family: String? = null,
    @ProtoId(2) @JvmField val address: String? = null,
    @ProtoId(3) @JvmField val port: Int = 0
) : IProtoMessage

@Serializable 
class ReqCommon () : IProtoMessage

@Serializable 
class ResCommon (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ResAccountUpdate (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val update: AccountUpdate? = null
) : IProtoMessage

@Serializable 
class AntiAddiction (
    @ProtoId(1) @JvmField val online_duration: Int = 0
) : IProtoMessage

@Serializable 
class AccountMahjongStatistic (
    @ProtoId(1) @JvmField val final_position_counts: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val recent_round: RoundSummary? = null,
    @ProtoId(3) @JvmField val recent_hu: HuSummary? = null,
    @ProtoId(4) @JvmField val highest_hu: HighestHuRecord? = null,
    @ProtoId(6) @JvmField val recent_20_hu_summary: Liqi20Summary? = null,
    @ProtoId(7) @JvmField val recent_10_hu_summary: LiQi10Summary? = null,
    @ProtoId(8) @JvmField val recent_10_game_result: List<GameResult> = emptyList()
) : IProtoMessage {
@Serializable 
class RoundSummary (
    @ProtoId(1) @JvmField val total_count: Int = 0,
    @ProtoId(2) @JvmField val rong_count: Int = 0,
    @ProtoId(3) @JvmField val zimo_count: Int = 0,
    @ProtoId(4) @JvmField val fangchong_count: Int = 0
) : IProtoMessage

@Serializable 
class HuSummary (
    @ProtoId(1) @JvmField val total_count: Int = 0,
    @ProtoId(2) @JvmField val dora_round_count: Int = 0,
    @ProtoId(3) @JvmField val total_fan: Int = 0
) : IProtoMessage

@Serializable 
class HighestHuRecord (
    @ProtoId(1) @JvmField val fanshu: Int = 0,
    @ProtoId(2) @JvmField val doranum: Int = 0,
    @ProtoId(3) @JvmField val title: String? = null,
    @ProtoId(4) @JvmField val hands: String? = null,
    @ProtoId(5) @JvmField val ming: String? = null,
    @ProtoId(6) @JvmField val hupai: String? = null,
    @ProtoId(7) @JvmField val title_id: Int = 0
) : IProtoMessage

@Serializable 
class Liqi20Summary (
    @ProtoId(1) @JvmField val total_count: Int = 0,
    @ProtoId(2) @JvmField val total_lidora_count: Int = 0,
    @ProtoId(3) @JvmField val average_hu_point: Int = 0
) : IProtoMessage

@Serializable 
class LiQi10Summary (
    @ProtoId(1) @JvmField val total_xuanshang: Int = 0,
    @ProtoId(2) @JvmField val total_fanshu: Int = 0
) : IProtoMessage

@Serializable 
class GameResult (
    @ProtoId(1) @JvmField val rank: Int = 0,
    @ProtoId(2) @JvmField val final_point: Int = 0
) : IProtoMessage

}

@Serializable 
class AccountStatisticData (
    @ProtoId(1) @JvmField val mahjong_category: Int = 0,
    @ProtoId(2) @JvmField val game_category: Int = 0,
    @ProtoId(3) @JvmField val statistic: AccountMahjongStatistic? = null
) : IProtoMessage

@Serializable 
class AccountLevel (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val score: Int = 0
) : IProtoMessage

@Serializable 
class ViewSlot (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val item_id: Int = 0
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class PlatformDiamond (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class PlatformSkinTicket (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

}

@Serializable 
class AccountOwnerData (
    @ProtoId(1) @JvmField val unlock_characters: List<Int> = emptyList()
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class NumericalUpdate (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(3) @JvmField val final: Int = 0
) : IProtoMessage

@Serializable 
class CharacterUpdate (
    @ProtoId(2) @JvmField val characters: List<Character> = emptyList(),
    @ProtoId(3) @JvmField val skins: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val finished_endings: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val rewarded_endings: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class AchievementUpdate (
    @ProtoId(1) @JvmField val progresses: List<AchievementProgress> = emptyList()
) : IProtoMessage

@Serializable 
class DailyTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage

@Serializable 
class TitleUpdate (
    @ProtoId(1) @JvmField val new_titles: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val remove_titles: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class TaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage

}

@Serializable 
class GameMetaData (
    @ProtoId(1) @JvmField val room_id: Int = 0,
    @ProtoId(2) @JvmField val mode_id: Int = 0,
    @ProtoId(3) @JvmField val contest_uid: Int = 0
) : IProtoMessage

@Serializable 
class AccountPlayingGame (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val category: Int = 0,
    @ProtoId(3) @JvmField val meta: GameMetaData? = null
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class GameMode (
    @ProtoId(1) @JvmField val mode: Int = 0,
    @ProtoId(4) @JvmField val ai: Boolean = false,
    @ProtoId(5) @JvmField val extendinfo: String? = null,
    @ProtoId(6) @JvmField val detail_rule: GameDetailRule? = null,
    @ProtoId(7) @JvmField val testing_environment: GameTestingEnvironmentSet? = null
) : IProtoMessage

@Serializable 
class GameTestingEnvironmentSet (
    @ProtoId(1) @JvmField val paixing: Int = 0,
    @ProtoId(2) @JvmField val left_count: Int = 0
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class GameEndResult (
    @ProtoId(1) @JvmField val players: List<PlayerItem> = emptyList()
) : IProtoMessage {
@Serializable 
class PlayerItem (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val total_point: Int = 0,
    @ProtoId(3) @JvmField val part_point_1: Int = 0,
    @ProtoId(4) @JvmField val part_point_2: Int = 0,
    @ProtoId(5) @JvmField val grading_score: Int = 0,
    @ProtoId(6) @JvmField val gold: Int = 0
) : IProtoMessage

}

@Serializable 
class GameConnectInfo (
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val location: String? = null
) : IProtoMessage

@Serializable 
class ItemGainRecord (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ItemGainRecords (
    @ProtoId(1) @JvmField val record_time: Int = 0,
    @ProtoId(2) @JvmField val limit_source_id: Int = 0,
    @ProtoId(3) @JvmField val records: List<ItemGainRecord> = emptyList()
) : IProtoMessage

@Serializable 
class Item (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val stack: Int = 0
) : IProtoMessage

@Serializable 
class Bag (
    @ProtoId(1) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(2) @JvmField val daily_gain_record: List<ItemGainRecords> = emptyList()
) : IProtoMessage

@Serializable 
class BagUpdate (
    @ProtoId(1) @JvmField val update_items: List<Item> = emptyList(),
    @ProtoId(2) @JvmField val update_daily_gain_record: List<ItemGainRecords> = emptyList()
) : IProtoMessage

@Serializable 
class RewardSlot (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class OpenResult (
    @ProtoId(1) @JvmField val reward: RewardSlot? = null,
    @ProtoId(2) @JvmField val replace: RewardSlot? = null
) : IProtoMessage

@Serializable 
class RewardPlusResult (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val exchange: Exchange? = null
) : IProtoMessage {
@Serializable 
class Exchange (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val exchange: Int = 0
) : IProtoMessage

}

@Serializable 
class ExecuteReward (
    @ProtoId(1) @JvmField val reward: RewardSlot? = null,
    @ProtoId(2) @JvmField val replace: RewardSlot? = null,
    @ProtoId(3) @JvmField val replace_count: Int = 0
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class AchievementProgress (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val counter: Int = 0,
    @ProtoId(3) @JvmField val achieved: Boolean = false,
    @ProtoId(4) @JvmField val date: Int = 0
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class RoundEndData (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val sum: Int = 0
) : IProtoMessage

@Serializable 
class RankScore (
    @ProtoId(1) @JvmField val rank: Int = 0,
    @ProtoId(2) @JvmField val score_sum: Int = 0,
    @ProtoId(3) @JvmField val count: Int = 0
) : IProtoMessage

}

@Serializable 
class AccountStatisticByFan (
    @ProtoId(1) @JvmField val fan_id: Int = 0,
    @ProtoId(2) @JvmField val sum: Int = 0
) : IProtoMessage

@Serializable 
class AccountFanAchieved (
    @ProtoId(1) @JvmField val mahjong_category: Int = 0,
    @ProtoId(2) @JvmField val fan: List<AccountStatisticByFan> = emptyList(),
    @ProtoId(3) @JvmField val liujumanguan: Int = 0
) : IProtoMessage

@Serializable 
class AccountDetailStatistic (
    @ProtoId(1) @JvmField val game_mode: List<AccountStatisticByGameMode> = emptyList(),
    @ProtoId(2) @JvmField val fan: List<AccountStatisticByFan> = emptyList(),
    @ProtoId(3) @JvmField val liujumanguan: Int = 0,
    @ProtoId(4) @JvmField val fan_achieved: List<AccountFanAchieved> = emptyList()
) : IProtoMessage

@Serializable 
class AccountDetailStatisticByCategory (
    @ProtoId(1) @JvmField val category: Int = 0,
    @ProtoId(2) @JvmField val detail_statistic: AccountDetailStatistic? = null
) : IProtoMessage

@Serializable 
class AccountDetailStatisticV2 (
    @ProtoId(1) @JvmField val friend_room_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val rank_statistic: RankStatistic? = null,
    @ProtoId(3) @JvmField val customized_contest_statistic: CustomizedContestStatistic? = null,
    @ProtoId(4) @JvmField val leisure_match_statistic: AccountDetailStatistic? = null
) : IProtoMessage {
@Serializable 
class RankStatistic (
    @ProtoId(1) @JvmField val total_statistic: RankData? = null,
    @ProtoId(2) @JvmField val month_statistic: RankData? = null,
    @ProtoId(3) @JvmField val month_refresh_time: Int = 0
) : IProtoMessage {
@Serializable 
class RankData (
    @ProtoId(1) @JvmField val all_level_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val level_data_list: List<RankLevelData> = emptyList()
) : IProtoMessage {
@Serializable 
class RankLevelData (
    @ProtoId(1) @JvmField val rank_level: Int = 0,
    @ProtoId(2) @JvmField val statistic: AccountDetailStatistic? = null
) : IProtoMessage

}

}

@Serializable 
class CustomizedContestStatistic (
    @ProtoId(1) @JvmField val total_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val month_statistic: AccountDetailStatistic? = null,
    @ProtoId(3) @JvmField val month_refresh_time: Int = 0
) : IProtoMessage

}

@Serializable 
class AccountShiLian (
    @ProtoId(1) @JvmField val step: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0
) : IProtoMessage

@Serializable 
class ClientDeviceInfo (
    @ProtoId(1) @JvmField val device_type: String? = null,
    @ProtoId(2) @JvmField val os: String? = null,
    @ProtoId(3) @JvmField val os_version: String? = null,
    @ProtoId(4) @JvmField val browser: String? = null
) : IProtoMessage

@Serializable 
class GamePlayerState () : IProtoMessage

@Serializable 
class Announcement (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val title: String? = null,
    @ProtoId(3) @JvmField val content: String? = null
) : IProtoMessage

@Serializable 
class TaskProgress (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val counter: Int = 0,
    @ProtoId(3) @JvmField val achieved: Boolean = false,
    @ProtoId(4) @JvmField val rewarded: Boolean = false
) : IProtoMessage

@Serializable 
class GameConfig (
    @ProtoId(1) @JvmField val category: Int = 0,
    @ProtoId(2) @JvmField val mode: GameMode? = null,
    @ProtoId(3) @JvmField val meta: GameMetaData? = null
) : IProtoMessage

@Serializable 
class AccountActiveState (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val login_time: Int = 0,
    @ProtoId(3) @JvmField val logout_time: Int = 0,
    @ProtoId(4) @JvmField val is_online: Boolean = false,
    @ProtoId(5) @JvmField val playing: AccountPlayingGame? = null
) : IProtoMessage

@Serializable 
class Friend (
    @ProtoId(1) @JvmField val base: PlayerBaseView? = null,
    @ProtoId(2) @JvmField val state: AccountActiveState? = null
) : IProtoMessage

@Serializable 
class GameLiveUnit (
    @ProtoId(1) @JvmField val timestamp: Int = 0,
    @ProtoId(2) @JvmField val action_category: Int = 0,
    @ProtoId(3) @JvmField val action_data: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage

@Serializable 
class GameLiveSegment (
    @ProtoId(1) @JvmField val actions: List<GameLiveUnit> = emptyList()
) : IProtoMessage

@Serializable 
class GameLiveSegmentUri (
    @ProtoId(1) @JvmField val segment_id: Int = 0,
    @ProtoId(2) @JvmField val segment_uri: String? = null
) : IProtoMessage

@Serializable 
class GameLiveHead (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val game_config: GameConfig? = null,
    @ProtoId(4) @JvmField val players: List<PlayerGameView> = emptyList(),
    @ProtoId(5) @JvmField val seat_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class GameNewRoundState (
    @ProtoId(1) @JvmField val seat_states: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class GameEndAction (
    @ProtoId(1) @JvmField val state: Int = 0
) : IProtoMessage

@Serializable 
class GameNoopAction () : IProtoMessage

@Serializable 
class CommentItem (
    @ProtoId(1) @JvmField val comment_id: Int = 0,
    @ProtoId(2) @JvmField val timestamp: Int = 0,
    @ProtoId(3) @JvmField val commenter: PlayerBaseView? = null,
    @ProtoId(4) @JvmField val content: String? = null,
    @ProtoId(5) @JvmField val is_banned: Int = 0
) : IProtoMessage

@Serializable 
class RollingNotice (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0,
    @ProtoId(5) @JvmField val repeat_interval: Int = 0
) : IProtoMessage

@Serializable 
class BillingGoods (
    @ProtoId(1) @JvmField val id: String? = null,
    @ProtoId(2) @JvmField val name: String? = null,
    @ProtoId(3) @JvmField val desc: String? = null,
    @ProtoId(4) @JvmField val icon: String? = null,
    @ProtoId(5) @JvmField val resource_id: Int = 0,
    @ProtoId(6) @JvmField val resource_count: Int = 0
) : IProtoMessage

@Serializable 
class BillShortcut (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val dealPrice: Int = 0
) : IProtoMessage

@Serializable 
class BillingProduct (
    @ProtoId(1) @JvmField val goods: BillingGoods? = null,
    @ProtoId(2) @JvmField val currency_code: String? = null,
    @ProtoId(3) @JvmField val currency_price: Int = 0,
    @ProtoId(4) @JvmField val sort_weight: Int = 0
) : IProtoMessage

@Serializable 
class Character (
    @ProtoId(1) @JvmField val charid: Int = 0,
    @ProtoId(2) @JvmField val level: Int = 0,
    @ProtoId(3) @JvmField val exp: Int = 0,
    @ProtoId(4) @JvmField val views: List<ViewSlot> = emptyList(),
    @ProtoId(5) @JvmField val skin: Int = 0,
    @ProtoId(6) @JvmField val is_upgraded: Boolean = false,
    @ProtoId(7) @JvmField val extra_emoji: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class BuyRecord (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ZHPShop (
    @ProtoId(1) @JvmField val goods: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val buy_records: List<BuyRecord> = emptyList(),
    @ProtoId(3) @JvmField val free_refresh: RefreshCount? = null,
    @ProtoId(4) @JvmField val cost_refresh: RefreshCount? = null
) : IProtoMessage {
@Serializable 
class RefreshCount (
    @ProtoId(1) @JvmField val count: Int = 0,
    @ProtoId(2) @JvmField val limit: Int = 0
) : IProtoMessage

}

@Serializable 
class MonthTicketInfo (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val end_time: Int = 0,
    @ProtoId(3) @JvmField val last_pay_time: Int = 0
) : IProtoMessage

@Serializable 
class ShopInfo (
    @ProtoId(1) @JvmField val zhp: ZHPShop? = null,
    @ProtoId(2) @JvmField val buy_records: List<BuyRecord> = emptyList(),
    @ProtoId(3) @JvmField val last_refresh_time: Int = 0
) : IProtoMessage

@Serializable 
class ChangeNicknameRecord (
    @ProtoId(1) @JvmField val from: String? = null,
    @ProtoId(2) @JvmField val to: String? = null,
    @ProtoId(3) @JvmField val time: Int = 0
) : IProtoMessage

@Serializable 
class ServerSettings (
    @ProtoId(3) @JvmField val payment_setting: PaymentSetting? = null
) : IProtoMessage

@Serializable 
class PaymentSetting (
    @ProtoId(1) @JvmField val open_payment: Int = 0,
    @ProtoId(2) @JvmField val payment_info_show_type: Int = 0,
    @ProtoId(3) @JvmField val payment_info: String? = null,
    @ProtoId(4) @JvmField val wechat: WechatData? = null,
    @ProtoId(5) @JvmField val alipay: AlipayData? = null
) : IProtoMessage {
@Serializable 
class WechatData (
    @ProtoId(1) @JvmField val disable_create: Boolean = false,
    @ProtoId(2) @JvmField val payment_source_platform: Int = 0,
    @ProtoId(3) @JvmField val enable_credit: Boolean = false
) : IProtoMessage

@Serializable 
class AlipayData (
    @ProtoId(1) @JvmField val disable_create: Boolean = false,
    @ProtoId(2) @JvmField val payment_source_platform: Int = 0
) : IProtoMessage

}

@Serializable 
class AccountSetting (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage

@Serializable 
class ChestData (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val face_black_count: Int = 0
) : IProtoMessage

@Serializable 
class ChestDataV2 (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val face_black_count: Int = 0
) : IProtoMessage

@Serializable 
class FaithData (
    @ProtoId(1) @JvmField val faith_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val modify_count: Int = 0
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class CustomizedContestExtend (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val public_notice: String? = null
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class CustomizedContestPlayerReport (
    @ProtoId(1) @JvmField val rank_rule: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val point: Int = 0,
    @ProtoId(4) @JvmField val game_ranks: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val total_game_count: Int = 0
) : IProtoMessage

@Serializable 
class RecordGame (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val end_time: Int = 0,
    @ProtoId(5) @JvmField val config: GameConfig? = null,
    @ProtoId(11) @JvmField val accounts: List<AccountInfo> = emptyList(),
    @ProtoId(12) @JvmField val result: GameEndResult? = null
) : IProtoMessage {
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
) : IProtoMessage

}

@Serializable 
class CustomizedContestGameStart (
    @ProtoId(1) @JvmField val players: List<Item> = emptyList()
) : IProtoMessage {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val nickname: String? = null
) : IProtoMessage

}

@Serializable 
class CustomizedContestGameEnd (
    @ProtoId(1) @JvmField val players: List<Item> = emptyList()
) : IProtoMessage {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val nickname: String? = null,
    @ProtoId(3) @JvmField val total_point: Int = 0
) : IProtoMessage

}

@Serializable 
class Activity (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val end_time: Int = 0,
    @ProtoId(4) @JvmField val type: String? = null
) : IProtoMessage

@Serializable 
class ExchangeRecord (
    @ProtoId(1) @JvmField val exchange_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ActivityAccumulatedPointData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0,
    @ProtoId(3) @JvmField val gained_reward_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ActivityRankPointData (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0,
    @ProtoId(3) @JvmField val gained_reward: Boolean = false,
    @ProtoId(4) @JvmField val gainable_time: Int = 0
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class HuPai (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val seat: Int = 0,
    @ProtoId(3) @JvmField val liqi: Int = 0
) : IProtoMessage

@Serializable 
class Fan (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val fan: Int = 0
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class GameRoundPlayer (
    @ProtoId(1) @JvmField val score: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val result: GameRoundPlayerResult? = null
) : IProtoMessage

@Serializable 
class GameRoundSnapshot (
    @ProtoId(1) @JvmField val ju: Int = 0,
    @ProtoId(2) @JvmField val ben: Int = 0,
    @ProtoId(3) @JvmField val players: List<GameRoundPlayer> = emptyList()
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class CalculateParam (
    @ProtoId(1) @JvmField val init_point: Int = 0,
    @ProtoId(2) @JvmField val jingsuanyuandian: Int = 0,
    @ProtoId(3) @JvmField val rank_points: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class GameSeat (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val notify_endpoint: NetworkEndpoint? = null,
    @ProtoId(4) @JvmField val client_address: String? = null,
    @ProtoId(5) @JvmField val is_connected: Boolean = false
) : IProtoMessage

@Serializable 
class FinalPlayer (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val total_point: Int = 0,
    @ProtoId(3) @JvmField val part_point_1: Int = 0,
    @ProtoId(4) @JvmField val part_point_2: Int = 0,
    @ProtoId(5) @JvmField val grading_score: Int = 0,
    @ProtoId(6) @JvmField val gold: Int = 0
) : IProtoMessage

@Serializable 
class AFKInfo (
    @ProtoId(1) @JvmField val deal_tile_count: Int = 0,
    @ProtoId(2) @JvmField val moqie_count: Int = 0,
    @ProtoId(3) @JvmField val seat: Int = 0
) : IProtoMessage

}

@Serializable 
class RecordCollectedData (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class ContestDetailRuleV2 (
    @ProtoId(1) @JvmField val game_rule: ContestDetailRule? = null,
    @ProtoId(2) @JvmField val extra_rule: ExtraRule? = null
) : IProtoMessage {
@Serializable 
class ExtraRule (
    @ProtoId(1) @JvmField val required_level: Int = 0,
    @ProtoId(2) @JvmField val max_game_count: Int = 0
) : IProtoMessage

}

@Serializable 
class GameRuleSetting (
    @ProtoId(1) @JvmField val round_type: Int = 0,
    @ProtoId(2) @JvmField val shiduan: Boolean = false,
    @ProtoId(3) @JvmField val dora_count: Int = 0,
    @ProtoId(4) @JvmField val thinking_type: Int = 0,
    @ProtoId(5) @JvmField val use_detail_rule: Boolean = false,
    @ProtoId(6) @JvmField val detail_rule_v2: ContestDetailRuleV2? = null
) : IProtoMessage

class Lobby {
    class FetchConnectionInfo(callable: (ReqCommon) -> ResConnectionInfo): IProtoRpc<ReqCommon, ResConnectionInfo>(".lq.Lobby.fetchConnectionInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResConnectionInfo): ByteArray = ProtoBuf.dump(ResConnectionInfo.serializer(), res)
    }
    class Signup(callable: (ReqSignupAccount) -> ResSignupAccount): IProtoRpc<ReqSignupAccount, ResSignupAccount>(".lq.Lobby.signup", callable) {
        override fun decodeReq(data: ByteArray): ReqSignupAccount = ProtoBuf.load(ReqSignupAccount.serializer(), data)
        override fun encodeRes(res: ResSignupAccount): ByteArray = ProtoBuf.dump(ResSignupAccount.serializer(), res)
    }
    class Login(callable: (ReqLogin) -> ResLogin): IProtoRpc<ReqLogin, ResLogin>(".lq.Lobby.login", callable) {
        override fun decodeReq(data: ByteArray): ReqLogin = ProtoBuf.load(ReqLogin.serializer(), data)
        override fun encodeRes(res: ResLogin): ByteArray = ProtoBuf.dump(ResLogin.serializer(), res)
    }
    class EmailLogin(callable: (ReqEmailLogin) -> ResLogin): IProtoRpc<ReqEmailLogin, ResLogin>(".lq.Lobby.emailLogin", callable) {
        override fun decodeReq(data: ByteArray): ReqEmailLogin = ProtoBuf.load(ReqEmailLogin.serializer(), data)
        override fun encodeRes(res: ResLogin): ByteArray = ProtoBuf.dump(ResLogin.serializer(), res)
    }
    class Oauth2Auth(callable: (ReqOauth2Auth) -> ResOauth2Auth): IProtoRpc<ReqOauth2Auth, ResOauth2Auth>(".lq.Lobby.oauth2Auth", callable) {
        override fun decodeReq(data: ByteArray): ReqOauth2Auth = ProtoBuf.load(ReqOauth2Auth.serializer(), data)
        override fun encodeRes(res: ResOauth2Auth): ByteArray = ProtoBuf.dump(ResOauth2Auth.serializer(), res)
    }
    class Oauth2Check(callable: (ReqOauth2Check) -> ResOauth2Check): IProtoRpc<ReqOauth2Check, ResOauth2Check>(".lq.Lobby.oauth2Check", callable) {
        override fun decodeReq(data: ByteArray): ReqOauth2Check = ProtoBuf.load(ReqOauth2Check.serializer(), data)
        override fun encodeRes(res: ResOauth2Check): ByteArray = ProtoBuf.dump(ResOauth2Check.serializer(), res)
    }
    class Oauth2Signup(callable: (ReqOauth2Signup) -> ResOauth2Signup): IProtoRpc<ReqOauth2Signup, ResOauth2Signup>(".lq.Lobby.oauth2Signup", callable) {
        override fun decodeReq(data: ByteArray): ReqOauth2Signup = ProtoBuf.load(ReqOauth2Signup.serializer(), data)
        override fun encodeRes(res: ResOauth2Signup): ByteArray = ProtoBuf.dump(ResOauth2Signup.serializer(), res)
    }
    class Oauth2Login(callable: (ReqOauth2Login) -> ResLogin): IProtoRpc<ReqOauth2Login, ResLogin>(".lq.Lobby.oauth2Login", callable) {
        override fun decodeReq(data: ByteArray): ReqOauth2Login = ProtoBuf.load(ReqOauth2Login.serializer(), data)
        override fun encodeRes(res: ResLogin): ByteArray = ProtoBuf.dump(ResLogin.serializer(), res)
    }
    class DmmPreLogin(callable: (ReqDMMPreLogin) -> ResDMMPreLogin): IProtoRpc<ReqDMMPreLogin, ResDMMPreLogin>(".lq.Lobby.dmmPreLogin", callable) {
        override fun decodeReq(data: ByteArray): ReqDMMPreLogin = ProtoBuf.load(ReqDMMPreLogin.serializer(), data)
        override fun encodeRes(res: ResDMMPreLogin): ByteArray = ProtoBuf.dump(ResDMMPreLogin.serializer(), res)
    }
    class CreatePhoneVerifyCode(callable: (ReqCreatePhoneVerifyCode) -> ResCommon): IProtoRpc<ReqCreatePhoneVerifyCode, ResCommon>(".lq.Lobby.createPhoneVerifyCode", callable) {
        override fun decodeReq(data: ByteArray): ReqCreatePhoneVerifyCode = ProtoBuf.load(ReqCreatePhoneVerifyCode.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class CreateEmailVerifyCode(callable: (ReqCreateEmailVerifyCode) -> ResCommon): IProtoRpc<ReqCreateEmailVerifyCode, ResCommon>(".lq.Lobby.createEmailVerifyCode", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateEmailVerifyCode = ProtoBuf.load(ReqCreateEmailVerifyCode.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class VerfifyCodeForSecure(callable: (ReqVerifyCodeForSecure) -> ResVerfiyCodeForSecure): IProtoRpc<ReqVerifyCodeForSecure, ResVerfiyCodeForSecure>(".lq.Lobby.verfifyCodeForSecure", callable) {
        override fun decodeReq(data: ByteArray): ReqVerifyCodeForSecure = ProtoBuf.load(ReqVerifyCodeForSecure.serializer(), data)
        override fun encodeRes(res: ResVerfiyCodeForSecure): ByteArray = ProtoBuf.dump(ResVerfiyCodeForSecure.serializer(), res)
    }
    class BindPhoneNumber(callable: (ReqBindPhoneNumber) -> ResCommon): IProtoRpc<ReqBindPhoneNumber, ResCommon>(".lq.Lobby.bindPhoneNumber", callable) {
        override fun decodeReq(data: ByteArray): ReqBindPhoneNumber = ProtoBuf.load(ReqBindPhoneNumber.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class UnbindPhoneNumber(callable: (ReqUnbindPhoneNumber) -> ResCommon): IProtoRpc<ReqUnbindPhoneNumber, ResCommon>(".lq.Lobby.unbindPhoneNumber", callable) {
        override fun decodeReq(data: ByteArray): ReqUnbindPhoneNumber = ProtoBuf.load(ReqUnbindPhoneNumber.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchPhoneLoginBind(callable: (ReqCommon) -> ResFetchPhoneLoginBind): IProtoRpc<ReqCommon, ResFetchPhoneLoginBind>(".lq.Lobby.fetchPhoneLoginBind", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResFetchPhoneLoginBind): ByteArray = ProtoBuf.dump(ResFetchPhoneLoginBind.serializer(), res)
    }
    class CreatePhoneLoginBind(callable: (ReqCreatePhoneLoginBind) -> ResCommon): IProtoRpc<ReqCreatePhoneLoginBind, ResCommon>(".lq.Lobby.createPhoneLoginBind", callable) {
        override fun decodeReq(data: ByteArray): ReqCreatePhoneLoginBind = ProtoBuf.load(ReqCreatePhoneLoginBind.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class BindEmail(callable: (ReqBindEmail) -> ResCommon): IProtoRpc<ReqBindEmail, ResCommon>(".lq.Lobby.bindEmail", callable) {
        override fun decodeReq(data: ByteArray): ReqBindEmail = ProtoBuf.load(ReqBindEmail.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ModifyPassword(callable: (ReqModifyPassword) -> ResCommon): IProtoRpc<ReqModifyPassword, ResCommon>(".lq.Lobby.modifyPassword", callable) {
        override fun decodeReq(data: ByteArray): ReqModifyPassword = ProtoBuf.load(ReqModifyPassword.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class BindAccount(callable: (ReqBindAccount) -> ResCommon): IProtoRpc<ReqBindAccount, ResCommon>(".lq.Lobby.bindAccount", callable) {
        override fun decodeReq(data: ByteArray): ReqBindAccount = ProtoBuf.load(ReqBindAccount.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class Logout(callable: (ReqLogout) -> ResLogout): IProtoRpc<ReqLogout, ResLogout>(".lq.Lobby.logout", callable) {
        override fun decodeReq(data: ByteArray): ReqLogout = ProtoBuf.load(ReqLogout.serializer(), data)
        override fun encodeRes(res: ResLogout): ByteArray = ProtoBuf.dump(ResLogout.serializer(), res)
    }
    class Heatbeat(callable: (ReqHeatBeat) -> ResCommon): IProtoRpc<ReqHeatBeat, ResCommon>(".lq.Lobby.heatbeat", callable) {
        override fun decodeReq(data: ByteArray): ReqHeatBeat = ProtoBuf.load(ReqHeatBeat.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class LoginBeat(callable: (ReqLoginBeat) -> ResCommon): IProtoRpc<ReqLoginBeat, ResCommon>(".lq.Lobby.loginBeat", callable) {
        override fun decodeReq(data: ByteArray): ReqLoginBeat = ProtoBuf.load(ReqLoginBeat.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class CreateNickname(callable: (ReqCreateNickname) -> ResCommon): IProtoRpc<ReqCreateNickname, ResCommon>(".lq.Lobby.createNickname", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateNickname = ProtoBuf.load(ReqCreateNickname.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ModifyNickname(callable: (ReqModifyNickname) -> ResCommon): IProtoRpc<ReqModifyNickname, ResCommon>(".lq.Lobby.modifyNickname", callable) {
        override fun decodeReq(data: ByteArray): ReqModifyNickname = ProtoBuf.load(ReqModifyNickname.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ModifyBirthday(callable: (ReqModifyBirthday) -> ResCommon): IProtoRpc<ReqModifyBirthday, ResCommon>(".lq.Lobby.modifyBirthday", callable) {
        override fun decodeReq(data: ByteArray): ReqModifyBirthday = ProtoBuf.load(ReqModifyBirthday.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchRoom(callable: (ReqCommon) -> ResSelfRoom): IProtoRpc<ReqCommon, ResSelfRoom>(".lq.Lobby.fetchRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResSelfRoom): ByteArray = ProtoBuf.dump(ResSelfRoom.serializer(), res)
    }
    class CreateRoom(callable: (ReqCreateRoom) -> ResCreateRoom): IProtoRpc<ReqCreateRoom, ResCreateRoom>(".lq.Lobby.createRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateRoom = ProtoBuf.load(ReqCreateRoom.serializer(), data)
        override fun encodeRes(res: ResCreateRoom): ByteArray = ProtoBuf.dump(ResCreateRoom.serializer(), res)
    }
    class JoinRoom(callable: (ReqJoinRoom) -> ResJoinRoom): IProtoRpc<ReqJoinRoom, ResJoinRoom>(".lq.Lobby.joinRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqJoinRoom = ProtoBuf.load(ReqJoinRoom.serializer(), data)
        override fun encodeRes(res: ResJoinRoom): ByteArray = ProtoBuf.dump(ResJoinRoom.serializer(), res)
    }
    class LeaveRoom(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.leaveRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ReadyPlay(callable: (ReqRoomReady) -> ResCommon): IProtoRpc<ReqRoomReady, ResCommon>(".lq.Lobby.readyPlay", callable) {
        override fun decodeReq(data: ByteArray): ReqRoomReady = ProtoBuf.load(ReqRoomReady.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class DressingStatus(callable: (ReqRoomDressing) -> ResCommon): IProtoRpc<ReqRoomDressing, ResCommon>(".lq.Lobby.dressingStatus", callable) {
        override fun decodeReq(data: ByteArray): ReqRoomDressing = ProtoBuf.load(ReqRoomDressing.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class StartRoom(callable: (ReqRoomStart) -> ResCommon): IProtoRpc<ReqRoomStart, ResCommon>(".lq.Lobby.startRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqRoomStart = ProtoBuf.load(ReqRoomStart.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class KickPlayer(callable: (ReqRoomKick) -> ResCommon): IProtoRpc<ReqRoomKick, ResCommon>(".lq.Lobby.kickPlayer", callable) {
        override fun decodeReq(data: ByteArray): ReqRoomKick = ProtoBuf.load(ReqRoomKick.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ModifyRoom(callable: (ReqModifyRoom) -> ResCommon): IProtoRpc<ReqModifyRoom, ResCommon>(".lq.Lobby.modifyRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqModifyRoom = ProtoBuf.load(ReqModifyRoom.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class MatchGame(callable: (ReqJoinMatchQueue) -> ResCommon): IProtoRpc<ReqJoinMatchQueue, ResCommon>(".lq.Lobby.matchGame", callable) {
        override fun decodeReq(data: ByteArray): ReqJoinMatchQueue = ProtoBuf.load(ReqJoinMatchQueue.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class CancelMatch(callable: (ReqCancelMatchQueue) -> ResCommon): IProtoRpc<ReqCancelMatchQueue, ResCommon>(".lq.Lobby.cancelMatch", callable) {
        override fun decodeReq(data: ByteArray): ReqCancelMatchQueue = ProtoBuf.load(ReqCancelMatchQueue.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchAccountInfo(callable: (ReqAccountInfo) -> ResAccountInfo): IProtoRpc<ReqAccountInfo, ResAccountInfo>(".lq.Lobby.fetchAccountInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqAccountInfo = ProtoBuf.load(ReqAccountInfo.serializer(), data)
        override fun encodeRes(res: ResAccountInfo): ByteArray = ProtoBuf.dump(ResAccountInfo.serializer(), res)
    }
    class ChangeAvatar(callable: (ReqChangeAvatar) -> ResCommon): IProtoRpc<ReqChangeAvatar, ResCommon>(".lq.Lobby.changeAvatar", callable) {
        override fun decodeReq(data: ByteArray): ReqChangeAvatar = ProtoBuf.load(ReqChangeAvatar.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchAccountStatisticInfo(callable: (ReqAccountStatisticInfo) -> ResAccountStatisticInfo): IProtoRpc<ReqAccountStatisticInfo, ResAccountStatisticInfo>(".lq.Lobby.fetchAccountStatisticInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqAccountStatisticInfo = ProtoBuf.load(ReqAccountStatisticInfo.serializer(), data)
        override fun encodeRes(res: ResAccountStatisticInfo): ByteArray = ProtoBuf.dump(ResAccountStatisticInfo.serializer(), res)
    }
    class FetchAccountCharacterInfo(callable: (ReqCommon) -> ResAccountCharacterInfo): IProtoRpc<ReqCommon, ResAccountCharacterInfo>(".lq.Lobby.fetchAccountCharacterInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResAccountCharacterInfo): ByteArray = ProtoBuf.dump(ResAccountCharacterInfo.serializer(), res)
    }
    class ShopPurchase(callable: (ReqShopPurchase) -> ResShopPurchase): IProtoRpc<ReqShopPurchase, ResShopPurchase>(".lq.Lobby.shopPurchase", callable) {
        override fun decodeReq(data: ByteArray): ReqShopPurchase = ProtoBuf.load(ReqShopPurchase.serializer(), data)
        override fun encodeRes(res: ResShopPurchase): ByteArray = ProtoBuf.dump(ResShopPurchase.serializer(), res)
    }
    class FetchGameRecord(callable: (ReqGameRecord) -> ResGameRecord): IProtoRpc<ReqGameRecord, ResGameRecord>(".lq.Lobby.fetchGameRecord", callable) {
        override fun decodeReq(data: ByteArray): ReqGameRecord = ProtoBuf.load(ReqGameRecord.serializer(), data)
        override fun encodeRes(res: ResGameRecord): ByteArray = ProtoBuf.dump(ResGameRecord.serializer(), res)
    }
    class FetchGameRecordList(callable: (ReqGameRecordList) -> ResGameRecordList): IProtoRpc<ReqGameRecordList, ResGameRecordList>(".lq.Lobby.fetchGameRecordList", callable) {
        override fun decodeReq(data: ByteArray): ReqGameRecordList = ProtoBuf.load(ReqGameRecordList.serializer(), data)
        override fun encodeRes(res: ResGameRecordList): ByteArray = ProtoBuf.dump(ResGameRecordList.serializer(), res)
    }
    class FetchCollectedGameRecordList(callable: (ReqCommon) -> ResCollectedGameRecordList): IProtoRpc<ReqCommon, ResCollectedGameRecordList>(".lq.Lobby.fetchCollectedGameRecordList", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCollectedGameRecordList): ByteArray = ProtoBuf.dump(ResCollectedGameRecordList.serializer(), res)
    }
    class FetchGameRecordsDetail(callable: (ReqGameRecordsDetail) -> ResGameRecordsDetail): IProtoRpc<ReqGameRecordsDetail, ResGameRecordsDetail>(".lq.Lobby.fetchGameRecordsDetail", callable) {
        override fun decodeReq(data: ByteArray): ReqGameRecordsDetail = ProtoBuf.load(ReqGameRecordsDetail.serializer(), data)
        override fun encodeRes(res: ResGameRecordsDetail): ByteArray = ProtoBuf.dump(ResGameRecordsDetail.serializer(), res)
    }
    class AddCollectedGameRecord(callable: (ReqAddCollectedGameRecord) -> ResAddCollectedGameRecord): IProtoRpc<ReqAddCollectedGameRecord, ResAddCollectedGameRecord>(".lq.Lobby.addCollectedGameRecord", callable) {
        override fun decodeReq(data: ByteArray): ReqAddCollectedGameRecord = ProtoBuf.load(ReqAddCollectedGameRecord.serializer(), data)
        override fun encodeRes(res: ResAddCollectedGameRecord): ByteArray = ProtoBuf.dump(ResAddCollectedGameRecord.serializer(), res)
    }
    class RemoveCollectedGameRecord(callable: (ReqRemoveCollectedGameRecord) -> ResRemoveCollectedGameRecord): IProtoRpc<ReqRemoveCollectedGameRecord, ResRemoveCollectedGameRecord>(".lq.Lobby.removeCollectedGameRecord", callable) {
        override fun decodeReq(data: ByteArray): ReqRemoveCollectedGameRecord = ProtoBuf.load(ReqRemoveCollectedGameRecord.serializer(), data)
        override fun encodeRes(res: ResRemoveCollectedGameRecord): ByteArray = ProtoBuf.dump(ResRemoveCollectedGameRecord.serializer(), res)
    }
    class ChangeCollectedGameRecordRemarks(callable: (ReqChangeCollectedGameRecordRemarks) -> ResChangeCollectedGameRecordRemarks): IProtoRpc<ReqChangeCollectedGameRecordRemarks, ResChangeCollectedGameRecordRemarks>(".lq.Lobby.changeCollectedGameRecordRemarks", callable) {
        override fun decodeReq(data: ByteArray): ReqChangeCollectedGameRecordRemarks = ProtoBuf.load(ReqChangeCollectedGameRecordRemarks.serializer(), data)
        override fun encodeRes(res: ResChangeCollectedGameRecordRemarks): ByteArray = ProtoBuf.dump(ResChangeCollectedGameRecordRemarks.serializer(), res)
    }
    class FetchLevelLeaderboard(callable: (ReqLevelLeaderboard) -> ResLevelLeaderboard): IProtoRpc<ReqLevelLeaderboard, ResLevelLeaderboard>(".lq.Lobby.fetchLevelLeaderboard", callable) {
        override fun decodeReq(data: ByteArray): ReqLevelLeaderboard = ProtoBuf.load(ReqLevelLeaderboard.serializer(), data)
        override fun encodeRes(res: ResLevelLeaderboard): ByteArray = ProtoBuf.dump(ResLevelLeaderboard.serializer(), res)
    }
    class FetchMultiAccountBrief(callable: (ReqMultiAccountId) -> ResMultiAccountBrief): IProtoRpc<ReqMultiAccountId, ResMultiAccountBrief>(".lq.Lobby.fetchMultiAccountBrief", callable) {
        override fun decodeReq(data: ByteArray): ReqMultiAccountId = ProtoBuf.load(ReqMultiAccountId.serializer(), data)
        override fun encodeRes(res: ResMultiAccountBrief): ByteArray = ProtoBuf.dump(ResMultiAccountBrief.serializer(), res)
    }
    class FetchFriendList(callable: (ReqCommon) -> ResFriendList): IProtoRpc<ReqCommon, ResFriendList>(".lq.Lobby.fetchFriendList", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResFriendList): ByteArray = ProtoBuf.dump(ResFriendList.serializer(), res)
    }
    class FetchFriendApplyList(callable: (ReqCommon) -> ResFriendApplyList): IProtoRpc<ReqCommon, ResFriendApplyList>(".lq.Lobby.fetchFriendApplyList", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResFriendApplyList): ByteArray = ProtoBuf.dump(ResFriendApplyList.serializer(), res)
    }
    class ApplyFriend(callable: (ReqApplyFriend) -> ResCommon): IProtoRpc<ReqApplyFriend, ResCommon>(".lq.Lobby.applyFriend", callable) {
        override fun decodeReq(data: ByteArray): ReqApplyFriend = ProtoBuf.load(ReqApplyFriend.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class HandleFriendApply(callable: (ReqHandleFriendApply) -> ResCommon): IProtoRpc<ReqHandleFriendApply, ResCommon>(".lq.Lobby.handleFriendApply", callable) {
        override fun decodeReq(data: ByteArray): ReqHandleFriendApply = ProtoBuf.load(ReqHandleFriendApply.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class RemoveFriend(callable: (ReqRemoveFriend) -> ResCommon): IProtoRpc<ReqRemoveFriend, ResCommon>(".lq.Lobby.removeFriend", callable) {
        override fun decodeReq(data: ByteArray): ReqRemoveFriend = ProtoBuf.load(ReqRemoveFriend.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class SearchAccountById(callable: (ReqSearchAccountById) -> ResSearchAccountById): IProtoRpc<ReqSearchAccountById, ResSearchAccountById>(".lq.Lobby.searchAccountById", callable) {
        override fun decodeReq(data: ByteArray): ReqSearchAccountById = ProtoBuf.load(ReqSearchAccountById.serializer(), data)
        override fun encodeRes(res: ResSearchAccountById): ByteArray = ProtoBuf.dump(ResSearchAccountById.serializer(), res)
    }
    class SearchAccountByPattern(callable: (ReqSearchAccountByPattern) -> ResSearchAccountByPattern): IProtoRpc<ReqSearchAccountByPattern, ResSearchAccountByPattern>(".lq.Lobby.searchAccountByPattern", callable) {
        override fun decodeReq(data: ByteArray): ReqSearchAccountByPattern = ProtoBuf.load(ReqSearchAccountByPattern.serializer(), data)
        override fun encodeRes(res: ResSearchAccountByPattern): ByteArray = ProtoBuf.dump(ResSearchAccountByPattern.serializer(), res)
    }
    class FetchAccountState(callable: (ReqAccountList) -> ResAccountStates): IProtoRpc<ReqAccountList, ResAccountStates>(".lq.Lobby.fetchAccountState", callable) {
        override fun decodeReq(data: ByteArray): ReqAccountList = ProtoBuf.load(ReqAccountList.serializer(), data)
        override fun encodeRes(res: ResAccountStates): ByteArray = ProtoBuf.dump(ResAccountStates.serializer(), res)
    }
    class FetchBagInfo(callable: (ReqCommon) -> ResBagInfo): IProtoRpc<ReqCommon, ResBagInfo>(".lq.Lobby.fetchBagInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResBagInfo): ByteArray = ProtoBuf.dump(ResBagInfo.serializer(), res)
    }
    class UseBagItem(callable: (ReqUseBagItem) -> ResCommon): IProtoRpc<ReqUseBagItem, ResCommon>(".lq.Lobby.useBagItem", callable) {
        override fun decodeReq(data: ByteArray): ReqUseBagItem = ProtoBuf.load(ReqUseBagItem.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class OpenManualItem(callable: (ReqOpenManualItem) -> ResCommon): IProtoRpc<ReqOpenManualItem, ResCommon>(".lq.Lobby.openManualItem", callable) {
        override fun decodeReq(data: ByteArray): ReqOpenManualItem = ProtoBuf.load(ReqOpenManualItem.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class OpenRandomRewardItem(callable: (ReqOpenRandomRewardItem) -> ResOpenRandomRewardItem): IProtoRpc<ReqOpenRandomRewardItem, ResOpenRandomRewardItem>(".lq.Lobby.openRandomRewardItem", callable) {
        override fun decodeReq(data: ByteArray): ReqOpenRandomRewardItem = ProtoBuf.load(ReqOpenRandomRewardItem.serializer(), data)
        override fun encodeRes(res: ResOpenRandomRewardItem): ByteArray = ProtoBuf.dump(ResOpenRandomRewardItem.serializer(), res)
    }
    class ComposeShard(callable: (ReqComposeShard) -> ResCommon): IProtoRpc<ReqComposeShard, ResCommon>(".lq.Lobby.composeShard", callable) {
        override fun decodeReq(data: ByteArray): ReqComposeShard = ProtoBuf.load(ReqComposeShard.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchAnnouncement(callable: (ReqCommon) -> ResAnnouncement): IProtoRpc<ReqCommon, ResAnnouncement>(".lq.Lobby.fetchAnnouncement", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResAnnouncement): ByteArray = ProtoBuf.dump(ResAnnouncement.serializer(), res)
    }
    class ReadAnnouncement(callable: (ReqReadAnnouncement) -> ResCommon): IProtoRpc<ReqReadAnnouncement, ResCommon>(".lq.Lobby.readAnnouncement", callable) {
        override fun decodeReq(data: ByteArray): ReqReadAnnouncement = ProtoBuf.load(ReqReadAnnouncement.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchMailInfo(callable: (ReqCommon) -> ResMailInfo): IProtoRpc<ReqCommon, ResMailInfo>(".lq.Lobby.fetchMailInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResMailInfo): ByteArray = ProtoBuf.dump(ResMailInfo.serializer(), res)
    }
    class ReadMail(callable: (ReqReadMail) -> ResCommon): IProtoRpc<ReqReadMail, ResCommon>(".lq.Lobby.readMail", callable) {
        override fun decodeReq(data: ByteArray): ReqReadMail = ProtoBuf.load(ReqReadMail.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class DeleteMail(callable: (ReqDeleteMail) -> ResCommon): IProtoRpc<ReqDeleteMail, ResCommon>(".lq.Lobby.deleteMail", callable) {
        override fun decodeReq(data: ByteArray): ReqDeleteMail = ProtoBuf.load(ReqDeleteMail.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class TakeAttachmentFromMail(callable: (ReqTakeAttachment) -> ResCommon): IProtoRpc<ReqTakeAttachment, ResCommon>(".lq.Lobby.takeAttachmentFromMail", callable) {
        override fun decodeReq(data: ByteArray): ReqTakeAttachment = ProtoBuf.load(ReqTakeAttachment.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchAchievement(callable: (ReqCommon) -> ResAchievement): IProtoRpc<ReqCommon, ResAchievement>(".lq.Lobby.fetchAchievement", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResAchievement): ByteArray = ProtoBuf.dump(ResAchievement.serializer(), res)
    }
    class BuyShiLian(callable: (ReqBuyShiLian) -> ResCommon): IProtoRpc<ReqBuyShiLian, ResCommon>(".lq.Lobby.buyShiLian", callable) {
        override fun decodeReq(data: ByteArray): ReqBuyShiLian = ProtoBuf.load(ReqBuyShiLian.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class MatchShiLian(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.matchShiLian", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class GoNextShiLian(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.goNextShiLian", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class UpdateClientValue(callable: (ReqUpdateClientValue) -> ResCommon): IProtoRpc<ReqUpdateClientValue, ResCommon>(".lq.Lobby.updateClientValue", callable) {
        override fun decodeReq(data: ByteArray): ReqUpdateClientValue = ProtoBuf.load(ReqUpdateClientValue.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchClientValue(callable: (ReqCommon) -> ResClientValue): IProtoRpc<ReqCommon, ResClientValue>(".lq.Lobby.fetchClientValue", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResClientValue): ByteArray = ProtoBuf.dump(ResClientValue.serializer(), res)
    }
    class ClientMessage(callable: (ReqClientMessage) -> ResCommon): IProtoRpc<ReqClientMessage, ResCommon>(".lq.Lobby.clientMessage", callable) {
        override fun decodeReq(data: ByteArray): ReqClientMessage = ProtoBuf.load(ReqClientMessage.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCurrentMatchInfo(callable: (ReqCurrentMatchInfo) -> ResCurrentMatchInfo): IProtoRpc<ReqCurrentMatchInfo, ResCurrentMatchInfo>(".lq.Lobby.fetchCurrentMatchInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCurrentMatchInfo = ProtoBuf.load(ReqCurrentMatchInfo.serializer(), data)
        override fun encodeRes(res: ResCurrentMatchInfo): ByteArray = ProtoBuf.dump(ResCurrentMatchInfo.serializer(), res)
    }
    class UserComplain(callable: (ReqUserComplain) -> ResCommon): IProtoRpc<ReqUserComplain, ResCommon>(".lq.Lobby.userComplain", callable) {
        override fun decodeReq(data: ByteArray): ReqUserComplain = ProtoBuf.load(ReqUserComplain.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchReviveCoinInfo(callable: (ReqCommon) -> ResReviveCoinInfo): IProtoRpc<ReqCommon, ResReviveCoinInfo>(".lq.Lobby.fetchReviveCoinInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResReviveCoinInfo): ByteArray = ProtoBuf.dump(ResReviveCoinInfo.serializer(), res)
    }
    class GainReviveCoin(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.gainReviveCoin", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchDailyTask(callable: (ReqCommon) -> ResDailyTask): IProtoRpc<ReqCommon, ResDailyTask>(".lq.Lobby.fetchDailyTask", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResDailyTask): ByteArray = ProtoBuf.dump(ResDailyTask.serializer(), res)
    }
    class RefreshDailyTask(callable: (ReqRefreshDailyTask) -> ResRefreshDailyTask): IProtoRpc<ReqRefreshDailyTask, ResRefreshDailyTask>(".lq.Lobby.refreshDailyTask", callable) {
        override fun decodeReq(data: ByteArray): ReqRefreshDailyTask = ProtoBuf.load(ReqRefreshDailyTask.serializer(), data)
        override fun encodeRes(res: ResRefreshDailyTask): ByteArray = ProtoBuf.dump(ResRefreshDailyTask.serializer(), res)
    }
    class UseGiftCode(callable: (ReqUseGiftCode) -> ResUseGiftCode): IProtoRpc<ReqUseGiftCode, ResUseGiftCode>(".lq.Lobby.useGiftCode", callable) {
        override fun decodeReq(data: ByteArray): ReqUseGiftCode = ProtoBuf.load(ReqUseGiftCode.serializer(), data)
        override fun encodeRes(res: ResUseGiftCode): ByteArray = ProtoBuf.dump(ResUseGiftCode.serializer(), res)
    }
    class FetchTitleList(callable: (ReqCommon) -> ResTitleList): IProtoRpc<ReqCommon, ResTitleList>(".lq.Lobby.fetchTitleList", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResTitleList): ByteArray = ProtoBuf.dump(ResTitleList.serializer(), res)
    }
    class UseTitle(callable: (ReqUseTitle) -> ResCommon): IProtoRpc<ReqUseTitle, ResCommon>(".lq.Lobby.useTitle", callable) {
        override fun decodeReq(data: ByteArray): ReqUseTitle = ProtoBuf.load(ReqUseTitle.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class SendClientMessage(callable: (ReqSendClientMessage) -> ResCommon): IProtoRpc<ReqSendClientMessage, ResCommon>(".lq.Lobby.sendClientMessage", callable) {
        override fun decodeReq(data: ByteArray): ReqSendClientMessage = ProtoBuf.load(ReqSendClientMessage.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchGameLiveInfo(callable: (ReqGameLiveInfo) -> ResGameLiveInfo): IProtoRpc<ReqGameLiveInfo, ResGameLiveInfo>(".lq.Lobby.fetchGameLiveInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqGameLiveInfo = ProtoBuf.load(ReqGameLiveInfo.serializer(), data)
        override fun encodeRes(res: ResGameLiveInfo): ByteArray = ProtoBuf.dump(ResGameLiveInfo.serializer(), res)
    }
    class FetchGameLiveLeftSegment(callable: (ReqGameLiveLeftSegment) -> ResGameLiveLeftSegment): IProtoRpc<ReqGameLiveLeftSegment, ResGameLiveLeftSegment>(".lq.Lobby.fetchGameLiveLeftSegment", callable) {
        override fun decodeReq(data: ByteArray): ReqGameLiveLeftSegment = ProtoBuf.load(ReqGameLiveLeftSegment.serializer(), data)
        override fun encodeRes(res: ResGameLiveLeftSegment): ByteArray = ProtoBuf.dump(ResGameLiveLeftSegment.serializer(), res)
    }
    class FetchGameLiveList(callable: (ReqGameLiveList) -> ResGameLiveList): IProtoRpc<ReqGameLiveList, ResGameLiveList>(".lq.Lobby.fetchGameLiveList", callable) {
        override fun decodeReq(data: ByteArray): ReqGameLiveList = ProtoBuf.load(ReqGameLiveList.serializer(), data)
        override fun encodeRes(res: ResGameLiveList): ByteArray = ProtoBuf.dump(ResGameLiveList.serializer(), res)
    }
    class FetchCommentSetting(callable: (ReqCommon) -> ResCommentSetting): IProtoRpc<ReqCommon, ResCommentSetting>(".lq.Lobby.fetchCommentSetting", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommentSetting): ByteArray = ProtoBuf.dump(ResCommentSetting.serializer(), res)
    }
    class UpdateCommentSetting(callable: (ReqUpdateCommentSetting) -> ResCommon): IProtoRpc<ReqUpdateCommentSetting, ResCommon>(".lq.Lobby.updateCommentSetting", callable) {
        override fun decodeReq(data: ByteArray): ReqUpdateCommentSetting = ProtoBuf.load(ReqUpdateCommentSetting.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCommentList(callable: (ReqFetchCommentList) -> ResFetchCommentList): IProtoRpc<ReqFetchCommentList, ResFetchCommentList>(".lq.Lobby.fetchCommentList", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCommentList = ProtoBuf.load(ReqFetchCommentList.serializer(), data)
        override fun encodeRes(res: ResFetchCommentList): ByteArray = ProtoBuf.dump(ResFetchCommentList.serializer(), res)
    }
    class FetchCommentContent(callable: (ReqFetchCommentContent) -> ResFetchCommentContent): IProtoRpc<ReqFetchCommentContent, ResFetchCommentContent>(".lq.Lobby.fetchCommentContent", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCommentContent = ProtoBuf.load(ReqFetchCommentContent.serializer(), data)
        override fun encodeRes(res: ResFetchCommentContent): ByteArray = ProtoBuf.dump(ResFetchCommentContent.serializer(), res)
    }
    class LeaveComment(callable: (ReqLeaveComment) -> ResCommon): IProtoRpc<ReqLeaveComment, ResCommon>(".lq.Lobby.leaveComment", callable) {
        override fun decodeReq(data: ByteArray): ReqLeaveComment = ProtoBuf.load(ReqLeaveComment.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class DeleteComment(callable: (ReqDeleteComment) -> ResCommon): IProtoRpc<ReqDeleteComment, ResCommon>(".lq.Lobby.deleteComment", callable) {
        override fun decodeReq(data: ByteArray): ReqDeleteComment = ProtoBuf.load(ReqDeleteComment.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class UpdateReadComment(callable: (ReqUpdateReadComment) -> ResCommon): IProtoRpc<ReqUpdateReadComment, ResCommon>(".lq.Lobby.updateReadComment", callable) {
        override fun decodeReq(data: ByteArray): ReqUpdateReadComment = ProtoBuf.load(ReqUpdateReadComment.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchRollingNotice(callable: (ReqCommon) -> ReqRollingNotice): IProtoRpc<ReqCommon, ReqRollingNotice>(".lq.Lobby.fetchRollingNotice", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ReqRollingNotice): ByteArray = ProtoBuf.dump(ReqRollingNotice.serializer(), res)
    }
    class FetchServerTime(callable: (ReqCommon) -> ResServerTime): IProtoRpc<ReqCommon, ResServerTime>(".lq.Lobby.fetchServerTime", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResServerTime): ByteArray = ProtoBuf.dump(ResServerTime.serializer(), res)
    }
    class FetchPlatformProducts(callable: (ReqPlatformBillingProducts) -> ResPlatformBillingProducts): IProtoRpc<ReqPlatformBillingProducts, ResPlatformBillingProducts>(".lq.Lobby.fetchPlatformProducts", callable) {
        override fun decodeReq(data: ByteArray): ReqPlatformBillingProducts = ProtoBuf.load(ReqPlatformBillingProducts.serializer(), data)
        override fun encodeRes(res: ResPlatformBillingProducts): ByteArray = ProtoBuf.dump(ResPlatformBillingProducts.serializer(), res)
    }
    class CancelGooglePlayOrder(callable: (ReqCancelGooglePlayOrder) -> ResCommon): IProtoRpc<ReqCancelGooglePlayOrder, ResCommon>(".lq.Lobby.cancelGooglePlayOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCancelGooglePlayOrder = ProtoBuf.load(ReqCancelGooglePlayOrder.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class OpenChest(callable: (ReqOpenChest) -> ResOpenChest): IProtoRpc<ReqOpenChest, ResOpenChest>(".lq.Lobby.openChest", callable) {
        override fun decodeReq(data: ByteArray): ReqOpenChest = ProtoBuf.load(ReqOpenChest.serializer(), data)
        override fun encodeRes(res: ResOpenChest): ByteArray = ProtoBuf.dump(ResOpenChest.serializer(), res)
    }
    class BuyFromChestShop(callable: (ReqBuyFromChestShop) -> ResBuyFromChestShop): IProtoRpc<ReqBuyFromChestShop, ResBuyFromChestShop>(".lq.Lobby.buyFromChestShop", callable) {
        override fun decodeReq(data: ByteArray): ReqBuyFromChestShop = ProtoBuf.load(ReqBuyFromChestShop.serializer(), data)
        override fun encodeRes(res: ResBuyFromChestShop): ByteArray = ProtoBuf.dump(ResBuyFromChestShop.serializer(), res)
    }
    class FetchDailySignInInfo(callable: (ReqCommon) -> ResDailySignInInfo): IProtoRpc<ReqCommon, ResDailySignInInfo>(".lq.Lobby.fetchDailySignInInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResDailySignInInfo): ByteArray = ProtoBuf.dump(ResDailySignInInfo.serializer(), res)
    }
    class DoDailySignIn(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.doDailySignIn", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class DoActivitySignIn(callable: (ReqDoActivitySignIn) -> ResDoActivitySignIn): IProtoRpc<ReqDoActivitySignIn, ResDoActivitySignIn>(".lq.Lobby.doActivitySignIn", callable) {
        override fun decodeReq(data: ByteArray): ReqDoActivitySignIn = ProtoBuf.load(ReqDoActivitySignIn.serializer(), data)
        override fun encodeRes(res: ResDoActivitySignIn): ByteArray = ProtoBuf.dump(ResDoActivitySignIn.serializer(), res)
    }
    class FetchCharacterInfo(callable: (ReqCommon) -> ResCharacterInfo): IProtoRpc<ReqCommon, ResCharacterInfo>(".lq.Lobby.fetchCharacterInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCharacterInfo): ByteArray = ProtoBuf.dump(ResCharacterInfo.serializer(), res)
    }
    class ChangeMainCharacter(callable: (ReqChangeMainCharacter) -> ResCommon): IProtoRpc<ReqChangeMainCharacter, ResCommon>(".lq.Lobby.changeMainCharacter", callable) {
        override fun decodeReq(data: ByteArray): ReqChangeMainCharacter = ProtoBuf.load(ReqChangeMainCharacter.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ChangeCharacterSkin(callable: (ReqChangeCharacterSkin) -> ResCommon): IProtoRpc<ReqChangeCharacterSkin, ResCommon>(".lq.Lobby.changeCharacterSkin", callable) {
        override fun decodeReq(data: ByteArray): ReqChangeCharacterSkin = ProtoBuf.load(ReqChangeCharacterSkin.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ChangeCharacterView(callable: (ReqChangeCharacterView) -> ResCommon): IProtoRpc<ReqChangeCharacterView, ResCommon>(".lq.Lobby.changeCharacterView", callable) {
        override fun decodeReq(data: ByteArray): ReqChangeCharacterView = ProtoBuf.load(ReqChangeCharacterView.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class SendGiftToCharacter(callable: (ReqSendGiftToCharacter) -> ResSendGiftToCharacter): IProtoRpc<ReqSendGiftToCharacter, ResSendGiftToCharacter>(".lq.Lobby.sendGiftToCharacter", callable) {
        override fun decodeReq(data: ByteArray): ReqSendGiftToCharacter = ProtoBuf.load(ReqSendGiftToCharacter.serializer(), data)
        override fun encodeRes(res: ResSendGiftToCharacter): ByteArray = ProtoBuf.dump(ResSendGiftToCharacter.serializer(), res)
    }
    class SellItem(callable: (ReqSellItem) -> ResCommon): IProtoRpc<ReqSellItem, ResCommon>(".lq.Lobby.sellItem", callable) {
        override fun decodeReq(data: ByteArray): ReqSellItem = ProtoBuf.load(ReqSellItem.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCommonView(callable: (ReqCommon) -> ResCommonView): IProtoRpc<ReqCommon, ResCommonView>(".lq.Lobby.fetchCommonView", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommonView): ByteArray = ProtoBuf.dump(ResCommonView.serializer(), res)
    }
    class ChangeCommonView(callable: (ReqChangeCommonView) -> ResCommon): IProtoRpc<ReqChangeCommonView, ResCommon>(".lq.Lobby.changeCommonView", callable) {
        override fun decodeReq(data: ByteArray): ReqChangeCommonView = ProtoBuf.load(ReqChangeCommonView.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class SaveCommonViews(callable: (ReqSaveCommonViews) -> ResCommon): IProtoRpc<ReqSaveCommonViews, ResCommon>(".lq.Lobby.saveCommonViews", callable) {
        override fun decodeReq(data: ByteArray): ReqSaveCommonViews = ProtoBuf.load(ReqSaveCommonViews.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCommonViews(callable: (ReqCommonViews) -> ResCommonViews): IProtoRpc<ReqCommonViews, ResCommonViews>(".lq.Lobby.fetchCommonViews", callable) {
        override fun decodeReq(data: ByteArray): ReqCommonViews = ProtoBuf.load(ReqCommonViews.serializer(), data)
        override fun encodeRes(res: ResCommonViews): ByteArray = ProtoBuf.dump(ResCommonViews.serializer(), res)
    }
    class FetchAllCommonViews(callable: (ReqCommon) -> ResAllcommonViews): IProtoRpc<ReqCommon, ResAllcommonViews>(".lq.Lobby.fetchAllCommonViews", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResAllcommonViews): ByteArray = ProtoBuf.dump(ResAllcommonViews.serializer(), res)
    }
    class UseCommonView(callable: (ReqUseCommonView) -> ResCommon): IProtoRpc<ReqUseCommonView, ResCommon>(".lq.Lobby.useCommonView", callable) {
        override fun decodeReq(data: ByteArray): ReqUseCommonView = ProtoBuf.load(ReqUseCommonView.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class UpgradeCharacter(callable: (ReqUpgradeCharacter) -> ResUpgradeCharacter): IProtoRpc<ReqUpgradeCharacter, ResUpgradeCharacter>(".lq.Lobby.upgradeCharacter", callable) {
        override fun decodeReq(data: ByteArray): ReqUpgradeCharacter = ProtoBuf.load(ReqUpgradeCharacter.serializer(), data)
        override fun encodeRes(res: ResUpgradeCharacter): ByteArray = ProtoBuf.dump(ResUpgradeCharacter.serializer(), res)
    }
    class AddFinishedEnding(callable: (ReqFinishedEnding) -> ResCommon): IProtoRpc<ReqFinishedEnding, ResCommon>(".lq.Lobby.addFinishedEnding", callable) {
        override fun decodeReq(data: ByteArray): ReqFinishedEnding = ProtoBuf.load(ReqFinishedEnding.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ReceiveEndingReward(callable: (ReqFinishedEnding) -> ResCommon): IProtoRpc<ReqFinishedEnding, ResCommon>(".lq.Lobby.receiveEndingReward", callable) {
        override fun decodeReq(data: ByteArray): ReqFinishedEnding = ProtoBuf.load(ReqFinishedEnding.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class GameMasterCommand(callable: (ReqGMCommand) -> ResCommon): IProtoRpc<ReqGMCommand, ResCommon>(".lq.Lobby.gameMasterCommand", callable) {
        override fun decodeReq(data: ByteArray): ReqGMCommand = ProtoBuf.load(ReqGMCommand.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchShopInfo(callable: (ReqCommon) -> ResShopInfo): IProtoRpc<ReqCommon, ResShopInfo>(".lq.Lobby.fetchShopInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResShopInfo): ByteArray = ProtoBuf.dump(ResShopInfo.serializer(), res)
    }
    class BuyFromShop(callable: (ReqBuyFromShop) -> ResBuyFromShop): IProtoRpc<ReqBuyFromShop, ResBuyFromShop>(".lq.Lobby.buyFromShop", callable) {
        override fun decodeReq(data: ByteArray): ReqBuyFromShop = ProtoBuf.load(ReqBuyFromShop.serializer(), data)
        override fun encodeRes(res: ResBuyFromShop): ByteArray = ProtoBuf.dump(ResBuyFromShop.serializer(), res)
    }
    class BuyFromZHP(callable: (ReqBuyFromZHP) -> ResCommon): IProtoRpc<ReqBuyFromZHP, ResCommon>(".lq.Lobby.buyFromZHP", callable) {
        override fun decodeReq(data: ByteArray): ReqBuyFromZHP = ProtoBuf.load(ReqBuyFromZHP.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class RefreshZHPShop(callable: (ReqReshZHPShop) -> ResRefreshZHPShop): IProtoRpc<ReqReshZHPShop, ResRefreshZHPShop>(".lq.Lobby.refreshZHPShop", callable) {
        override fun decodeReq(data: ByteArray): ReqReshZHPShop = ProtoBuf.load(ReqReshZHPShop.serializer(), data)
        override fun encodeRes(res: ResRefreshZHPShop): ByteArray = ProtoBuf.dump(ResRefreshZHPShop.serializer(), res)
    }
    class FetchMonthTicketInfo(callable: (ReqCommon) -> ResMonthTicketInfo): IProtoRpc<ReqCommon, ResMonthTicketInfo>(".lq.Lobby.fetchMonthTicketInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResMonthTicketInfo): ByteArray = ProtoBuf.dump(ResMonthTicketInfo.serializer(), res)
    }
    class PayMonthTicket(callable: (ReqPayMonthTicket) -> ResPayMonthTicket): IProtoRpc<ReqPayMonthTicket, ResPayMonthTicket>(".lq.Lobby.payMonthTicket", callable) {
        override fun decodeReq(data: ByteArray): ReqPayMonthTicket = ProtoBuf.load(ReqPayMonthTicket.serializer(), data)
        override fun encodeRes(res: ResPayMonthTicket): ByteArray = ProtoBuf.dump(ResPayMonthTicket.serializer(), res)
    }
    class ExchangeCurrency(callable: (ReqExchangeCurrency) -> ResCommon): IProtoRpc<ReqExchangeCurrency, ResCommon>(".lq.Lobby.exchangeCurrency", callable) {
        override fun decodeReq(data: ByteArray): ReqExchangeCurrency = ProtoBuf.load(ReqExchangeCurrency.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ExchangeChestStone(callable: (ReqExchangeCurrency) -> ResCommon): IProtoRpc<ReqExchangeCurrency, ResCommon>(".lq.Lobby.exchangeChestStone", callable) {
        override fun decodeReq(data: ByteArray): ReqExchangeCurrency = ProtoBuf.load(ReqExchangeCurrency.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ExchangeDiamond(callable: (ReqExchangeCurrency) -> ResCommon): IProtoRpc<ReqExchangeCurrency, ResCommon>(".lq.Lobby.exchangeDiamond", callable) {
        override fun decodeReq(data: ByteArray): ReqExchangeCurrency = ProtoBuf.load(ReqExchangeCurrency.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchServerSettings(callable: (ReqCommon) -> ResServerSettings): IProtoRpc<ReqCommon, ResServerSettings>(".lq.Lobby.fetchServerSettings", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResServerSettings): ByteArray = ProtoBuf.dump(ResServerSettings.serializer(), res)
    }
    class FetchAccountSettings(callable: (ReqCommon) -> ResAccountSettings): IProtoRpc<ReqCommon, ResAccountSettings>(".lq.Lobby.fetchAccountSettings", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResAccountSettings): ByteArray = ProtoBuf.dump(ResAccountSettings.serializer(), res)
    }
    class UpdateAccountSettings(callable: (ReqUpdateAccountSettings) -> ResCommon): IProtoRpc<ReqUpdateAccountSettings, ResCommon>(".lq.Lobby.updateAccountSettings", callable) {
        override fun decodeReq(data: ByteArray): ReqUpdateAccountSettings = ProtoBuf.load(ReqUpdateAccountSettings.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchModNicknameTime(callable: (ReqCommon) -> ResModNicknameTime): IProtoRpc<ReqCommon, ResModNicknameTime>(".lq.Lobby.fetchModNicknameTime", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResModNicknameTime): ByteArray = ProtoBuf.dump(ResModNicknameTime.serializer(), res)
    }
    class CreateWechatNativeOrder(callable: (ReqCreateWechatNativeOrder) -> ResCreateWechatNativeOrder): IProtoRpc<ReqCreateWechatNativeOrder, ResCreateWechatNativeOrder>(".lq.Lobby.createWechatNativeOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateWechatNativeOrder = ProtoBuf.load(ReqCreateWechatNativeOrder.serializer(), data)
        override fun encodeRes(res: ResCreateWechatNativeOrder): ByteArray = ProtoBuf.dump(ResCreateWechatNativeOrder.serializer(), res)
    }
    class CreateWechatAppOrder(callable: (ReqCreateWechatAppOrder) -> ResCreateWechatAppOrder): IProtoRpc<ReqCreateWechatAppOrder, ResCreateWechatAppOrder>(".lq.Lobby.createWechatAppOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateWechatAppOrder = ProtoBuf.load(ReqCreateWechatAppOrder.serializer(), data)
        override fun encodeRes(res: ResCreateWechatAppOrder): ByteArray = ProtoBuf.dump(ResCreateWechatAppOrder.serializer(), res)
    }
    class CreateAlipayOrder(callable: (ReqCreateAlipayOrder) -> ResCreateAlipayOrder): IProtoRpc<ReqCreateAlipayOrder, ResCreateAlipayOrder>(".lq.Lobby.createAlipayOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateAlipayOrder = ProtoBuf.load(ReqCreateAlipayOrder.serializer(), data)
        override fun encodeRes(res: ResCreateAlipayOrder): ByteArray = ProtoBuf.dump(ResCreateAlipayOrder.serializer(), res)
    }
    class CreateAlipayScanOrder(callable: (ReqCreateAlipayScanOrder) -> ResCreateAlipayScanOrder): IProtoRpc<ReqCreateAlipayScanOrder, ResCreateAlipayScanOrder>(".lq.Lobby.createAlipayScanOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateAlipayScanOrder = ProtoBuf.load(ReqCreateAlipayScanOrder.serializer(), data)
        override fun encodeRes(res: ResCreateAlipayScanOrder): ByteArray = ProtoBuf.dump(ResCreateAlipayScanOrder.serializer(), res)
    }
    class CreateAlipayAppOrder(callable: (ReqCreateAlipayAppOrder) -> ResCreateAlipayAppOrder): IProtoRpc<ReqCreateAlipayAppOrder, ResCreateAlipayAppOrder>(".lq.Lobby.createAlipayAppOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateAlipayAppOrder = ProtoBuf.load(ReqCreateAlipayAppOrder.serializer(), data)
        override fun encodeRes(res: ResCreateAlipayAppOrder): ByteArray = ProtoBuf.dump(ResCreateAlipayAppOrder.serializer(), res)
    }
    class CreateJPCreditCardOrder(callable: (ReqCreateJPCreditCardOrder) -> ResCreateJPCreditCardOrder): IProtoRpc<ReqCreateJPCreditCardOrder, ResCreateJPCreditCardOrder>(".lq.Lobby.createJPCreditCardOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateJPCreditCardOrder = ProtoBuf.load(ReqCreateJPCreditCardOrder.serializer(), data)
        override fun encodeRes(res: ResCreateJPCreditCardOrder): ByteArray = ProtoBuf.dump(ResCreateJPCreditCardOrder.serializer(), res)
    }
    class CreateJPPaypalOrder(callable: (ReqCreateJPPaypalOrder) -> ResCreateJPPaypalOrder): IProtoRpc<ReqCreateJPPaypalOrder, ResCreateJPPaypalOrder>(".lq.Lobby.createJPPaypalOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateJPPaypalOrder = ProtoBuf.load(ReqCreateJPPaypalOrder.serializer(), data)
        override fun encodeRes(res: ResCreateJPPaypalOrder): ByteArray = ProtoBuf.dump(ResCreateJPPaypalOrder.serializer(), res)
    }
    class CreateJPAuOrder(callable: (ReqCreateJPAuOrder) -> ResCreateJPAuOrder): IProtoRpc<ReqCreateJPAuOrder, ResCreateJPAuOrder>(".lq.Lobby.createJPAuOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateJPAuOrder = ProtoBuf.load(ReqCreateJPAuOrder.serializer(), data)
        override fun encodeRes(res: ResCreateJPAuOrder): ByteArray = ProtoBuf.dump(ResCreateJPAuOrder.serializer(), res)
    }
    class CreateJPDocomoOrder(callable: (ReqCreateJPDocomoOrder) -> ResCreateJPDocomoOrder): IProtoRpc<ReqCreateJPDocomoOrder, ResCreateJPDocomoOrder>(".lq.Lobby.createJPDocomoOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateJPDocomoOrder = ProtoBuf.load(ReqCreateJPDocomoOrder.serializer(), data)
        override fun encodeRes(res: ResCreateJPDocomoOrder): ByteArray = ProtoBuf.dump(ResCreateJPDocomoOrder.serializer(), res)
    }
    class CreateJPWebMoneyOrder(callable: (ReqCreateJPWebMoneyOrder) -> ResCreateJPWebMoneyOrder): IProtoRpc<ReqCreateJPWebMoneyOrder, ResCreateJPWebMoneyOrder>(".lq.Lobby.createJPWebMoneyOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateJPWebMoneyOrder = ProtoBuf.load(ReqCreateJPWebMoneyOrder.serializer(), data)
        override fun encodeRes(res: ResCreateJPWebMoneyOrder): ByteArray = ProtoBuf.dump(ResCreateJPWebMoneyOrder.serializer(), res)
    }
    class CreateJPSoftbankOrder(callable: (ReqCreateJPSoftbankOrder) -> ResCreateJPSoftbankOrder): IProtoRpc<ReqCreateJPSoftbankOrder, ResCreateJPSoftbankOrder>(".lq.Lobby.createJPSoftbankOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateJPSoftbankOrder = ProtoBuf.load(ReqCreateJPSoftbankOrder.serializer(), data)
        override fun encodeRes(res: ResCreateJPSoftbankOrder): ByteArray = ProtoBuf.dump(ResCreateJPSoftbankOrder.serializer(), res)
    }
    class CreateENPaypalOrder(callable: (ReqCreateENPaypalOrder) -> ResCreateENPaypalOrder): IProtoRpc<ReqCreateENPaypalOrder, ResCreateENPaypalOrder>(".lq.Lobby.createENPaypalOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateENPaypalOrder = ProtoBuf.load(ReqCreateENPaypalOrder.serializer(), data)
        override fun encodeRes(res: ResCreateENPaypalOrder): ByteArray = ProtoBuf.dump(ResCreateENPaypalOrder.serializer(), res)
    }
    class CreateENMasterCardOrder(callable: (ReqCreateENMasterCardOrder) -> ResCreateENMasterCardOrder): IProtoRpc<ReqCreateENMasterCardOrder, ResCreateENMasterCardOrder>(".lq.Lobby.createENMasterCardOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateENMasterCardOrder = ProtoBuf.load(ReqCreateENMasterCardOrder.serializer(), data)
        override fun encodeRes(res: ResCreateENMasterCardOrder): ByteArray = ProtoBuf.dump(ResCreateENMasterCardOrder.serializer(), res)
    }
    class CreateENVisaOrder(callable: (ReqCreateENVisaOrder) -> ResCreateENVisaOrder): IProtoRpc<ReqCreateENVisaOrder, ResCreateENVisaOrder>(".lq.Lobby.createENVisaOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateENVisaOrder = ProtoBuf.load(ReqCreateENVisaOrder.serializer(), data)
        override fun encodeRes(res: ResCreateENVisaOrder): ByteArray = ProtoBuf.dump(ResCreateENVisaOrder.serializer(), res)
    }
    class CreateENJCBOrder(callable: (ReqCreateENJCBOrder) -> ResCreateENJCBOrder): IProtoRpc<ReqCreateENJCBOrder, ResCreateENJCBOrder>(".lq.Lobby.createENJCBOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateENJCBOrder = ProtoBuf.load(ReqCreateENJCBOrder.serializer(), data)
        override fun encodeRes(res: ResCreateENJCBOrder): ByteArray = ProtoBuf.dump(ResCreateENJCBOrder.serializer(), res)
    }
    class CreateENAlipayOrder(callable: (ReqCreateENAlipayOrder) -> ResCreateENAlipayOrder): IProtoRpc<ReqCreateENAlipayOrder, ResCreateENAlipayOrder>(".lq.Lobby.createENAlipayOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateENAlipayOrder = ProtoBuf.load(ReqCreateENAlipayOrder.serializer(), data)
        override fun encodeRes(res: ResCreateENAlipayOrder): ByteArray = ProtoBuf.dump(ResCreateENAlipayOrder.serializer(), res)
    }
    class CreateDMMOrder(callable: (ReqCreateDMMOrder) -> ResCreateDmmOrder): IProtoRpc<ReqCreateDMMOrder, ResCreateDmmOrder>(".lq.Lobby.createDMMOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateDMMOrder = ProtoBuf.load(ReqCreateDMMOrder.serializer(), data)
        override fun encodeRes(res: ResCreateDmmOrder): ByteArray = ProtoBuf.dump(ResCreateDmmOrder.serializer(), res)
    }
    class CreateIAPOrder(callable: (ReqCreateIAPOrder) -> ResCreateIAPOrder): IProtoRpc<ReqCreateIAPOrder, ResCreateIAPOrder>(".lq.Lobby.createIAPOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateIAPOrder = ProtoBuf.load(ReqCreateIAPOrder.serializer(), data)
        override fun encodeRes(res: ResCreateIAPOrder): ByteArray = ProtoBuf.dump(ResCreateIAPOrder.serializer(), res)
    }
    class CreateMyCardAndroidOrder(callable: (ReqCreateMyCardOrder) -> ResCreateMyCardOrder): IProtoRpc<ReqCreateMyCardOrder, ResCreateMyCardOrder>(".lq.Lobby.createMyCardAndroidOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateMyCardOrder = ProtoBuf.load(ReqCreateMyCardOrder.serializer(), data)
        override fun encodeRes(res: ResCreateMyCardOrder): ByteArray = ProtoBuf.dump(ResCreateMyCardOrder.serializer(), res)
    }
    class CreateMyCardWebOrder(callable: (ReqCreateMyCardOrder) -> ResCreateMyCardOrder): IProtoRpc<ReqCreateMyCardOrder, ResCreateMyCardOrder>(".lq.Lobby.createMyCardWebOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateMyCardOrder = ProtoBuf.load(ReqCreateMyCardOrder.serializer(), data)
        override fun encodeRes(res: ResCreateMyCardOrder): ByteArray = ProtoBuf.dump(ResCreateMyCardOrder.serializer(), res)
    }
    class VerifyMyCardOrder(callable: (ReqVerifyMyCardOrder) -> ResCommon): IProtoRpc<ReqVerifyMyCardOrder, ResCommon>(".lq.Lobby.verifyMyCardOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqVerifyMyCardOrder = ProtoBuf.load(ReqVerifyMyCardOrder.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class VerificationIAPOrder(callable: (ReqVerificationIAPOrder) -> ResVerificationIAPOrder): IProtoRpc<ReqVerificationIAPOrder, ResVerificationIAPOrder>(".lq.Lobby.verificationIAPOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqVerificationIAPOrder = ProtoBuf.load(ReqVerificationIAPOrder.serializer(), data)
        override fun encodeRes(res: ResVerificationIAPOrder): ByteArray = ProtoBuf.dump(ResVerificationIAPOrder.serializer(), res)
    }
    class CreateYostarSDKOrder(callable: (ReqCreateYostarOrder) -> ResCreateYostarOrder): IProtoRpc<ReqCreateYostarOrder, ResCreateYostarOrder>(".lq.Lobby.createYostarSDKOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateYostarOrder = ProtoBuf.load(ReqCreateYostarOrder.serializer(), data)
        override fun encodeRes(res: ResCreateYostarOrder): ByteArray = ProtoBuf.dump(ResCreateYostarOrder.serializer(), res)
    }
    class CreateBillingOrder(callable: (ReqCreateBillingOrder) -> ResCreateBillingOrder): IProtoRpc<ReqCreateBillingOrder, ResCreateBillingOrder>(".lq.Lobby.createBillingOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateBillingOrder = ProtoBuf.load(ReqCreateBillingOrder.serializer(), data)
        override fun encodeRes(res: ResCreateBillingOrder): ByteArray = ProtoBuf.dump(ResCreateBillingOrder.serializer(), res)
    }
    class SolveGooglePlayOrder(callable: (ReqSolveGooglePlayOrder) -> ResCommon): IProtoRpc<ReqSolveGooglePlayOrder, ResCommon>(".lq.Lobby.solveGooglePlayOrder", callable) {
        override fun decodeReq(data: ByteArray): ReqSolveGooglePlayOrder = ProtoBuf.load(ReqSolveGooglePlayOrder.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class SolveGooglePayOrderV3(callable: (ReqSolveGooglePlayOrderV3) -> ResCommon): IProtoRpc<ReqSolveGooglePlayOrderV3, ResCommon>(".lq.Lobby.solveGooglePayOrderV3", callable) {
        override fun decodeReq(data: ByteArray): ReqSolveGooglePlayOrderV3 = ProtoBuf.load(ReqSolveGooglePlayOrderV3.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchMisc(callable: (ReqCommon) -> ResMisc): IProtoRpc<ReqCommon, ResMisc>(".lq.Lobby.fetchMisc", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResMisc): ByteArray = ProtoBuf.dump(ResMisc.serializer(), res)
    }
    class ModifySignature(callable: (ReqModifySignature) -> ResCommon): IProtoRpc<ReqModifySignature, ResCommon>(".lq.Lobby.modifySignature", callable) {
        override fun decodeReq(data: ByteArray): ReqModifySignature = ProtoBuf.load(ReqModifySignature.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchIDCardInfo(callable: (ReqCommon) -> ResIDCardInfo): IProtoRpc<ReqCommon, ResIDCardInfo>(".lq.Lobby.fetchIDCardInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResIDCardInfo): ByteArray = ProtoBuf.dump(ResIDCardInfo.serializer(), res)
    }
    class UpdateIDCardInfo(callable: (ReqUpdateIDCardInfo) -> ResCommon): IProtoRpc<ReqUpdateIDCardInfo, ResCommon>(".lq.Lobby.updateIDCardInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqUpdateIDCardInfo = ProtoBuf.load(ReqUpdateIDCardInfo.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchVipReward(callable: (ReqCommon) -> ResVipReward): IProtoRpc<ReqCommon, ResVipReward>(".lq.Lobby.fetchVipReward", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResVipReward): ByteArray = ProtoBuf.dump(ResVipReward.serializer(), res)
    }
    class GainVipReward(callable: (ReqGainVipReward) -> ResCommon): IProtoRpc<ReqGainVipReward, ResCommon>(".lq.Lobby.gainVipReward", callable) {
        override fun decodeReq(data: ByteArray): ReqGainVipReward = ProtoBuf.load(ReqGainVipReward.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCustomizedContestList(callable: (ReqFetchCustomizedContestList) -> ResFetchCustomizedContestList): IProtoRpc<ReqFetchCustomizedContestList, ResFetchCustomizedContestList>(".lq.Lobby.fetchCustomizedContestList", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestList = ProtoBuf.load(ReqFetchCustomizedContestList.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestList): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestList.serializer(), res)
    }
    class FetchCustomizedContestExtendInfo(callable: (ReqFetchCustomizedContestExtendInfo) -> ResFetchCustomizedContestExtendInfo): IProtoRpc<ReqFetchCustomizedContestExtendInfo, ResFetchCustomizedContestExtendInfo>(".lq.Lobby.fetchCustomizedContestExtendInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestExtendInfo = ProtoBuf.load(ReqFetchCustomizedContestExtendInfo.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestExtendInfo): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestExtendInfo.serializer(), res)
    }
    class FetchCustomizedContestAuthInfo(callable: (ReqFetchCustomizedContestAuthInfo) -> ResFetchCustomizedContestAuthInfo): IProtoRpc<ReqFetchCustomizedContestAuthInfo, ResFetchCustomizedContestAuthInfo>(".lq.Lobby.fetchCustomizedContestAuthInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestAuthInfo = ProtoBuf.load(ReqFetchCustomizedContestAuthInfo.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestAuthInfo): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestAuthInfo.serializer(), res)
    }
    class EnterCustomizedContest(callable: (ReqEnterCustomizedContest) -> ResEnterCustomizedContest): IProtoRpc<ReqEnterCustomizedContest, ResEnterCustomizedContest>(".lq.Lobby.enterCustomizedContest", callable) {
        override fun decodeReq(data: ByteArray): ReqEnterCustomizedContest = ProtoBuf.load(ReqEnterCustomizedContest.serializer(), data)
        override fun encodeRes(res: ResEnterCustomizedContest): ByteArray = ProtoBuf.dump(ResEnterCustomizedContest.serializer(), res)
    }
    class LeaveCustomizedContest(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.leaveCustomizedContest", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCustomizedContestOnlineInfo(callable: (ReqFetchCustomizedContestOnlineInfo) -> ResFetchCustomizedContestOnlineInfo): IProtoRpc<ReqFetchCustomizedContestOnlineInfo, ResFetchCustomizedContestOnlineInfo>(".lq.Lobby.fetchCustomizedContestOnlineInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestOnlineInfo = ProtoBuf.load(ReqFetchCustomizedContestOnlineInfo.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestOnlineInfo): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestOnlineInfo.serializer(), res)
    }
    class FetchCustomizedContestByContestId(callable: (ReqFetchCustomizedContestByContestId) -> ResFetchCustomizedContestByContestId): IProtoRpc<ReqFetchCustomizedContestByContestId, ResFetchCustomizedContestByContestId>(".lq.Lobby.fetchCustomizedContestByContestId", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestByContestId = ProtoBuf.load(ReqFetchCustomizedContestByContestId.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestByContestId): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestByContestId.serializer(), res)
    }
    class StartCustomizedContest(callable: (ReqStartCustomizedContest) -> ResCommon): IProtoRpc<ReqStartCustomizedContest, ResCommon>(".lq.Lobby.startCustomizedContest", callable) {
        override fun decodeReq(data: ByteArray): ReqStartCustomizedContest = ProtoBuf.load(ReqStartCustomizedContest.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class StopCustomizedContest(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.stopCustomizedContest", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class JoinCustomizedContestChatRoom(callable: (ReqJoinCustomizedContestChatRoom) -> ResJoinCustomizedContestChatRoom): IProtoRpc<ReqJoinCustomizedContestChatRoom, ResJoinCustomizedContestChatRoom>(".lq.Lobby.joinCustomizedContestChatRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqJoinCustomizedContestChatRoom = ProtoBuf.load(ReqJoinCustomizedContestChatRoom.serializer(), data)
        override fun encodeRes(res: ResJoinCustomizedContestChatRoom): ByteArray = ProtoBuf.dump(ResJoinCustomizedContestChatRoom.serializer(), res)
    }
    class LeaveCustomizedContestChatRoom(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.leaveCustomizedContestChatRoom", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class SayChatMessage(callable: (ReqSayChatMessage) -> ResCommon): IProtoRpc<ReqSayChatMessage, ResCommon>(".lq.Lobby.sayChatMessage", callable) {
        override fun decodeReq(data: ByteArray): ReqSayChatMessage = ProtoBuf.load(ReqSayChatMessage.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchCustomizedContestGameRecords(callable: (ReqFetchCustomizedContestGameRecords) -> ResFetchCustomizedContestGameRecords): IProtoRpc<ReqFetchCustomizedContestGameRecords, ResFetchCustomizedContestGameRecords>(".lq.Lobby.fetchCustomizedContestGameRecords", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestGameRecords = ProtoBuf.load(ReqFetchCustomizedContestGameRecords.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestGameRecords): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestGameRecords.serializer(), res)
    }
    class FetchCustomizedContestGameLiveList(callable: (ReqFetchCustomizedContestGameLiveList) -> ResFetchCustomizedContestGameLiveList): IProtoRpc<ReqFetchCustomizedContestGameLiveList, ResFetchCustomizedContestGameLiveList>(".lq.Lobby.fetchCustomizedContestGameLiveList", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchCustomizedContestGameLiveList = ProtoBuf.load(ReqFetchCustomizedContestGameLiveList.serializer(), data)
        override fun encodeRes(res: ResFetchCustomizedContestGameLiveList): ByteArray = ProtoBuf.dump(ResFetchCustomizedContestGameLiveList.serializer(), res)
    }
    class FollowCustomizedContest(callable: (ReqTargetCustomizedContest) -> ResCommon): IProtoRpc<ReqTargetCustomizedContest, ResCommon>(".lq.Lobby.followCustomizedContest", callable) {
        override fun decodeReq(data: ByteArray): ReqTargetCustomizedContest = ProtoBuf.load(ReqTargetCustomizedContest.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class UnfollowCustomizedContest(callable: (ReqTargetCustomizedContest) -> ResCommon): IProtoRpc<ReqTargetCustomizedContest, ResCommon>(".lq.Lobby.unfollowCustomizedContest", callable) {
        override fun decodeReq(data: ByteArray): ReqTargetCustomizedContest = ProtoBuf.load(ReqTargetCustomizedContest.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchActivityList(callable: (ReqCommon) -> ResActivityList): IProtoRpc<ReqCommon, ResActivityList>(".lq.Lobby.fetchActivityList", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResActivityList): ByteArray = ProtoBuf.dump(ResActivityList.serializer(), res)
    }
    class FetchAccountActivityData(callable: (ReqCommon) -> ResAccountActivityData): IProtoRpc<ReqCommon, ResAccountActivityData>(".lq.Lobby.fetchAccountActivityData", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResAccountActivityData): ByteArray = ProtoBuf.dump(ResAccountActivityData.serializer(), res)
    }
    class ExchangeActivityItem(callable: (ReqExchangeActivityItem) -> ResExchangeActivityItem): IProtoRpc<ReqExchangeActivityItem, ResExchangeActivityItem>(".lq.Lobby.exchangeActivityItem", callable) {
        override fun decodeReq(data: ByteArray): ReqExchangeActivityItem = ProtoBuf.load(ReqExchangeActivityItem.serializer(), data)
        override fun encodeRes(res: ResExchangeActivityItem): ByteArray = ProtoBuf.dump(ResExchangeActivityItem.serializer(), res)
    }
    class CompleteActivityTask(callable: (ReqCompleteActivityTask) -> ResCommon): IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completeActivityTask", callable) {
        override fun decodeReq(data: ByteArray): ReqCompleteActivityTask = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class CompleteActivityFlipTask(callable: (ReqCompleteActivityTask) -> ResCommon): IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completeActivityFlipTask", callable) {
        override fun decodeReq(data: ByteArray): ReqCompleteActivityTask = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class CompletePeriodActivityTask(callable: (ReqCompleteActivityTask) -> ResCommon): IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completePeriodActivityTask", callable) {
        override fun decodeReq(data: ByteArray): ReqCompleteActivityTask = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class CompleteRandomActivityTask(callable: (ReqCompleteActivityTask) -> ResCommon): IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completeRandomActivityTask", callable) {
        override fun decodeReq(data: ByteArray): ReqCompleteActivityTask = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ReceiveActivityFlipTask(callable: (ReqReceiveActivityFlipTask) -> ResReceiveActivityFlipTask): IProtoRpc<ReqReceiveActivityFlipTask, ResReceiveActivityFlipTask>(".lq.Lobby.receiveActivityFlipTask", callable) {
        override fun decodeReq(data: ByteArray): ReqReceiveActivityFlipTask = ProtoBuf.load(ReqReceiveActivityFlipTask.serializer(), data)
        override fun encodeRes(res: ResReceiveActivityFlipTask): ByteArray = ProtoBuf.dump(ResReceiveActivityFlipTask.serializer(), res)
    }
    class FetchActivityFlipInfo(callable: (ReqFetchActivityFlipInfo) -> ResFetchActivityFlipInfo): IProtoRpc<ReqFetchActivityFlipInfo, ResFetchActivityFlipInfo>(".lq.Lobby.fetchActivityFlipInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchActivityFlipInfo = ProtoBuf.load(ReqFetchActivityFlipInfo.serializer(), data)
        override fun encodeRes(res: ResFetchActivityFlipInfo): ByteArray = ProtoBuf.dump(ResFetchActivityFlipInfo.serializer(), res)
    }
    class GainAccumulatedPointActivityReward(callable: (ReqGainAccumulatedPointActivityReward) -> ResCommon): IProtoRpc<ReqGainAccumulatedPointActivityReward, ResCommon>(".lq.Lobby.gainAccumulatedPointActivityReward", callable) {
        override fun decodeReq(data: ByteArray): ReqGainAccumulatedPointActivityReward = ProtoBuf.load(ReqGainAccumulatedPointActivityReward.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchRankPointLeaderboard(callable: (ReqFetchRankPointLeaderboard) -> ResFetchRankPointLeaderboard): IProtoRpc<ReqFetchRankPointLeaderboard, ResFetchRankPointLeaderboard>(".lq.Lobby.fetchRankPointLeaderboard", callable) {
        override fun decodeReq(data: ByteArray): ReqFetchRankPointLeaderboard = ProtoBuf.load(ReqFetchRankPointLeaderboard.serializer(), data)
        override fun encodeRes(res: ResFetchRankPointLeaderboard): ByteArray = ProtoBuf.dump(ResFetchRankPointLeaderboard.serializer(), res)
    }
    class GainRankPointReward(callable: (ReqGainRankPointReward) -> ResCommon): IProtoRpc<ReqGainRankPointReward, ResCommon>(".lq.Lobby.gainRankPointReward", callable) {
        override fun decodeReq(data: ByteArray): ReqGainRankPointReward = ProtoBuf.load(ReqGainRankPointReward.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class RichmanActivityNextMove(callable: (ReqRichmanNextMove) -> ResRichmanNextMove): IProtoRpc<ReqRichmanNextMove, ResRichmanNextMove>(".lq.Lobby.richmanActivityNextMove", callable) {
        override fun decodeReq(data: ByteArray): ReqRichmanNextMove = ProtoBuf.load(ReqRichmanNextMove.serializer(), data)
        override fun encodeRes(res: ResRichmanNextMove): ByteArray = ProtoBuf.dump(ResRichmanNextMove.serializer(), res)
    }
    class RichmanAcitivitySpecialMove(callable: (ReqRichmanSpecialMove) -> ResRichmanNextMove): IProtoRpc<ReqRichmanSpecialMove, ResRichmanNextMove>(".lq.Lobby.richmanAcitivitySpecialMove", callable) {
        override fun decodeReq(data: ByteArray): ReqRichmanSpecialMove = ProtoBuf.load(ReqRichmanSpecialMove.serializer(), data)
        override fun encodeRes(res: ResRichmanNextMove): ByteArray = ProtoBuf.dump(ResRichmanNextMove.serializer(), res)
    }
    class RichmanActivityChestInfo(callable: (ReqRichmanChestInfo) -> ResRichmanChestInfo): IProtoRpc<ReqRichmanChestInfo, ResRichmanChestInfo>(".lq.Lobby.richmanActivityChestInfo", callable) {
        override fun decodeReq(data: ByteArray): ReqRichmanChestInfo = ProtoBuf.load(ReqRichmanChestInfo.serializer(), data)
        override fun encodeRes(res: ResRichmanChestInfo): ByteArray = ProtoBuf.dump(ResRichmanChestInfo.serializer(), res)
    }
    class CreateGameObserveAuth(callable: (ReqCreateGameObserveAuth) -> ResCreateGameObserveAuth): IProtoRpc<ReqCreateGameObserveAuth, ResCreateGameObserveAuth>(".lq.Lobby.createGameObserveAuth", callable) {
        override fun decodeReq(data: ByteArray): ReqCreateGameObserveAuth = ProtoBuf.load(ReqCreateGameObserveAuth.serializer(), data)
        override fun encodeRes(res: ResCreateGameObserveAuth): ByteArray = ProtoBuf.dump(ResCreateGameObserveAuth.serializer(), res)
    }
    class RefreshGameObserveAuth(callable: (ReqRefreshGameObserveAuth) -> ResRefreshGameObserveAuth): IProtoRpc<ReqRefreshGameObserveAuth, ResRefreshGameObserveAuth>(".lq.Lobby.refreshGameObserveAuth", callable) {
        override fun decodeReq(data: ByteArray): ReqRefreshGameObserveAuth = ProtoBuf.load(ReqRefreshGameObserveAuth.serializer(), data)
        override fun encodeRes(res: ResRefreshGameObserveAuth): ByteArray = ProtoBuf.dump(ResRefreshGameObserveAuth.serializer(), res)
    }
}

@Serializable 
class ResConnectionInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val client_endpoint: NetworkEndpoint? = null
) : IProtoMessage

@Serializable 
class ReqSignupAccount (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val code: String? = null,
    @ProtoId(4) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class ResSignupAccount (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class ReqBindAccount (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null
) : IProtoMessage

@Serializable 
class ReqCreatePhoneVerifyCode (
    @ProtoId(1) @JvmField val phone: String? = null,
    @ProtoId(2) @JvmField val usage: Int = 0
) : IProtoMessage

@Serializable 
class ReqCreateEmailVerifyCode (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val usage: Int = 0
) : IProtoMessage

@Serializable 
class ReqVerifyCodeForSecure (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val operation: Int = 0
) : IProtoMessage

@Serializable 
class ResVerfiyCodeForSecure (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val secure_token: String? = null
) : IProtoMessage

@Serializable 
class ReqBindPhoneNumber (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val phone: String? = null,
    @ProtoId(3) @JvmField val password: String? = null,
    @ProtoId(4) @JvmField val multi_bind_version: Boolean = false
) : IProtoMessage

@Serializable 
class ReqUnbindPhoneNumber (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val phone: String? = null,
    @ProtoId(3) @JvmField val password: String? = null
) : IProtoMessage

@Serializable 
class ResFetchPhoneLoginBind (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val phone_login: Int = 0
) : IProtoMessage

@Serializable 
class ReqCreatePhoneLoginBind (
    @ProtoId(1) @JvmField val password: String? = null
) : IProtoMessage

@Serializable 
class ReqBindEmail (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val code: String? = null,
    @ProtoId(3) @JvmField val password: String? = null
) : IProtoMessage

@Serializable 
class ReqModifyPassword (
    @ProtoId(1) @JvmField val new_password: String? = null,
    @ProtoId(2) @JvmField val old_password: String? = null,
    @ProtoId(3) @JvmField val secure_token: String? = null
) : IProtoMessage

@Serializable 
class ReqOauth2Auth (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val code: String? = null,
    @ProtoId(3) @JvmField val uid: String? = null
) : IProtoMessage

@Serializable 
class ResOauth2Auth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ReqOauth2Check (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResOauth2Check (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val has_account: Boolean = false
) : IProtoMessage

@Serializable 
class ReqOauth2Signup (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null,
    @ProtoId(3) @JvmField val email: String? = null,
    @ProtoId(4) @JvmField val advertise_str: String? = null
) : IProtoMessage

@Serializable 
class ResOauth2Signup (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqOauth2Login (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ReqDMMPreLogin (
    @ProtoId(1) @JvmField val finish_url: String? = null
) : IProtoMessage

@Serializable 
class ResDMMPreLogin (
    @ProtoId(1) @JvmField val parameter: String? = null
) : IProtoMessage

@Serializable 
class ReqLogout () : IProtoMessage

@Serializable 
class ResLogout (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqHeatBeat (
    @ProtoId(1) @JvmField val no_operation_counter: Int = 0
) : IProtoMessage

@Serializable 
class ReqLoginBeat (
    @ProtoId(1) @JvmField val contract: String? = null
) : IProtoMessage

@Serializable 
class ReqJoinMatchQueue (
    @ProtoId(1) @JvmField val match_mode: Int = 0
) : IProtoMessage

@Serializable 
class ReqCancelMatchQueue (
    @ProtoId(1) @JvmField val match_mode: Int = 0
) : IProtoMessage

@Serializable 
class ReqAccountInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResAccountInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val account: Account? = null,
    @ProtoId(3) @JvmField val room: Room? = null
) : IProtoMessage

@Serializable 
class ReqCreateNickname (
    @ProtoId(1) @JvmField val nickname: String? = null,
    @ProtoId(2) @JvmField val advertise_str: String? = null
) : IProtoMessage

@Serializable 
class ReqModifyNickname (
    @ProtoId(1) @JvmField val nickname: String? = null,
    @ProtoId(2) @JvmField val use_item_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqModifyBirthday (
    @ProtoId(1) @JvmField val birthday: Int = 0
) : IProtoMessage

@Serializable 
class ResSelfRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
) : IProtoMessage

@Serializable 
class ReqCreateRoom (
    @ProtoId(1) @JvmField val player_count: Int = 0,
    @ProtoId(2) @JvmField val mode: GameMode? = null,
    @ProtoId(3) @JvmField val public_live: Boolean = false
) : IProtoMessage

@Serializable 
class ResCreateRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
) : IProtoMessage

@Serializable 
class ReqJoinRoom (
    @ProtoId(1) @JvmField val room_id: Int = 0
) : IProtoMessage

@Serializable 
class ResJoinRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
) : IProtoMessage

@Serializable 
class ReqRoomReady (
    @ProtoId(1) @JvmField val ready: Boolean = false
) : IProtoMessage

@Serializable 
class ReqRoomDressing (
    @ProtoId(1) @JvmField val dressing: Boolean = false
) : IProtoMessage

@Serializable 
class ReqRoomStart () : IProtoMessage

@Serializable 
class ReqRoomKick (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqModifyRoom (
    @ProtoId(1) @JvmField val robot_count: Int = 0
) : IProtoMessage

@Serializable 
class ReqChangeAvatar (
    @ProtoId(1) @JvmField val avatar_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqAccountStatisticInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResAccountStatisticInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val statistic_data: List<AccountStatisticData> = emptyList(),
    @ProtoId(3) @JvmField val detail_data: AccountDetailStatisticV2? = null
) : IProtoMessage

@Serializable 
class ResAccountCharacterInfo (
    @ProtoId(1) @JvmField val unlock_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ReqShopPurchase (
    @ProtoId(1) @JvmField val type: String? = null,
    @ProtoId(2) @JvmField val id: Int = 0
) : IProtoMessage

@Serializable 
class ResShopPurchase (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val update: AccountUpdate? = null
) : IProtoMessage

@Serializable 
class ReqGameRecord (
    @ProtoId(1) @JvmField val game_uuid: String? = null
) : IProtoMessage

@Serializable 
class ResGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(3) @JvmField val head: RecordGame? = null,
    @ProtoId(4) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY,
    @ProtoId(5) @JvmField val data_url: String? = null
) : IProtoMessage

@Serializable 
class ReqGameRecordList (
    @ProtoId(1) @JvmField val start: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class ResGameRecordList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val total_count: Int = 0,
    @ProtoId(3) @JvmField val record_list: List<RecordGame> = emptyList()
) : IProtoMessage

@Serializable 
class ResCollectedGameRecordList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val record_list: List<RecordCollectedData> = emptyList(),
    @ProtoId(3) @JvmField val record_collect_limit: Int = 0
) : IProtoMessage

@Serializable 
class ReqGameRecordsDetail (
    @ProtoId(1) @JvmField val uuid_list: String? = null
) : IProtoMessage

@Serializable 
class ResGameRecordsDetail (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val record_list: List<RecordGame> = emptyList()
) : IProtoMessage

@Serializable 
class ReqAddCollectedGameRecord (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0
) : IProtoMessage

@Serializable 
class ResAddCollectedGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqRemoveCollectedGameRecord (
    @ProtoId(1) @JvmField val uuid: String? = null
) : IProtoMessage

@Serializable 
class ResRemoveCollectedGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqChangeCollectedGameRecordRemarks (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null
) : IProtoMessage

@Serializable 
class ResChangeCollectedGameRecordRemarks (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqLevelLeaderboard (
    @ProtoId(1) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class ResLevelLeaderboard (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(3) @JvmField val self_rank: Int = 0
) : IProtoMessage {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val level: AccountLevel? = null
) : IProtoMessage

}

@Serializable 
class ReqMultiAccountId (
    @ProtoId(1) @JvmField val account_id_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ResMultiAccountBrief (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val players: List<PlayerBaseView> = emptyList()
) : IProtoMessage

@Serializable 
class ResFriendList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val friends: List<Friend> = emptyList(),
    @ProtoId(3) @JvmField val friend_max_count: Int = 0
) : IProtoMessage

@Serializable 
class ResFriendApplyList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val applies: List<FriendApply> = emptyList()
) : IProtoMessage {
@Serializable 
class FriendApply (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val apply_time: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqApplyFriend (
    @ProtoId(1) @JvmField val target_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqHandleFriendApply (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val method: Int = 0
) : IProtoMessage

@Serializable 
class ReqRemoveFriend (
    @ProtoId(1) @JvmField val target_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqSearchAccountByPattern (
    @ProtoId(1) @JvmField val search_next: Boolean = false,
    @ProtoId(2) @JvmField val pattern: String? = null
) : IProtoMessage

@Serializable 
class ResSearchAccountByPattern (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_finished: Boolean = false,
    @ProtoId(3) @JvmField val match_accounts: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val decode_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqAccountList (
    @ProtoId(1) @JvmField val account_id_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ResAccountStates (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val states: List<AccountActiveState> = emptyList()
) : IProtoMessage

@Serializable 
class ReqSearchAccountById (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResSearchAccountById (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val player: PlayerBaseView? = null
) : IProtoMessage

@Serializable 
class ResBagInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val bag: Bag? = null
) : IProtoMessage

@Serializable 
class ReqUseBagItem (
    @ProtoId(1) @JvmField val item_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqOpenManualItem (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val select_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqOpenRandomRewardItem (
    @ProtoId(1) @JvmField val item_id: Int = 0
) : IProtoMessage

@Serializable 
class ResOpenRandomRewardItem (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val results: List<OpenResult> = emptyList()
) : IProtoMessage

@Serializable 
class ReqComposeShard (
    @ProtoId(1) @JvmField val item_id: Int = 0
) : IProtoMessage

@Serializable 
class ResAnnouncement (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val announcements: List<Announcement> = emptyList(),
    @ProtoId(3) @JvmField val sort: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val read_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ResMailInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val mails: List<Mail> = emptyList()
) : IProtoMessage

@Serializable 
class ReqReadMail (
    @ProtoId(1) @JvmField val mail_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqDeleteMail (
    @ProtoId(1) @JvmField val mail_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqTakeAttachment (
    @ProtoId(1) @JvmField val mail_id: Int = 0
) : IProtoMessage

@Serializable 
class ResAchievement (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progresses: List<AchievementProgress> = emptyList()
) : IProtoMessage

@Serializable 
class ResTitleList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val title_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ReqUseTitle (
    @ProtoId(1) @JvmField val title: Int = 0
) : IProtoMessage

@Serializable 
class ReqBuyShiLian (
    @ProtoId(1) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class ReqUpdateClientValue (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage

@Serializable 
class ResClientValue (
    @ProtoId(1) @JvmField val datas: List<Value> = emptyList(),
    @ProtoId(2) @JvmField val recharged_count: Int = 0
) : IProtoMessage {
@Serializable 
class Value (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqClientMessage (
    @ProtoId(1) @JvmField val timestamp: Int = 0,
    @ProtoId(2) @JvmField val message: String? = null
) : IProtoMessage

@Serializable 
class ReqCurrentMatchInfo (
    @ProtoId(1) @JvmField val mode_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ResCurrentMatchInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val matches: List<CurrentMatchInfo> = emptyList()
) : IProtoMessage {
@Serializable 
class CurrentMatchInfo (
    @ProtoId(1) @JvmField val mode_id: Int = 0,
    @ProtoId(2) @JvmField val playing_count: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqUserComplain (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class ReqReadAnnouncement (
    @ProtoId(1) @JvmField val announcement_id: Int = 0
) : IProtoMessage

@Serializable 
class ResReviveCoinInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val has_gained: Boolean = false
) : IProtoMessage

@Serializable 
class ResDailyTask (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progresses: List<TaskProgress> = emptyList(),
    @ProtoId(3) @JvmField val has_refresh_count: Boolean = false,
    @ProtoId(4) @JvmField val max_daily_task_count: Int = 0,
    @ProtoId(5) @JvmField val refresh_count: Int = 0
) : IProtoMessage

@Serializable 
class ReqRefreshDailyTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
) : IProtoMessage

@Serializable 
class ResRefreshDailyTask (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progress: TaskProgress? = null,
    @ProtoId(3) @JvmField val refresh_count: Int = 0
) : IProtoMessage

@Serializable 
class ReqUseGiftCode (
    @ProtoId(1) @JvmField val code: String? = null
) : IProtoMessage

@Serializable 
class ResUseGiftCode (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(6) @JvmField val rewards: List<RewardSlot> = emptyList()
) : IProtoMessage

@Serializable 
class ReqSendClientMessage (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val content: String? = null
) : IProtoMessage

@Serializable 
class ReqGameLiveInfo (
    @ProtoId(1) @JvmField val game_uuid: String? = null
) : IProtoMessage

@Serializable 
class ResGameLiveInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val left_start_seconds: Int = 0,
    @ProtoId(3) @JvmField val live_head: GameLiveHead? = null,
    @ProtoId(4) @JvmField val segments: List<GameLiveSegmentUri> = emptyList(),
    @ProtoId(5) @JvmField val now_millisecond: Int = 0
) : IProtoMessage

@Serializable 
class ReqGameLiveLeftSegment (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val last_segment_id: Int = 0
) : IProtoMessage

@Serializable 
class ResGameLiveLeftSegment (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_state: Int = 0,
    @ProtoId(4) @JvmField val segments: List<GameLiveSegmentUri> = emptyList(),
    @ProtoId(5) @JvmField val now_millisecond: Int = 0,
    @ProtoId(6) @JvmField val segment_end_millisecond: Int = 0
) : IProtoMessage

@Serializable 
class ReqGameLiveList (
    @ProtoId(1) @JvmField val filter_id: Int = 0
) : IProtoMessage

@Serializable 
class ResGameLiveList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_list: List<GameLiveHead> = emptyList()
) : IProtoMessage

@Serializable 
class ResCommentSetting (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comment_allow: Int = 0
) : IProtoMessage

@Serializable 
class ReqUpdateCommentSetting (
    @ProtoId(1) @JvmField val comment_allow: Int = 0
) : IProtoMessage

@Serializable 
class ReqFetchCommentList (
    @ProtoId(1) @JvmField val target_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCommentList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comment_allow: Int = 0,
    @ProtoId(3) @JvmField val comment_id_list: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val last_read_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqFetchCommentContent (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val comment_id_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ResFetchCommentContent (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comments: List<CommentItem> = emptyList()
) : IProtoMessage

@Serializable 
class ReqLeaveComment (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null
) : IProtoMessage

@Serializable 
class ReqDeleteComment (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val delete_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ReqUpdateReadComment (
    @ProtoId(1) @JvmField val read_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqRollingNotice (
    @ProtoId(1) @JvmField val notice: RollingNotice? = null
) : IProtoMessage

@Serializable 
class ResServerTime (
    @ProtoId(1) @JvmField val server_time: Int = 0
) : IProtoMessage

@Serializable 
class ReqPlatformBillingProducts (
    @ProtoId(1) @JvmField val shelves_id: Int = 0
) : IProtoMessage

@Serializable 
class ResPlatformBillingProducts (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val products: List<BillingProduct> = emptyList()
) : IProtoMessage

@Serializable 
class ReqCreateBillingOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val payment_platform: Int = 0,
    @ProtoId(3) @JvmField val client_type: Int = 0,
    @ProtoId(4) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResCreateBillingOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqSolveGooglePlayOrder (
    @ProtoId(2) @JvmField val inapp_purchase_data: String? = null,
    @ProtoId(3) @JvmField val inapp_data_signature: String? = null
) : IProtoMessage

@Serializable 
class ReqSolveGooglePlayOrderV3 (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val transaction_id: String? = null,
    @ProtoId(3) @JvmField val token: String? = null,
    @ProtoId(4) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqCancelGooglePlayOrder (
    @ProtoId(1) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateWechatNativeOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val account_ip: String? = null
) : IProtoMessage

@Serializable 
class ResCreateWechatNativeOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val qrcode_buffer: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateWechatAppOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val account_ip: String? = null
) : IProtoMessage

@Serializable 
class ResCreateWechatAppOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val call_wechat_app_param: CallWechatAppParam? = null
) : IProtoMessage {
@Serializable 
class CallWechatAppParam (
    @ProtoId(1) @JvmField val appid: String? = null,
    @ProtoId(2) @JvmField val partnerid: String? = null,
    @ProtoId(3) @JvmField val prepayid: String? = null,
    @ProtoId(4) @JvmField val `package`: String? = null,
    @ProtoId(5) @JvmField val noncestr: String? = null,
    @ProtoId(6) @JvmField val timestamp: String? = null,
    @ProtoId(7) @JvmField val sign: String? = null
) : IProtoMessage

}

@Serializable 
class ReqCreateAlipayOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val alipay_trade_type: String? = null,
    @ProtoId(5) @JvmField val return_url: String? = null
) : IProtoMessage

@Serializable 
class ResCreateAlipayOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val alipay_url: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateAlipayScanOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResCreateAlipayScanOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val qrcode_buffer: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null,
    @ProtoId(4) @JvmField val qr_code: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateAlipayAppOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResCreateAlipayAppOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val alipay_url: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateJPCreditCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateJPCreditCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateJPPaypalOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateJPPaypalOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateJPAuOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateJPAuOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateJPDocomoOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateJPDocomoOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateJPWebMoneyOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateJPWebMoneyOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateJPSoftbankOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateJPSoftbankOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateYostarOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val order_type: Int = 0
) : IProtoMessage

@Serializable 
class ResCreateYostarOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateENPaypalOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateENPaypalOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateENJCBOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateENJCBOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateENMasterCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateENMasterCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateENVisaOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateENVisaOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateENAlipayOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateENAlipayOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqCreateDMMOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val client_type: Int = 0
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class ReqCreateIAPOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val access_token: String? = null
) : IProtoMessage

@Serializable 
class ResCreateIAPOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqVerificationIAPOrder (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val transaction_id: String? = null,
    @ProtoId(3) @JvmField val receipt_data: String? = null,
    @ProtoId(4) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResVerificationIAPOrder (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqCreateMyCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ResCreateMyCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val auth_code: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null
) : IProtoMessage

@Serializable 
class ReqVerifyMyCardOrder (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val account_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqOpenChest (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val use_ticket: Boolean = false
) : IProtoMessage

@Serializable 
class ResOpenChest (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val results: List<OpenResult> = emptyList(),
    @ProtoId(3) @JvmField val total_open_count: Int = 0,
    @ProtoId(4) @JvmField val faith_count: Int = 0
) : IProtoMessage

@Serializable 
class ReqBuyFromChestShop (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ResBuyFromChestShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val chest_id: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val faith_count: Int = 0
) : IProtoMessage

@Serializable 
class ResDailySignInInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val sign_in_days: Int = 0
) : IProtoMessage

@Serializable 
class ReqDoActivitySignIn (
    @ProtoId(2) @JvmField val activity_id: Int = 0
) : IProtoMessage

@Serializable 
class ResDoActivitySignIn (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val rewards: List<RewardData> = emptyList(),
    @ProtoId(3) @JvmField val sign_in_count: Int = 0
) : IProtoMessage {
@Serializable 
class RewardData (
    @ProtoId(1) @JvmField val resource_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class ReqChangeMainCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqChangeCharacterSkin (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val skin: Int = 0
) : IProtoMessage

@Serializable 
class ReqChangeCharacterView (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val slot: Int = 0,
    @ProtoId(3) @JvmField val item_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqSendGiftToCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val gifts: List<Gift> = emptyList()
) : IProtoMessage {
@Serializable 
class Gift (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

}

@Serializable 
class ResSendGiftToCharacter (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val level: Int = 0,
    @ProtoId(3) @JvmField val exp: Int = 0
) : IProtoMessage

@Serializable 
class ReqSellItem (
    @ProtoId(1) @JvmField val sells: List<Item> = emptyList()
) : IProtoMessage {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

}

@Serializable 
class ResCommonView (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val slots: List<Slot> = emptyList()
) : IProtoMessage {
@Serializable 
class Slot (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqChangeCommonView (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage

@Serializable 
class ReqSaveCommonViews (
    @ProtoId(1) @JvmField val views: List<ViewSlot> = emptyList(),
    @ProtoId(2) @JvmField val save_index: Int = 0,
    @ProtoId(3) @JvmField val is_use: Int = 0
) : IProtoMessage

@Serializable 
class ReqCommonViews (
    @ProtoId(1) @JvmField val index: Int = 0
) : IProtoMessage

@Serializable 
class ResCommonViews (
    @ProtoId(1) @JvmField val views: List<ViewSlot> = emptyList()
) : IProtoMessage

@Serializable 
class ResAllcommonViews (
    @ProtoId(1) @JvmField val views: List<Views> = emptyList(),
    @ProtoId(2) @JvmField val use: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) : IProtoMessage {
@Serializable 
class Views (
    @ProtoId(1) @JvmField val values: List<ViewSlot> = emptyList(),
    @ProtoId(2) @JvmField val index: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqUseCommonView (
    @ProtoId(3) @JvmField val index: Int = 0
) : IProtoMessage

@Serializable 
class ReqUpgradeCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0
) : IProtoMessage

@Serializable 
class ResUpgradeCharacter (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val character: Character? = null
) : IProtoMessage

@Serializable 
class ReqFinishedEnding (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val story_id: Int = 0,
    @ProtoId(3) @JvmField val ending_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqGMCommand (
    @ProtoId(1) @JvmField val command: String? = null
) : IProtoMessage

@Serializable 
class ResShopInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val shop_info: ShopInfo? = null
) : IProtoMessage

@Serializable 
class ReqBuyFromShop (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val bill_short_cut: List<BillShortcut> = emptyList(),
    @ProtoId(4) @JvmField val deal_price: Int = 0
) : IProtoMessage

@Serializable 
class ResBuyFromShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val rewards: List<RewardSlot> = emptyList()
) : IProtoMessage

@Serializable 
class ReqBuyFromZHP (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ReqPayMonthTicket (
    @ProtoId(1) @JvmField val ticket_id: Int = 0
) : IProtoMessage

@Serializable 
class ResPayMonthTicket (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val resource_id: Int = 0,
    @ProtoId(3) @JvmField val resource_count: Int = 0
) : IProtoMessage

@Serializable 
class ReqReshZHPShop (
    @ProtoId(1) @JvmField val free_refresh: Int = 0,
    @ProtoId(2) @JvmField val cost_refresh: Int = 0
) : IProtoMessage

@Serializable 
class ResRefreshZHPShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val zhp: ZHPShop? = null
) : IProtoMessage

@Serializable 
class ResMonthTicketInfo (
    @ProtoId(1) @JvmField val month_ticket_info: List<MonthTicketInfo> = emptyList()
) : IProtoMessage

@Serializable 
class ReqExchangeCurrency (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ResServerSettings (
    @ProtoId(1) @JvmField val settings: ServerSettings? = null
) : IProtoMessage

@Serializable 
class ResAccountSettings (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val settings: List<AccountSetting> = emptyList()
) : IProtoMessage

@Serializable 
class ReqUpdateAccountSettings (
    @ProtoId(1) @JvmField val setting: AccountSetting? = null
) : IProtoMessage

@Serializable 
class ResModNicknameTime (
    @ProtoId(1) @JvmField val last_mod_time: Int = 0
) : IProtoMessage

@Serializable 
class ResMisc (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val recharged_list: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val faiths: List<MiscFaithData> = emptyList()
) : IProtoMessage {
@Serializable 
class MiscFaithData (
    @ProtoId(1) @JvmField val faith_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqModifySignature (
    @ProtoId(1) @JvmField val signature: String? = null
) : IProtoMessage

@Serializable 
class ResIDCardInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_authed: Boolean = false,
    @ProtoId(3) @JvmField val country: String? = null
) : IProtoMessage

@Serializable 
class ReqUpdateIDCardInfo (
    @ProtoId(1) @JvmField val fullname: String? = null,
    @ProtoId(2) @JvmField val card_no: String? = null
) : IProtoMessage

@Serializable 
class ResVipReward (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val gained_vip_levels: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ReqGainVipReward (
    @ProtoId(1) @JvmField val vip_level: Int = 0
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestList (
    @ProtoId(1) @JvmField val start: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val contests: List<CustomizedContestBase> = emptyList(),
    @ProtoId(3) @JvmField val follow_contests: List<CustomizedContestBase> = emptyList()
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestExtendInfo (
    @ProtoId(1) @JvmField val uid_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestExtendInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val extend_list: List<CustomizedContestExtend> = emptyList()
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestAuthInfo (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestAuthInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val observer_level: Int = 0
) : IProtoMessage

@Serializable 
class ReqEnterCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ResEnterCustomizedContest (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val detail_info: CustomizedContestDetail? = null,
    @ProtoId(3) @JvmField val player_report: CustomizedContestPlayerReport? = null,
    @ProtoId(4) @JvmField val is_followed: Boolean = false
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestOnlineInfo (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestOnlineInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val online_player: Int = 0
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestByContestId (
    @ProtoId(1) @JvmField val contest_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestByContestId (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val contest_info: CustomizedContestAbstract? = null
) : IProtoMessage

@Serializable 
class ReqStartCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqJoinCustomizedContestChatRoom (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ResJoinCustomizedContestChatRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val chat_history: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage

@Serializable 
class ReqSayChatMessage (
    @ProtoId(1) @JvmField val content: String? = null
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestGameLiveList (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestGameLiveList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_list: List<GameLiveHead> = emptyList()
) : IProtoMessage

@Serializable 
class ReqFetchCustomizedContestGameRecords (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val last_index: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchCustomizedContestGameRecords (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val next_index: Int = 0,
    @ProtoId(3) @JvmField val record_list: List<RecordGame> = emptyList()
) : IProtoMessage

@Serializable 
class ReqTargetCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage

@Serializable 
class ResActivityList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val activities: List<Activity> = emptyList()
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class ActivitySignInData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val sign_in_count: Int = 0,
    @ProtoId(3) @JvmField val last_sign_in_time: Int = 0
) : IProtoMessage

@Serializable 
class BuffData (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val remain: Int = 0,
    @ProtoId(3) @JvmField val effect: Int = 0
) : IProtoMessage

@Serializable 
class ActivityRichmanData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val location: Int = 0,
    @ProtoId(3) @JvmField val finished_count: Int = 0,
    @ProtoId(4) @JvmField val chest_position: Int = 0,
    @ProtoId(5) @JvmField val bank_save: Int = 0,
    @ProtoId(6) @JvmField val exp: Int = 0,
    @ProtoId(7) @JvmField val buff: List<BuffData> = emptyList()
) : IProtoMessage

}

@Serializable 
class ReqExchangeActivityItem (
    @ProtoId(1) @JvmField val exchange_id: Int = 0
) : IProtoMessage

@Serializable 
class ResExchangeActivityItem (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val execute_reward: List<ExecuteReward> = emptyList()
) : IProtoMessage

@Serializable 
class ReqCompleteActivityTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqReceiveActivityFlipTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
) : IProtoMessage

@Serializable 
class ResReceiveActivityFlipTask (
    @ProtoId(1) @JvmField val count: Int = 0,
    @ProtoId(2) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqFetchActivityFlipInfo (
    @ProtoId(1) @JvmField val activity_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchActivityFlipInfo (
    @ProtoId(1) @JvmField val rewards: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqGainAccumulatedPointActivityReward (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val reward_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqFetchRankPointLeaderboard (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0
) : IProtoMessage

@Serializable 
class ResFetchRankPointLeaderboard (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(3) @JvmField val last_refresh_time: Int = 0
) : IProtoMessage {
@Serializable 
class Item (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val view: PlayerBaseView? = null,
    @ProtoId(4) @JvmField val point: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqGainRankPointReward (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val activity_id: Int = 0
) : IProtoMessage

@Serializable 
class ReqRichmanNextMove (
    @ProtoId(1) @JvmField val activity_id: Int = 0
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class RewardData (
    @ProtoId(1) @JvmField val resource_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val origin_count: Int = 0,
    @ProtoId(4) @JvmField val is_chest: Int = 0
) : IProtoMessage

@Serializable 
class PathData (
    @ProtoId(1) @JvmField val location: Int = 0,
    @ProtoId(2) @JvmField val rewards: List<RewardData> = emptyList(),
    @ProtoId(3) @JvmField val events: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class BuffData (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val remain: Int = 0,
    @ProtoId(3) @JvmField val effect: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqRichmanSpecialMove (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val step: Int = 0
) : IProtoMessage

@Serializable 
class ReqRichmanChestInfo (
    @ProtoId(1) @JvmField val activity_id: Int = 0
) : IProtoMessage

@Serializable 
class ResRichmanChestInfo (
    @ProtoId(1) @JvmField val items: List<ItemData> = emptyList(),
    @ProtoId(2) @JvmField val error: Error? = null
) : IProtoMessage {
@Serializable 
class ItemData (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage

}

@Serializable 
class ReqCreateGameObserveAuth (
    @ProtoId(1) @JvmField val game_uuid: String? = null
) : IProtoMessage

@Serializable 
class ResCreateGameObserveAuth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val token: String? = null,
    @ProtoId(3) @JvmField val location: String? = null
) : IProtoMessage

@Serializable 
class ReqRefreshGameObserveAuth (
    @ProtoId(1) @JvmField val token: String? = null
) : IProtoMessage

@Serializable 
class ResRefreshGameObserveAuth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val ttl: Int = 0
) : IProtoMessage

@Serializable 
class ActionMJStart () : IProtoMessage

@Serializable 
class NewRoundOpenedTiles (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tiles: String? = null,
    @ProtoId(3) @JvmField val count: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class MuyuInfo (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val count_max: Int = 0,
    @ProtoId(4) @JvmField val id: Int = 0
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class TingPai (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tingpais1: List<TingPaiInfo> = emptyList()
) : IProtoMessage

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
) : IProtoMessage {
@Serializable 
class PlayerSnapshot (
    @ProtoId(1) @JvmField val score: Int = 0,
    @ProtoId(2) @JvmField val liqiposition: Int = 0,
    @ProtoId(3) @JvmField val tilenum: Int = 0,
    @ProtoId(4) @JvmField val qipais: String? = null,
    @ProtoId(5) @JvmField val mings: List<Fulu> = emptyList()
) : IProtoMessage {
@Serializable 
class Fulu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val from: List<Int> = emptyList()
) : IProtoMessage

}

}

@Serializable 
class ActionPrototype (
    @ProtoId(1) @JvmField val step: Int = 0,
    @ProtoId(2) @JvmField val name: String? = null,
    @ProtoId(3) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage

@Serializable 
class GameDetailRecords (
    @ProtoId(1) @JvmField val records: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage

@Serializable 
class OptionalOperation (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val combination: String? = null
) : IProtoMessage

@Serializable 
class OptionalOperationList (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val operation_list: List<OptionalOperation> = emptyList(),
    @ProtoId(4) @JvmField val time_add: Int = 0,
    @ProtoId(5) @JvmField val time_fixed: Int = 0
) : IProtoMessage

@Serializable 
class LiQiSuccess (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val score: Int = 0,
    @ProtoId(3) @JvmField val liqibang: Int = 0
) : IProtoMessage

@Serializable 
class FanInfo (
    @ProtoId(1) @JvmField val name: String? = null,
    @ProtoId(2) @JvmField val `val`: Int = 0,
    @ProtoId(3) @JvmField val id: Int = 0
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class TingPaiDiscardInfo (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val zhenting: Boolean = false,
    @ProtoId(3) @JvmField val infos: List<TingPaiInfo> = emptyList()
) : IProtoMessage

@Serializable 
class GameEnd (
    @ProtoId(1) @JvmField val scores: List<Int> = emptyList()
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class RecordAnGangAddGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class RecordBaBei (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(8) @JvmField val moqie: Boolean = false,
    @ProtoId(10) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage

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
) : IProtoMessage

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
) : IProtoMessage

@Serializable 
class ActionLiuJu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val gameend: GameEnd? = null,
    @ProtoId(3) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val allplayertiles: String? = null,
    @ProtoId(7) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage

@Serializable 
class RecordLiuJu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val gameend: GameEnd? = null,
    @ProtoId(3) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val allplayertiles: String? = null,
    @ProtoId(7) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage

@Serializable 
class NoTilePlayerInfo (
    @ProtoId(3) @JvmField val tingpai: Boolean = false,
    @ProtoId(4) @JvmField val hand: String? = null,
    @ProtoId(5) @JvmField val tings: List<TingPaiInfo> = emptyList()
) : IProtoMessage

@Serializable 
class NoTileScoreInfo (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val hand: String? = null,
    @ProtoId(5) @JvmField val ming: String? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val score: Int = 0
) : IProtoMessage

@Serializable 
class ActionNoTile (
    @ProtoId(1) @JvmField val liujumanguan: Boolean = false,
    @ProtoId(2) @JvmField val players: List<NoTilePlayerInfo> = emptyList(),
    @ProtoId(3) @JvmField val scores: List<NoTileScoreInfo> = emptyList(),
    @ProtoId(4) @JvmField val gameend: Boolean = false,
    @ProtoId(5) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage

@Serializable 
class RecordNoTile (
    @ProtoId(1) @JvmField val liujumanguan: Boolean = false,
    @ProtoId(2) @JvmField val players: List<NoTilePlayerInfo> = emptyList(),
    @ProtoId(3) @JvmField val scores: List<NoTileScoreInfo> = emptyList(),
    @ProtoId(4) @JvmField val gameend: Boolean = false,
    @ProtoId(5) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage

@Serializable 
class PlayerLeaving (
    @ProtoId(1) @JvmField val seat: Int = 0
) : IProtoMessage

class FastTest {
    class AuthGame(callable: (ReqAuthGame) -> ResAuthGame): IProtoRpc<ReqAuthGame, ResAuthGame>(".lq.FastTest.authGame", callable) {
        override fun decodeReq(data: ByteArray): ReqAuthGame = ProtoBuf.load(ReqAuthGame.serializer(), data)
        override fun encodeRes(res: ResAuthGame): ByteArray = ProtoBuf.dump(ResAuthGame.serializer(), res)
    }
    class EnterGame(callable: (ReqCommon) -> ResEnterGame): IProtoRpc<ReqCommon, ResEnterGame>(".lq.FastTest.enterGame", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResEnterGame): ByteArray = ProtoBuf.dump(ResEnterGame.serializer(), res)
    }
    class SyncGame(callable: (ReqSyncGame) -> ResSyncGame): IProtoRpc<ReqSyncGame, ResSyncGame>(".lq.FastTest.syncGame", callable) {
        override fun decodeReq(data: ByteArray): ReqSyncGame = ProtoBuf.load(ReqSyncGame.serializer(), data)
        override fun encodeRes(res: ResSyncGame): ByteArray = ProtoBuf.dump(ResSyncGame.serializer(), res)
    }
    class FinishSyncGame(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.finishSyncGame", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class TerminateGame(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.terminateGame", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class InputOperation(callable: (ReqSelfOperation) -> ResCommon): IProtoRpc<ReqSelfOperation, ResCommon>(".lq.FastTest.inputOperation", callable) {
        override fun decodeReq(data: ByteArray): ReqSelfOperation = ProtoBuf.load(ReqSelfOperation.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class InputChiPengGang(callable: (ReqChiPengGang) -> ResCommon): IProtoRpc<ReqChiPengGang, ResCommon>(".lq.FastTest.inputChiPengGang", callable) {
        override fun decodeReq(data: ByteArray): ReqChiPengGang = ProtoBuf.load(ReqChiPengGang.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ConfirmNewRound(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.confirmNewRound", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class BroadcastInGame(callable: (ReqBroadcastInGame) -> ResCommon): IProtoRpc<ReqBroadcastInGame, ResCommon>(".lq.FastTest.broadcastInGame", callable) {
        override fun decodeReq(data: ByteArray): ReqBroadcastInGame = ProtoBuf.load(ReqBroadcastInGame.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class InputGameGMCommand(callable: (ReqGMCommandInGaming) -> ResCommon): IProtoRpc<ReqGMCommandInGaming, ResCommon>(".lq.FastTest.inputGameGMCommand", callable) {
        override fun decodeReq(data: ByteArray): ReqGMCommandInGaming = ProtoBuf.load(ReqGMCommandInGaming.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class FetchGamePlayerState(callable: (ReqCommon) -> ResGamePlayerState): IProtoRpc<ReqCommon, ResGamePlayerState>(".lq.FastTest.fetchGamePlayerState", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResGamePlayerState): ByteArray = ProtoBuf.dump(ResGamePlayerState.serializer(), res)
    }
    class CheckNetworkDelay(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.checkNetworkDelay", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class ClearLeaving(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.clearLeaving", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class VoteGameEnd(callable: (ReqVoteGameEnd) -> ResGameEndVote): IProtoRpc<ReqVoteGameEnd, ResGameEndVote>(".lq.FastTest.voteGameEnd", callable) {
        override fun decodeReq(data: ByteArray): ReqVoteGameEnd = ProtoBuf.load(ReqVoteGameEnd.serializer(), data)
        override fun encodeRes(res: ResGameEndVote): ByteArray = ProtoBuf.dump(ResGameEndVote.serializer(), res)
    }
    class AuthObserve(callable: (ReqAuthObserve) -> ResCommon): IProtoRpc<ReqAuthObserve, ResCommon>(".lq.FastTest.authObserve", callable) {
        override fun decodeReq(data: ByteArray): ReqAuthObserve = ProtoBuf.load(ReqAuthObserve.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
    class StartObserve(callable: (ReqCommon) -> ResStartObserve): IProtoRpc<ReqCommon, ResStartObserve>(".lq.FastTest.startObserve", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResStartObserve): ByteArray = ProtoBuf.dump(ResStartObserve.serializer(), res)
    }
    class StopObserve(callable: (ReqCommon) -> ResCommon): IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.stopObserve", callable) {
        override fun decodeReq(data: ByteArray): ReqCommon = ProtoBuf.load(ReqCommon.serializer(), data)
        override fun encodeRes(res: ResCommon): ByteArray = ProtoBuf.dump(ResCommon.serializer(), res)
    }
}

@Serializable 
class ReqAuthGame (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null
) : IProtoMessage

@Serializable 
class ResAuthGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val players: List<PlayerGameView> = emptyList(),
    @ProtoId(3) @JvmField val seat_list: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val is_game_start: Boolean = false,
    @ProtoId(5) @JvmField val game_config: GameConfig? = null,
    @ProtoId(6) @JvmField val ready_id_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class GameRestore (
    @ProtoId(1) @JvmField val snapshot: GameSnapshot? = null,
    @ProtoId(2) @JvmField val actions: List<ActionPrototype> = emptyList(),
    @ProtoId(3) @JvmField val passed_waiting_time: Int = 0,
    @ProtoId(4) @JvmField val game_state: Int = 0,
    @ProtoId(5) @JvmField val start_time: Int = 0,
    @ProtoId(6) @JvmField val last_pause_time_ms: Int = 0
) : IProtoMessage

@Serializable 
class ResEnterGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_end: Boolean = false,
    @ProtoId(3) @JvmField val step: Int = 0,
    @ProtoId(4) @JvmField val game_restore: GameRestore? = null
) : IProtoMessage

@Serializable 
class ReqSyncGame (
    @ProtoId(1) @JvmField val round_id: String? = null,
    @ProtoId(2) @JvmField val step: Int = 0
) : IProtoMessage

@Serializable 
class ResSyncGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_end: Boolean = false,
    @ProtoId(3) @JvmField val step: Int = 0,
    @ProtoId(4) @JvmField val game_restore: GameRestore? = null
) : IProtoMessage

@Serializable 
class ReqSelfOperation (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val index: Int = 0,
    @ProtoId(3) @JvmField val tile: String? = null,
    @ProtoId(4) @JvmField val cancel_operation: Boolean = false,
    @ProtoId(5) @JvmField val moqie: Boolean = false,
    @ProtoId(6) @JvmField val timeuse: Int = 0,
    @ProtoId(7) @JvmField val tile_state: Int = 0
) : IProtoMessage

@Serializable 
class ReqChiPengGang (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val index: Int = 0,
    @ProtoId(3) @JvmField val cancel_operation: Boolean = false,
    @ProtoId(6) @JvmField val timeuse: Int = 0
) : IProtoMessage

@Serializable 
class ReqBroadcastInGame (
    @ProtoId(1) @JvmField val content: String? = null,
    @ProtoId(2) @JvmField val except_self: Boolean = false
) : IProtoMessage

@Serializable 
class ReqGMCommandInGaming (
    @ProtoId(1) @JvmField val json_data: String? = null
) : IProtoMessage

@Serializable 
class ResGamePlayerState (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val state_list: List<GamePlayerState> = emptyList()
) : IProtoMessage

@Serializable 
class ReqVoteGameEnd (
    @ProtoId(1) @JvmField val yes: Boolean = false
) : IProtoMessage

@Serializable 
class ResGameEndVote (
    @ProtoId(1) @JvmField val success: Boolean = false,
    @ProtoId(2) @JvmField val vote_cd_end_time: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) : IProtoMessage

@Serializable 
class ReqAuthObserve (
    @ProtoId(1) @JvmField val token: String? = null
) : IProtoMessage

@Serializable 
class ResStartObserve (
    @ProtoId(1) @JvmField val head: GameLiveHead? = null,
    @ProtoId(2) @JvmField val passed: GameLiveSegment? = null
) : IProtoMessage

@Serializable 
class NotifyNewGame (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val player_list: String? = null
) : IProtoMessage

@Serializable 
class NotifyPlayerLoadGameReady (
    @ProtoId(1) @JvmField val ready_id_list: List<Int> = emptyList()
) : IProtoMessage

@Serializable 
class NotifyGameBroadcast (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null
) : IProtoMessage

@Serializable 
class NotifyGameEndResult (
    @ProtoId(1) @JvmField val result: GameEndResult? = null
) : IProtoMessage

@Serializable 
class NotifyGameTerminate (
    @ProtoId(1) @JvmField val reason: String? = null
) : IProtoMessage

@Serializable 
class NotifyPlayerConnectionState (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val state: GamePlayerState? = null
) : IProtoMessage

@Serializable 
class NotifyAccountLevelChange (
    @ProtoId(1) @JvmField val origin: AccountLevel? = null,
    @ProtoId(2) @JvmField val final: AccountLevel? = null,
    @ProtoId(3) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class NotifyGameFinishReward (
    @ProtoId(1) @JvmField val mode_id: Int = 0,
    @ProtoId(2) @JvmField val level_change: LevelChange? = null,
    @ProtoId(3) @JvmField val match_chest: MatchChest? = null,
    @ProtoId(4) @JvmField val main_character: MainCharacter? = null,
    @ProtoId(5) @JvmField val character_gift: CharacterGift? = null
) : IProtoMessage {
@Serializable 
class LevelChange (
    @ProtoId(1) @JvmField val origin: AccountLevel? = null,
    @ProtoId(2) @JvmField val final: AccountLevel? = null,
    @ProtoId(3) @JvmField val type: Int = 0
) : IProtoMessage

@Serializable 
class MatchChest (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val origin: Int = 0,
    @ProtoId(3) @JvmField val final: Int = 0,
    @ProtoId(4) @JvmField val is_graded: Boolean = false,
    @ProtoId(5) @JvmField val rewards: List<RewardSlot> = emptyList()
) : IProtoMessage

@Serializable 
class MainCharacter (
    @ProtoId(1) @JvmField val level: Int = 0,
    @ProtoId(2) @JvmField val exp: Int = 0,
    @ProtoId(3) @JvmField val add: Int = 0
) : IProtoMessage

@Serializable 
class CharacterGift (
    @ProtoId(1) @JvmField val origin: Int = 0,
    @ProtoId(2) @JvmField val final: Int = 0,
    @ProtoId(3) @JvmField val add: Int = 0,
    @ProtoId(4) @JvmField val is_graded: Boolean = false
) : IProtoMessage

}

@Serializable 
class NotifyActivityReward (
    @ProtoId(1) @JvmField val activity_reward: List<ActivityReward> = emptyList()
) : IProtoMessage {
@Serializable 
class ActivityReward (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val rewards: List<RewardSlot> = emptyList()
) : IProtoMessage

}

@Serializable 
class NotifyActivityPoint (
    @ProtoId(1) @JvmField val activity_points: List<ActivityPoint> = emptyList()
) : IProtoMessage {
@Serializable 
class ActivityPoint (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0
) : IProtoMessage

}

@Serializable 
class NotifyLeaderboardPoint (
    @ProtoId(1) @JvmField val leaderboard_points: List<LeaderboardPoint> = emptyList()
) : IProtoMessage {
@Serializable 
class LeaderboardPoint (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0
) : IProtoMessage

}

@Serializable 
class NotifyGamePause (
    @ProtoId(1) @JvmField val paused: Boolean = false
) : IProtoMessage

@Serializable 
class NotifyEndGameVote (
    @ProtoId(1) @JvmField val results: List<VoteResult> = emptyList(),
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val duration_time: Int = 0
) : IProtoMessage {
@Serializable 
class VoteResult (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val yes: Boolean = false
) : IProtoMessage

}

@Serializable 
class NotifyObserveData (
    @ProtoId(1) @JvmField val unit: GameLiveUnit? = null
) : IProtoMessage

