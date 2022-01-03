package com.olvind.mui.muiSystem.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.csstype.mod.Property.AlignContent
import com.olvind.mui.csstype.mod.Property.AlignItems
import com.olvind.mui.csstype.mod.Property.AlignSelf
import com.olvind.mui.csstype.mod.Property.BackgroundColor
import com.olvind.mui.csstype.mod.Property.Border
import com.olvind.mui.csstype.mod.Property.BorderBottom
import com.olvind.mui.csstype.mod.Property.BorderColor
import com.olvind.mui.csstype.mod.Property.BorderLeft
import com.olvind.mui.csstype.mod.Property.BorderRadius
import com.olvind.mui.csstype.mod.Property.BorderRight
import com.olvind.mui.csstype.mod.Property.BorderTop
import com.olvind.mui.csstype.mod.Property.Bottom
import com.olvind.mui.csstype.mod.Property.BoxShadow
import com.olvind.mui.csstype.mod.Property.BoxSizing
import com.olvind.mui.csstype.mod.Property.Color
import com.olvind.mui.csstype.mod.Property.ColumnGap
import com.olvind.mui.csstype.mod.Property.Display
import com.olvind.mui.csstype.mod.Property.Flex
import com.olvind.mui.csstype.mod.Property.FlexBasis
import com.olvind.mui.csstype.mod.Property.FlexDirection
import com.olvind.mui.csstype.mod.Property.FlexGrow
import com.olvind.mui.csstype.mod.Property.FlexShrink
import com.olvind.mui.csstype.mod.Property.FlexWrap
import com.olvind.mui.csstype.mod.Property.FontFamily
import com.olvind.mui.csstype.mod.Property.FontSize
import com.olvind.mui.csstype.mod.Property.FontStyle
import com.olvind.mui.csstype.mod.Property.FontWeight
import com.olvind.mui.csstype.mod.Property.Gap
import com.olvind.mui.csstype.mod.Property.GridArea
import com.olvind.mui.csstype.mod.Property.GridAutoColumns
import com.olvind.mui.csstype.mod.Property.GridAutoFlow
import com.olvind.mui.csstype.mod.Property.GridAutoRows
import com.olvind.mui.csstype.mod.Property.GridColumn
import com.olvind.mui.csstype.mod.Property.GridRow
import com.olvind.mui.csstype.mod.Property.GridTemplateAreas
import com.olvind.mui.csstype.mod.Property.GridTemplateColumns
import com.olvind.mui.csstype.mod.Property.GridTemplateRows
import com.olvind.mui.csstype.mod.Property.Height
import com.olvind.mui.csstype.mod.Property.JustifyContent
import com.olvind.mui.csstype.mod.Property.JustifyItems
import com.olvind.mui.csstype.mod.Property.JustifySelf
import com.olvind.mui.csstype.mod.Property.Left
import com.olvind.mui.csstype.mod.Property.LetterSpacing
import com.olvind.mui.csstype.mod.Property.LineHeight
import com.olvind.mui.csstype.mod.Property.Margin
import com.olvind.mui.csstype.mod.Property.MarginBottom
import com.olvind.mui.csstype.mod.Property.MarginLeft
import com.olvind.mui.csstype.mod.Property.MarginRight
import com.olvind.mui.csstype.mod.Property.MarginTop
import com.olvind.mui.csstype.mod.Property.MaxHeight
import com.olvind.mui.csstype.mod.Property.MaxWidth
import com.olvind.mui.csstype.mod.Property.MinHeight
import com.olvind.mui.csstype.mod.Property.MinWidth
import com.olvind.mui.csstype.mod.Property.Order
import com.olvind.mui.csstype.mod.Property.Overflow
import com.olvind.mui.csstype.mod.Property.Padding
import com.olvind.mui.csstype.mod.Property.PaddingBottom
import com.olvind.mui.csstype.mod.Property.PaddingLeft
import com.olvind.mui.csstype.mod.Property.PaddingRight
import com.olvind.mui.csstype.mod.Property.PaddingTop
import com.olvind.mui.csstype.mod.Property.Position
import com.olvind.mui.csstype.mod.Property.Right
import com.olvind.mui.csstype.mod.Property.RowGap
import com.olvind.mui.csstype.mod.Property.TextAlign
import com.olvind.mui.csstype.mod.Property.TextOverflow
import com.olvind.mui.csstype.mod.Property.Top
import com.olvind.mui.csstype.mod.Property.Visibility
import com.olvind.mui.csstype.mod.Property.Width
import com.olvind.mui.csstype.mod.Property.ZIndex
import com.olvind.mui.muiSystem.anon.DefaultComponentPropsBoxTypeMapdiv
import com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme
import com.olvind.mui.muiSystem.muiSystemNumbers.`0`
import com.olvind.mui.muiSystem.muiSystemStrings.`additions removals`
import com.olvind.mui.muiSystem.muiSystemStrings.`additions text`
import com.olvind.mui.muiSystem.muiSystemStrings.`inline`
import com.olvind.mui.muiSystem.muiSystemStrings.`removals additions`
import com.olvind.mui.muiSystem.muiSystemStrings.`removals text`
import com.olvind.mui.muiSystem.muiSystemStrings.`text additions`
import com.olvind.mui.muiSystem.muiSystemStrings.`text removals`
import com.olvind.mui.muiSystem.muiSystemStrings.additions
import com.olvind.mui.muiSystem.muiSystemStrings.all
import com.olvind.mui.muiSystem.muiSystemStrings.ascending
import com.olvind.mui.muiSystem.muiSystemStrings.assertive
import com.olvind.mui.muiSystem.muiSystemStrings.both
import com.olvind.mui.muiSystem.muiSystemStrings.copy
import com.olvind.mui.muiSystem.muiSystemStrings.date
import com.olvind.mui.muiSystem.muiSystemStrings.decimal
import com.olvind.mui.muiSystem.muiSystemStrings.descending
import com.olvind.mui.muiSystem.muiSystemStrings.dialog
import com.olvind.mui.muiSystem.muiSystemStrings.email
import com.olvind.mui.muiSystem.muiSystemStrings.execute
import com.olvind.mui.muiSystem.muiSystemStrings.grammar
import com.olvind.mui.muiSystem.muiSystemStrings.grid
import com.olvind.mui.muiSystem.muiSystemStrings.horizontal
import com.olvind.mui.muiSystem.muiSystemStrings.inherit
import com.olvind.mui.muiSystem.muiSystemStrings.link
import com.olvind.mui.muiSystem.muiSystemStrings.list
import com.olvind.mui.muiSystem.muiSystemStrings.listbox
import com.olvind.mui.muiSystem.muiSystemStrings.location
import com.olvind.mui.muiSystem.muiSystemStrings.menu
import com.olvind.mui.muiSystem.muiSystemStrings.mixed
import com.olvind.mui.muiSystem.muiSystemStrings.move
import com.olvind.mui.muiSystem.muiSystemStrings.no
import com.olvind.mui.muiSystem.muiSystemStrings.none
import com.olvind.mui.muiSystem.muiSystemStrings.numeric
import com.olvind.mui.muiSystem.muiSystemStrings.off
import com.olvind.mui.muiSystem.muiSystemStrings.on
import com.olvind.mui.muiSystem.muiSystemStrings.other
import com.olvind.mui.muiSystem.muiSystemStrings.page
import com.olvind.mui.muiSystem.muiSystemStrings.polite
import com.olvind.mui.muiSystem.muiSystemStrings.popup
import com.olvind.mui.muiSystem.muiSystemStrings.removals
import com.olvind.mui.muiSystem.muiSystemStrings.search
import com.olvind.mui.muiSystem.muiSystemStrings.spelling
import com.olvind.mui.muiSystem.muiSystemStrings.step
import com.olvind.mui.muiSystem.muiSystemStrings.tel
import com.olvind.mui.muiSystem.muiSystemStrings.text
import com.olvind.mui.muiSystem.muiSystemStrings.time
import com.olvind.mui.muiSystem.muiSystemStrings.tree
import com.olvind.mui.muiSystem.muiSystemStrings.url
import com.olvind.mui.muiSystem.muiSystemStrings.vertical
import com.olvind.mui.muiSystem.muiSystemStrings.yes
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.DragEvent
import com.olvind.mui.std.NonNullable
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("@mui/system", "Box")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignContent(
      value: (ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
        ])
    ): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignContentFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
    ): this.type = set("alignContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def alignContentVarargs(
      value: (js.UndefOr[
          AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]] | NonNullable[js.UndefOr[AlignContent]] | Null
        ])*
    ): this.type = set("alignContent", js.Array(value :_*))
    
    @scala.inline
    def alignItems(
      value: (ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
        ])
    ): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignItemsFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
    ): this.type = set("alignItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def alignItemsVarargs(
      value: (js.UndefOr[
          AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]] | NonNullable[js.UndefOr[AlignItems]] | Null
        ])*
    ): this.type = set("alignItems", js.Array(value :_*))
    
    @scala.inline
    def alignSelf(
      value: (ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
        ])
    ): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelfFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
    ): this.type = set("alignSelf", js.Any.fromFunction1(value))
    
    @scala.inline
    def alignSelfVarargs(
      value: (js.UndefOr[
          AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]] | NonNullable[js.UndefOr[AlignSelf]] | Null
        ])*
    ): this.type = set("alignSelf", js.Array(value :_*))
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgcolor(
      value: (ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
        ])
    ): this.type = set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgcolorFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
    ): this.type = set("bgcolor", js.Any.fromFunction1(value))
    
    @scala.inline
    def bgcolorVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[BackgroundColor]]] | BackgroundColor | NonNullable[js.UndefOr[BackgroundColor]] | Null
        ])*
    ): this.type = set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def border(
      value: (ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]
        ])
    ): this.type = set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottom(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (BorderBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (BorderBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (BorderBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]])
          ]
        ]
    ): this.type = set("borderBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderBottomVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]]) | (BorderBottom[Double | String]) | (NonNullable[js.UndefOr[BorderBottom[Double | String]]]) | Null
        ])*
    ): this.type = set("borderBottom", js.Array(value :_*))
    
    @scala.inline
    def borderColor(
      value: (ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
        ])
    ): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColorFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
    ): this.type = set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderColorVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[BorderColor]]] | BorderColor | NonNullable[js.UndefOr[BorderColor]] | Null
        ])*
    ): this.type = set("borderColor", js.Array(value :_*))
    
    @scala.inline
    def borderFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]): this.type = set("border", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderLeft(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (BorderLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (BorderLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeftFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (BorderLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("borderLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderLeftVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]]) | (BorderLeft[Double | String]) | (NonNullable[js.UndefOr[BorderLeft[Double | String]]]) | Null
        ])*
    ): this.type = set("borderLeft", js.Array(value :_*))
    
    @scala.inline
    def borderRadius(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (BorderRadius[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (BorderRadius[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadiusFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (BorderRadius[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]])
          ]
        ]
    ): this.type = set("borderRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderRadiusVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]]) | (BorderRadius[Double | String]) | (NonNullable[js.UndefOr[BorderRadius[Double | String]]]) | Null
        ])*
    ): this.type = set("borderRadius", js.Array(value :_*))
    
    @scala.inline
    def borderRight(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (BorderRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (BorderRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (BorderRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]])
          ]
        ]
    ): this.type = set("borderRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderRightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]]) | (BorderRight[Double | String]) | (NonNullable[js.UndefOr[BorderRight[Double | String]]]) | Null
        ])*
    ): this.type = set("borderRight", js.Array(value :_*))
    
    @scala.inline
    def borderTop(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (BorderTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (BorderTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (BorderTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]])
          ]
        ]
    ): this.type = set("borderTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderTopVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]]) | (BorderTop[Double | String]) | (NonNullable[js.UndefOr[BorderTop[Double | String]]]) | Null
        ])*
    ): this.type = set("borderTop", js.Array(value :_*))
    
    @scala.inline
    def borderVarargs(value: ((js.UndefOr[(Border[String | `0`]) | Double]) | Null)*): this.type = set("border", js.Array(value :_*))
    
    @scala.inline
    def bottom(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Bottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Bottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Bottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]])
          ]
        ]
    ): this.type = set("bottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def bottomVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]]) | (Bottom[Double | String]) | (NonNullable[js.UndefOr[Bottom[Double | String]]]) | Null
        ])*
    ): this.type = set("bottom", js.Array(value :_*))
    
    @scala.inline
    def boxShadow(
      value: (ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]])
    ): this.type = set("boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxShadowFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]): this.type = set("boxShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def boxShadowVarargs(value: ((js.UndefOr[BoxShadow | Double]) | Null)*): this.type = set("boxShadow", js.Array(value :_*))
    
    @scala.inline
    def boxSizing(
      value: (ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
        ])
    ): this.type = set("boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxSizingFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
    ): this.type = set("boxSizing", js.Any.fromFunction1(value))
    
    @scala.inline
    def boxSizingVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[BoxSizing]]] | BoxSizing | NonNullable[js.UndefOr[BoxSizing]] | Null
        ])*
    ): this.type = set("boxSizing", js.Array(value :_*))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(
      value: (ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
        ])
    ): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
    ): this.type = set("color", js.Any.fromFunction1(value))
    
    @scala.inline
    def colorVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Color]]] | Color | NonNullable[js.UndefOr[Color]] | Null
        ])*
    ): this.type = set("color", js.Array(value :_*))
    
    @scala.inline
    def columnGap(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (ColumnGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (ColumnGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnGapFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (ColumnGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]])
          ]
        ]
    ): this.type = set("columnGap", js.Any.fromFunction1(value))
    
    @scala.inline
    def columnGapVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]]) | (ColumnGap[Double | String]) | (NonNullable[js.UndefOr[ColumnGap[Double | String]]]) | Null
        ])*
    ): this.type = set("columnGap", js.Array(value :_*))
    
    @scala.inline
    def component(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(
      value: (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
        ])
    ): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
    ): this.type = set("display", js.Any.fromFunction1(value))
    
    @scala.inline
    def displayPrint(
      value: (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
        ])
    ): this.type = set("displayPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayPrintFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
    ): this.type = set("displayPrint", js.Any.fromFunction1(value))
    
    @scala.inline
    def displayPrintVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Display]]] | Display | NonNullable[js.UndefOr[Display]] | Null
        ])*
    ): this.type = set("displayPrint", js.Array(value :_*))
    
    @scala.inline
    def displayVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Display]]] | Display | NonNullable[js.UndefOr[Display]] | Null
        ])*
    ): this.type = set("display", js.Array(value :_*))
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flex(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Flex[Double | String]) | (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Flex[Double | String]) | (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexBasis(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (FlexBasis[Double | String]) | (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (FlexBasis[Double | String]) | (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexBasisFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (FlexBasis[Double | String]) | (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]])
          ]
        ]
    ): this.type = set("flexBasis", js.Any.fromFunction1(value))
    
    @scala.inline
    def flexBasisVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]]) | (FlexBasis[Double | String]) | (NonNullable[js.UndefOr[FlexBasis[Double | String]]]) | Null
        ])*
    ): this.type = set("flexBasis", js.Array(value :_*))
    
    @scala.inline
    def flexDirection(
      value: (ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
        ])
    ): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexDirectionFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
    ): this.type = set("flexDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def flexDirectionVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[FlexDirection]]] | FlexDirection | NonNullable[js.UndefOr[FlexDirection]] | Null
        ])*
    ): this.type = set("flexDirection", js.Array(value :_*))
    
    @scala.inline
    def flexFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Flex[Double | String]) | (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]])
          ]
        ]
    ): this.type = set("flex", js.Any.fromFunction1(value))
    
    @scala.inline
    def flexGrow(
      value: (ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
        ])
    ): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexGrowFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
    ): this.type = set("flexGrow", js.Any.fromFunction1(value))
    
    @scala.inline
    def flexGrowVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[FlexGrow]]] | FlexGrow | NonNullable[js.UndefOr[FlexGrow]] | Null
        ])*
    ): this.type = set("flexGrow", js.Array(value :_*))
    
    @scala.inline
    def flexShrink(
      value: (ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
        ])
    ): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexShrinkFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
    ): this.type = set("flexShrink", js.Any.fromFunction1(value))
    
    @scala.inline
    def flexShrinkVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[FlexShrink]]] | FlexShrink | NonNullable[js.UndefOr[FlexShrink]] | Null
        ])*
    ): this.type = set("flexShrink", js.Array(value :_*))
    
    @scala.inline
    def flexVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]]) | (Flex[Double | String]) | (NonNullable[js.UndefOr[Flex[Double | String]]]) | Null
        ])*
    ): this.type = set("flex", js.Array(value :_*))
    
    @scala.inline
    def flexWrap(
      value: (ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
        ])
    ): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexWrapFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
    ): this.type = set("flexWrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def flexWrapVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[FlexWrap]]] | FlexWrap | NonNullable[js.UndefOr[FlexWrap]] | Null
        ])*
    ): this.type = set("flexWrap", js.Array(value :_*))
    
    @scala.inline
    def fontFamily(
      value: (ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
        ])
    ): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamilyFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
    ): this.type = set("fontFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def fontFamilyVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[FontFamily]]] | FontFamily | NonNullable[js.UndefOr[FontFamily]] | Null
        ])*
    ): this.type = set("fontFamily", js.Array(value :_*))
    
    @scala.inline
    def fontSize(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (FontSize[Double | String]) | (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (FontSize[Double | String]) | (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (FontSize[Double | String]) | (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]])
          ]
        ]
    ): this.type = set("fontSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def fontSizeVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]]) | (FontSize[Double | String]) | (NonNullable[js.UndefOr[FontSize[Double | String]]]) | Null
        ])*
    ): this.type = set("fontSize", js.Array(value :_*))
    
    @scala.inline
    def fontStyle(
      value: (ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
        ])
    ): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyleFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
    ): this.type = set("fontStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def fontStyleVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[FontStyle]]] | FontStyle | NonNullable[js.UndefOr[FontStyle]] | Null
        ])*
    ): this.type = set("fontStyle", js.Array(value :_*))
    
    @scala.inline
    def fontWeight(
      value: (ResponsiveStyleValue[js.UndefOr[FontWeight | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[FontWeight | String]]])
    ): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeightFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontWeight | String]]): this.type = set("fontWeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def fontWeightVarargs(value: ((js.UndefOr[FontWeight | String]) | Null)*): this.type = set("fontWeight", js.Array(value :_*))
    
    @scala.inline
    def gap(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Gap[Double | String]) | (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Gap[Double | String]) | (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gapFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Gap[Double | String]) | (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]])
          ]
        ]
    ): this.type = set("gap", js.Any.fromFunction1(value))
    
    @scala.inline
    def gapVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]]) | (Gap[Double | String]) | (NonNullable[js.UndefOr[Gap[Double | String]]]) | Null
        ])*
    ): this.type = set("gap", js.Array(value :_*))
    
    @scala.inline
    def gridArea(
      value: (ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
        ])
    ): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAreaFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
    ): this.type = set("gridArea", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridAreaVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[GridArea]]] | GridArea | NonNullable[js.UndefOr[GridArea]] | Null
        ])*
    ): this.type = set("gridArea", js.Array(value :_*))
    
    @scala.inline
    def gridAutoColumns(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (GridAutoColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (GridAutoColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAutoColumnsFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (GridAutoColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]])
          ]
        ]
    ): this.type = set("gridAutoColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridAutoColumnsVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]]) | (GridAutoColumns[Double | String]) | (NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]) | Null
        ])*
    ): this.type = set("gridAutoColumns", js.Array(value :_*))
    
    @scala.inline
    def gridAutoFlow(
      value: (ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
        ])
    ): this.type = set("gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAutoFlowFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
    ): this.type = set("gridAutoFlow", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridAutoFlowVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[GridAutoFlow]]] | GridAutoFlow | NonNullable[js.UndefOr[GridAutoFlow]] | Null
        ])*
    ): this.type = set("gridAutoFlow", js.Array(value :_*))
    
    @scala.inline
    def gridAutoRows(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (GridAutoRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (GridAutoRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAutoRowsFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (GridAutoRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]])
          ]
        ]
    ): this.type = set("gridAutoRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridAutoRowsVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]]) | (GridAutoRows[Double | String]) | (NonNullable[js.UndefOr[GridAutoRows[Double | String]]]) | Null
        ])*
    ): this.type = set("gridAutoRows", js.Array(value :_*))
    
    @scala.inline
    def gridColumn(
      value: (ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
        ])
    ): this.type = set("gridColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumnFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
    ): this.type = set("gridColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridColumnVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[GridColumn]]] | GridColumn | NonNullable[js.UndefOr[GridColumn]] | Null
        ])*
    ): this.type = set("gridColumn", js.Array(value :_*))
    
    @scala.inline
    def gridRow(
      value: (ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
        ])
    ): this.type = set("gridRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridRowFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
    ): this.type = set("gridRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridRowVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[GridRow]]] | GridRow | NonNullable[js.UndefOr[GridRow]] | Null
        ])*
    ): this.type = set("gridRow", js.Array(value :_*))
    
    @scala.inline
    def gridTemplateAreas(
      value: (ResponsiveStyleValue[
          js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
          ]
        ])
    ): this.type = set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateAreasFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
        ]
    ): this.type = set("gridTemplateAreas", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridTemplateAreasVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]] | GridTemplateAreas | NonNullable[js.UndefOr[GridTemplateAreas]] | Null
        ])*
    ): this.type = set("gridTemplateAreas", js.Array(value :_*))
    
    @scala.inline
    def gridTemplateColumns(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (GridTemplateColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (GridTemplateColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateColumnsFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (GridTemplateColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]])
          ]
        ]
    ): this.type = set("gridTemplateColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridTemplateColumnsVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]]) | (GridTemplateColumns[Double | String]) | (NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]) | Null
        ])*
    ): this.type = set("gridTemplateColumns", js.Array(value :_*))
    
    @scala.inline
    def gridTemplateRows(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (GridTemplateRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (GridTemplateRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateRowsFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (GridTemplateRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]])
          ]
        ]
    ): this.type = set("gridTemplateRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def gridTemplateRowsVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]]) | (GridTemplateRows[Double | String]) | (NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]) | Null
        ])*
    ): this.type = set("gridTemplateRows", js.Array(value :_*))
    
    @scala.inline
    def height(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Height[Double | String]) | (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Height[Double | String]) | (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Height[Double | String]) | (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]])
          ]
        ]
    ): this.type = set("height", js.Any.fromFunction1(value))
    
    @scala.inline
    def heightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]]) | (Height[Double | String]) | (NonNullable[js.UndefOr[Height[Double | String]]]) | Null
        ])*
    ): this.type = set("height", js.Array(value :_*))
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyContent(
      value: (ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
        ])
    ): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyContentFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
    ): this.type = set("justifyContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def justifyContentVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[JustifyContent]]] | JustifyContent | NonNullable[js.UndefOr[JustifyContent]] | Null
        ])*
    ): this.type = set("justifyContent", js.Array(value :_*))
    
    @scala.inline
    def justifyItems(
      value: (ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
        ])
    ): this.type = set("justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyItemsFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
    ): this.type = set("justifyItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def justifyItemsVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[JustifyItems]]] | JustifyItems | NonNullable[js.UndefOr[JustifyItems]] | Null
        ])*
    ): this.type = set("justifyItems", js.Array(value :_*))
    
    @scala.inline
    def justifySelf(
      value: (ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
        ])
    ): this.type = set("justifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifySelfFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
    ): this.type = set("justifySelf", js.Any.fromFunction1(value))
    
    @scala.inline
    def justifySelfVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[JustifySelf]]] | JustifySelf | NonNullable[js.UndefOr[JustifySelf]] | Null
        ])*
    ): this.type = set("justifySelf", js.Array(value :_*))
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Left[Double | String]) | (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Left[Double | String]) | (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Left[Double | String]) | (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]])
          ]
        ]
    ): this.type = set("left", js.Any.fromFunction1(value))
    
    @scala.inline
    def leftVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]]) | (Left[Double | String]) | (NonNullable[js.UndefOr[Left[Double | String]]]) | Null
        ])*
    ): this.type = set("left", js.Array(value :_*))
    
    @scala.inline
    def letterSpacing(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (LetterSpacing[Double | String]) | (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (LetterSpacing[Double | String]) | (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacingFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (LetterSpacing[Double | String]) | (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]])
          ]
        ]
    ): this.type = set("letterSpacing", js.Any.fromFunction1(value))
    
    @scala.inline
    def letterSpacingVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]]) | (LetterSpacing[Double | String]) | (NonNullable[js.UndefOr[LetterSpacing[Double | String]]]) | Null
        ])*
    ): this.type = set("letterSpacing", js.Array(value :_*))
    
    @scala.inline
    def lineHeight(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (LineHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (LineHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (LineHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]])
          ]
        ]
    ): this.type = set("lineHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def lineHeightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]]) | (LineHeight[Double | String]) | (NonNullable[js.UndefOr[LineHeight[Double | String]]]) | Null
        ])*
    ): this.type = set("lineHeight", js.Array(value :_*))
    
    @scala.inline
    def m(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
          ]
        ]
    ): this.type = set("m", js.Any.fromFunction1(value))
    
    @scala.inline
    def mVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]]) | (Margin[Double | String]) | (NonNullable[js.UndefOr[Margin[Double | String]]]) | Null
        ])*
    ): this.type = set("m", js.Array(value :_*))
    
    @scala.inline
    def margin(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottom(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottomFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
          ]
        ]
    ): this.type = set("marginBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginBottomVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]]) | (MarginBottom[Double | String]) | (NonNullable[js.UndefOr[MarginBottom[Double | String]]]) | Null
        ])*
    ): this.type = set("marginBottom", js.Array(value :_*))
    
    @scala.inline
    def marginFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
          ]
        ]
    ): this.type = set("margin", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginLeft(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginLeftFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("marginLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginLeftVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
        ])*
    ): this.type = set("marginLeft", js.Array(value :_*))
    
    @scala.inline
    def marginRight(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginRightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
          ]
        ]
    ): this.type = set("marginRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginRightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]]) | (MarginRight[Double | String]) | (NonNullable[js.UndefOr[MarginRight[Double | String]]]) | Null
        ])*
    ): this.type = set("marginRight", js.Array(value :_*))
    
    @scala.inline
    def marginTop(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginTopFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]
    ): this.type = set("marginTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginTopVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
        ])*
    ): this.type = set("marginTop", js.Array(value :_*))
    
    @scala.inline
    def marginVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]]) | (Margin[Double | String]) | (NonNullable[js.UndefOr[Margin[Double | String]]]) | Null
        ])*
    ): this.type = set("margin", js.Array(value :_*))
    
    @scala.inline
    def marginX(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginXFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("marginX", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginXVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
        ])*
    ): this.type = set("marginX", js.Array(value :_*))
    
    @scala.inline
    def marginY(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginYFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]
    ): this.type = set("marginY", js.Any.fromFunction1(value))
    
    @scala.inline
    def marginYVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
        ])*
    ): this.type = set("marginY", js.Array(value :_*))
    
    @scala.inline
    def maxHeight(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MaxHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MaxHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MaxHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]])
          ]
        ]
    ): this.type = set("maxHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxHeightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]]) | (MaxHeight[Double | String]) | (NonNullable[js.UndefOr[MaxHeight[Double | String]]]) | Null
        ])*
    ): this.type = set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def maxWidth(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MaxWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MaxWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidthFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MaxWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]])
          ]
        ]
    ): this.type = set("maxWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxWidthVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]]) | (MaxWidth[Double | String]) | (NonNullable[js.UndefOr[MaxWidth[Double | String]]]) | Null
        ])*
    ): this.type = set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def mb(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mbFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
          ]
        ]
    ): this.type = set("mb", js.Any.fromFunction1(value))
    
    @scala.inline
    def mbVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]]) | (MarginBottom[Double | String]) | (NonNullable[js.UndefOr[MarginBottom[Double | String]]]) | Null
        ])*
    ): this.type = set("mb", js.Array(value :_*))
    
    @scala.inline
    def minHeight(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MinHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MinHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MinHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]])
          ]
        ]
    ): this.type = set("minHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def minHeightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]]) | (MinHeight[Double | String]) | (NonNullable[js.UndefOr[MinHeight[Double | String]]]) | Null
        ])*
    ): this.type = set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def minWidth(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MinWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MinWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidthFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MinWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]])
          ]
        ]
    ): this.type = set("minWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def minWidthVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]]) | (MinWidth[Double | String]) | (NonNullable[js.UndefOr[MinWidth[Double | String]]]) | Null
        ])*
    ): this.type = set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def ml(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mlFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("ml", js.Any.fromFunction1(value))
    
    @scala.inline
    def mlVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
        ])*
    ): this.type = set("ml", js.Array(value :_*))
    
    @scala.inline
    def mr(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mrFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
          ]
        ]
    ): this.type = set("mr", js.Any.fromFunction1(value))
    
    @scala.inline
    def mrVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]]) | (MarginRight[Double | String]) | (NonNullable[js.UndefOr[MarginRight[Double | String]]]) | Null
        ])*
    ): this.type = set("mr", js.Array(value :_*))
    
    @scala.inline
    def mt(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mtFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]
    ): this.type = set("mt", js.Any.fromFunction1(value))
    
    @scala.inline
    def mtVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
        ])*
    ): this.type = set("mt", js.Array(value :_*))
    
    @scala.inline
    def mx(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mxFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("mx", js.Any.fromFunction1(value))
    
    @scala.inline
    def mxVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
        ])*
    ): this.type = set("mx", js.Array(value :_*))
    
    @scala.inline
    def my(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def myFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
          ]
        ]
    ): this.type = set("my", js.Any.fromFunction1(value))
    
    @scala.inline
    def myVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
        ])*
    ): this.type = set("my", js.Array(value :_*))
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExit(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def order(
      value: (ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
        ])
    ): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orderFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
    ): this.type = set("order", js.Any.fromFunction1(value))
    
    @scala.inline
    def orderVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Order]]] | NonNullable[js.UndefOr[Order]] | Null | Order
        ])*
    ): this.type = set("order", js.Array(value :_*))
    
    @scala.inline
    def overflow(
      value: (ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
        ])
    ): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
    ): this.type = set("overflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def overflowVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Overflow]]] | NonNullable[js.UndefOr[Overflow]] | Null | Overflow
        ])*
    ): this.type = set("overflow", js.Array(value :_*))
    
    @scala.inline
    def p(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
          ]
        ]
    ): this.type = set("p", js.Any.fromFunction1(value))
    
    @scala.inline
    def pVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]]) | (NonNullable[js.UndefOr[Padding[Double | String]]]) | Null | (Padding[Double | String])
        ])*
    ): this.type = set("p", js.Array(value :_*))
    
    @scala.inline
    def padding(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottom(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottomFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
          ]
        ]
    ): this.type = set("paddingBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingBottomVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingBottom[Double | String]]]) | Null | (PaddingBottom[Double | String])
        ])*
    ): this.type = set("paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def paddingFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
          ]
        ]
    ): this.type = set("padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingLeft(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeftFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("paddingLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingLeftVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
        ])*
    ): this.type = set("paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def paddingRight(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
          ]
        ]
    ): this.type = set("paddingRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingRightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingRight[Double | String]]]) | Null | (PaddingRight[Double | String])
        ])*
    ): this.type = set("paddingRight", js.Array(value :_*))
    
    @scala.inline
    def paddingTop(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTopFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]
    ): this.type = set("paddingTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingTopVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
        ])*
    ): this.type = set("paddingTop", js.Array(value :_*))
    
    @scala.inline
    def paddingVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]]) | (NonNullable[js.UndefOr[Padding[Double | String]]]) | Null | (Padding[Double | String])
        ])*
    ): this.type = set("padding", js.Array(value :_*))
    
    @scala.inline
    def paddingX(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingXFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("paddingX", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingXVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
        ])*
    ): this.type = set("paddingX", js.Array(value :_*))
    
    @scala.inline
    def paddingY(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingYFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]
    ): this.type = set("paddingY", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingYVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
        ])*
    ): this.type = set("paddingY", js.Array(value :_*))
    
    @scala.inline
    def pb(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pbFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
          ]
        ]
    ): this.type = set("pb", js.Any.fromFunction1(value))
    
    @scala.inline
    def pbVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingBottom[Double | String]]]) | Null | (PaddingBottom[Double | String])
        ])*
    ): this.type = set("pb", js.Array(value :_*))
    
    @scala.inline
    def pl(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("pl", js.Any.fromFunction1(value))
    
    @scala.inline
    def plVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
        ])*
    ): this.type = set("pl", js.Array(value :_*))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(
      value: (ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
        ])
    ): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
    ): this.type = set("position", js.Any.fromFunction1(value))
    
    @scala.inline
    def positionVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Position]]] | NonNullable[js.UndefOr[Position]] | Null | Position
        ])*
    ): this.type = set("position", js.Array(value :_*))
    
    @scala.inline
    def pr(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
          ]
        ]
    ): this.type = set("pr", js.Any.fromFunction1(value))
    
    @scala.inline
    def prVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingRight[Double | String]]]) | Null | (PaddingRight[Double | String])
        ])*
    ): this.type = set("pr", js.Array(value :_*))
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pt(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ptFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]
    ): this.type = set("pt", js.Any.fromFunction1(value))
    
    @scala.inline
    def ptVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
        ])*
    ): this.type = set("pt", js.Array(value :_*))
    
    @scala.inline
    def px(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pxFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
          ]
        ]
    ): this.type = set("px", js.Any.fromFunction1(value))
    
    @scala.inline
    def pxVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
        ])*
    ): this.type = set("px", js.Array(value :_*))
    
    @scala.inline
    def py(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("py", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pyFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
          ]
        ]
    ): this.type = set("py", js.Any.fromFunction1(value))
    
    @scala.inline
    def pyVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
        ])*
    ): this.type = set("py", js.Array(value :_*))
    
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Right[Double | String]) | (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Right[Double | String]) | (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Right[Double | String]) | (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]])
          ]
        ]
    ): this.type = set("right", js.Any.fromFunction1(value))
    
    @scala.inline
    def rightVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]]) | (NonNullable[js.UndefOr[Right[Double | String]]]) | Null | (Right[Double | String])
        ])*
    ): this.type = set("right", js.Array(value :_*))
    
    @scala.inline
    def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowGap(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (RowGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (RowGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("rowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowGapFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (RowGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]])
          ]
        ]
    ): this.type = set("rowGap", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowGapVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]]) | (NonNullable[js.UndefOr[RowGap[Double | String]]]) | Null | (RowGap[Double | String])
        ])*
    ): this.type = set("rowGap", js.Array(value :_*))
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def sxNull: this.type = set("sx", null)
    
    @scala.inline
    def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value :_*))
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlign(
      value: (ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
        ])
    ): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlignFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
    ): this.type = set("textAlign", js.Any.fromFunction1(value))
    
    @scala.inline
    def textAlignVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[TextAlign]]] | NonNullable[js.UndefOr[TextAlign]] | Null | TextAlign
        ])*
    ): this.type = set("textAlign", js.Array(value :_*))
    
    @scala.inline
    def textOverflow(
      value: (ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
        ])
    ): this.type = set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textOverflowFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
    ): this.type = set("textOverflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def textOverflowVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[TextOverflow]]] | NonNullable[js.UndefOr[TextOverflow]] | Null | TextOverflow
        ])*
    ): this.type = set("textOverflow", js.Array(value :_*))
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Top[Double | String]) | (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Top[Double | String]) | (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def topFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Top[Double | String]) | (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]])
          ]
        ]
    ): this.type = set("top", js.Any.fromFunction1(value))
    
    @scala.inline
    def topVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]]) | (NonNullable[js.UndefOr[Top[Double | String]]]) | Null | (Top[Double | String])
        ])*
    ): this.type = set("top", js.Array(value :_*))
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typography(
      value: ResponsiveStyleValue[js.UndefOr[String]] | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[String]]])
    ): this.type = set("typography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typographyFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[String]]): this.type = set("typography", js.Any.fromFunction1(value))
    
    @scala.inline
    def typographyVarargs(value: (js.UndefOr[String] | Null)*): this.type = set("typography", js.Array(value :_*))
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibility(
      value: (ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
        ])
    ): this.type = set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibilityFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
    ): this.type = set("visibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def visibilityVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[Visibility]]] | NonNullable[js.UndefOr[Visibility]] | Null | Visibility
        ])*
    ): this.type = set("visibility", js.Array(value :_*))
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])
          ]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])
            ]
          ]
        ])
    ): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthFunction1(
      value: /* theme */ Theme => ResponsiveStyleValue[
          js.UndefOr[
            (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])
          ]
        ]
    ): this.type = set("width", js.Any.fromFunction1(value))
    
    @scala.inline
    def widthVarargs(
      value: (js.UndefOr[
          (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]]) | (NonNullable[js.UndefOr[Width[Double | String]]]) | Null | (Width[Double | String])
        ])*
    ): this.type = set("width", js.Array(value :_*))
    
    @scala.inline
    def zIndex(
      value: (ResponsiveStyleValue[js.UndefOr[ZIndex | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[ZIndex | String]]])
    ): this.type = set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndexFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[ZIndex | String]]): this.type = set("zIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def zIndexVarargs(value: ((js.UndefOr[ZIndex | String]) | Null)*): this.type = set("zIndex", js.Array(value :_*))
  }
  
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ DefaultComponentPropsBoxTypeMapdiv): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
