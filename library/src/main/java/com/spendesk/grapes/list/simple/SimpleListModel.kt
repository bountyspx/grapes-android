package com.spendesk.grapes.list.simple

import com.spendesk.grapes.component.SimpleEntryItemView
import com.spendesk.grapes.component.SimpleSectionItemView

/**
 * @author danyboucanova
 * @since 12/07/2021
 */
sealed class SimpleListModel(val viewType: SimpleListViewType) {
    class Item(val id: String, val configuration: SimpleEntryItemView.Configuration) : SimpleListModel(SimpleListViewType.ITEM)
    class Section(val id: String, val configuration: SimpleSectionItemView.Configuration) : SimpleListModel(SimpleListViewType.SECTION)
}