define(['exports', 'kotlin', '@jetbrains/ring-ui/components/data-list/data-list'], function (_, Kotlin, $module$_jetbrains_ring_ui_components_data_list_data_list) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var getKClass = Kotlin.getKClass;
  var DataList = $module$_jetbrains_ring_ui_components_data_list_data_list.default;
  function Item(id, title, selectable, collapsible, collapsed, onCollapse, onExpand, items) {
    if (selectable === void 0)
      selectable = null;
    if (collapsible === void 0)
      collapsible = null;
    if (collapsed === void 0)
      collapsed = null;
    if (onCollapse === void 0)
      onCollapse = Item_init$lambda;
    if (onExpand === void 0)
      onExpand = Item_init$lambda_0;
    if (items === void 0)
      items = null;
    this.id = id;
    this.title = title;
    this.selectable = selectable;
    this.collapsible = collapsible;
    this.collapsed = collapsed;
    this.onCollapse = onCollapse;
    this.onExpand = onExpand;
    this.items = items;
  }
  function Item_init$lambda() {
    return Unit;
  }
  function Item_init$lambda_0() {
    return Unit;
  }
  Item.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Item',
    interfaces: []
  };
  Item.prototype.component1 = function () {
    return this.id;
  };
  Item.prototype.component2 = function () {
    return this.title;
  };
  Item.prototype.component3 = function () {
    return this.selectable;
  };
  Item.prototype.component4 = function () {
    return this.collapsible;
  };
  Item.prototype.component5 = function () {
    return this.collapsed;
  };
  Item.prototype.component6 = function () {
    return this.onCollapse;
  };
  Item.prototype.component7 = function () {
    return this.onExpand;
  };
  Item.prototype.component8 = function () {
    return this.items;
  };
  Item.prototype.copy_u02vd4$ = function (id, title, selectable, collapsible, collapsed, onCollapse, onExpand, items) {
    return new Item(id === void 0 ? this.id : id, title === void 0 ? this.title : title, selectable === void 0 ? this.selectable : selectable, collapsible === void 0 ? this.collapsible : collapsible, collapsed === void 0 ? this.collapsed : collapsed, onCollapse === void 0 ? this.onCollapse : onCollapse, onExpand === void 0 ? this.onExpand : onExpand, items === void 0 ? this.items : items);
  };
  Item.prototype.toString = function () {
    return 'Item(id=' + Kotlin.toString(this.id) + (', title=' + Kotlin.toString(this.title)) + (', selectable=' + Kotlin.toString(this.selectable)) + (', collapsible=' + Kotlin.toString(this.collapsible)) + (', collapsed=' + Kotlin.toString(this.collapsed)) + (', onCollapse=' + Kotlin.toString(this.onCollapse)) + (', onExpand=' + Kotlin.toString(this.onExpand)) + (', items=' + Kotlin.toString(this.items)) + ')';
  };
  Item.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.id) | 0;
    result = result * 31 + Kotlin.hashCode(this.title) | 0;
    result = result * 31 + Kotlin.hashCode(this.selectable) | 0;
    result = result * 31 + Kotlin.hashCode(this.collapsible) | 0;
    result = result * 31 + Kotlin.hashCode(this.collapsed) | 0;
    result = result * 31 + Kotlin.hashCode(this.onCollapse) | 0;
    result = result * 31 + Kotlin.hashCode(this.onExpand) | 0;
    result = result * 31 + Kotlin.hashCode(this.items) | 0;
    return result;
  };
  Item.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.id, other.id) && Kotlin.equals(this.title, other.title) && Kotlin.equals(this.selectable, other.selectable) && Kotlin.equals(this.collapsible, other.collapsible) && Kotlin.equals(this.collapsed, other.collapsed) && Kotlin.equals(this.onCollapse, other.onCollapse) && Kotlin.equals(this.onExpand, other.onExpand) && Kotlin.equals(this.items, other.items)))));
  };
  function MoreLessButtonStates() {
    MoreLessButtonStates_instance = this;
    this.UNUSED = 0;
    this.MORE = 1;
    this.MORE_LOADING = 2;
    this.LESS = 3;
  }
  MoreLessButtonStates.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'MoreLessButtonStates',
    interfaces: []
  };
  var MoreLessButtonStates_instance = null;
  function MoreLessButtonStates_getInstance() {
    if (MoreLessButtonStates_instance === null) {
      new MoreLessButtonStates();
    }
    return MoreLessButtonStates_instance;
  }
  function DataListProps() {
  }
  DataListProps.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'DataListProps',
    interfaces: []
  };
  function dataList$lambda($receiver) {
    return Unit;
  }
  function dataList$lambda_0(closure$block) {
    return function ($receiver) {
      closure$block($receiver);
      return Unit;
    };
  }
  function dataList($receiver, block) {
    if (block === void 0)
      block = dataList$lambda;
    return $receiver.child_bzgiuu$(getKClass(DataList), dataList$lambda_0(block));
  }
  var package$ringui = _.ringui || (_.ringui = {});
  var package$dataList = package$ringui.dataList || (package$ringui.dataList = {});
  package$dataList.Item = Item;
  Object.defineProperty(package$dataList, 'MoreLessButtonStates', {
    get: MoreLessButtonStates_getInstance
  });
  package$dataList.DataListProps = DataListProps;
  package$dataList.dataList_ejswat$ = dataList;
  Kotlin.defineModule('kotlin-ring-ui-datalist', _);
  return _;
});

//# sourceMappingURL=kotlin-ring-ui-datalist.js.map
