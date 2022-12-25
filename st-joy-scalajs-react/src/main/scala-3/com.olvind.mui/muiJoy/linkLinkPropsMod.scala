package com.olvind.mui.muiJoy

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
import com.olvind.mui.muiJoy.anon.EndDecorator
import com.olvind.mui.muiJoy.anon.EndDecoratorRoot
import com.olvind.mui.muiJoy.anon.EndDecoratorRootStartDecorator
import com.olvind.mui.muiJoy.anon.Level
import com.olvind.mui.muiJoy.anon.OmitSystemPropscolor
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AnimationEventHandler
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ClipboardEventHandler
import com.olvind.mui.react.mod.CompositionEventHandler
import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.FormEventHandler
import com.olvind.mui.react.mod.HTMLAttributeAnchorTarget
import com.olvind.mui.react.mod.HTMLAttributeReferrerPolicy
import com.olvind.mui.react.mod.Key
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.LegacyRef
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.PointerEventHandler
import com.olvind.mui.react.mod.ReactEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import com.olvind.mui.react.mod.TransitionEventHandler
import com.olvind.mui.react.mod.UIEventHandler
import com.olvind.mui.react.mod.WheelEventHandler
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLinkPropsMod {
  
  /* Inlined parent @mui/joy.@mui/joy/Link/LinkProps.LinkProps<@mui/joy.@mui/joy/Link/LinkProps.LinkTypeMap<{}, 'a'>['defaultComponent'], {  component :react.react.ElementType<any> | undefined,   focusVisible :boolean | undefined}> */
  trait LinkOwnerState extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var alignContent: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
        ])
      ] = js.undefined
    
    var alignItems: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
        ])
      ] = js.undefined
    
    var alignSelf: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
        ])
      ] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr["none" | "inline" | "list" | "both"] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | "page" | "step" | "location" | "date" | "time"] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr["none" | "copy" | "execute" | "link" | "move" | "popup"] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr["off" | "assertive" | "polite"] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr["none" | "ascending" | "descending" | "other"] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var bgcolor: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
        ])
      ] = js.undefined
    
    var border: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[(Border[String | 0]) | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[(Border[String | 0]) | Double]]])
      ] = js.undefined
    
    var borderBottom: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var borderColor: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
        ])
      ] = js.undefined
    
    var borderLeft: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var borderRadius: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var borderRight: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var borderTop: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var bottom: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var boxShadow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]])
      ] = js.undefined
    
    var boxSizing: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
        ])
      ] = js.undefined
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color of the link.
      * @default 'primary'
      */
    var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, LinkPropsColorOverrides]] = js.undefined
    
    var columnGap: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var component: js.UndefOr[ElementType] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var display: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
        ])
      ] = js.undefined
    
    var displayPrint: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
        ])
      ] = js.undefined
    
    var download: js.UndefOr[Any] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Element placed after the children.
      */
    var endDecorator: js.UndefOr[Node] = js.undefined
    
    var flex: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var flexBasis: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var flexDirection: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
        ])
      ] = js.undefined
    
    var flexGrow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
        ])
      ] = js.undefined
    
    var flexShrink: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
        ])
      ] = js.undefined
    
    var flexWrap: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
        ])
      ] = js.undefined
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
        ])
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
        ])
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FontWeight | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[FontWeight | String]]])
      ] = js.undefined
    
    var gap: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var gridArea: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
        ])
      ] = js.undefined
    
    var gridAutoColumns: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var gridAutoFlow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
        ])
      ] = js.undefined
    
    var gridAutoRows: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var gridColumn: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
        ])
      ] = js.undefined
    
    var gridRow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
        ])
      ] = js.undefined
    
    var gridTemplateAreas: js.UndefOr[
        (ResponsiveStyleValue[
          js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
          ]
        ])
      ] = js.undefined
    
    var gridTemplateColumns: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var gridTemplateRows: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var height: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var hrefLang: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr["none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var justifyContent: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
        ])
      ] = js.undefined
    
    var justifyItems: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
        ])
      ] = js.undefined
    
    var justifySelf: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
        ])
      ] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var letterSpacing: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    /**
      * Applies the theme typography styles.
      * @default 'body1'
      */
    var level: js.UndefOr[
        "body4" | "display2" | "body2" | "body5" | "h2" | "display1" | "h3" | "body1" | "h6" | "h1" | "h5" | "body3" | "h4" | "inherit"
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var m: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var margin: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var marginBottom: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var marginLeft: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var marginRight: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var marginTop: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var marginX: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var marginY: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var maxHeight: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var maxWidth: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var mb: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var minHeight: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var minWidth: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var ml: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var mr: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var mt: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var mx: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var my: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    /**
      * If `true`, the element is rendered by a Typography component.
      */
    var nested: Boolean
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLAnchorElement]] = js.undefined
    
    var order: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
        ])
      ] = js.undefined
    
    var overflow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
        ])
      ] = js.undefined
    
    /**
      * If `true`, the ::after psuedo element is added to cover the area of interaction.
      * The parent of the overlay Link should have `relative` CSS position.
      * @default false
      */
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var p: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var padding: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var paddingBottom: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var paddingLeft: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var paddingRight: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var paddingTop: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var paddingX: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var paddingY: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var pb: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var ping: js.UndefOr[String] = js.undefined
    
    var pl: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
        ])
      ] = js.undefined
    
    var pr: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var pt: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var px: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var py: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[HTMLAnchorElement]] = js.undefined
    
    var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var rowGap: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var slotProps: js.UndefOr[EndDecoratorRoot] = js.undefined
    
    var slots: js.UndefOr[EndDecorator] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Element placed before the children.
      */
    var startDecorator: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[HTMLAttributeAnchorTarget] = js.undefined
    
    var textAlign: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
        ])
      ] = js.undefined
    
    /**
      * The system color.
      */
    var textColor: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
        ])
      ] = js.undefined
    
    var textOverflow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
        ])
      ] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var translate: js.UndefOr["yes" | "no"] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var typography: js.UndefOr[
        ResponsiveStyleValue[js.UndefOr[String]] | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[String]]])
      ] = js.undefined
    
    /**
      * Controls when the link should have an underline.
      * @default 'hover'
      */
    var underline: js.UndefOr["none" | "hover" | "always"] = js.undefined
    
    var unselectable: js.UndefOr["on" | "off"] = js.undefined
    
    /**
      * Applies the theme link styles.
      * @default 'plain'
      */
    var variant: js.UndefOr[OverridableStringUnion[VariantProp, LinkPropsVariantOverrides]] = js.undefined
    
    var visibility: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
        ])
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[
        (ResponsiveStyleValue[
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
      ] = js.undefined
    
    var zIndex: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[ZIndex | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[ZIndex | String]]])
      ] = js.undefined
  }
  object LinkOwnerState {
    
    inline def apply(nested: Boolean): LinkOwnerState = {
      val __obj = js.Dynamic.literal(nested = nested.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkOwnerState] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignContent(
        value: (ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
            ])
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
      ): Self = StObject.set(x, "alignContent", js.Any.fromFunction1(value))
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignContentVarargs(
        value: (js.UndefOr[
              AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]] | NonNullable[js.UndefOr[AlignContent]] | Null
            ])*
      ): Self = StObject.set(x, "alignContent", js.Array(value*))
      
      inline def setAlignItems(
        value: (ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
            ])
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
      ): Self = StObject.set(x, "alignItems", js.Any.fromFunction1(value))
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignItemsVarargs(
        value: (js.UndefOr[
              AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]] | NonNullable[js.UndefOr[AlignItems]] | Null
            ])*
      ): Self = StObject.set(x, "alignItems", js.Array(value*))
      
      inline def setAlignSelf(
        value: (ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
            ])
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
      ): Self = StObject.set(x, "alignSelf", js.Any.fromFunction1(value))
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: (js.UndefOr[
              AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]] | NonNullable[js.UndefOr[AlignSelf]] | Null
            ])*
      ): Self = StObject.set(x, "alignSelf", js.Array(value*))
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: "none" | "inline" | "list" | "both"): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | "page" | "step" | "location" | "date" | "time"): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: "none" | "copy" | "execute" | "link" | "move" | "popup"): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | "grammar" | "spelling"): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: "off" | "assertive" | "polite"): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: "horizontal" | "vertical"): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: "none" | "ascending" | "descending" | "other"): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBgcolor(
        value: (ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
            ])
      ): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
      ): Self = StObject.set(x, "bgcolor", js.Any.fromFunction1(value))
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setBgcolorVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[BackgroundColor]]] | BackgroundColor | NonNullable[js.UndefOr[BackgroundColor]] | Null
            ])*
      ): Self = StObject.set(x, "bgcolor", js.Array(value*))
      
      inline def setBorder(
        value: (ResponsiveStyleValue[js.UndefOr[(Border[String | 0]) | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[(Border[String | 0]) | Double]]])
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBottom(
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
      ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderBottom", js.Any.fromFunction1(value))
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]]) | (BorderBottom[Double | String]) | (NonNullable[js.UndefOr[BorderBottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderBottom", js.Array(value*))
      
      inline def setBorderColor(
        value: (ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
            ])
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
      ): Self = StObject.set(x, "borderColor", js.Any.fromFunction1(value))
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderColorVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[BorderColor]]] | BorderColor | NonNullable[js.UndefOr[BorderColor]] | Null
            ])*
      ): Self = StObject.set(x, "borderColor", js.Array(value*))
      
      inline def setBorderFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[(Border[String | 0]) | Double]]): Self = StObject.set(x, "border", js.Any.fromFunction1(value))
      
      inline def setBorderLeft(
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
      ): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderLeft", js.Any.fromFunction1(value))
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]]) | (BorderLeft[Double | String]) | (NonNullable[js.UndefOr[BorderLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderLeft", js.Array(value*))
      
      inline def setBorderRadius(
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
      ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderRadius[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderRadius", js.Any.fromFunction1(value))
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRadiusVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]]) | (BorderRadius[Double | String]) | (NonNullable[js.UndefOr[BorderRadius[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderRadius", js.Array(value*))
      
      inline def setBorderRight(
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
      ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderRight", js.Any.fromFunction1(value))
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]]) | (BorderRight[Double | String]) | (NonNullable[js.UndefOr[BorderRight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderRight", js.Array(value*))
      
      inline def setBorderTop(
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
      ): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderTop", js.Any.fromFunction1(value))
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setBorderTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]]) | (BorderTop[Double | String]) | (NonNullable[js.UndefOr[BorderTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderTop", js.Array(value*))
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: ((js.UndefOr[(Border[String | 0]) | Double]) | Null)*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setBottom(
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
      ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Bottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "bottom", js.Any.fromFunction1(value))
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]]) | (Bottom[Double | String]) | (NonNullable[js.UndefOr[Bottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "bottom", js.Array(value*))
      
      inline def setBoxShadow(
        value: (ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]])
      ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]): Self = StObject.set(x, "boxShadow", js.Any.fromFunction1(value))
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setBoxShadowVarargs(value: ((js.UndefOr[BoxShadow | Double]) | Null)*): Self = StObject.set(x, "boxShadow", js.Array(value*))
      
      inline def setBoxSizing(
        value: (ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
            ])
      ): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setBoxSizingFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
      ): Self = StObject.set(x, "boxSizing", js.Any.fromFunction1(value))
      
      inline def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      inline def setBoxSizingVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[BoxSizing]]] | BoxSizing | NonNullable[js.UndefOr[BoxSizing]] | Null
            ])*
      ): Self = StObject.set(x, "boxSizing", js.Array(value*))
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: OverridableStringUnion[ColorPaletteProp, LinkPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnGap(
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
      ): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (ColumnGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "columnGap", js.Any.fromFunction1(value))
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumnGapVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]]) | (ColumnGap[Double | String]) | (NonNullable[js.UndefOr[ColumnGap[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "columnGap", js.Array(value*))
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContentEditable(value: Booleanish | "inherit"): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
            ])
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
      ): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
      
      inline def setDisplayPrint(
        value: (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
            ])
      ): Self = StObject.set(x, "displayPrint", value.asInstanceOf[js.Any])
      
      inline def setDisplayPrintFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
      ): Self = StObject.set(x, "displayPrint", js.Any.fromFunction1(value))
      
      inline def setDisplayPrintUndefined: Self = StObject.set(x, "displayPrint", js.undefined)
      
      inline def setDisplayPrintVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Display]]] | Display | NonNullable[js.UndefOr[Display]] | Null
            ])*
      ): Self = StObject.set(x, "displayPrint", js.Array(value*))
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Display]]] | Display | NonNullable[js.UndefOr[Display]] | Null
            ])*
      ): Self = StObject.set(x, "display", js.Array(value*))
      
      inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
      
      inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
      
      inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
      
      inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFlex(
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
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(
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
      ): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (FlexBasis[Double | String]) | (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "flexBasis", js.Any.fromFunction1(value))
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexBasisVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]]) | (FlexBasis[Double | String]) | (NonNullable[js.UndefOr[FlexBasis[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "flexBasis", js.Array(value*))
      
      inline def setFlexDirection(
        value: (ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
            ])
      ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
      ): Self = StObject.set(x, "flexDirection", js.Any.fromFunction1(value))
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexDirectionVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexDirection]]] | FlexDirection | NonNullable[js.UndefOr[FlexDirection]] | Null
            ])*
      ): Self = StObject.set(x, "flexDirection", js.Array(value*))
      
      inline def setFlexFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Flex[Double | String]) | (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "flex", js.Any.fromFunction1(value))
      
      inline def setFlexGrow(
        value: (ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
            ])
      ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
      ): Self = StObject.set(x, "flexGrow", js.Any.fromFunction1(value))
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexGrowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexGrow]]] | FlexGrow | NonNullable[js.UndefOr[FlexGrow]] | Null
            ])*
      ): Self = StObject.set(x, "flexGrow", js.Array(value*))
      
      inline def setFlexShrink(
        value: (ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
            ])
      ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
      ): Self = StObject.set(x, "flexShrink", js.Any.fromFunction1(value))
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexShrinkVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexShrink]]] | FlexShrink | NonNullable[js.UndefOr[FlexShrink]] | Null
            ])*
      ): Self = StObject.set(x, "flexShrink", js.Array(value*))
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]]) | (Flex[Double | String]) | (NonNullable[js.UndefOr[Flex[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "flex", js.Array(value*))
      
      inline def setFlexWrap(
        value: (ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
            ])
      ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
      ): Self = StObject.set(x, "flexWrap", js.Any.fromFunction1(value))
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFlexWrapVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexWrap]]] | FlexWrap | NonNullable[js.UndefOr[FlexWrap]] | Null
            ])*
      ): Self = StObject.set(x, "flexWrap", js.Array(value*))
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
      
      inline def setFontFamily(
        value: (ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
            ])
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
      ): Self = StObject.set(x, "fontFamily", js.Any.fromFunction1(value))
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFamilyVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FontFamily]]] | FontFamily | NonNullable[js.UndefOr[FontFamily]] | Null
            ])*
      ): Self = StObject.set(x, "fontFamily", js.Array(value*))
      
      inline def setFontSize(
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
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (FontSize[Double | String]) | (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "fontSize", js.Any.fromFunction1(value))
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]]) | (FontSize[Double | String]) | (NonNullable[js.UndefOr[FontSize[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "fontSize", js.Array(value*))
      
      inline def setFontStyle(
        value: (ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
            ])
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
      ): Self = StObject.set(x, "fontStyle", js.Any.fromFunction1(value))
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontStyleVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FontStyle]]] | FontStyle | NonNullable[js.UndefOr[FontStyle]] | Null
            ])*
      ): Self = StObject.set(x, "fontStyle", js.Array(value*))
      
      inline def setFontWeight(
        value: (ResponsiveStyleValue[js.UndefOr[FontWeight | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[FontWeight | String]]])
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontWeight | String]]): Self = StObject.set(x, "fontWeight", js.Any.fromFunction1(value))
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((js.UndefOr[FontWeight | String]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value*))
      
      inline def setGap(
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
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Gap[Double | String]) | (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gap", js.Any.fromFunction1(value))
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGapVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]]) | (Gap[Double | String]) | (NonNullable[js.UndefOr[Gap[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gap", js.Array(value*))
      
      inline def setGridArea(
        value: (ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
            ])
      ): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
      ): Self = StObject.set(x, "gridArea", js.Any.fromFunction1(value))
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridAreaVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridArea]]] | GridArea | NonNullable[js.UndefOr[GridArea]] | Null
            ])*
      ): Self = StObject.set(x, "gridArea", js.Array(value*))
      
      inline def setGridAutoColumns(
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
      ): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridAutoColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridAutoColumns", js.Any.fromFunction1(value))
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoColumnsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]]) | (GridAutoColumns[Double | String]) | (NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridAutoColumns", js.Array(value*))
      
      inline def setGridAutoFlow(
        value: (ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
            ])
      ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
      ): Self = StObject.set(x, "gridAutoFlow", js.Any.fromFunction1(value))
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoFlowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridAutoFlow]]] | GridAutoFlow | NonNullable[js.UndefOr[GridAutoFlow]] | Null
            ])*
      ): Self = StObject.set(x, "gridAutoFlow", js.Array(value*))
      
      inline def setGridAutoRows(
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
      ): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridAutoRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridAutoRows", js.Any.fromFunction1(value))
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridAutoRowsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]]) | (GridAutoRows[Double | String]) | (NonNullable[js.UndefOr[GridAutoRows[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridAutoRows", js.Array(value*))
      
      inline def setGridColumn(
        value: (ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
            ])
      ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
      ): Self = StObject.set(x, "gridColumn", js.Any.fromFunction1(value))
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridColumnVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridColumn]]] | GridColumn | NonNullable[js.UndefOr[GridColumn]] | Null
            ])*
      ): Self = StObject.set(x, "gridColumn", js.Array(value*))
      
      inline def setGridRow(
        value: (ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
            ])
      ): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
      ): Self = StObject.set(x, "gridRow", js.Any.fromFunction1(value))
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setGridRowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridRow]]] | GridRow | NonNullable[js.UndefOr[GridRow]] | Null
            ])*
      ): Self = StObject.set(x, "gridRow", js.Array(value*))
      
      inline def setGridTemplateAreas(
        value: (ResponsiveStyleValue[
              js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
            ]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[
                js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
              ]
            ])
      ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreasFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
            ]
      ): Self = StObject.set(x, "gridTemplateAreas", js.Any.fromFunction1(value))
      
      inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      inline def setGridTemplateAreasVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]] | GridTemplateAreas | NonNullable[js.UndefOr[GridTemplateAreas]] | Null
            ])*
      ): Self = StObject.set(x, "gridTemplateAreas", js.Array(value*))
      
      inline def setGridTemplateColumns(
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
      ): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridTemplateColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridTemplateColumns", js.Any.fromFunction1(value))
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateColumnsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]]) | (GridTemplateColumns[Double | String]) | (NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridTemplateColumns", js.Array(value*))
      
      inline def setGridTemplateRows(
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
      ): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridTemplateRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridTemplateRows", js.Any.fromFunction1(value))
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      inline def setGridTemplateRowsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]]) | (GridTemplateRows[Double | String]) | (NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridTemplateRows", js.Array(value*))
      
      inline def setHeight(
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
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Height[Double | String]) | (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]]) | (Height[Double | String]) | (NonNullable[js.UndefOr[Height[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "height", js.Array(value*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setJustifyContent(
        value: (ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
            ])
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
      ): Self = StObject.set(x, "justifyContent", js.Any.fromFunction1(value))
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyContentVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[JustifyContent]]] | JustifyContent | NonNullable[js.UndefOr[JustifyContent]] | Null
            ])*
      ): Self = StObject.set(x, "justifyContent", js.Array(value*))
      
      inline def setJustifyItems(
        value: (ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
            ])
      ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
      ): Self = StObject.set(x, "justifyItems", js.Any.fromFunction1(value))
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setJustifyItemsVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[JustifyItems]]] | JustifyItems | NonNullable[js.UndefOr[JustifyItems]] | Null
            ])*
      ): Self = StObject.set(x, "justifyItems", js.Array(value*))
      
      inline def setJustifySelf(
        value: (ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
            ])
      ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
      ): Self = StObject.set(x, "justifySelf", js.Any.fromFunction1(value))
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setJustifySelfVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[JustifySelf]]] | JustifySelf | NonNullable[js.UndefOr[JustifySelf]] | Null
            ])*
      ): Self = StObject.set(x, "justifySelf", js.Array(value*))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLeft(
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
      ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Left[Double | String]) | (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]]) | (Left[Double | String]) | (NonNullable[js.UndefOr[Left[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setLetterSpacing(
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
      ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (LetterSpacing[Double | String]) | (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "letterSpacing", js.Any.fromFunction1(value))
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLetterSpacingVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]]) | (LetterSpacing[Double | String]) | (NonNullable[js.UndefOr[LetterSpacing[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "letterSpacing", js.Array(value*))
      
      inline def setLevel(
        value: "body4" | "display2" | "body2" | "body5" | "h2" | "display1" | "h3" | "body1" | "h6" | "h1" | "h5" | "body3" | "h4" | "inherit"
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLineHeight(
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
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (LineHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "lineHeight", js.Any.fromFunction1(value))
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]]) | (LineHeight[Double | String]) | (NonNullable[js.UndefOr[LineHeight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "lineHeight", js.Array(value*))
      
      inline def setM(
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
      ): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "m", js.Any.fromFunction1(value))
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]]) | (Margin[Double | String]) | (NonNullable[js.UndefOr[Margin[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "m", js.Array(value*))
      
      inline def setMargin(
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
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(
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
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginBottom", js.Any.fromFunction1(value))
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]]) | (MarginBottom[Double | String]) | (NonNullable[js.UndefOr[MarginBottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginBottom", js.Array(value*))
      
      inline def setMarginFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "margin", js.Any.fromFunction1(value))
      
      inline def setMarginLeft(
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
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginLeft", js.Any.fromFunction1(value))
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginLeft", js.Array(value*))
      
      inline def setMarginRight(
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
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginRight", js.Any.fromFunction1(value))
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]]) | (MarginRight[Double | String]) | (NonNullable[js.UndefOr[MarginRight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginRight", js.Array(value*))
      
      inline def setMarginTop(
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
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginTop", js.Any.fromFunction1(value))
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginTop", js.Array(value*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]]) | (Margin[Double | String]) | (NonNullable[js.UndefOr[Margin[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "margin", js.Array(value*))
      
      inline def setMarginX(
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
      ): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginX", js.Any.fromFunction1(value))
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginX", js.Array(value*))
      
      inline def setMarginY(
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
      ): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginY", js.Any.fromFunction1(value))
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginY", js.Array(value*))
      
      inline def setMaxHeight(
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
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MaxHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "maxHeight", js.Any.fromFunction1(value))
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]]) | (MaxHeight[Double | String]) | (NonNullable[js.UndefOr[MaxHeight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "maxHeight", js.Array(value*))
      
      inline def setMaxWidth(
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
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MaxWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "maxWidth", js.Any.fromFunction1(value))
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]]) | (MaxWidth[Double | String]) | (NonNullable[js.UndefOr[MaxWidth[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "maxWidth", js.Array(value*))
      
      inline def setMb(
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
      ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mb", js.Any.fromFunction1(value))
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]]) | (MarginBottom[Double | String]) | (NonNullable[js.UndefOr[MarginBottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mb", js.Array(value*))
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMinHeight(
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
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MinHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "minHeight", js.Any.fromFunction1(value))
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]]) | (MinHeight[Double | String]) | (NonNullable[js.UndefOr[MinHeight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "minHeight", js.Array(value*))
      
      inline def setMinWidth(
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
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MinWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "minWidth", js.Any.fromFunction1(value))
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]]) | (MinWidth[Double | String]) | (NonNullable[js.UndefOr[MinWidth[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "minWidth", js.Array(value*))
      
      inline def setMl(
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
      ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "ml", js.Any.fromFunction1(value))
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "ml", js.Array(value*))
      
      inline def setMr(
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
      ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mr", js.Any.fromFunction1(value))
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]]) | (MarginRight[Double | String]) | (NonNullable[js.UndefOr[MarginRight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mr", js.Array(value*))
      
      inline def setMt(
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
      ): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mt", js.Any.fromFunction1(value))
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mt", js.Array(value*))
      
      inline def setMx(
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
      ): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mx", js.Any.fromFunction1(value))
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mx", js.Array(value*))
      
      inline def setMy(
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
      ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "my", js.Any.fromFunction1(value))
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "my", js.Array(value*))
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOrder(
        value: (ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
            ])
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
      ): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Order]]] | NonNullable[js.UndefOr[Order]] | Null | Order
            ])*
      ): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setOverflow(
        value: (ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
            ])
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
      ): Self = StObject.set(x, "overflow", js.Any.fromFunction1(value))
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Overflow]]] | NonNullable[js.UndefOr[Overflow]] | Null | Overflow
            ])*
      ): Self = StObject.set(x, "overflow", js.Array(value*))
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setP(
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
      ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "p", js.Any.fromFunction1(value))
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]]) | (NonNullable[js.UndefOr[Padding[Double | String]]]) | Null | (Padding[Double | String])
            ])*
      ): Self = StObject.set(x, "p", js.Array(value*))
      
      inline def setPadding(
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
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(
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
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingBottom", js.Any.fromFunction1(value))
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingBottom[Double | String]]]) | Null | (PaddingBottom[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingBottom", js.Array(value*))
      
      inline def setPaddingFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
      
      inline def setPaddingLeft(
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
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingLeft", js.Any.fromFunction1(value))
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingLeft", js.Array(value*))
      
      inline def setPaddingRight(
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
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingRight", js.Any.fromFunction1(value))
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingRight[Double | String]]]) | Null | (PaddingRight[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingRight", js.Array(value*))
      
      inline def setPaddingTop(
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
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingTop", js.Any.fromFunction1(value))
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingTop", js.Array(value*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]]) | (NonNullable[js.UndefOr[Padding[Double | String]]]) | Null | (Padding[Double | String])
            ])*
      ): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPaddingX(
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
      ): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingX", js.Any.fromFunction1(value))
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingX", js.Array(value*))
      
      inline def setPaddingY(
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
      ): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingY", js.Any.fromFunction1(value))
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingY", js.Array(value*))
      
      inline def setPb(
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
      ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pb", js.Any.fromFunction1(value))
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingBottom[Double | String]]]) | Null | (PaddingBottom[Double | String])
            ])*
      ): Self = StObject.set(x, "pb", js.Array(value*))
      
      inline def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
      
      inline def setPl(
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
      ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pl", js.Any.fromFunction1(value))
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "pl", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPosition(
        value: (ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
            ])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
      ): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Position]]] | NonNullable[js.UndefOr[Position]] | Null | Position
            ])*
      ): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setPr(
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
      ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pr", js.Any.fromFunction1(value))
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingRight[Double | String]]]) | Null | (PaddingRight[Double | String])
            ])*
      ): Self = StObject.set(x, "pr", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(
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
      ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pt", js.Any.fromFunction1(value))
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "pt", js.Array(value*))
      
      inline def setPx(
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
      ): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "px", js.Any.fromFunction1(value))
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "px", js.Array(value*))
      
      inline def setPy(
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
      ): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "py", js.Any.fromFunction1(value))
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "py", js.Array(value*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRef(value: LegacyRef[HTMLAnchorElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLAnchorElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLAnchorElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRight(
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
      ): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Right[Double | String]) | (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]]) | (NonNullable[js.UndefOr[Right[Double | String]]]) | Null | (Right[Double | String])
            ])*
      ): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRowGap(
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
      ): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      inline def setRowGapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (RowGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "rowGap", js.Any.fromFunction1(value))
      
      inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      inline def setRowGapVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]]) | (NonNullable[js.UndefOr[RowGap[Double | String]]]) | Null | (RowGap[Double | String])
            ])*
      ): Self = StObject.set(x, "rowGap", js.Array(value*))
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotProps(value: EndDecoratorRoot): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSlots(value: EndDecorator): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStartDecorator(value: VdomNode): Self = StObject.set(x, "startDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartDecoratorNull: Self = StObject.set(x, "startDecorator", null)
      
      inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
      
      inline def setStartDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startDecorator", js.Array(value*))
      
      inline def setStartDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "startDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: HTMLAttributeAnchorTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTextAlign(
        value: (ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
            ])
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
      ): Self = StObject.set(x, "textAlign", js.Any.fromFunction1(value))
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextAlignVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[TextAlign]]] | NonNullable[js.UndefOr[TextAlign]] | Null | TextAlign
            ])*
      ): Self = StObject.set(x, "textAlign", js.Array(value*))
      
      inline def setTextColor(
        value: (ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
            ])
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
      ): Self = StObject.set(x, "textColor", js.Any.fromFunction1(value))
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextColorVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Color]]] | Color | NonNullable[js.UndefOr[Color]] | Null
            ])*
      ): Self = StObject.set(x, "textColor", js.Array(value*))
      
      inline def setTextOverflow(
        value: (ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
            ])
      ): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
      ): Self = StObject.set(x, "textOverflow", js.Any.fromFunction1(value))
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextOverflowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[TextOverflow]]] | NonNullable[js.UndefOr[TextOverflow]] | Null | TextOverflow
            ])*
      ): Self = StObject.set(x, "textOverflow", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTop(
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
      ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Top[Double | String]) | (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "top", js.Any.fromFunction1(value))
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]]) | (NonNullable[js.UndefOr[Top[Double | String]]]) | Null | (Top[Double | String])
            ])*
      ): Self = StObject.set(x, "top", js.Array(value*))
      
      inline def setTranslate(value: "yes" | "no"): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setTypography(
        value: ResponsiveStyleValue[js.UndefOr[String]] | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[String]]])
      ): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[String]]): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      inline def setTypographyVarargs(value: (js.UndefOr[String] | Null)*): Self = StObject.set(x, "typography", js.Array(value*))
      
      inline def setUnderline(value: "none" | "hover" | "always"): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      inline def setUnselectable(value: "on" | "off"): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVariant(value: OverridableStringUnion[VariantProp, LinkPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVisibility(
        value: (ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
            ])
      ): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
      ): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibilityVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Visibility]]] | NonNullable[js.UndefOr[Visibility]] | Null | Visibility
            ])*
      ): Self = StObject.set(x, "visibility", js.Array(value*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
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
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]]) | (NonNullable[js.UndefOr[Width[Double | String]]]) | Null | (Width[Double | String])
            ])*
      ): Self = StObject.set(x, "width", js.Array(value*))
      
      inline def setZIndex(
        value: (ResponsiveStyleValue[js.UndefOr[ZIndex | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[ZIndex | String]]])
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[ZIndex | String]]): Self = StObject.set(x, "zIndex", js.Any.fromFunction1(value))
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZIndexVarargs(value: ((js.UndefOr[ZIndex | String]) | Null)*): Self = StObject.set(x, "zIndex", js.Array(value*))
    }
  }
  
  type LinkProps[D /* <: ElementType */, P] = OverrideProps[LinkTypeMap[P, D], D]
  
  trait LinkPropsColorOverrides extends StObject
  
  trait LinkPropsVariantOverrides extends StObject
  
  object LinkSlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type LinkSlot = "root" | "startDecorator" | "endDecorator"
  
  type LinkSlotsAndSlotProps = CreateSlotsAndSlotProps[LinkSlot, EndDecoratorRootStartDecorator]
  
  trait LinkTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & LinkSlotsAndSlotProps & OmitSystemPropscolor & Level
  }
  object LinkTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & LinkSlotsAndSlotProps & OmitSystemPropscolor & Level): LinkTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (LinkTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & LinkSlotsAndSlotProps & OmitSystemPropscolor & Level): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
