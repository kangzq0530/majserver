package io.majserver.network.proto

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoId

val EMPTY_BYTE_ARRAY = ByteArray(0)

@Serializable data class NotifyRoomGameStart (
    @ProtoId(1) @JvmField val game_url: String? = null,
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val location: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyRoomGameStart", encode())
}

@Serializable data class NotifyMatchGameStart (
    @ProtoId(1) @JvmField val game_url: String? = null,
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val match_mode_id: Int = 0,
    @ProtoId(5) @JvmField val location: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyMatchGameStart", encode())
}

@Serializable data class NotifyRoomPlayerReady (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val ready: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyRoomPlayerReady", encode())
}

@Serializable data class NotifyRoomPlayerDressing (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val dressing: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyRoomPlayerDressing", encode())
}

@Serializable data class NotifyRoomPlayerUpdate (
    @ProtoId(1) @JvmField val update_list: List<PlayerBaseView> = emptyList(),
    @ProtoId(2) @JvmField val remove_list: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val owner_id: Int = 0,
    @ProtoId(4) @JvmField val robot_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyRoomPlayerUpdate", encode())
}

@Serializable class NotifyRoomKickOut () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyRoomKickOut", encode())
}

@Serializable class NotifyMatchTimeout () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyMatchTimeout", encode())
}

@Serializable data class NotifyFriendStateChange (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val active_state: AccountActiveState? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyFriendStateChange", encode())
}

@Serializable data class NotifyFriendViewChange (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val base: PlayerBaseView? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyFriendViewChange", encode())
}

@Serializable data class NotifyFriendChange (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val friend: Friend? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyFriendChange", encode())
}

@Serializable data class NotifyNewFriendApply (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val apply_time: Int = 0,
    @ProtoId(3) @JvmField val removed_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyNewFriendApply", encode())
}

@Serializable data class NotifyClientMessage (
    @ProtoId(1) @JvmField val sender: PlayerBaseView? = null,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val content: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyClientMessage", encode())
}

@Serializable data class NotifyAccountUpdate (
    @ProtoId(1) @JvmField val update: AccountUpdate? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAccountUpdate", encode())
}

@Serializable class NotifyAnotherLogin () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAnotherLogin", encode())
}

@Serializable class NotifyAccountLogout () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAccountLogout", encode())
}

@Serializable data class NotifyAnnouncementUpdate (
    @ProtoId(1) @JvmField val announcements: List<Announcement> = emptyList(),
    @ProtoId(2) @JvmField val sort: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAnnouncementUpdate", encode())
}

@Serializable data class NotifyNewMail (
    @ProtoId(1) @JvmField val mail: Mail? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyNewMail", encode())
}

@Serializable data class NotifyDeleteMail (
    @ProtoId(1) @JvmField val mail_id_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyDeleteMail", encode())
}

@Serializable data class NotifyReviveCoinUpdate (
    @ProtoId(1) @JvmField val has_gained: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyReviveCoinUpdate", encode())
}

@Serializable data class NotifyDailyTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList(),
    @ProtoId(2) @JvmField val max_daily_task_count: Int = 0,
    @ProtoId(3) @JvmField val refresh_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyDailyTaskUpdate", encode())
}

@Serializable data class NotifyActivityTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyActivityTaskUpdate", encode())
}

@Serializable data class NotifyActivityPeriodTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyActivityPeriodTaskUpdate", encode())
}

@Serializable data class NotifyAccountRandomTaskUpdate (
    @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAccountRandomTaskUpdate", encode())
}

@Serializable class NotifyNewComment () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyNewComment", encode())
}

@Serializable data class NotifyRollingNotice (
    @ProtoId(1) @JvmField val notice: RollingNotice? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyRollingNotice", encode())
}

@Serializable class NotifyGiftSendRefresh () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyGiftSendRefresh", encode())
}

@Serializable data class NotifyShopUpdate (
    @ProtoId(1) @JvmField val shop_info: ShopInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyShopUpdate", encode())
}

@Serializable data class NotifyVipLevelChange (
    @ProtoId(1) @JvmField val gift_limit: Int = 0,
    @ProtoId(2) @JvmField val friend_max_count: Int = 0,
    @ProtoId(3) @JvmField val zhp_free_refresh_limit: Int = 0,
    @ProtoId(4) @JvmField val zhp_cost_refresh_limit: Int = 0,
    @ProtoId(5) @JvmField val buddy_bonus: Float = 0f,
    @ProtoId(6) @JvmField val record_collect_limit: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyVipLevelChange", encode())
}

@Serializable data class NotifyServerSetting (
    @ProtoId(1) @JvmField val settings: ServerSettings? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyServerSetting", encode())
}

@Serializable data class NotifyPayResult (
    @ProtoId(1) @JvmField val pay_result: Int = 0,
    @ProtoId(2) @JvmField val order_id: String? = null,
    @ProtoId(3) @JvmField val goods_id: Int = 0,
    @ProtoId(4) @JvmField val new_month_ticket: Int = 0,
    @ProtoId(5) @JvmField val resource_modify: List<ResourceModify> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyPayResult", encode())

    @Serializable data class ResourceModify (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0,
        @ProtoId(3) @JvmField val final: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ResourceModify", encode())
    }

}

@Serializable data class NotifyCustomContestAccountMsg (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val sender: String? = null,
    @ProtoId(4) @JvmField val content: String? = null,
    @ProtoId(5) @JvmField val verified: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyCustomContestAccountMsg", encode())
}

@Serializable data class NotifyCustomContestSystemMsg (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val uuid: String? = null,
    @ProtoId(4) @JvmField val game_start: CustomizedContestGameStart? = null,
    @ProtoId(5) @JvmField val game_end: CustomizedContestGameEnd? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyCustomContestSystemMsg", encode())
}

@Serializable data class NotifyCustomContestState (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyCustomContestState", encode())
}

@Serializable data class NotifyActivityChange (
    @ProtoId(1) @JvmField val new_activities: List<Activity> = emptyList(),
    @ProtoId(2) @JvmField val end_activities: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyActivityChange", encode())
}

@Serializable data class NotifyAFKResult (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val ban_end_time: Int = 0,
    @ProtoId(3) @JvmField val game_uuid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAFKResult", encode())
}

@Serializable data class Error (
    @ProtoId(1) @JvmField val code: Int = 0,
    @ProtoId(2) @JvmField val u32_params: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val str_params: String? = null,
    @ProtoId(4) @JvmField val json_param: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Error", encode())
}

@Serializable data class Wrapper (
    @ProtoId(1) @JvmField val name: String? = null,
    @ProtoId(2) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Wrapper", encode())
}

@Serializable data class NetworkEndpoint (
    @ProtoId(1) @JvmField val family: String? = null,
    @ProtoId(2) @JvmField val address: String? = null,
    @ProtoId(3) @JvmField val port: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NetworkEndpoint", encode())
}

@Serializable class ReqCommon () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCommon", encode())
}

@Serializable data class ResCommon (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCommon", encode())
}

@Serializable data class ResAccountUpdate (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val update: AccountUpdate? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountUpdate", encode())
}

@Serializable data class AntiAddiction (
    @ProtoId(1) @JvmField val online_duration: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AntiAddiction", encode())
}

@Serializable data class AccountMahjongStatistic (
    @ProtoId(1) @JvmField val final_position_counts: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val recent_round: RoundSummary? = null,
    @ProtoId(3) @JvmField val recent_hu: HuSummary? = null,
    @ProtoId(4) @JvmField val highest_hu: HighestHuRecord? = null,
    @ProtoId(6) @JvmField val recent_20_hu_summary: Liqi20Summary? = null,
    @ProtoId(7) @JvmField val recent_10_hu_summary: LiQi10Summary? = null,
    @ProtoId(8) @JvmField val recent_10_game_result: List<GameResult> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountMahjongStatistic", encode())

    @Serializable data class RoundSummary (
        @ProtoId(1) @JvmField val total_count: Int = 0,
        @ProtoId(2) @JvmField val rong_count: Int = 0,
        @ProtoId(3) @JvmField val zimo_count: Int = 0,
        @ProtoId(4) @JvmField val fangchong_count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RoundSummary", encode())
    }


    @Serializable data class HuSummary (
        @ProtoId(1) @JvmField val total_count: Int = 0,
        @ProtoId(2) @JvmField val dora_round_count: Int = 0,
        @ProtoId(3) @JvmField val total_fan: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.HuSummary", encode())
    }


    @Serializable data class HighestHuRecord (
        @ProtoId(1) @JvmField val fanshu: Int = 0,
        @ProtoId(2) @JvmField val doranum: Int = 0,
        @ProtoId(3) @JvmField val title: String? = null,
        @ProtoId(4) @JvmField val hands: String? = null,
        @ProtoId(5) @JvmField val ming: String? = null,
        @ProtoId(6) @JvmField val hupai: String? = null,
        @ProtoId(7) @JvmField val title_id: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.HighestHuRecord", encode())
    }


    @Serializable data class Liqi20Summary (
        @ProtoId(1) @JvmField val total_count: Int = 0,
        @ProtoId(2) @JvmField val total_lidora_count: Int = 0,
        @ProtoId(3) @JvmField val average_hu_point: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Liqi20Summary", encode())
    }


    @Serializable data class LiQi10Summary (
        @ProtoId(1) @JvmField val total_xuanshang: Int = 0,
        @ProtoId(2) @JvmField val total_fanshu: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.LiQi10Summary", encode())
    }


    @Serializable data class GameResult (
        @ProtoId(1) @JvmField val rank: Int = 0,
        @ProtoId(2) @JvmField val final_point: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.GameResult", encode())
    }

}

@Serializable data class AccountStatisticData (
    @ProtoId(1) @JvmField val mahjong_category: Int = 0,
    @ProtoId(2) @JvmField val game_category: Int = 0,
    @ProtoId(3) @JvmField val statistic: AccountMahjongStatistic? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountStatisticData", encode())
}

@Serializable data class AccountLevel (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val score: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountLevel", encode())
}

@Serializable data class ViewSlot (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val item_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ViewSlot", encode())
}

@Serializable data class Account (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Account", encode())

    @Serializable data class PlatformDiamond (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.PlatformDiamond", encode())
    }


    @Serializable data class PlatformSkinTicket (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.PlatformSkinTicket", encode())
    }

}

@Serializable data class AccountOwnerData (
    @ProtoId(1) @JvmField val unlock_characters: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountOwnerData", encode())
}

@Serializable data class AccountUpdate (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountUpdate", encode())

    @Serializable data class NumericalUpdate (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(3) @JvmField val final: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.NumericalUpdate", encode())
    }


    @Serializable data class CharacterUpdate (
        @ProtoId(2) @JvmField val characters: List<Character> = emptyList(),
        @ProtoId(3) @JvmField val skins: List<Int> = emptyList(),
        @ProtoId(4) @JvmField val finished_endings: List<Int> = emptyList(),
        @ProtoId(5) @JvmField val rewarded_endings: List<Int> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.CharacterUpdate", encode())
    }


    @Serializable data class AchievementUpdate (
        @ProtoId(1) @JvmField val progresses: List<AchievementProgress> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.AchievementUpdate", encode())
    }


    @Serializable data class DailyTaskUpdate (
        @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.DailyTaskUpdate", encode())
    }


    @Serializable data class TitleUpdate (
        @ProtoId(1) @JvmField val new_titles: List<Int> = emptyList(),
        @ProtoId(2) @JvmField val remove_titles: List<Int> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.TitleUpdate", encode())
    }


    @Serializable data class TaskUpdate (
        @ProtoId(1) @JvmField val progresses: List<TaskProgress> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.TaskUpdate", encode())
    }

}

@Serializable data class GameMetaData (
    @ProtoId(1) @JvmField val room_id: Int = 0,
    @ProtoId(2) @JvmField val mode_id: Int = 0,
    @ProtoId(3) @JvmField val contest_uid: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameMetaData", encode())
}

@Serializable data class AccountPlayingGame (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val category: Int = 0,
    @ProtoId(3) @JvmField val meta: GameMetaData? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountPlayingGame", encode())
}

@Serializable data class AccountCacheView (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountCacheView", encode())
}

@Serializable data class PlayerBaseView (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val avatar_id: Int = 0,
    @ProtoId(3) @JvmField val title: Int = 0,
    @ProtoId(4) @JvmField val nickname: String? = null,
    @ProtoId(5) @JvmField val level: AccountLevel? = null,
    @ProtoId(6) @JvmField val level3: AccountLevel? = null,
    @ProtoId(7) @JvmField val avatar_frame: Int = 0,
    @ProtoId(8) @JvmField val verified: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.PlayerBaseView", encode())
}

@Serializable data class PlayerGameView (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.PlayerGameView", encode())
}

@Serializable data class GameMode (
    @ProtoId(1) @JvmField val mode: Int = 0,
    @ProtoId(4) @JvmField val ai: Boolean = false,
    @ProtoId(5) @JvmField val extendinfo: String? = null,
    @ProtoId(6) @JvmField val detail_rule: GameDetailRule? = null,
    @ProtoId(7) @JvmField val testing_environment: GameTestingEnvironmentSet? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameMode", encode())
}

@Serializable data class GameTestingEnvironmentSet (
    @ProtoId(1) @JvmField val paixing: Int = 0,
    @ProtoId(2) @JvmField val left_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameTestingEnvironmentSet", encode())
}

@Serializable data class GameDetailRule (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameDetailRule", encode())
}

@Serializable data class Room (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Room", encode())
}

@Serializable data class GameEndResult (
    @ProtoId(1) @JvmField val players: List<PlayerItem> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameEndResult", encode())

    @Serializable data class PlayerItem (
        @ProtoId(1) @JvmField val seat: Int = 0,
        @ProtoId(2) @JvmField val total_point: Int = 0,
        @ProtoId(3) @JvmField val part_point_1: Int = 0,
        @ProtoId(4) @JvmField val part_point_2: Int = 0,
        @ProtoId(5) @JvmField val grading_score: Int = 0,
        @ProtoId(6) @JvmField val gold: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.PlayerItem", encode())
    }

}

@Serializable data class GameConnectInfo (
    @ProtoId(2) @JvmField val connect_token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null,
    @ProtoId(4) @JvmField val location: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameConnectInfo", encode())
}

@Serializable data class ItemGainRecord (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ItemGainRecord", encode())
}

@Serializable data class ItemGainRecords (
    @ProtoId(1) @JvmField val record_time: Int = 0,
    @ProtoId(2) @JvmField val limit_source_id: Int = 0,
    @ProtoId(3) @JvmField val records: List<ItemGainRecord> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ItemGainRecords", encode())
}

@Serializable data class Item (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val stack: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Item", encode())
}

@Serializable data class Bag (
    @ProtoId(1) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(2) @JvmField val daily_gain_record: List<ItemGainRecords> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Bag", encode())
}

@Serializable data class BagUpdate (
    @ProtoId(1) @JvmField val update_items: List<Item> = emptyList(),
    @ProtoId(2) @JvmField val update_daily_gain_record: List<ItemGainRecords> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.BagUpdate", encode())
}

@Serializable data class RewardSlot (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RewardSlot", encode())
}

@Serializable data class OpenResult (
    @ProtoId(1) @JvmField val reward: RewardSlot? = null,
    @ProtoId(2) @JvmField val replace: RewardSlot? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.OpenResult", encode())
}

@Serializable data class RewardPlusResult (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val exchange: Exchange? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RewardPlusResult", encode())

    @Serializable data class Exchange (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0,
        @ProtoId(3) @JvmField val exchange: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Exchange", encode())
    }

}

@Serializable data class ExecuteReward (
    @ProtoId(1) @JvmField val reward: RewardSlot? = null,
    @ProtoId(2) @JvmField val replace: RewardSlot? = null,
    @ProtoId(3) @JvmField val replace_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ExecuteReward", encode())
}

@Serializable data class Mail (
    @ProtoId(1) @JvmField val mail_id: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0,
    @ProtoId(3) @JvmField val take_attachment: Boolean = false,
    @ProtoId(4) @JvmField val title: String? = null,
    @ProtoId(5) @JvmField val content: String? = null,
    @ProtoId(6) @JvmField val attachments: List<RewardSlot> = emptyList(),
    @ProtoId(7) @JvmField val create_time: Int = 0,
    @ProtoId(8) @JvmField val expire_time: Int = 0,
    @ProtoId(9) @JvmField val reference_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Mail", encode())
}

@Serializable data class AchievementProgress (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val counter: Int = 0,
    @ProtoId(3) @JvmField val achieved: Boolean = false,
    @ProtoId(4) @JvmField val date: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AchievementProgress", encode())
}

@Serializable data class AccountStatisticByGameMode (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountStatisticByGameMode", encode())

    @Serializable data class RoundEndData (
        @ProtoId(1) @JvmField val type: Int = 0,
        @ProtoId(2) @JvmField val sum: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RoundEndData", encode())
    }


    @Serializable data class RankScore (
        @ProtoId(1) @JvmField val rank: Int = 0,
        @ProtoId(2) @JvmField val score_sum: Int = 0,
        @ProtoId(3) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RankScore", encode())
    }

}

@Serializable data class AccountStatisticByFan (
    @ProtoId(1) @JvmField val fan_id: Int = 0,
    @ProtoId(2) @JvmField val sum: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountStatisticByFan", encode())
}

@Serializable data class AccountFanAchieved (
    @ProtoId(1) @JvmField val mahjong_category: Int = 0,
    @ProtoId(2) @JvmField val fan: List<AccountStatisticByFan> = emptyList(),
    @ProtoId(3) @JvmField val liujumanguan: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountFanAchieved", encode())
}

@Serializable data class AccountDetailStatistic (
    @ProtoId(1) @JvmField val game_mode: List<AccountStatisticByGameMode> = emptyList(),
    @ProtoId(2) @JvmField val fan: List<AccountStatisticByFan> = emptyList(),
    @ProtoId(3) @JvmField val liujumanguan: Int = 0,
    @ProtoId(4) @JvmField val fan_achieved: List<AccountFanAchieved> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountDetailStatistic", encode())
}

@Serializable data class AccountDetailStatisticByCategory (
    @ProtoId(1) @JvmField val category: Int = 0,
    @ProtoId(2) @JvmField val detail_statistic: AccountDetailStatistic? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountDetailStatisticByCategory", encode())
}

@Serializable data class AccountDetailStatisticV2 (
    @ProtoId(1) @JvmField val friend_room_statistic: AccountDetailStatistic? = null,
    @ProtoId(2) @JvmField val rank_statistic: RankStatistic? = null,
    @ProtoId(3) @JvmField val customized_contest_statistic: CustomizedContestStatistic? = null,
    @ProtoId(4) @JvmField val leisure_match_statistic: AccountDetailStatistic? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountDetailStatisticV2", encode())

    @Serializable data class RankStatistic (
        @ProtoId(1) @JvmField val total_statistic: RankData? = null,
        @ProtoId(2) @JvmField val month_statistic: RankData? = null,
        @ProtoId(3) @JvmField val month_refresh_time: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RankStatistic", encode())

        @Serializable data class RankData (
            @ProtoId(1) @JvmField val all_level_statistic: AccountDetailStatistic? = null,
            @ProtoId(2) @JvmField val level_data_list: List<RankLevelData> = emptyList()
        ) : IProtoMessage {
            override fun encode() = ProtoBuf.dump(serializer(), this)
            override fun wrap() = Wrapper(".lq.RankData", encode())

            @Serializable data class RankLevelData (
                @ProtoId(1) @JvmField val rank_level: Int = 0,
                @ProtoId(2) @JvmField val statistic: AccountDetailStatistic? = null
            ) : IProtoMessage {
                override fun encode() = ProtoBuf.dump(serializer(), this)
                override fun wrap() = Wrapper(".lq.RankLevelData", encode())
            }

        }

    }


    @Serializable data class CustomizedContestStatistic (
        @ProtoId(1) @JvmField val total_statistic: AccountDetailStatistic? = null,
        @ProtoId(2) @JvmField val month_statistic: AccountDetailStatistic? = null,
        @ProtoId(3) @JvmField val month_refresh_time: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.CustomizedContestStatistic", encode())
    }

}

@Serializable data class AccountShiLian (
    @ProtoId(1) @JvmField val step: Int = 0,
    @ProtoId(2) @JvmField val state: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountShiLian", encode())
}

@Serializable data class ClientDeviceInfo (
    @ProtoId(1) @JvmField val device_type: String? = null,
    @ProtoId(2) @JvmField val os: String? = null,
    @ProtoId(3) @JvmField val os_version: String? = null,
    @ProtoId(4) @JvmField val browser: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ClientDeviceInfo", encode())
}

@Serializable class GamePlayerState () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GamePlayerState", encode())
}

@Serializable data class Announcement (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val title: String? = null,
    @ProtoId(3) @JvmField val content: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Announcement", encode())
}

@Serializable data class TaskProgress (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val counter: Int = 0,
    @ProtoId(3) @JvmField val achieved: Boolean = false,
    @ProtoId(4) @JvmField val rewarded: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.TaskProgress", encode())
}

@Serializable data class GameConfig (
    @ProtoId(1) @JvmField val category: Int = 0,
    @ProtoId(2) @JvmField val mode: GameMode? = null,
    @ProtoId(3) @JvmField val meta: GameMetaData? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameConfig", encode())
}

@Serializable data class AccountActiveState (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val login_time: Int = 0,
    @ProtoId(3) @JvmField val logout_time: Int = 0,
    @ProtoId(4) @JvmField val is_online: Boolean = false,
    @ProtoId(5) @JvmField val playing: AccountPlayingGame? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountActiveState", encode())
}

@Serializable data class Friend (
    @ProtoId(1) @JvmField val base: PlayerBaseView? = null,
    @ProtoId(2) @JvmField val state: AccountActiveState? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Friend", encode())
}

@Serializable data class GameLiveUnit (
    @ProtoId(1) @JvmField val timestamp: Int = 0,
    @ProtoId(2) @JvmField val action_category: Int = 0,
    @ProtoId(3) @JvmField val action_data: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameLiveUnit", encode())
}

@Serializable data class GameLiveSegment (
    @ProtoId(1) @JvmField val actions: List<GameLiveUnit> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameLiveSegment", encode())
}

@Serializable data class GameLiveSegmentUri (
    @ProtoId(1) @JvmField val segment_id: Int = 0,
    @ProtoId(2) @JvmField val segment_uri: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameLiveSegmentUri", encode())
}

@Serializable data class GameLiveHead (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val game_config: GameConfig? = null,
    @ProtoId(4) @JvmField val players: List<PlayerGameView> = emptyList(),
    @ProtoId(5) @JvmField val seat_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameLiveHead", encode())
}

@Serializable data class GameNewRoundState (
    @ProtoId(1) @JvmField val seat_states: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameNewRoundState", encode())
}

@Serializable data class GameEndAction (
    @ProtoId(1) @JvmField val state: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameEndAction", encode())
}

@Serializable class GameNoopAction () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameNoopAction", encode())
}

@Serializable data class CommentItem (
    @ProtoId(1) @JvmField val comment_id: Int = 0,
    @ProtoId(2) @JvmField val timestamp: Int = 0,
    @ProtoId(3) @JvmField val commenter: PlayerBaseView? = null,
    @ProtoId(4) @JvmField val content: String? = null,
    @ProtoId(5) @JvmField val is_banned: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CommentItem", encode())
}

@Serializable data class RollingNotice (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0,
    @ProtoId(5) @JvmField val repeat_interval: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RollingNotice", encode())
}

@Serializable data class BillingGoods (
    @ProtoId(1) @JvmField val id: String? = null,
    @ProtoId(2) @JvmField val name: String? = null,
    @ProtoId(3) @JvmField val desc: String? = null,
    @ProtoId(4) @JvmField val icon: String? = null,
    @ProtoId(5) @JvmField val resource_id: Int = 0,
    @ProtoId(6) @JvmField val resource_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.BillingGoods", encode())
}

@Serializable data class BillShortcut (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val dealPrice: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.BillShortcut", encode())
}

@Serializable data class BillingProduct (
    @ProtoId(1) @JvmField val goods: BillingGoods? = null,
    @ProtoId(2) @JvmField val currency_code: String? = null,
    @ProtoId(3) @JvmField val currency_price: Int = 0,
    @ProtoId(4) @JvmField val sort_weight: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.BillingProduct", encode())
}

@Serializable data class Character (
    @ProtoId(1) @JvmField val charid: Int = 0,
    @ProtoId(2) @JvmField val level: Int = 0,
    @ProtoId(3) @JvmField val exp: Int = 0,
    @ProtoId(4) @JvmField val views: List<ViewSlot> = emptyList(),
    @ProtoId(5) @JvmField val skin: Int = 0,
    @ProtoId(6) @JvmField val is_upgraded: Boolean = false,
    @ProtoId(7) @JvmField val extra_emoji: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Character", encode())
}

@Serializable data class BuyRecord (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.BuyRecord", encode())
}

@Serializable data class ZHPShop (
    @ProtoId(1) @JvmField val goods: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val buy_records: List<BuyRecord> = emptyList(),
    @ProtoId(3) @JvmField val free_refresh: RefreshCount? = null,
    @ProtoId(4) @JvmField val cost_refresh: RefreshCount? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ZHPShop", encode())

    @Serializable data class RefreshCount (
        @ProtoId(1) @JvmField val count: Int = 0,
        @ProtoId(2) @JvmField val limit: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RefreshCount", encode())
    }

}

@Serializable data class MonthTicketInfo (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val end_time: Int = 0,
    @ProtoId(3) @JvmField val last_pay_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.MonthTicketInfo", encode())
}

@Serializable data class ShopInfo (
    @ProtoId(1) @JvmField val zhp: ZHPShop? = null,
    @ProtoId(2) @JvmField val buy_records: List<BuyRecord> = emptyList(),
    @ProtoId(3) @JvmField val last_refresh_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ShopInfo", encode())
}

@Serializable data class ChangeNicknameRecord (
    @ProtoId(1) @JvmField val from: String? = null,
    @ProtoId(2) @JvmField val to: String? = null,
    @ProtoId(3) @JvmField val time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ChangeNicknameRecord", encode())
}

@Serializable data class ServerSettings (
    @ProtoId(3) @JvmField val payment_setting: PaymentSetting? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ServerSettings", encode())
}

@Serializable data class PaymentSetting (
    @ProtoId(1) @JvmField val open_payment: Int = 0,
    @ProtoId(2) @JvmField val payment_info_show_type: Int = 0,
    @ProtoId(3) @JvmField val payment_info: String? = null,
    @ProtoId(4) @JvmField val wechat: WechatData? = null,
    @ProtoId(5) @JvmField val alipay: AlipayData? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.PaymentSetting", encode())

    @Serializable data class WechatData (
        @ProtoId(1) @JvmField val disable_create: Boolean = false,
        @ProtoId(2) @JvmField val payment_source_platform: Int = 0,
        @ProtoId(3) @JvmField val enable_credit: Boolean = false
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.WechatData", encode())
    }


    @Serializable data class AlipayData (
        @ProtoId(1) @JvmField val disable_create: Boolean = false,
        @ProtoId(2) @JvmField val payment_source_platform: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.AlipayData", encode())
    }

}

@Serializable data class AccountSetting (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.AccountSetting", encode())
}

@Serializable data class ChestData (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val face_black_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ChestData", encode())
}

@Serializable data class ChestDataV2 (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val face_black_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ChestDataV2", encode())
}

@Serializable data class FaithData (
    @ProtoId(1) @JvmField val faith_id: Int = 0,
    @ProtoId(2) @JvmField val total_open_count: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val modify_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.FaithData", encode())
}

@Serializable data class CustomizedContestBase (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestBase", encode())
}

@Serializable data class CustomizedContestExtend (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val public_notice: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestExtend", encode())
}

@Serializable data class CustomizedContestAbstract (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestAbstract", encode())
}

@Serializable data class CustomizedContestDetail (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestDetail", encode())
}

@Serializable data class CustomizedContestPlayerReport (
    @ProtoId(1) @JvmField val rank_rule: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val point: Int = 0,
    @ProtoId(4) @JvmField val game_ranks: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val total_game_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestPlayerReport", encode())
}

@Serializable data class RecordGame (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val end_time: Int = 0,
    @ProtoId(5) @JvmField val config: GameConfig? = null,
    @ProtoId(11) @JvmField val accounts: List<AccountInfo> = emptyList(),
    @ProtoId(12) @JvmField val result: GameEndResult? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordGame", encode())

    @Serializable data class AccountInfo (
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
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.AccountInfo", encode())
    }

}

@Serializable data class CustomizedContestGameStart (
    @ProtoId(1) @JvmField val players: List<Item> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestGameStart", encode())

    @Serializable data class Item (
        @ProtoId(1) @JvmField val account_id: Int = 0,
        @ProtoId(2) @JvmField val nickname: String? = null
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Item", encode())
    }

}

@Serializable data class CustomizedContestGameEnd (
    @ProtoId(1) @JvmField val players: List<Item> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.CustomizedContestGameEnd", encode())

    @Serializable data class Item (
        @ProtoId(1) @JvmField val account_id: Int = 0,
        @ProtoId(2) @JvmField val nickname: String? = null,
        @ProtoId(3) @JvmField val total_point: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Item", encode())
    }

}

@Serializable data class Activity (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val end_time: Int = 0,
    @ProtoId(4) @JvmField val type: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.Activity", encode())
}

@Serializable data class ExchangeRecord (
    @ProtoId(1) @JvmField val exchange_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ExchangeRecord", encode())
}

@Serializable data class ActivityAccumulatedPointData (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0,
    @ProtoId(3) @JvmField val gained_reward_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActivityAccumulatedPointData", encode())
}

@Serializable data class ActivityRankPointData (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val point: Int = 0,
    @ProtoId(3) @JvmField val gained_reward: Boolean = false,
    @ProtoId(4) @JvmField val gainable_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActivityRankPointData", encode())
}

@Serializable data class GameRoundHuData (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameRoundHuData", encode())

    @Serializable data class HuPai (
        @ProtoId(1) @JvmField val tile: String? = null,
        @ProtoId(2) @JvmField val seat: Int = 0,
        @ProtoId(3) @JvmField val liqi: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.HuPai", encode())
    }


    @Serializable data class Fan (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0,
        @ProtoId(3) @JvmField val fan: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Fan", encode())
    }

}

@Serializable data class GameRoundPlayerResult (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val hands: String? = null,
    @ProtoId(3) @JvmField val ming: String? = null,
    @ProtoId(4) @JvmField val liqi_type: Int = 0,
    @ProtoId(5) @JvmField val is_fulu: Boolean = false,
    @ProtoId(6) @JvmField val is_liujumanguan: Boolean = false,
    @ProtoId(7) @JvmField val lian_zhuang: Int = 0,
    @ProtoId(8) @JvmField val hu: GameRoundHuData? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameRoundPlayerResult", encode())
}

@Serializable data class GameRoundPlayer (
    @ProtoId(1) @JvmField val score: Int = 0,
    @ProtoId(2) @JvmField val rank: Int = 0,
    @ProtoId(3) @JvmField val result: GameRoundPlayerResult? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameRoundPlayer", encode())
}

@Serializable data class GameRoundSnapshot (
    @ProtoId(1) @JvmField val ju: Int = 0,
    @ProtoId(2) @JvmField val ben: Int = 0,
    @ProtoId(3) @JvmField val players: List<GameRoundPlayer> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameRoundSnapshot", encode())
}

@Serializable data class GameFinalSnapshot (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameFinalSnapshot", encode())

    @Serializable data class CalculateParam (
        @ProtoId(1) @JvmField val init_point: Int = 0,
        @ProtoId(2) @JvmField val jingsuanyuandian: Int = 0,
        @ProtoId(3) @JvmField val rank_points: List<Int> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.CalculateParam", encode())
    }


    @Serializable data class GameSeat (
        @ProtoId(1) @JvmField val type: Int = 0,
        @ProtoId(2) @JvmField val account_id: Int = 0,
        @ProtoId(3) @JvmField val notify_endpoint: NetworkEndpoint? = null,
        @ProtoId(4) @JvmField val client_address: String? = null,
        @ProtoId(5) @JvmField val is_connected: Boolean = false
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.GameSeat", encode())
    }


    @Serializable data class FinalPlayer (
        @ProtoId(1) @JvmField val seat: Int = 0,
        @ProtoId(2) @JvmField val total_point: Int = 0,
        @ProtoId(3) @JvmField val part_point_1: Int = 0,
        @ProtoId(4) @JvmField val part_point_2: Int = 0,
        @ProtoId(5) @JvmField val grading_score: Int = 0,
        @ProtoId(6) @JvmField val gold: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.FinalPlayer", encode())
    }


    @Serializable data class AFKInfo (
        @ProtoId(1) @JvmField val deal_tile_count: Int = 0,
        @ProtoId(2) @JvmField val moqie_count: Int = 0,
        @ProtoId(3) @JvmField val seat: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.AFKInfo", encode())
    }

}

@Serializable data class RecordCollectedData (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordCollectedData", encode())
}

@Serializable data class ContestDetailRule (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ContestDetailRule", encode())
}

@Serializable data class ContestDetailRuleV2 (
    @ProtoId(1) @JvmField val game_rule: ContestDetailRule? = null,
    @ProtoId(2) @JvmField val extra_rule: ExtraRule? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ContestDetailRuleV2", encode())

    @Serializable data class ExtraRule (
        @ProtoId(1) @JvmField val required_level: Int = 0,
        @ProtoId(2) @JvmField val max_game_count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ExtraRule", encode())
    }

}

@Serializable data class GameRuleSetting (
    @ProtoId(1) @JvmField val round_type: Int = 0,
    @ProtoId(2) @JvmField val shiduan: Boolean = false,
    @ProtoId(3) @JvmField val dora_count: Int = 0,
    @ProtoId(4) @JvmField val thinking_type: Int = 0,
    @ProtoId(5) @JvmField val use_detail_rule: Boolean = false,
    @ProtoId(6) @JvmField val detail_rule_v2: ContestDetailRuleV2? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameRuleSetting", encode())
}

class Lobby {
    object FetchConnectionInfo: IProtoRpc<ReqCommon, ResConnectionInfo>(".lq.Lobby.fetchConnectionInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object Signup: IProtoRpc<ReqSignupAccount, ResSignupAccount>(".lq.Lobby.signup") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSignupAccount.serializer(), data)
    }
    object Login: IProtoRpc<ReqLogin, ResLogin>(".lq.Lobby.login") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqLogin.serializer(), data)
    }
    object EmailLogin: IProtoRpc<ReqEmailLogin, ResLogin>(".lq.Lobby.emailLogin") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqEmailLogin.serializer(), data)
    }
    object Oauth2Auth: IProtoRpc<ReqOauth2Auth, ResOauth2Auth>(".lq.Lobby.oauth2Auth") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOauth2Auth.serializer(), data)
    }
    object Oauth2Check: IProtoRpc<ReqOauth2Check, ResOauth2Check>(".lq.Lobby.oauth2Check") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOauth2Check.serializer(), data)
    }
    object Oauth2Signup: IProtoRpc<ReqOauth2Signup, ResOauth2Signup>(".lq.Lobby.oauth2Signup") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOauth2Signup.serializer(), data)
    }
    object Oauth2Login: IProtoRpc<ReqOauth2Login, ResLogin>(".lq.Lobby.oauth2Login") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOauth2Login.serializer(), data)
    }
    object DmmPreLogin: IProtoRpc<ReqDMMPreLogin, ResDMMPreLogin>(".lq.Lobby.dmmPreLogin") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqDMMPreLogin.serializer(), data)
    }
    object CreatePhoneVerifyCode: IProtoRpc<ReqCreatePhoneVerifyCode, ResCommon>(".lq.Lobby.createPhoneVerifyCode") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreatePhoneVerifyCode.serializer(), data)
    }
    object CreateEmailVerifyCode: IProtoRpc<ReqCreateEmailVerifyCode, ResCommon>(".lq.Lobby.createEmailVerifyCode") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateEmailVerifyCode.serializer(), data)
    }
    object VerfifyCodeForSecure: IProtoRpc<ReqVerifyCodeForSecure, ResVerfiyCodeForSecure>(".lq.Lobby.verfifyCodeForSecure") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqVerifyCodeForSecure.serializer(), data)
    }
    object BindPhoneNumber: IProtoRpc<ReqBindPhoneNumber, ResCommon>(".lq.Lobby.bindPhoneNumber") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBindPhoneNumber.serializer(), data)
    }
    object UnbindPhoneNumber: IProtoRpc<ReqUnbindPhoneNumber, ResCommon>(".lq.Lobby.unbindPhoneNumber") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUnbindPhoneNumber.serializer(), data)
    }
    object FetchPhoneLoginBind: IProtoRpc<ReqCommon, ResFetchPhoneLoginBind>(".lq.Lobby.fetchPhoneLoginBind") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object CreatePhoneLoginBind: IProtoRpc<ReqCreatePhoneLoginBind, ResCommon>(".lq.Lobby.createPhoneLoginBind") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreatePhoneLoginBind.serializer(), data)
    }
    object BindEmail: IProtoRpc<ReqBindEmail, ResCommon>(".lq.Lobby.bindEmail") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBindEmail.serializer(), data)
    }
    object ModifyPassword: IProtoRpc<ReqModifyPassword, ResCommon>(".lq.Lobby.modifyPassword") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqModifyPassword.serializer(), data)
    }
    object BindAccount: IProtoRpc<ReqBindAccount, ResCommon>(".lq.Lobby.bindAccount") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBindAccount.serializer(), data)
    }
    object Logout: IProtoRpc<ReqLogout, ResLogout>(".lq.Lobby.logout") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqLogout.serializer(), data)
    }
    object Heatbeat: IProtoRpc<ReqHeatBeat, ResCommon>(".lq.Lobby.heatbeat") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqHeatBeat.serializer(), data)
    }
    object LoginBeat: IProtoRpc<ReqLoginBeat, ResCommon>(".lq.Lobby.loginBeat") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqLoginBeat.serializer(), data)
    }
    object CreateNickname: IProtoRpc<ReqCreateNickname, ResCommon>(".lq.Lobby.createNickname") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateNickname.serializer(), data)
    }
    object ModifyNickname: IProtoRpc<ReqModifyNickname, ResCommon>(".lq.Lobby.modifyNickname") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqModifyNickname.serializer(), data)
    }
    object ModifyBirthday: IProtoRpc<ReqModifyBirthday, ResCommon>(".lq.Lobby.modifyBirthday") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqModifyBirthday.serializer(), data)
    }
    object FetchRoom: IProtoRpc<ReqCommon, ResSelfRoom>(".lq.Lobby.fetchRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object CreateRoom: IProtoRpc<ReqCreateRoom, ResCreateRoom>(".lq.Lobby.createRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateRoom.serializer(), data)
    }
    object JoinRoom: IProtoRpc<ReqJoinRoom, ResJoinRoom>(".lq.Lobby.joinRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqJoinRoom.serializer(), data)
    }
    object LeaveRoom: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.leaveRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ReadyPlay: IProtoRpc<ReqRoomReady, ResCommon>(".lq.Lobby.readyPlay") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRoomReady.serializer(), data)
    }
    object DressingStatus: IProtoRpc<ReqRoomDressing, ResCommon>(".lq.Lobby.dressingStatus") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRoomDressing.serializer(), data)
    }
    object StartRoom: IProtoRpc<ReqRoomStart, ResCommon>(".lq.Lobby.startRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRoomStart.serializer(), data)
    }
    object KickPlayer: IProtoRpc<ReqRoomKick, ResCommon>(".lq.Lobby.kickPlayer") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRoomKick.serializer(), data)
    }
    object ModifyRoom: IProtoRpc<ReqModifyRoom, ResCommon>(".lq.Lobby.modifyRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqModifyRoom.serializer(), data)
    }
    object MatchGame: IProtoRpc<ReqJoinMatchQueue, ResCommon>(".lq.Lobby.matchGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqJoinMatchQueue.serializer(), data)
    }
    object CancelMatch: IProtoRpc<ReqCancelMatchQueue, ResCommon>(".lq.Lobby.cancelMatch") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCancelMatchQueue.serializer(), data)
    }
    object FetchAccountInfo: IProtoRpc<ReqAccountInfo, ResAccountInfo>(".lq.Lobby.fetchAccountInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqAccountInfo.serializer(), data)
    }
    object ChangeAvatar: IProtoRpc<ReqChangeAvatar, ResCommon>(".lq.Lobby.changeAvatar") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChangeAvatar.serializer(), data)
    }
    object FetchAccountStatisticInfo: IProtoRpc<ReqAccountStatisticInfo, ResAccountStatisticInfo>(".lq.Lobby.fetchAccountStatisticInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqAccountStatisticInfo.serializer(), data)
    }
    object FetchAccountCharacterInfo: IProtoRpc<ReqCommon, ResAccountCharacterInfo>(".lq.Lobby.fetchAccountCharacterInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ShopPurchase: IProtoRpc<ReqShopPurchase, ResShopPurchase>(".lq.Lobby.shopPurchase") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqShopPurchase.serializer(), data)
    }
    object FetchGameRecord: IProtoRpc<ReqGameRecord, ResGameRecord>(".lq.Lobby.fetchGameRecord") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGameRecord.serializer(), data)
    }
    object FetchGameRecordList: IProtoRpc<ReqGameRecordList, ResGameRecordList>(".lq.Lobby.fetchGameRecordList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGameRecordList.serializer(), data)
    }
    object FetchCollectedGameRecordList: IProtoRpc<ReqCommon, ResCollectedGameRecordList>(".lq.Lobby.fetchCollectedGameRecordList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchGameRecordsDetail: IProtoRpc<ReqGameRecordsDetail, ResGameRecordsDetail>(".lq.Lobby.fetchGameRecordsDetail") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGameRecordsDetail.serializer(), data)
    }
    object AddCollectedGameRecord: IProtoRpc<ReqAddCollectedGameRecord, ResAddCollectedGameRecord>(".lq.Lobby.addCollectedGameRecord") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqAddCollectedGameRecord.serializer(), data)
    }
    object RemoveCollectedGameRecord: IProtoRpc<ReqRemoveCollectedGameRecord, ResRemoveCollectedGameRecord>(".lq.Lobby.removeCollectedGameRecord") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRemoveCollectedGameRecord.serializer(), data)
    }
    object ChangeCollectedGameRecordRemarks: IProtoRpc<ReqChangeCollectedGameRecordRemarks, ResChangeCollectedGameRecordRemarks>(".lq.Lobby.changeCollectedGameRecordRemarks") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChangeCollectedGameRecordRemarks.serializer(), data)
    }
    object FetchLevelLeaderboard: IProtoRpc<ReqLevelLeaderboard, ResLevelLeaderboard>(".lq.Lobby.fetchLevelLeaderboard") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqLevelLeaderboard.serializer(), data)
    }
    object FetchMultiAccountBrief: IProtoRpc<ReqMultiAccountId, ResMultiAccountBrief>(".lq.Lobby.fetchMultiAccountBrief") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqMultiAccountId.serializer(), data)
    }
    object FetchFriendList: IProtoRpc<ReqCommon, ResFriendList>(".lq.Lobby.fetchFriendList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchFriendApplyList: IProtoRpc<ReqCommon, ResFriendApplyList>(".lq.Lobby.fetchFriendApplyList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ApplyFriend: IProtoRpc<ReqApplyFriend, ResCommon>(".lq.Lobby.applyFriend") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqApplyFriend.serializer(), data)
    }
    object HandleFriendApply: IProtoRpc<ReqHandleFriendApply, ResCommon>(".lq.Lobby.handleFriendApply") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqHandleFriendApply.serializer(), data)
    }
    object RemoveFriend: IProtoRpc<ReqRemoveFriend, ResCommon>(".lq.Lobby.removeFriend") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRemoveFriend.serializer(), data)
    }
    object SearchAccountById: IProtoRpc<ReqSearchAccountById, ResSearchAccountById>(".lq.Lobby.searchAccountById") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSearchAccountById.serializer(), data)
    }
    object SearchAccountByPattern: IProtoRpc<ReqSearchAccountByPattern, ResSearchAccountByPattern>(".lq.Lobby.searchAccountByPattern") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSearchAccountByPattern.serializer(), data)
    }
    object FetchAccountState: IProtoRpc<ReqAccountList, ResAccountStates>(".lq.Lobby.fetchAccountState") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqAccountList.serializer(), data)
    }
    object FetchBagInfo: IProtoRpc<ReqCommon, ResBagInfo>(".lq.Lobby.fetchBagInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UseBagItem: IProtoRpc<ReqUseBagItem, ResCommon>(".lq.Lobby.useBagItem") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUseBagItem.serializer(), data)
    }
    object OpenManualItem: IProtoRpc<ReqOpenManualItem, ResCommon>(".lq.Lobby.openManualItem") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOpenManualItem.serializer(), data)
    }
    object OpenRandomRewardItem: IProtoRpc<ReqOpenRandomRewardItem, ResOpenRandomRewardItem>(".lq.Lobby.openRandomRewardItem") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOpenRandomRewardItem.serializer(), data)
    }
    object ComposeShard: IProtoRpc<ReqComposeShard, ResCommon>(".lq.Lobby.composeShard") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqComposeShard.serializer(), data)
    }
    object FetchAnnouncement: IProtoRpc<ReqCommon, ResAnnouncement>(".lq.Lobby.fetchAnnouncement") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ReadAnnouncement: IProtoRpc<ReqReadAnnouncement, ResCommon>(".lq.Lobby.readAnnouncement") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqReadAnnouncement.serializer(), data)
    }
    object FetchMailInfo: IProtoRpc<ReqCommon, ResMailInfo>(".lq.Lobby.fetchMailInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ReadMail: IProtoRpc<ReqReadMail, ResCommon>(".lq.Lobby.readMail") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqReadMail.serializer(), data)
    }
    object DeleteMail: IProtoRpc<ReqDeleteMail, ResCommon>(".lq.Lobby.deleteMail") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqDeleteMail.serializer(), data)
    }
    object TakeAttachmentFromMail: IProtoRpc<ReqTakeAttachment, ResCommon>(".lq.Lobby.takeAttachmentFromMail") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqTakeAttachment.serializer(), data)
    }
    object FetchAchievement: IProtoRpc<ReqCommon, ResAchievement>(".lq.Lobby.fetchAchievement") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object BuyShiLian: IProtoRpc<ReqBuyShiLian, ResCommon>(".lq.Lobby.buyShiLian") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBuyShiLian.serializer(), data)
    }
    object MatchShiLian: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.matchShiLian") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object GoNextShiLian: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.goNextShiLian") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UpdateClientValue: IProtoRpc<ReqUpdateClientValue, ResCommon>(".lq.Lobby.updateClientValue") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUpdateClientValue.serializer(), data)
    }
    object FetchClientValue: IProtoRpc<ReqCommon, ResClientValue>(".lq.Lobby.fetchClientValue") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ClientMessage: IProtoRpc<ReqClientMessage, ResCommon>(".lq.Lobby.clientMessage") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqClientMessage.serializer(), data)
    }
    object FetchCurrentMatchInfo: IProtoRpc<ReqCurrentMatchInfo, ResCurrentMatchInfo>(".lq.Lobby.fetchCurrentMatchInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCurrentMatchInfo.serializer(), data)
    }
    object UserComplain: IProtoRpc<ReqUserComplain, ResCommon>(".lq.Lobby.userComplain") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUserComplain.serializer(), data)
    }
    object FetchReviveCoinInfo: IProtoRpc<ReqCommon, ResReviveCoinInfo>(".lq.Lobby.fetchReviveCoinInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object GainReviveCoin: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.gainReviveCoin") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchDailyTask: IProtoRpc<ReqCommon, ResDailyTask>(".lq.Lobby.fetchDailyTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object RefreshDailyTask: IProtoRpc<ReqRefreshDailyTask, ResRefreshDailyTask>(".lq.Lobby.refreshDailyTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRefreshDailyTask.serializer(), data)
    }
    object UseGiftCode: IProtoRpc<ReqUseGiftCode, ResUseGiftCode>(".lq.Lobby.useGiftCode") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUseGiftCode.serializer(), data)
    }
    object FetchTitleList: IProtoRpc<ReqCommon, ResTitleList>(".lq.Lobby.fetchTitleList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UseTitle: IProtoRpc<ReqUseTitle, ResCommon>(".lq.Lobby.useTitle") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUseTitle.serializer(), data)
    }
    object SendClientMessage: IProtoRpc<ReqSendClientMessage, ResCommon>(".lq.Lobby.sendClientMessage") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSendClientMessage.serializer(), data)
    }
    object FetchGameLiveInfo: IProtoRpc<ReqGameLiveInfo, ResGameLiveInfo>(".lq.Lobby.fetchGameLiveInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGameLiveInfo.serializer(), data)
    }
    object FetchGameLiveLeftSegment: IProtoRpc<ReqGameLiveLeftSegment, ResGameLiveLeftSegment>(".lq.Lobby.fetchGameLiveLeftSegment") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGameLiveLeftSegment.serializer(), data)
    }
    object FetchGameLiveList: IProtoRpc<ReqGameLiveList, ResGameLiveList>(".lq.Lobby.fetchGameLiveList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGameLiveList.serializer(), data)
    }
    object FetchCommentSetting: IProtoRpc<ReqCommon, ResCommentSetting>(".lq.Lobby.fetchCommentSetting") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UpdateCommentSetting: IProtoRpc<ReqUpdateCommentSetting, ResCommon>(".lq.Lobby.updateCommentSetting") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUpdateCommentSetting.serializer(), data)
    }
    object FetchCommentList: IProtoRpc<ReqFetchCommentList, ResFetchCommentList>(".lq.Lobby.fetchCommentList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCommentList.serializer(), data)
    }
    object FetchCommentContent: IProtoRpc<ReqFetchCommentContent, ResFetchCommentContent>(".lq.Lobby.fetchCommentContent") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCommentContent.serializer(), data)
    }
    object LeaveComment: IProtoRpc<ReqLeaveComment, ResCommon>(".lq.Lobby.leaveComment") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqLeaveComment.serializer(), data)
    }
    object DeleteComment: IProtoRpc<ReqDeleteComment, ResCommon>(".lq.Lobby.deleteComment") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqDeleteComment.serializer(), data)
    }
    object UpdateReadComment: IProtoRpc<ReqUpdateReadComment, ResCommon>(".lq.Lobby.updateReadComment") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUpdateReadComment.serializer(), data)
    }
    object FetchRollingNotice: IProtoRpc<ReqCommon, ReqRollingNotice>(".lq.Lobby.fetchRollingNotice") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchServerTime: IProtoRpc<ReqCommon, ResServerTime>(".lq.Lobby.fetchServerTime") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchPlatformProducts: IProtoRpc<ReqPlatformBillingProducts, ResPlatformBillingProducts>(".lq.Lobby.fetchPlatformProducts") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqPlatformBillingProducts.serializer(), data)
    }
    object CancelGooglePlayOrder: IProtoRpc<ReqCancelGooglePlayOrder, ResCommon>(".lq.Lobby.cancelGooglePlayOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCancelGooglePlayOrder.serializer(), data)
    }
    object OpenChest: IProtoRpc<ReqOpenChest, ResOpenChest>(".lq.Lobby.openChest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqOpenChest.serializer(), data)
    }
    object BuyFromChestShop: IProtoRpc<ReqBuyFromChestShop, ResBuyFromChestShop>(".lq.Lobby.buyFromChestShop") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBuyFromChestShop.serializer(), data)
    }
    object FetchDailySignInInfo: IProtoRpc<ReqCommon, ResDailySignInInfo>(".lq.Lobby.fetchDailySignInInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object DoDailySignIn: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.doDailySignIn") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object DoActivitySignIn: IProtoRpc<ReqDoActivitySignIn, ResDoActivitySignIn>(".lq.Lobby.doActivitySignIn") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqDoActivitySignIn.serializer(), data)
    }
    object FetchCharacterInfo: IProtoRpc<ReqCommon, ResCharacterInfo>(".lq.Lobby.fetchCharacterInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ChangeMainCharacter: IProtoRpc<ReqChangeMainCharacter, ResCommon>(".lq.Lobby.changeMainCharacter") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChangeMainCharacter.serializer(), data)
    }
    object ChangeCharacterSkin: IProtoRpc<ReqChangeCharacterSkin, ResCommon>(".lq.Lobby.changeCharacterSkin") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChangeCharacterSkin.serializer(), data)
    }
    object ChangeCharacterView: IProtoRpc<ReqChangeCharacterView, ResCommon>(".lq.Lobby.changeCharacterView") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChangeCharacterView.serializer(), data)
    }
    object SendGiftToCharacter: IProtoRpc<ReqSendGiftToCharacter, ResSendGiftToCharacter>(".lq.Lobby.sendGiftToCharacter") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSendGiftToCharacter.serializer(), data)
    }
    object SellItem: IProtoRpc<ReqSellItem, ResCommon>(".lq.Lobby.sellItem") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSellItem.serializer(), data)
    }
    object FetchCommonView: IProtoRpc<ReqCommon, ResCommonView>(".lq.Lobby.fetchCommonView") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ChangeCommonView: IProtoRpc<ReqChangeCommonView, ResCommon>(".lq.Lobby.changeCommonView") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChangeCommonView.serializer(), data)
    }
    object SaveCommonViews: IProtoRpc<ReqSaveCommonViews, ResCommon>(".lq.Lobby.saveCommonViews") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSaveCommonViews.serializer(), data)
    }
    object FetchCommonViews: IProtoRpc<ReqCommonViews, ResCommonViews>(".lq.Lobby.fetchCommonViews") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommonViews.serializer(), data)
    }
    object FetchAllCommonViews: IProtoRpc<ReqCommon, ResAllcommonViews>(".lq.Lobby.fetchAllCommonViews") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UseCommonView: IProtoRpc<ReqUseCommonView, ResCommon>(".lq.Lobby.useCommonView") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUseCommonView.serializer(), data)
    }
    object UpgradeCharacter: IProtoRpc<ReqUpgradeCharacter, ResUpgradeCharacter>(".lq.Lobby.upgradeCharacter") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUpgradeCharacter.serializer(), data)
    }
    object AddFinishedEnding: IProtoRpc<ReqFinishedEnding, ResCommon>(".lq.Lobby.addFinishedEnding") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFinishedEnding.serializer(), data)
    }
    object ReceiveEndingReward: IProtoRpc<ReqFinishedEnding, ResCommon>(".lq.Lobby.receiveEndingReward") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFinishedEnding.serializer(), data)
    }
    object GameMasterCommand: IProtoRpc<ReqGMCommand, ResCommon>(".lq.Lobby.gameMasterCommand") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGMCommand.serializer(), data)
    }
    object FetchShopInfo: IProtoRpc<ReqCommon, ResShopInfo>(".lq.Lobby.fetchShopInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object BuyFromShop: IProtoRpc<ReqBuyFromShop, ResBuyFromShop>(".lq.Lobby.buyFromShop") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBuyFromShop.serializer(), data)
    }
    object BuyFromZHP: IProtoRpc<ReqBuyFromZHP, ResCommon>(".lq.Lobby.buyFromZHP") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBuyFromZHP.serializer(), data)
    }
    object RefreshZHPShop: IProtoRpc<ReqReshZHPShop, ResRefreshZHPShop>(".lq.Lobby.refreshZHPShop") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqReshZHPShop.serializer(), data)
    }
    object FetchMonthTicketInfo: IProtoRpc<ReqCommon, ResMonthTicketInfo>(".lq.Lobby.fetchMonthTicketInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object PayMonthTicket: IProtoRpc<ReqPayMonthTicket, ResPayMonthTicket>(".lq.Lobby.payMonthTicket") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqPayMonthTicket.serializer(), data)
    }
    object ExchangeCurrency: IProtoRpc<ReqExchangeCurrency, ResCommon>(".lq.Lobby.exchangeCurrency") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqExchangeCurrency.serializer(), data)
    }
    object ExchangeChestStone: IProtoRpc<ReqExchangeCurrency, ResCommon>(".lq.Lobby.exchangeChestStone") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqExchangeCurrency.serializer(), data)
    }
    object ExchangeDiamond: IProtoRpc<ReqExchangeCurrency, ResCommon>(".lq.Lobby.exchangeDiamond") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqExchangeCurrency.serializer(), data)
    }
    object FetchServerSettings: IProtoRpc<ReqCommon, ResServerSettings>(".lq.Lobby.fetchServerSettings") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchAccountSettings: IProtoRpc<ReqCommon, ResAccountSettings>(".lq.Lobby.fetchAccountSettings") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UpdateAccountSettings: IProtoRpc<ReqUpdateAccountSettings, ResCommon>(".lq.Lobby.updateAccountSettings") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUpdateAccountSettings.serializer(), data)
    }
    object FetchModNicknameTime: IProtoRpc<ReqCommon, ResModNicknameTime>(".lq.Lobby.fetchModNicknameTime") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object CreateWechatNativeOrder: IProtoRpc<ReqCreateWechatNativeOrder, ResCreateWechatNativeOrder>(".lq.Lobby.createWechatNativeOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateWechatNativeOrder.serializer(), data)
    }
    object CreateWechatAppOrder: IProtoRpc<ReqCreateWechatAppOrder, ResCreateWechatAppOrder>(".lq.Lobby.createWechatAppOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateWechatAppOrder.serializer(), data)
    }
    object CreateAlipayOrder: IProtoRpc<ReqCreateAlipayOrder, ResCreateAlipayOrder>(".lq.Lobby.createAlipayOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateAlipayOrder.serializer(), data)
    }
    object CreateAlipayScanOrder: IProtoRpc<ReqCreateAlipayScanOrder, ResCreateAlipayScanOrder>(".lq.Lobby.createAlipayScanOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateAlipayScanOrder.serializer(), data)
    }
    object CreateAlipayAppOrder: IProtoRpc<ReqCreateAlipayAppOrder, ResCreateAlipayAppOrder>(".lq.Lobby.createAlipayAppOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateAlipayAppOrder.serializer(), data)
    }
    object CreateJPCreditCardOrder: IProtoRpc<ReqCreateJPCreditCardOrder, ResCreateJPCreditCardOrder>(".lq.Lobby.createJPCreditCardOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateJPCreditCardOrder.serializer(), data)
    }
    object CreateJPPaypalOrder: IProtoRpc<ReqCreateJPPaypalOrder, ResCreateJPPaypalOrder>(".lq.Lobby.createJPPaypalOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateJPPaypalOrder.serializer(), data)
    }
    object CreateJPAuOrder: IProtoRpc<ReqCreateJPAuOrder, ResCreateJPAuOrder>(".lq.Lobby.createJPAuOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateJPAuOrder.serializer(), data)
    }
    object CreateJPDocomoOrder: IProtoRpc<ReqCreateJPDocomoOrder, ResCreateJPDocomoOrder>(".lq.Lobby.createJPDocomoOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateJPDocomoOrder.serializer(), data)
    }
    object CreateJPWebMoneyOrder: IProtoRpc<ReqCreateJPWebMoneyOrder, ResCreateJPWebMoneyOrder>(".lq.Lobby.createJPWebMoneyOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateJPWebMoneyOrder.serializer(), data)
    }
    object CreateJPSoftbankOrder: IProtoRpc<ReqCreateJPSoftbankOrder, ResCreateJPSoftbankOrder>(".lq.Lobby.createJPSoftbankOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateJPSoftbankOrder.serializer(), data)
    }
    object CreateENPaypalOrder: IProtoRpc<ReqCreateENPaypalOrder, ResCreateENPaypalOrder>(".lq.Lobby.createENPaypalOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateENPaypalOrder.serializer(), data)
    }
    object CreateENMasterCardOrder: IProtoRpc<ReqCreateENMasterCardOrder, ResCreateENMasterCardOrder>(".lq.Lobby.createENMasterCardOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateENMasterCardOrder.serializer(), data)
    }
    object CreateENVisaOrder: IProtoRpc<ReqCreateENVisaOrder, ResCreateENVisaOrder>(".lq.Lobby.createENVisaOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateENVisaOrder.serializer(), data)
    }
    object CreateENJCBOrder: IProtoRpc<ReqCreateENJCBOrder, ResCreateENJCBOrder>(".lq.Lobby.createENJCBOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateENJCBOrder.serializer(), data)
    }
    object CreateENAlipayOrder: IProtoRpc<ReqCreateENAlipayOrder, ResCreateENAlipayOrder>(".lq.Lobby.createENAlipayOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateENAlipayOrder.serializer(), data)
    }
    object CreateDMMOrder: IProtoRpc<ReqCreateDMMOrder, ResCreateDmmOrder>(".lq.Lobby.createDMMOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateDMMOrder.serializer(), data)
    }
    object CreateIAPOrder: IProtoRpc<ReqCreateIAPOrder, ResCreateIAPOrder>(".lq.Lobby.createIAPOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateIAPOrder.serializer(), data)
    }
    object CreateMyCardAndroidOrder: IProtoRpc<ReqCreateMyCardOrder, ResCreateMyCardOrder>(".lq.Lobby.createMyCardAndroidOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateMyCardOrder.serializer(), data)
    }
    object CreateMyCardWebOrder: IProtoRpc<ReqCreateMyCardOrder, ResCreateMyCardOrder>(".lq.Lobby.createMyCardWebOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateMyCardOrder.serializer(), data)
    }
    object VerifyMyCardOrder: IProtoRpc<ReqVerifyMyCardOrder, ResCommon>(".lq.Lobby.verifyMyCardOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqVerifyMyCardOrder.serializer(), data)
    }
    object VerificationIAPOrder: IProtoRpc<ReqVerificationIAPOrder, ResVerificationIAPOrder>(".lq.Lobby.verificationIAPOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqVerificationIAPOrder.serializer(), data)
    }
    object CreateYostarSDKOrder: IProtoRpc<ReqCreateYostarOrder, ResCreateYostarOrder>(".lq.Lobby.createYostarSDKOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateYostarOrder.serializer(), data)
    }
    object CreateBillingOrder: IProtoRpc<ReqCreateBillingOrder, ResCreateBillingOrder>(".lq.Lobby.createBillingOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateBillingOrder.serializer(), data)
    }
    object SolveGooglePlayOrder: IProtoRpc<ReqSolveGooglePlayOrder, ResCommon>(".lq.Lobby.solveGooglePlayOrder") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSolveGooglePlayOrder.serializer(), data)
    }
    object SolveGooglePayOrderV3: IProtoRpc<ReqSolveGooglePlayOrderV3, ResCommon>(".lq.Lobby.solveGooglePayOrderV3") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSolveGooglePlayOrderV3.serializer(), data)
    }
    object FetchMisc: IProtoRpc<ReqCommon, ResMisc>(".lq.Lobby.fetchMisc") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ModifySignature: IProtoRpc<ReqModifySignature, ResCommon>(".lq.Lobby.modifySignature") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqModifySignature.serializer(), data)
    }
    object FetchIDCardInfo: IProtoRpc<ReqCommon, ResIDCardInfo>(".lq.Lobby.fetchIDCardInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object UpdateIDCardInfo: IProtoRpc<ReqUpdateIDCardInfo, ResCommon>(".lq.Lobby.updateIDCardInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqUpdateIDCardInfo.serializer(), data)
    }
    object FetchVipReward: IProtoRpc<ReqCommon, ResVipReward>(".lq.Lobby.fetchVipReward") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object GainVipReward: IProtoRpc<ReqGainVipReward, ResCommon>(".lq.Lobby.gainVipReward") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGainVipReward.serializer(), data)
    }
    object FetchCustomizedContestList: IProtoRpc<ReqFetchCustomizedContestList, ResFetchCustomizedContestList>(".lq.Lobby.fetchCustomizedContestList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestList.serializer(), data)
    }
    object FetchCustomizedContestExtendInfo: IProtoRpc<ReqFetchCustomizedContestExtendInfo, ResFetchCustomizedContestExtendInfo>(".lq.Lobby.fetchCustomizedContestExtendInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestExtendInfo.serializer(), data)
    }
    object FetchCustomizedContestAuthInfo: IProtoRpc<ReqFetchCustomizedContestAuthInfo, ResFetchCustomizedContestAuthInfo>(".lq.Lobby.fetchCustomizedContestAuthInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestAuthInfo.serializer(), data)
    }
    object EnterCustomizedContest: IProtoRpc<ReqEnterCustomizedContest, ResEnterCustomizedContest>(".lq.Lobby.enterCustomizedContest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqEnterCustomizedContest.serializer(), data)
    }
    object LeaveCustomizedContest: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.leaveCustomizedContest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchCustomizedContestOnlineInfo: IProtoRpc<ReqFetchCustomizedContestOnlineInfo, ResFetchCustomizedContestOnlineInfo>(".lq.Lobby.fetchCustomizedContestOnlineInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestOnlineInfo.serializer(), data)
    }
    object FetchCustomizedContestByContestId: IProtoRpc<ReqFetchCustomizedContestByContestId, ResFetchCustomizedContestByContestId>(".lq.Lobby.fetchCustomizedContestByContestId") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestByContestId.serializer(), data)
    }
    object StartCustomizedContest: IProtoRpc<ReqStartCustomizedContest, ResCommon>(".lq.Lobby.startCustomizedContest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqStartCustomizedContest.serializer(), data)
    }
    object StopCustomizedContest: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.stopCustomizedContest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object JoinCustomizedContestChatRoom: IProtoRpc<ReqJoinCustomizedContestChatRoom, ResJoinCustomizedContestChatRoom>(".lq.Lobby.joinCustomizedContestChatRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqJoinCustomizedContestChatRoom.serializer(), data)
    }
    object LeaveCustomizedContestChatRoom: IProtoRpc<ReqCommon, ResCommon>(".lq.Lobby.leaveCustomizedContestChatRoom") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object SayChatMessage: IProtoRpc<ReqSayChatMessage, ResCommon>(".lq.Lobby.sayChatMessage") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSayChatMessage.serializer(), data)
    }
    object FetchCustomizedContestGameRecords: IProtoRpc<ReqFetchCustomizedContestGameRecords, ResFetchCustomizedContestGameRecords>(".lq.Lobby.fetchCustomizedContestGameRecords") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestGameRecords.serializer(), data)
    }
    object FetchCustomizedContestGameLiveList: IProtoRpc<ReqFetchCustomizedContestGameLiveList, ResFetchCustomizedContestGameLiveList>(".lq.Lobby.fetchCustomizedContestGameLiveList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchCustomizedContestGameLiveList.serializer(), data)
    }
    object FollowCustomizedContest: IProtoRpc<ReqTargetCustomizedContest, ResCommon>(".lq.Lobby.followCustomizedContest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqTargetCustomizedContest.serializer(), data)
    }
    object UnfollowCustomizedContest: IProtoRpc<ReqTargetCustomizedContest, ResCommon>(".lq.Lobby.unfollowCustomizedContest") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqTargetCustomizedContest.serializer(), data)
    }
    object FetchActivityList: IProtoRpc<ReqCommon, ResActivityList>(".lq.Lobby.fetchActivityList") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object FetchAccountActivityData: IProtoRpc<ReqCommon, ResAccountActivityData>(".lq.Lobby.fetchAccountActivityData") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ExchangeActivityItem: IProtoRpc<ReqExchangeActivityItem, ResExchangeActivityItem>(".lq.Lobby.exchangeActivityItem") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqExchangeActivityItem.serializer(), data)
    }
    object CompleteActivityTask: IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completeActivityTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
    }
    object CompleteActivityFlipTask: IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completeActivityFlipTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
    }
    object CompletePeriodActivityTask: IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completePeriodActivityTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
    }
    object CompleteRandomActivityTask: IProtoRpc<ReqCompleteActivityTask, ResCommon>(".lq.Lobby.completeRandomActivityTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCompleteActivityTask.serializer(), data)
    }
    object ReceiveActivityFlipTask: IProtoRpc<ReqReceiveActivityFlipTask, ResReceiveActivityFlipTask>(".lq.Lobby.receiveActivityFlipTask") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqReceiveActivityFlipTask.serializer(), data)
    }
    object FetchActivityFlipInfo: IProtoRpc<ReqFetchActivityFlipInfo, ResFetchActivityFlipInfo>(".lq.Lobby.fetchActivityFlipInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchActivityFlipInfo.serializer(), data)
    }
    object GainAccumulatedPointActivityReward: IProtoRpc<ReqGainAccumulatedPointActivityReward, ResCommon>(".lq.Lobby.gainAccumulatedPointActivityReward") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGainAccumulatedPointActivityReward.serializer(), data)
    }
    object FetchRankPointLeaderboard: IProtoRpc<ReqFetchRankPointLeaderboard, ResFetchRankPointLeaderboard>(".lq.Lobby.fetchRankPointLeaderboard") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqFetchRankPointLeaderboard.serializer(), data)
    }
    object GainRankPointReward: IProtoRpc<ReqGainRankPointReward, ResCommon>(".lq.Lobby.gainRankPointReward") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGainRankPointReward.serializer(), data)
    }
    object RichmanActivityNextMove: IProtoRpc<ReqRichmanNextMove, ResRichmanNextMove>(".lq.Lobby.richmanActivityNextMove") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRichmanNextMove.serializer(), data)
    }
    object RichmanAcitivitySpecialMove: IProtoRpc<ReqRichmanSpecialMove, ResRichmanNextMove>(".lq.Lobby.richmanAcitivitySpecialMove") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRichmanSpecialMove.serializer(), data)
    }
    object RichmanActivityChestInfo: IProtoRpc<ReqRichmanChestInfo, ResRichmanChestInfo>(".lq.Lobby.richmanActivityChestInfo") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRichmanChestInfo.serializer(), data)
    }
    object CreateGameObserveAuth: IProtoRpc<ReqCreateGameObserveAuth, ResCreateGameObserveAuth>(".lq.Lobby.createGameObserveAuth") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCreateGameObserveAuth.serializer(), data)
    }
    object RefreshGameObserveAuth: IProtoRpc<ReqRefreshGameObserveAuth, ResRefreshGameObserveAuth>(".lq.Lobby.refreshGameObserveAuth") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqRefreshGameObserveAuth.serializer(), data)
    }
}

@Serializable data class ResConnectionInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val client_endpoint: NetworkEndpoint? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResConnectionInfo", encode())
}

@Serializable data class ReqSignupAccount (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val code: String? = null,
    @ProtoId(4) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSignupAccount", encode())
}

@Serializable data class ResSignupAccount (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResSignupAccount", encode())
}

@Serializable data class ReqLogin (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(7) @JvmField val gen_access_token: Boolean = false,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList(),
    @ProtoId(9) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqLogin", encode())
}

@Serializable data class ResLogin (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val account: Account? = null,
    @ProtoId(4) @JvmField val game_info: GameConnectInfo? = null,
    @ProtoId(5) @JvmField val has_unread_announcement: Boolean = false,
    @ProtoId(6) @JvmField val access_token: String? = null,
    @ProtoId(7) @JvmField val signup_time: Int = 0,
    @ProtoId(8) @JvmField val is_id_card_authed: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResLogin", encode())
}

@Serializable data class ReqEmailLogin (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val password: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(7) @JvmField val gen_access_token: Boolean = false,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqEmailLogin", encode())
}

@Serializable data class ReqBindAccount (
    @ProtoId(1) @JvmField val account: String? = null,
    @ProtoId(2) @JvmField val password: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBindAccount", encode())
}

@Serializable data class ReqCreatePhoneVerifyCode (
    @ProtoId(1) @JvmField val phone: String? = null,
    @ProtoId(2) @JvmField val usage: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreatePhoneVerifyCode", encode())
}

@Serializable data class ReqCreateEmailVerifyCode (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val usage: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateEmailVerifyCode", encode())
}

@Serializable data class ReqVerifyCodeForSecure (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val operation: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqVerifyCodeForSecure", encode())
}

@Serializable data class ResVerfiyCodeForSecure (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val secure_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResVerfiyCodeForSecure", encode())
}

@Serializable data class ReqBindPhoneNumber (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val phone: String? = null,
    @ProtoId(3) @JvmField val password: String? = null,
    @ProtoId(4) @JvmField val multi_bind_version: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBindPhoneNumber", encode())
}

@Serializable data class ReqUnbindPhoneNumber (
    @ProtoId(1) @JvmField val code: String? = null,
    @ProtoId(2) @JvmField val phone: String? = null,
    @ProtoId(3) @JvmField val password: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUnbindPhoneNumber", encode())
}

@Serializable data class ResFetchPhoneLoginBind (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val phone_login: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchPhoneLoginBind", encode())
}

@Serializable data class ReqCreatePhoneLoginBind (
    @ProtoId(1) @JvmField val password: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreatePhoneLoginBind", encode())
}

@Serializable data class ReqBindEmail (
    @ProtoId(1) @JvmField val email: String? = null,
    @ProtoId(2) @JvmField val code: String? = null,
    @ProtoId(3) @JvmField val password: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBindEmail", encode())
}

@Serializable data class ReqModifyPassword (
    @ProtoId(1) @JvmField val new_password: String? = null,
    @ProtoId(2) @JvmField val old_password: String? = null,
    @ProtoId(3) @JvmField val secure_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqModifyPassword", encode())
}

@Serializable data class ReqOauth2Auth (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val code: String? = null,
    @ProtoId(3) @JvmField val uid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOauth2Auth", encode())
}

@Serializable data class ResOauth2Auth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResOauth2Auth", encode())
}

@Serializable data class ReqOauth2Check (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOauth2Check", encode())
}

@Serializable data class ResOauth2Check (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val has_account: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResOauth2Check", encode())
}

@Serializable data class ReqOauth2Signup (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null,
    @ProtoId(3) @JvmField val email: String? = null,
    @ProtoId(4) @JvmField val advertise_str: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOauth2Signup", encode())
}

@Serializable data class ResOauth2Signup (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResOauth2Signup", encode())
}

@Serializable data class ReqOauth2Login (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val access_token: String? = null,
    @ProtoId(3) @JvmField val reconnect: Boolean = false,
    @ProtoId(4) @JvmField val device: ClientDeviceInfo? = null,
    @ProtoId(5) @JvmField val random_key: String? = null,
    @ProtoId(6) @JvmField val client_version: String? = null,
    @ProtoId(8) @JvmField val currency_platforms: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOauth2Login", encode())
}

@Serializable data class ReqDMMPreLogin (
    @ProtoId(1) @JvmField val finish_url: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqDMMPreLogin", encode())
}

@Serializable data class ResDMMPreLogin (
    @ProtoId(1) @JvmField val parameter: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResDMMPreLogin", encode())
}

@Serializable class ReqLogout () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqLogout", encode())
}

@Serializable data class ResLogout (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResLogout", encode())
}

@Serializable data class ReqHeatBeat (
    @ProtoId(1) @JvmField val no_operation_counter: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqHeatBeat", encode())
}

@Serializable data class ReqLoginBeat (
    @ProtoId(1) @JvmField val contract: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqLoginBeat", encode())
}

@Serializable data class ReqJoinMatchQueue (
    @ProtoId(1) @JvmField val match_mode: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqJoinMatchQueue", encode())
}

@Serializable data class ReqCancelMatchQueue (
    @ProtoId(1) @JvmField val match_mode: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCancelMatchQueue", encode())
}

@Serializable data class ReqAccountInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqAccountInfo", encode())
}

@Serializable data class ResAccountInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val account: Account? = null,
    @ProtoId(3) @JvmField val room: Room? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountInfo", encode())
}

@Serializable data class ReqCreateNickname (
    @ProtoId(1) @JvmField val nickname: String? = null,
    @ProtoId(2) @JvmField val advertise_str: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateNickname", encode())
}

@Serializable data class ReqModifyNickname (
    @ProtoId(1) @JvmField val nickname: String? = null,
    @ProtoId(2) @JvmField val use_item_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqModifyNickname", encode())
}

@Serializable data class ReqModifyBirthday (
    @ProtoId(1) @JvmField val birthday: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqModifyBirthday", encode())
}

@Serializable data class ResSelfRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResSelfRoom", encode())
}

@Serializable data class ReqCreateRoom (
    @ProtoId(1) @JvmField val player_count: Int = 0,
    @ProtoId(2) @JvmField val mode: GameMode? = null,
    @ProtoId(3) @JvmField val public_live: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateRoom", encode())
}

@Serializable data class ResCreateRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateRoom", encode())
}

@Serializable data class ReqJoinRoom (
    @ProtoId(1) @JvmField val room_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqJoinRoom", encode())
}

@Serializable data class ResJoinRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val room: Room? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResJoinRoom", encode())
}

@Serializable data class ReqRoomReady (
    @ProtoId(1) @JvmField val ready: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRoomReady", encode())
}

@Serializable data class ReqRoomDressing (
    @ProtoId(1) @JvmField val dressing: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRoomDressing", encode())
}

@Serializable class ReqRoomStart () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRoomStart", encode())
}

@Serializable data class ReqRoomKick (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRoomKick", encode())
}

@Serializable data class ReqModifyRoom (
    @ProtoId(1) @JvmField val robot_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqModifyRoom", encode())
}

@Serializable data class ReqChangeAvatar (
    @ProtoId(1) @JvmField val avatar_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChangeAvatar", encode())
}

@Serializable data class ReqAccountStatisticInfo (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqAccountStatisticInfo", encode())
}

@Serializable data class ResAccountStatisticInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val statistic_data: List<AccountStatisticData> = emptyList(),
    @ProtoId(3) @JvmField val detail_data: AccountDetailStatisticV2? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountStatisticInfo", encode())
}

@Serializable data class ResAccountCharacterInfo (
    @ProtoId(1) @JvmField val unlock_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountCharacterInfo", encode())
}

@Serializable data class ReqShopPurchase (
    @ProtoId(1) @JvmField val type: String? = null,
    @ProtoId(2) @JvmField val id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqShopPurchase", encode())
}

@Serializable data class ResShopPurchase (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val update: AccountUpdate? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResShopPurchase", encode())
}

@Serializable data class ReqGameRecord (
    @ProtoId(1) @JvmField val game_uuid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGameRecord", encode())
}

@Serializable data class ResGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(3) @JvmField val head: RecordGame? = null,
    @ProtoId(4) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY,
    @ProtoId(5) @JvmField val data_url: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameRecord", encode())
}

@Serializable data class ReqGameRecordList (
    @ProtoId(1) @JvmField val start: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGameRecordList", encode())
}

@Serializable data class ResGameRecordList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val total_count: Int = 0,
    @ProtoId(3) @JvmField val record_list: List<RecordGame> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameRecordList", encode())
}

@Serializable data class ResCollectedGameRecordList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val record_list: List<RecordCollectedData> = emptyList(),
    @ProtoId(3) @JvmField val record_collect_limit: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCollectedGameRecordList", encode())
}

@Serializable data class ReqGameRecordsDetail (
    @ProtoId(1) @JvmField val uuid_list: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGameRecordsDetail", encode())
}

@Serializable data class ResGameRecordsDetail (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val record_list: List<RecordGame> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameRecordsDetail", encode())
}

@Serializable data class ReqAddCollectedGameRecord (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null,
    @ProtoId(3) @JvmField val start_time: Int = 0,
    @ProtoId(4) @JvmField val end_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqAddCollectedGameRecord", encode())
}

@Serializable data class ResAddCollectedGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAddCollectedGameRecord", encode())
}

@Serializable data class ReqRemoveCollectedGameRecord (
    @ProtoId(1) @JvmField val uuid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRemoveCollectedGameRecord", encode())
}

@Serializable data class ResRemoveCollectedGameRecord (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResRemoveCollectedGameRecord", encode())
}

@Serializable data class ReqChangeCollectedGameRecordRemarks (
    @ProtoId(1) @JvmField val uuid: String? = null,
    @ProtoId(2) @JvmField val remarks: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChangeCollectedGameRecordRemarks", encode())
}

@Serializable data class ResChangeCollectedGameRecordRemarks (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResChangeCollectedGameRecordRemarks", encode())
}

@Serializable data class ReqLevelLeaderboard (
    @ProtoId(1) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqLevelLeaderboard", encode())
}

@Serializable data class ResLevelLeaderboard (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(3) @JvmField val self_rank: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResLevelLeaderboard", encode())

    @Serializable data class Item (
        @ProtoId(1) @JvmField val account_id: Int = 0,
        @ProtoId(2) @JvmField val level: AccountLevel? = null
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Item", encode())
    }

}

@Serializable data class ReqMultiAccountId (
    @ProtoId(1) @JvmField val account_id_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqMultiAccountId", encode())
}

@Serializable data class ResMultiAccountBrief (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val players: List<PlayerBaseView> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResMultiAccountBrief", encode())
}

@Serializable data class ResFriendList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val friends: List<Friend> = emptyList(),
    @ProtoId(3) @JvmField val friend_max_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFriendList", encode())
}

@Serializable data class ResFriendApplyList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val applies: List<FriendApply> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFriendApplyList", encode())

    @Serializable data class FriendApply (
        @ProtoId(1) @JvmField val account_id: Int = 0,
        @ProtoId(2) @JvmField val apply_time: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.FriendApply", encode())
    }

}

@Serializable data class ReqApplyFriend (
    @ProtoId(1) @JvmField val target_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqApplyFriend", encode())
}

@Serializable data class ReqHandleFriendApply (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val method: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqHandleFriendApply", encode())
}

@Serializable data class ReqRemoveFriend (
    @ProtoId(1) @JvmField val target_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRemoveFriend", encode())
}

@Serializable data class ReqSearchAccountByPattern (
    @ProtoId(1) @JvmField val search_next: Boolean = false,
    @ProtoId(2) @JvmField val pattern: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSearchAccountByPattern", encode())
}

@Serializable data class ResSearchAccountByPattern (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_finished: Boolean = false,
    @ProtoId(3) @JvmField val match_accounts: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val decode_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResSearchAccountByPattern", encode())
}

@Serializable data class ReqAccountList (
    @ProtoId(1) @JvmField val account_id_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqAccountList", encode())
}

@Serializable data class ResAccountStates (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val states: List<AccountActiveState> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountStates", encode())
}

@Serializable data class ReqSearchAccountById (
    @ProtoId(1) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSearchAccountById", encode())
}

@Serializable data class ResSearchAccountById (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val player: PlayerBaseView? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResSearchAccountById", encode())
}

@Serializable data class ResBagInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val bag: Bag? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResBagInfo", encode())
}

@Serializable data class ReqUseBagItem (
    @ProtoId(1) @JvmField val item_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUseBagItem", encode())
}

@Serializable data class ReqOpenManualItem (
    @ProtoId(1) @JvmField val item_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val select_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOpenManualItem", encode())
}

@Serializable data class ReqOpenRandomRewardItem (
    @ProtoId(1) @JvmField val item_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOpenRandomRewardItem", encode())
}

@Serializable data class ResOpenRandomRewardItem (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val results: List<OpenResult> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResOpenRandomRewardItem", encode())
}

@Serializable data class ReqComposeShard (
    @ProtoId(1) @JvmField val item_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqComposeShard", encode())
}

@Serializable data class ResAnnouncement (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val announcements: List<Announcement> = emptyList(),
    @ProtoId(3) @JvmField val sort: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val read_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAnnouncement", encode())
}

@Serializable data class ResMailInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val mails: List<Mail> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResMailInfo", encode())
}

@Serializable data class ReqReadMail (
    @ProtoId(1) @JvmField val mail_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqReadMail", encode())
}

@Serializable data class ReqDeleteMail (
    @ProtoId(1) @JvmField val mail_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqDeleteMail", encode())
}

@Serializable data class ReqTakeAttachment (
    @ProtoId(1) @JvmField val mail_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqTakeAttachment", encode())
}

@Serializable data class ResAchievement (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progresses: List<AchievementProgress> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAchievement", encode())
}

@Serializable data class ResTitleList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val title_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResTitleList", encode())
}

@Serializable data class ReqUseTitle (
    @ProtoId(1) @JvmField val title: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUseTitle", encode())
}

@Serializable data class ReqBuyShiLian (
    @ProtoId(1) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBuyShiLian", encode())
}

@Serializable data class ReqUpdateClientValue (
    @ProtoId(1) @JvmField val key: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUpdateClientValue", encode())
}

@Serializable data class ResClientValue (
    @ProtoId(1) @JvmField val datas: List<Value> = emptyList(),
    @ProtoId(2) @JvmField val recharged_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResClientValue", encode())

    @Serializable data class Value (
        @ProtoId(1) @JvmField val key: Int = 0,
        @ProtoId(2) @JvmField val value: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Value", encode())
    }

}

@Serializable data class ReqClientMessage (
    @ProtoId(1) @JvmField val timestamp: Int = 0,
    @ProtoId(2) @JvmField val message: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqClientMessage", encode())
}

@Serializable data class ReqCurrentMatchInfo (
    @ProtoId(1) @JvmField val mode_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCurrentMatchInfo", encode())
}

@Serializable data class ResCurrentMatchInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val matches: List<CurrentMatchInfo> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCurrentMatchInfo", encode())

    @Serializable data class CurrentMatchInfo (
        @ProtoId(1) @JvmField val mode_id: Int = 0,
        @ProtoId(2) @JvmField val playing_count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.CurrentMatchInfo", encode())
    }

}

@Serializable data class ReqUserComplain (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUserComplain", encode())
}

@Serializable data class ReqReadAnnouncement (
    @ProtoId(1) @JvmField val announcement_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqReadAnnouncement", encode())
}

@Serializable data class ResReviveCoinInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val has_gained: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResReviveCoinInfo", encode())
}

@Serializable data class ResDailyTask (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progresses: List<TaskProgress> = emptyList(),
    @ProtoId(3) @JvmField val has_refresh_count: Boolean = false,
    @ProtoId(4) @JvmField val max_daily_task_count: Int = 0,
    @ProtoId(5) @JvmField val refresh_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResDailyTask", encode())
}

@Serializable data class ReqRefreshDailyTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRefreshDailyTask", encode())
}

@Serializable data class ResRefreshDailyTask (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val progress: TaskProgress? = null,
    @ProtoId(3) @JvmField val refresh_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResRefreshDailyTask", encode())
}

@Serializable data class ReqUseGiftCode (
    @ProtoId(1) @JvmField val code: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUseGiftCode", encode())
}

@Serializable data class ResUseGiftCode (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(6) @JvmField val rewards: List<RewardSlot> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResUseGiftCode", encode())
}

@Serializable data class ReqSendClientMessage (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val content: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSendClientMessage", encode())
}

@Serializable data class ReqGameLiveInfo (
    @ProtoId(1) @JvmField val game_uuid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGameLiveInfo", encode())
}

@Serializable data class ResGameLiveInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val left_start_seconds: Int = 0,
    @ProtoId(3) @JvmField val live_head: GameLiveHead? = null,
    @ProtoId(4) @JvmField val segments: List<GameLiveSegmentUri> = emptyList(),
    @ProtoId(5) @JvmField val now_millisecond: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameLiveInfo", encode())
}

@Serializable data class ReqGameLiveLeftSegment (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val last_segment_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGameLiveLeftSegment", encode())
}

@Serializable data class ResGameLiveLeftSegment (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_state: Int = 0,
    @ProtoId(4) @JvmField val segments: List<GameLiveSegmentUri> = emptyList(),
    @ProtoId(5) @JvmField val now_millisecond: Int = 0,
    @ProtoId(6) @JvmField val segment_end_millisecond: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameLiveLeftSegment", encode())
}

@Serializable data class ReqGameLiveList (
    @ProtoId(1) @JvmField val filter_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGameLiveList", encode())
}

@Serializable data class ResGameLiveList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_list: List<GameLiveHead> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameLiveList", encode())
}

@Serializable data class ResCommentSetting (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comment_allow: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCommentSetting", encode())
}

@Serializable data class ReqUpdateCommentSetting (
    @ProtoId(1) @JvmField val comment_allow: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUpdateCommentSetting", encode())
}

@Serializable data class ReqFetchCommentList (
    @ProtoId(1) @JvmField val target_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCommentList", encode())
}

@Serializable data class ResFetchCommentList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comment_allow: Int = 0,
    @ProtoId(3) @JvmField val comment_id_list: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val last_read_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCommentList", encode())
}

@Serializable data class ReqFetchCommentContent (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val comment_id_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCommentContent", encode())
}

@Serializable data class ResFetchCommentContent (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val comments: List<CommentItem> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCommentContent", encode())
}

@Serializable data class ReqLeaveComment (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqLeaveComment", encode())
}

@Serializable data class ReqDeleteComment (
    @ProtoId(1) @JvmField val target_id: Int = 0,
    @ProtoId(2) @JvmField val delete_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqDeleteComment", encode())
}

@Serializable data class ReqUpdateReadComment (
    @ProtoId(1) @JvmField val read_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUpdateReadComment", encode())
}

@Serializable data class ReqRollingNotice (
    @ProtoId(1) @JvmField val notice: RollingNotice? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRollingNotice", encode())
}

@Serializable data class ResServerTime (
    @ProtoId(1) @JvmField val server_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResServerTime", encode())
}

@Serializable data class ReqPlatformBillingProducts (
    @ProtoId(1) @JvmField val shelves_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqPlatformBillingProducts", encode())
}

@Serializable data class ResPlatformBillingProducts (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val products: List<BillingProduct> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResPlatformBillingProducts", encode())
}

@Serializable data class ReqCreateBillingOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val payment_platform: Int = 0,
    @ProtoId(3) @JvmField val client_type: Int = 0,
    @ProtoId(4) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateBillingOrder", encode())
}

@Serializable data class ResCreateBillingOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateBillingOrder", encode())
}

@Serializable data class ReqSolveGooglePlayOrder (
    @ProtoId(2) @JvmField val inapp_purchase_data: String? = null,
    @ProtoId(3) @JvmField val inapp_data_signature: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSolveGooglePlayOrder", encode())
}

@Serializable data class ReqSolveGooglePlayOrderV3 (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val transaction_id: String? = null,
    @ProtoId(3) @JvmField val token: String? = null,
    @ProtoId(4) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSolveGooglePlayOrderV3", encode())
}

@Serializable data class ReqCancelGooglePlayOrder (
    @ProtoId(1) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCancelGooglePlayOrder", encode())
}

@Serializable data class ReqCreateWechatNativeOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val account_ip: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateWechatNativeOrder", encode())
}

@Serializable data class ResCreateWechatNativeOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val qrcode_buffer: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateWechatNativeOrder", encode())
}

@Serializable data class ReqCreateWechatAppOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val account_ip: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateWechatAppOrder", encode())
}

@Serializable data class ResCreateWechatAppOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val call_wechat_app_param: CallWechatAppParam? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateWechatAppOrder", encode())

    @Serializable data class CallWechatAppParam (
        @ProtoId(1) @JvmField val appid: String? = null,
        @ProtoId(2) @JvmField val partnerid: String? = null,
        @ProtoId(3) @JvmField val prepayid: String? = null,
        @ProtoId(4) @JvmField val `package`: String? = null,
        @ProtoId(5) @JvmField val noncestr: String? = null,
        @ProtoId(6) @JvmField val timestamp: String? = null,
        @ProtoId(7) @JvmField val sign: String? = null
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.CallWechatAppParam", encode())
    }

}

@Serializable data class ReqCreateAlipayOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val alipay_trade_type: String? = null,
    @ProtoId(5) @JvmField val return_url: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateAlipayOrder", encode())
}

@Serializable data class ResCreateAlipayOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val alipay_url: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateAlipayOrder", encode())
}

@Serializable data class ReqCreateAlipayScanOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateAlipayScanOrder", encode())
}

@Serializable data class ResCreateAlipayScanOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val qrcode_buffer: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null,
    @ProtoId(4) @JvmField val qr_code: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateAlipayScanOrder", encode())
}

@Serializable data class ReqCreateAlipayAppOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateAlipayAppOrder", encode())
}

@Serializable data class ResCreateAlipayAppOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val alipay_url: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateAlipayAppOrder", encode())
}

@Serializable data class ReqCreateJPCreditCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateJPCreditCardOrder", encode())
}

@Serializable data class ResCreateJPCreditCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateJPCreditCardOrder", encode())
}

@Serializable data class ReqCreateJPPaypalOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateJPPaypalOrder", encode())
}

@Serializable data class ResCreateJPPaypalOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateJPPaypalOrder", encode())
}

@Serializable data class ReqCreateJPAuOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateJPAuOrder", encode())
}

@Serializable data class ResCreateJPAuOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateJPAuOrder", encode())
}

@Serializable data class ReqCreateJPDocomoOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateJPDocomoOrder", encode())
}

@Serializable data class ResCreateJPDocomoOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateJPDocomoOrder", encode())
}

@Serializable data class ReqCreateJPWebMoneyOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateJPWebMoneyOrder", encode())
}

@Serializable data class ResCreateJPWebMoneyOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateJPWebMoneyOrder", encode())
}

@Serializable data class ReqCreateJPSoftbankOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateJPSoftbankOrder", encode())
}

@Serializable data class ResCreateJPSoftbankOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateJPSoftbankOrder", encode())
}

@Serializable data class ReqCreateYostarOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val order_type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateYostarOrder", encode())
}

@Serializable data class ResCreateYostarOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateYostarOrder", encode())
}

@Serializable data class ReqCreateENPaypalOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateENPaypalOrder", encode())
}

@Serializable data class ResCreateENPaypalOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateENPaypalOrder", encode())
}

@Serializable data class ReqCreateENJCBOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateENJCBOrder", encode())
}

@Serializable data class ResCreateENJCBOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateENJCBOrder", encode())
}

@Serializable data class ReqCreateENMasterCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateENMasterCardOrder", encode())
}

@Serializable data class ResCreateENMasterCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateENMasterCardOrder", encode())
}

@Serializable data class ReqCreateENVisaOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateENVisaOrder", encode())
}

@Serializable data class ResCreateENVisaOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateENVisaOrder", encode())
}

@Serializable data class ReqCreateENAlipayOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val return_url: String? = null,
    @ProtoId(5) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateENAlipayOrder", encode())
}

@Serializable data class ResCreateENAlipayOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateENAlipayOrder", encode())
}

@Serializable data class ReqCreateDMMOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val account_id: Int = 0,
    @ProtoId(3) @JvmField val client_type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateDMMOrder", encode())
}

@Serializable data class ResCreateDmmOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null,
    @ProtoId(3) @JvmField val transaction_id: String? = null,
    @ProtoId(4) @JvmField val dmm_user_id: String? = null,
    @ProtoId(5) @JvmField val token: String? = null,
    @ProtoId(6) @JvmField val callback_url: String? = null,
    @ProtoId(9) @JvmField val request_time: String? = null,
    @ProtoId(10) @JvmField val dmm_app_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateDmmOrder", encode())
}

@Serializable data class ReqCreateIAPOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0,
    @ProtoId(4) @JvmField val access_token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateIAPOrder", encode())
}

@Serializable data class ResCreateIAPOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateIAPOrder", encode())
}

@Serializable data class ReqVerificationIAPOrder (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val transaction_id: String? = null,
    @ProtoId(3) @JvmField val receipt_data: String? = null,
    @ProtoId(4) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqVerificationIAPOrder", encode())
}

@Serializable data class ResVerificationIAPOrder (
    @ProtoId(1) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResVerificationIAPOrder", encode())
}

@Serializable data class ReqCreateMyCardOrder (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val client_type: Int = 0,
    @ProtoId(3) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateMyCardOrder", encode())
}

@Serializable data class ResCreateMyCardOrder (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val auth_code: String? = null,
    @ProtoId(3) @JvmField val order_id: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateMyCardOrder", encode())
}

@Serializable data class ReqVerifyMyCardOrder (
    @ProtoId(1) @JvmField val order_id: String? = null,
    @ProtoId(2) @JvmField val account_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqVerifyMyCardOrder", encode())
}

@Serializable data class ReqOpenChest (
    @ProtoId(1) @JvmField val chest_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val use_ticket: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqOpenChest", encode())
}

@Serializable data class ResOpenChest (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val results: List<OpenResult> = emptyList(),
    @ProtoId(3) @JvmField val total_open_count: Int = 0,
    @ProtoId(4) @JvmField val faith_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResOpenChest", encode())
}

@Serializable data class ReqBuyFromChestShop (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBuyFromChestShop", encode())
}

@Serializable data class ResBuyFromChestShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val chest_id: Int = 0,
    @ProtoId(3) @JvmField val consume_count: Int = 0,
    @ProtoId(4) @JvmField val faith_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResBuyFromChestShop", encode())
}

@Serializable data class ResDailySignInInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val sign_in_days: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResDailySignInInfo", encode())
}

@Serializable data class ReqDoActivitySignIn (
    @ProtoId(2) @JvmField val activity_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqDoActivitySignIn", encode())
}

@Serializable data class ResDoActivitySignIn (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val rewards: List<RewardData> = emptyList(),
    @ProtoId(3) @JvmField val sign_in_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResDoActivitySignIn", encode())

    @Serializable data class RewardData (
        @ProtoId(1) @JvmField val resource_id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RewardData", encode())
    }

}

@Serializable data class ResCharacterInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val characters: List<Character> = emptyList(),
    @ProtoId(3) @JvmField val skins: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val main_character_id: Int = 0,
    @ProtoId(5) @JvmField val send_gift_count: Int = 0,
    @ProtoId(6) @JvmField val send_gift_limit: Int = 0,
    @ProtoId(7) @JvmField val finished_endings: List<Int> = emptyList(),
    @ProtoId(8) @JvmField val rewarded_endings: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCharacterInfo", encode())
}

@Serializable data class ReqChangeMainCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChangeMainCharacter", encode())
}

@Serializable data class ReqChangeCharacterSkin (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val skin: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChangeCharacterSkin", encode())
}

@Serializable data class ReqChangeCharacterView (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val slot: Int = 0,
    @ProtoId(3) @JvmField val item_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChangeCharacterView", encode())
}

@Serializable data class ReqSendGiftToCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val gifts: List<Gift> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSendGiftToCharacter", encode())

    @Serializable data class Gift (
        @ProtoId(1) @JvmField val item_id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Gift", encode())
    }

}

@Serializable data class ResSendGiftToCharacter (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val level: Int = 0,
    @ProtoId(3) @JvmField val exp: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResSendGiftToCharacter", encode())
}

@Serializable data class ReqSellItem (
    @ProtoId(1) @JvmField val sells: List<Item> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSellItem", encode())

    @Serializable data class Item (
        @ProtoId(1) @JvmField val item_id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Item", encode())
    }

}

@Serializable data class ResCommonView (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val slots: List<Slot> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCommonView", encode())

    @Serializable data class Slot (
        @ProtoId(1) @JvmField val slot: Int = 0,
        @ProtoId(2) @JvmField val value: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Slot", encode())
    }

}

@Serializable data class ReqChangeCommonView (
    @ProtoId(1) @JvmField val slot: Int = 0,
    @ProtoId(2) @JvmField val value: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChangeCommonView", encode())
}

@Serializable data class ReqSaveCommonViews (
    @ProtoId(1) @JvmField val views: List<ViewSlot> = emptyList(),
    @ProtoId(2) @JvmField val save_index: Int = 0,
    @ProtoId(3) @JvmField val is_use: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSaveCommonViews", encode())
}

@Serializable data class ReqCommonViews (
    @ProtoId(1) @JvmField val index: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCommonViews", encode())
}

@Serializable data class ResCommonViews (
    @ProtoId(1) @JvmField val views: List<ViewSlot> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCommonViews", encode())
}

@Serializable data class ResAllcommonViews (
    @ProtoId(1) @JvmField val views: List<Views> = emptyList(),
    @ProtoId(2) @JvmField val use: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAllcommonViews", encode())

    @Serializable data class Views (
        @ProtoId(1) @JvmField val values: List<ViewSlot> = emptyList(),
        @ProtoId(2) @JvmField val index: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Views", encode())
    }

}

@Serializable data class ReqUseCommonView (
    @ProtoId(3) @JvmField val index: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUseCommonView", encode())
}

@Serializable data class ReqUpgradeCharacter (
    @ProtoId(1) @JvmField val character_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUpgradeCharacter", encode())
}

@Serializable data class ResUpgradeCharacter (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val character: Character? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResUpgradeCharacter", encode())
}

@Serializable data class ReqFinishedEnding (
    @ProtoId(1) @JvmField val character_id: Int = 0,
    @ProtoId(2) @JvmField val story_id: Int = 0,
    @ProtoId(3) @JvmField val ending_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFinishedEnding", encode())
}

@Serializable data class ReqGMCommand (
    @ProtoId(1) @JvmField val command: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGMCommand", encode())
}

@Serializable data class ResShopInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val shop_info: ShopInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResShopInfo", encode())
}

@Serializable data class ReqBuyFromShop (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val bill_short_cut: List<BillShortcut> = emptyList(),
    @ProtoId(4) @JvmField val deal_price: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBuyFromShop", encode())
}

@Serializable data class ResBuyFromShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val rewards: List<RewardSlot> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResBuyFromShop", encode())
}

@Serializable data class ReqBuyFromZHP (
    @ProtoId(1) @JvmField val goods_id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBuyFromZHP", encode())
}

@Serializable data class ReqPayMonthTicket (
    @ProtoId(1) @JvmField val ticket_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqPayMonthTicket", encode())
}

@Serializable data class ResPayMonthTicket (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val resource_id: Int = 0,
    @ProtoId(3) @JvmField val resource_count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResPayMonthTicket", encode())
}

@Serializable data class ReqReshZHPShop (
    @ProtoId(1) @JvmField val free_refresh: Int = 0,
    @ProtoId(2) @JvmField val cost_refresh: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqReshZHPShop", encode())
}

@Serializable data class ResRefreshZHPShop (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val zhp: ZHPShop? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResRefreshZHPShop", encode())
}

@Serializable data class ResMonthTicketInfo (
    @ProtoId(1) @JvmField val month_ticket_info: List<MonthTicketInfo> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResMonthTicketInfo", encode())
}

@Serializable data class ReqExchangeCurrency (
    @ProtoId(1) @JvmField val id: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqExchangeCurrency", encode())
}

@Serializable data class ResServerSettings (
    @ProtoId(1) @JvmField val settings: ServerSettings? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResServerSettings", encode())
}

@Serializable data class ResAccountSettings (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val settings: List<AccountSetting> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountSettings", encode())
}

@Serializable data class ReqUpdateAccountSettings (
    @ProtoId(1) @JvmField val setting: AccountSetting? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUpdateAccountSettings", encode())
}

@Serializable data class ResModNicknameTime (
    @ProtoId(1) @JvmField val last_mod_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResModNicknameTime", encode())
}

@Serializable data class ResMisc (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val recharged_list: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val faiths: List<MiscFaithData> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResMisc", encode())

    @Serializable data class MiscFaithData (
        @ProtoId(1) @JvmField val faith_id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.MiscFaithData", encode())
    }

}

@Serializable data class ReqModifySignature (
    @ProtoId(1) @JvmField val signature: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqModifySignature", encode())
}

@Serializable data class ResIDCardInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_authed: Boolean = false,
    @ProtoId(3) @JvmField val country: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResIDCardInfo", encode())
}

@Serializable data class ReqUpdateIDCardInfo (
    @ProtoId(1) @JvmField val fullname: String? = null,
    @ProtoId(2) @JvmField val card_no: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqUpdateIDCardInfo", encode())
}

@Serializable data class ResVipReward (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val gained_vip_levels: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResVipReward", encode())
}

@Serializable data class ReqGainVipReward (
    @ProtoId(1) @JvmField val vip_level: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGainVipReward", encode())
}

@Serializable data class ReqFetchCustomizedContestList (
    @ProtoId(1) @JvmField val start: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestList", encode())
}

@Serializable data class ResFetchCustomizedContestList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val contests: List<CustomizedContestBase> = emptyList(),
    @ProtoId(3) @JvmField val follow_contests: List<CustomizedContestBase> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestList", encode())
}

@Serializable data class ReqFetchCustomizedContestExtendInfo (
    @ProtoId(1) @JvmField val uid_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestExtendInfo", encode())
}

@Serializable data class ResFetchCustomizedContestExtendInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val extend_list: List<CustomizedContestExtend> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestExtendInfo", encode())
}

@Serializable data class ReqFetchCustomizedContestAuthInfo (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestAuthInfo", encode())
}

@Serializable data class ResFetchCustomizedContestAuthInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val observer_level: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestAuthInfo", encode())
}

@Serializable data class ReqEnterCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqEnterCustomizedContest", encode())
}

@Serializable data class ResEnterCustomizedContest (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val detail_info: CustomizedContestDetail? = null,
    @ProtoId(3) @JvmField val player_report: CustomizedContestPlayerReport? = null,
    @ProtoId(4) @JvmField val is_followed: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResEnterCustomizedContest", encode())
}

@Serializable data class ReqFetchCustomizedContestOnlineInfo (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestOnlineInfo", encode())
}

@Serializable data class ResFetchCustomizedContestOnlineInfo (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val online_player: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestOnlineInfo", encode())
}

@Serializable data class ReqFetchCustomizedContestByContestId (
    @ProtoId(1) @JvmField val contest_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestByContestId", encode())
}

@Serializable data class ResFetchCustomizedContestByContestId (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val contest_info: CustomizedContestAbstract? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestByContestId", encode())
}

@Serializable data class ReqStartCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqStartCustomizedContest", encode())
}

@Serializable data class ReqJoinCustomizedContestChatRoom (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqJoinCustomizedContestChatRoom", encode())
}

@Serializable data class ResJoinCustomizedContestChatRoom (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val chat_history: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResJoinCustomizedContestChatRoom", encode())
}

@Serializable data class ReqSayChatMessage (
    @ProtoId(1) @JvmField val content: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSayChatMessage", encode())
}

@Serializable data class ReqFetchCustomizedContestGameLiveList (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestGameLiveList", encode())
}

@Serializable data class ResFetchCustomizedContestGameLiveList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val live_list: List<GameLiveHead> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestGameLiveList", encode())
}

@Serializable data class ReqFetchCustomizedContestGameRecords (
    @ProtoId(1) @JvmField val unique_id: Int = 0,
    @ProtoId(2) @JvmField val last_index: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchCustomizedContestGameRecords", encode())
}

@Serializable data class ResFetchCustomizedContestGameRecords (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val next_index: Int = 0,
    @ProtoId(3) @JvmField val record_list: List<RecordGame> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchCustomizedContestGameRecords", encode())
}

@Serializable data class ReqTargetCustomizedContest (
    @ProtoId(1) @JvmField val unique_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqTargetCustomizedContest", encode())
}

@Serializable data class ResActivityList (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val activities: List<Activity> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResActivityList", encode())
}

@Serializable data class ResAccountActivityData (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAccountActivityData", encode())

    @Serializable data class ActivitySignInData (
        @ProtoId(1) @JvmField val activity_id: Int = 0,
        @ProtoId(2) @JvmField val sign_in_count: Int = 0,
        @ProtoId(3) @JvmField val last_sign_in_time: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ActivitySignInData", encode())
    }


    @Serializable data class BuffData (
        @ProtoId(1) @JvmField val type: Int = 0,
        @ProtoId(2) @JvmField val remain: Int = 0,
        @ProtoId(3) @JvmField val effect: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.BuffData", encode())
    }


    @Serializable data class ActivityRichmanData (
        @ProtoId(1) @JvmField val activity_id: Int = 0,
        @ProtoId(2) @JvmField val location: Int = 0,
        @ProtoId(3) @JvmField val finished_count: Int = 0,
        @ProtoId(4) @JvmField val chest_position: Int = 0,
        @ProtoId(5) @JvmField val bank_save: Int = 0,
        @ProtoId(6) @JvmField val exp: Int = 0,
        @ProtoId(7) @JvmField val buff: List<BuffData> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ActivityRichmanData", encode())
    }

}

@Serializable data class ReqExchangeActivityItem (
    @ProtoId(1) @JvmField val exchange_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqExchangeActivityItem", encode())
}

@Serializable data class ResExchangeActivityItem (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val execute_reward: List<ExecuteReward> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResExchangeActivityItem", encode())
}

@Serializable data class ReqCompleteActivityTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCompleteActivityTask", encode())
}

@Serializable data class ReqReceiveActivityFlipTask (
    @ProtoId(1) @JvmField val task_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqReceiveActivityFlipTask", encode())
}

@Serializable data class ResReceiveActivityFlipTask (
    @ProtoId(1) @JvmField val count: Int = 0,
    @ProtoId(2) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResReceiveActivityFlipTask", encode())
}

@Serializable data class ReqFetchActivityFlipInfo (
    @ProtoId(1) @JvmField val activity_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchActivityFlipInfo", encode())
}

@Serializable data class ResFetchActivityFlipInfo (
    @ProtoId(1) @JvmField val rewards: List<Int> = emptyList(),
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchActivityFlipInfo", encode())
}

@Serializable data class ReqGainAccumulatedPointActivityReward (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val reward_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGainAccumulatedPointActivityReward", encode())
}

@Serializable data class ReqFetchRankPointLeaderboard (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqFetchRankPointLeaderboard", encode())
}

@Serializable data class ResFetchRankPointLeaderboard (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val items: List<Item> = emptyList(),
    @ProtoId(3) @JvmField val last_refresh_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResFetchRankPointLeaderboard", encode())

    @Serializable data class Item (
        @ProtoId(1) @JvmField val account_id: Int = 0,
        @ProtoId(2) @JvmField val rank: Int = 0,
        @ProtoId(3) @JvmField val view: PlayerBaseView? = null,
        @ProtoId(4) @JvmField val point: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.Item", encode())
    }

}

@Serializable data class ReqGainRankPointReward (
    @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
    @ProtoId(2) @JvmField val activity_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGainRankPointReward", encode())
}

@Serializable data class ReqRichmanNextMove (
    @ProtoId(1) @JvmField val activity_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRichmanNextMove", encode())
}

@Serializable data class ResRichmanNextMove (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResRichmanNextMove", encode())

    @Serializable data class RewardData (
        @ProtoId(1) @JvmField val resource_id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0,
        @ProtoId(3) @JvmField val origin_count: Int = 0,
        @ProtoId(4) @JvmField val is_chest: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.RewardData", encode())
    }


    @Serializable data class PathData (
        @ProtoId(1) @JvmField val location: Int = 0,
        @ProtoId(2) @JvmField val rewards: List<RewardData> = emptyList(),
        @ProtoId(3) @JvmField val events: List<Int> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.PathData", encode())
    }


    @Serializable data class BuffData (
        @ProtoId(1) @JvmField val type: Int = 0,
        @ProtoId(2) @JvmField val remain: Int = 0,
        @ProtoId(3) @JvmField val effect: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.BuffData", encode())
    }

}

@Serializable data class ReqRichmanSpecialMove (
    @ProtoId(1) @JvmField val activity_id: Int = 0,
    @ProtoId(2) @JvmField val step: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRichmanSpecialMove", encode())
}

@Serializable data class ReqRichmanChestInfo (
    @ProtoId(1) @JvmField val activity_id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRichmanChestInfo", encode())
}

@Serializable data class ResRichmanChestInfo (
    @ProtoId(1) @JvmField val items: List<ItemData> = emptyList(),
    @ProtoId(2) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResRichmanChestInfo", encode())

    @Serializable data class ItemData (
        @ProtoId(1) @JvmField val id: Int = 0,
        @ProtoId(2) @JvmField val count: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ItemData", encode())
    }

}

@Serializable data class ReqCreateGameObserveAuth (
    @ProtoId(1) @JvmField val game_uuid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqCreateGameObserveAuth", encode())
}

@Serializable data class ResCreateGameObserveAuth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val token: String? = null,
    @ProtoId(3) @JvmField val location: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResCreateGameObserveAuth", encode())
}

@Serializable data class ReqRefreshGameObserveAuth (
    @ProtoId(1) @JvmField val token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqRefreshGameObserveAuth", encode())
}

@Serializable data class ResRefreshGameObserveAuth (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val ttl: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResRefreshGameObserveAuth", encode())
}

@Serializable class ActionMJStart () : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionMJStart", encode())
}

@Serializable data class NewRoundOpenedTiles (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tiles: String? = null,
    @ProtoId(3) @JvmField val count: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NewRoundOpenedTiles", encode())
}

@Serializable data class MuyuInfo (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val count: Int = 0,
    @ProtoId(3) @JvmField val count_max: Int = 0,
    @ProtoId(4) @JvmField val id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.MuyuInfo", encode())
}

@Serializable data class ActionNewRound (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionNewRound", encode())
}

@Serializable data class RecordNewRound (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordNewRound", encode())

    @Serializable data class TingPai (
        @ProtoId(1) @JvmField val seat: Int = 0,
        @ProtoId(2) @JvmField val tingpais1: List<TingPaiInfo> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.TingPai", encode())
    }

}

@Serializable data class GameSnapshot (
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
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameSnapshot", encode())

    @Serializable data class PlayerSnapshot (
        @ProtoId(1) @JvmField val score: Int = 0,
        @ProtoId(2) @JvmField val liqiposition: Int = 0,
        @ProtoId(3) @JvmField val tilenum: Int = 0,
        @ProtoId(4) @JvmField val qipais: String? = null,
        @ProtoId(5) @JvmField val mings: List<Fulu> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.PlayerSnapshot", encode())

        @Serializable data class Fulu (
            @ProtoId(1) @JvmField val type: Int = 0,
            @ProtoId(2) @JvmField val tile: String? = null,
            @ProtoId(3) @JvmField val from: List<Int> = emptyList()
        ) : IProtoMessage {
            override fun encode() = ProtoBuf.dump(serializer(), this)
            override fun wrap() = Wrapper(".lq.Fulu", encode())
        }

    }

}

@Serializable data class ActionPrototype (
    @ProtoId(1) @JvmField val step: Int = 0,
    @ProtoId(2) @JvmField val name: String? = null,
    @ProtoId(3) @JvmField val data: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionPrototype", encode())
}

@Serializable data class GameDetailRecords (
    @ProtoId(1) @JvmField val records: ByteArray = EMPTY_BYTE_ARRAY
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameDetailRecords", encode())
}

@Serializable data class OptionalOperation (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val combination: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.OptionalOperation", encode())
}

@Serializable data class OptionalOperationList (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val operation_list: List<OptionalOperation> = emptyList(),
    @ProtoId(4) @JvmField val time_add: Int = 0,
    @ProtoId(5) @JvmField val time_fixed: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.OptionalOperationList", encode())
}

@Serializable data class LiQiSuccess (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val score: Int = 0,
    @ProtoId(3) @JvmField val liqibang: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.LiQiSuccess", encode())
}

@Serializable data class FanInfo (
    @ProtoId(1) @JvmField val name: String? = null,
    @ProtoId(2) @JvmField val `val`: Int = 0,
    @ProtoId(3) @JvmField val id: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.FanInfo", encode())
}

@Serializable data class HuleInfo (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.HuleInfo", encode())
}

@Serializable data class TingPaiInfo (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val haveyi: Boolean = false,
    @ProtoId(3) @JvmField val yiman: Boolean = false,
    @ProtoId(4) @JvmField val count: Int = 0,
    @ProtoId(5) @JvmField val fu: Int = 0,
    @ProtoId(6) @JvmField val biao_dora_count: Int = 0,
    @ProtoId(7) @JvmField val yiman_zimo: Boolean = false,
    @ProtoId(8) @JvmField val count_zimo: Int = 0,
    @ProtoId(9) @JvmField val fu_zimo: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.TingPaiInfo", encode())
}

@Serializable data class TingPaiDiscardInfo (
    @ProtoId(1) @JvmField val tile: String? = null,
    @ProtoId(2) @JvmField val zhenting: Boolean = false,
    @ProtoId(3) @JvmField val infos: List<TingPaiInfo> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.TingPaiDiscardInfo", encode())
}

@Serializable data class GameEnd (
    @ProtoId(1) @JvmField val scores: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameEnd", encode())
}

@Serializable data class ActionDiscardTile (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionDiscardTile", encode())
}

@Serializable data class RecordDiscardTile (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordDiscardTile", encode())
}

@Serializable data class ActionDealTile (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionDealTile", encode())
}

@Serializable data class RecordDealTile (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val tile: String? = null,
    @ProtoId(3) @JvmField val left_tile_count: Int = 0,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(9) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordDealTile", encode())
}

@Serializable data class ActionChiPengGang (
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
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionChiPengGang", encode())
}

@Serializable data class RecordChiPengGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(4) @JvmField val froms: List<Int> = emptyList(),
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(9) @JvmField val tile_states: List<Int> = emptyList(),
    @ProtoId(10) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordChiPengGang", encode())
}

@Serializable data class ActionAnGangAddGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(4) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val tingpais: List<TingPaiInfo> = emptyList(),
    @ProtoId(9) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionAnGangAddGang", encode())
}

@Serializable data class RecordAnGangAddGang (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val type: Int = 0,
    @ProtoId(3) @JvmField val tiles: String? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordAnGangAddGang", encode())
}

@Serializable data class ActionBaBei (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val operation: OptionalOperationList? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val zhenting: Boolean = false,
    @ProtoId(8) @JvmField val tingpais: List<TingPaiInfo> = emptyList(),
    @ProtoId(9) @JvmField val moqie: Boolean = false,
    @ProtoId(10) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionBaBei", encode())
}

@Serializable data class RecordBaBei (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val operations: List<OptionalOperationList> = emptyList(),
    @ProtoId(8) @JvmField val moqie: Boolean = false,
    @ProtoId(10) @JvmField val tile_state: Int = 0,
    @ProtoId(11) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordBaBei", encode())
}

@Serializable data class ActionHule (
    @ProtoId(1) @JvmField val hules: List<HuleInfo> = emptyList(),
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val wait_timeout: Int = 0,
    @ProtoId(5) @JvmField val scores: List<Int> = emptyList(),
    @ProtoId(6) @JvmField val gameend: GameEnd? = null,
    @ProtoId(7) @JvmField val doras: String? = null,
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionHule", encode())
}

@Serializable data class RecordHule (
    @ProtoId(1) @JvmField val hules: List<HuleInfo> = emptyList(),
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val wait_timeout: Int = 0,
    @ProtoId(5) @JvmField val scores: List<Int> = emptyList(),
    @ProtoId(6) @JvmField val gameend: GameEnd? = null,
    @ProtoId(7) @JvmField val doras: String? = null,
    @ProtoId(8) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordHule", encode())
}

@Serializable data class ActionLiuJu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val gameend: GameEnd? = null,
    @ProtoId(3) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val allplayertiles: String? = null,
    @ProtoId(7) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionLiuJu", encode())
}

@Serializable data class RecordLiuJu (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val gameend: GameEnd? = null,
    @ProtoId(3) @JvmField val seat: Int = 0,
    @ProtoId(4) @JvmField val tiles: String? = null,
    @ProtoId(5) @JvmField val liqi: LiQiSuccess? = null,
    @ProtoId(6) @JvmField val allplayertiles: String? = null,
    @ProtoId(7) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordLiuJu", encode())
}

@Serializable data class NoTilePlayerInfo (
    @ProtoId(3) @JvmField val tingpai: Boolean = false,
    @ProtoId(4) @JvmField val hand: String? = null,
    @ProtoId(5) @JvmField val tings: List<TingPaiInfo> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NoTilePlayerInfo", encode())
}

@Serializable data class NoTileScoreInfo (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val old_scores: List<Int> = emptyList(),
    @ProtoId(3) @JvmField val delta_scores: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val hand: String? = null,
    @ProtoId(5) @JvmField val ming: String? = null,
    @ProtoId(6) @JvmField val doras: String? = null,
    @ProtoId(7) @JvmField val score: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NoTileScoreInfo", encode())
}

@Serializable data class ActionNoTile (
    @ProtoId(1) @JvmField val liujumanguan: Boolean = false,
    @ProtoId(2) @JvmField val players: List<NoTilePlayerInfo> = emptyList(),
    @ProtoId(3) @JvmField val scores: List<NoTileScoreInfo> = emptyList(),
    @ProtoId(4) @JvmField val gameend: Boolean = false,
    @ProtoId(5) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ActionNoTile", encode())
}

@Serializable data class RecordNoTile (
    @ProtoId(1) @JvmField val liujumanguan: Boolean = false,
    @ProtoId(2) @JvmField val players: List<NoTilePlayerInfo> = emptyList(),
    @ProtoId(3) @JvmField val scores: List<NoTileScoreInfo> = emptyList(),
    @ProtoId(4) @JvmField val gameend: Boolean = false,
    @ProtoId(5) @JvmField val muyu: MuyuInfo? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.RecordNoTile", encode())
}

@Serializable data class PlayerLeaving (
    @ProtoId(1) @JvmField val seat: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.PlayerLeaving", encode())
}

class FastTest {
    object AuthGame: IProtoRpc<ReqAuthGame, ResAuthGame>(".lq.FastTest.authGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqAuthGame.serializer(), data)
    }
    object EnterGame: IProtoRpc<ReqCommon, ResEnterGame>(".lq.FastTest.enterGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object SyncGame: IProtoRpc<ReqSyncGame, ResSyncGame>(".lq.FastTest.syncGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSyncGame.serializer(), data)
    }
    object FinishSyncGame: IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.finishSyncGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object TerminateGame: IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.terminateGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object InputOperation: IProtoRpc<ReqSelfOperation, ResCommon>(".lq.FastTest.inputOperation") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqSelfOperation.serializer(), data)
    }
    object InputChiPengGang: IProtoRpc<ReqChiPengGang, ResCommon>(".lq.FastTest.inputChiPengGang") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqChiPengGang.serializer(), data)
    }
    object ConfirmNewRound: IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.confirmNewRound") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object BroadcastInGame: IProtoRpc<ReqBroadcastInGame, ResCommon>(".lq.FastTest.broadcastInGame") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqBroadcastInGame.serializer(), data)
    }
    object InputGameGMCommand: IProtoRpc<ReqGMCommandInGaming, ResCommon>(".lq.FastTest.inputGameGMCommand") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqGMCommandInGaming.serializer(), data)
    }
    object FetchGamePlayerState: IProtoRpc<ReqCommon, ResGamePlayerState>(".lq.FastTest.fetchGamePlayerState") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object CheckNetworkDelay: IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.checkNetworkDelay") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object ClearLeaving: IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.clearLeaving") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object VoteGameEnd: IProtoRpc<ReqVoteGameEnd, ResGameEndVote>(".lq.FastTest.voteGameEnd") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqVoteGameEnd.serializer(), data)
    }
    object AuthObserve: IProtoRpc<ReqAuthObserve, ResCommon>(".lq.FastTest.authObserve") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqAuthObserve.serializer(), data)
    }
    object StartObserve: IProtoRpc<ReqCommon, ResStartObserve>(".lq.FastTest.startObserve") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
    object StopObserve: IProtoRpc<ReqCommon, ResCommon>(".lq.FastTest.stopObserve") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load(ReqCommon.serializer(), data)
    }
}

@Serializable data class ReqAuthGame (
    @ProtoId(1) @JvmField val account_id: Int = 0,
    @ProtoId(2) @JvmField val token: String? = null,
    @ProtoId(3) @JvmField val game_uuid: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqAuthGame", encode())
}

@Serializable data class ResAuthGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val players: List<PlayerGameView> = emptyList(),
    @ProtoId(3) @JvmField val seat_list: List<Int> = emptyList(),
    @ProtoId(4) @JvmField val is_game_start: Boolean = false,
    @ProtoId(5) @JvmField val game_config: GameConfig? = null,
    @ProtoId(6) @JvmField val ready_id_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResAuthGame", encode())
}

@Serializable data class GameRestore (
    @ProtoId(1) @JvmField val snapshot: GameSnapshot? = null,
    @ProtoId(2) @JvmField val actions: List<ActionPrototype> = emptyList(),
    @ProtoId(3) @JvmField val passed_waiting_time: Int = 0,
    @ProtoId(4) @JvmField val game_state: Int = 0,
    @ProtoId(5) @JvmField val start_time: Int = 0,
    @ProtoId(6) @JvmField val last_pause_time_ms: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.GameRestore", encode())
}

@Serializable data class ResEnterGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_end: Boolean = false,
    @ProtoId(3) @JvmField val step: Int = 0,
    @ProtoId(4) @JvmField val game_restore: GameRestore? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResEnterGame", encode())
}

@Serializable data class ReqSyncGame (
    @ProtoId(1) @JvmField val round_id: String? = null,
    @ProtoId(2) @JvmField val step: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSyncGame", encode())
}

@Serializable data class ResSyncGame (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val is_end: Boolean = false,
    @ProtoId(3) @JvmField val step: Int = 0,
    @ProtoId(4) @JvmField val game_restore: GameRestore? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResSyncGame", encode())
}

@Serializable data class ReqSelfOperation (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val index: Int = 0,
    @ProtoId(3) @JvmField val tile: String? = null,
    @ProtoId(4) @JvmField val cancel_operation: Boolean = false,
    @ProtoId(5) @JvmField val moqie: Boolean = false,
    @ProtoId(6) @JvmField val timeuse: Int = 0,
    @ProtoId(7) @JvmField val tile_state: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqSelfOperation", encode())
}

@Serializable data class ReqChiPengGang (
    @ProtoId(1) @JvmField val type: Int = 0,
    @ProtoId(2) @JvmField val index: Int = 0,
    @ProtoId(3) @JvmField val cancel_operation: Boolean = false,
    @ProtoId(6) @JvmField val timeuse: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqChiPengGang", encode())
}

@Serializable data class ReqBroadcastInGame (
    @ProtoId(1) @JvmField val content: String? = null,
    @ProtoId(2) @JvmField val except_self: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqBroadcastInGame", encode())
}

@Serializable data class ReqGMCommandInGaming (
    @ProtoId(1) @JvmField val json_data: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqGMCommandInGaming", encode())
}

@Serializable data class ResGamePlayerState (
    @ProtoId(1) @JvmField val error: Error? = null,
    @ProtoId(2) @JvmField val state_list: List<GamePlayerState> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGamePlayerState", encode())
}

@Serializable data class ReqVoteGameEnd (
    @ProtoId(1) @JvmField val yes: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqVoteGameEnd", encode())
}

@Serializable data class ResGameEndVote (
    @ProtoId(1) @JvmField val success: Boolean = false,
    @ProtoId(2) @JvmField val vote_cd_end_time: Int = 0,
    @ProtoId(3) @JvmField val error: Error? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResGameEndVote", encode())
}

@Serializable data class ReqAuthObserve (
    @ProtoId(1) @JvmField val token: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ReqAuthObserve", encode())
}

@Serializable data class ResStartObserve (
    @ProtoId(1) @JvmField val head: GameLiveHead? = null,
    @ProtoId(2) @JvmField val passed: GameLiveSegment? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.ResStartObserve", encode())
}

@Serializable data class NotifyNewGame (
    @ProtoId(1) @JvmField val game_uuid: String? = null,
    @ProtoId(2) @JvmField val player_list: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyNewGame", encode())
}

@Serializable data class NotifyPlayerLoadGameReady (
    @ProtoId(1) @JvmField val ready_id_list: List<Int> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyPlayerLoadGameReady", encode())
}

@Serializable data class NotifyGameBroadcast (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val content: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyGameBroadcast", encode())
}

@Serializable data class NotifyGameEndResult (
    @ProtoId(1) @JvmField val result: GameEndResult? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyGameEndResult", encode())
}

@Serializable data class NotifyGameTerminate (
    @ProtoId(1) @JvmField val reason: String? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyGameTerminate", encode())
}

@Serializable data class NotifyPlayerConnectionState (
    @ProtoId(1) @JvmField val seat: Int = 0,
    @ProtoId(2) @JvmField val state: GamePlayerState? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyPlayerConnectionState", encode())
}

@Serializable data class NotifyAccountLevelChange (
    @ProtoId(1) @JvmField val origin: AccountLevel? = null,
    @ProtoId(2) @JvmField val final: AccountLevel? = null,
    @ProtoId(3) @JvmField val type: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyAccountLevelChange", encode())
}

@Serializable data class NotifyGameFinishReward (
    @ProtoId(1) @JvmField val mode_id: Int = 0,
    @ProtoId(2) @JvmField val level_change: LevelChange? = null,
    @ProtoId(3) @JvmField val match_chest: MatchChest? = null,
    @ProtoId(4) @JvmField val main_character: MainCharacter? = null,
    @ProtoId(5) @JvmField val character_gift: CharacterGift? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyGameFinishReward", encode())

    @Serializable data class LevelChange (
        @ProtoId(1) @JvmField val origin: AccountLevel? = null,
        @ProtoId(2) @JvmField val final: AccountLevel? = null,
        @ProtoId(3) @JvmField val type: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.LevelChange", encode())
    }


    @Serializable data class MatchChest (
        @ProtoId(1) @JvmField val chest_id: Int = 0,
        @ProtoId(2) @JvmField val origin: Int = 0,
        @ProtoId(3) @JvmField val final: Int = 0,
        @ProtoId(4) @JvmField val is_graded: Boolean = false,
        @ProtoId(5) @JvmField val rewards: List<RewardSlot> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.MatchChest", encode())
    }


    @Serializable data class MainCharacter (
        @ProtoId(1) @JvmField val level: Int = 0,
        @ProtoId(2) @JvmField val exp: Int = 0,
        @ProtoId(3) @JvmField val add: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.MainCharacter", encode())
    }


    @Serializable data class CharacterGift (
        @ProtoId(1) @JvmField val origin: Int = 0,
        @ProtoId(2) @JvmField val final: Int = 0,
        @ProtoId(3) @JvmField val add: Int = 0,
        @ProtoId(4) @JvmField val is_graded: Boolean = false
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.CharacterGift", encode())
    }

}

@Serializable data class NotifyActivityReward (
    @ProtoId(1) @JvmField val activity_reward: List<ActivityReward> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyActivityReward", encode())

    @Serializable data class ActivityReward (
        @ProtoId(1) @JvmField val activity_id: Int = 0,
        @ProtoId(2) @JvmField val rewards: List<RewardSlot> = emptyList()
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ActivityReward", encode())
    }

}

@Serializable data class NotifyActivityPoint (
    @ProtoId(1) @JvmField val activity_points: List<ActivityPoint> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyActivityPoint", encode())

    @Serializable data class ActivityPoint (
        @ProtoId(1) @JvmField val activity_id: Int = 0,
        @ProtoId(2) @JvmField val point: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.ActivityPoint", encode())
    }

}

@Serializable data class NotifyLeaderboardPoint (
    @ProtoId(1) @JvmField val leaderboard_points: List<LeaderboardPoint> = emptyList()
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyLeaderboardPoint", encode())

    @Serializable data class LeaderboardPoint (
        @ProtoId(1) @JvmField val leaderboard_id: Int = 0,
        @ProtoId(2) @JvmField val point: Int = 0
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.LeaderboardPoint", encode())
    }

}

@Serializable data class NotifyGamePause (
    @ProtoId(1) @JvmField val paused: Boolean = false
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyGamePause", encode())
}

@Serializable data class NotifyEndGameVote (
    @ProtoId(1) @JvmField val results: List<VoteResult> = emptyList(),
    @ProtoId(2) @JvmField val start_time: Int = 0,
    @ProtoId(3) @JvmField val duration_time: Int = 0
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyEndGameVote", encode())

    @Serializable data class VoteResult (
        @ProtoId(1) @JvmField val account_id: Int = 0,
        @ProtoId(2) @JvmField val yes: Boolean = false
    ) : IProtoMessage {
        override fun encode() = ProtoBuf.dump(serializer(), this)
        override fun wrap() = Wrapper(".lq.VoteResult", encode())
    }

}

@Serializable data class NotifyObserveData (
    @ProtoId(1) @JvmField val unit: GameLiveUnit? = null
) : IProtoMessage {
    override fun encode() = ProtoBuf.dump(serializer(), this)
    override fun wrap() = Wrapper(".lq.NotifyObserveData", encode())
}

