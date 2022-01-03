package com.olvind.mui.muiSystem

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
import com.olvind.mui.muiSystem.muiSystemNumbers.`0`
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.ResponsiveStyleValue
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.NonNullable
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxBoxMod extends Shortcut {
  
  @JSImport("@mui/system/Box/Box", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = js.native
  
  /* Inlined {[ K in @mui/system.@mui/system/Box/Box.StandardSystemKeys ]:? @mui/system.@mui/system/styleFunctionSx.ResponsiveStyleValue<@mui/system.@mui/system/styleFunctionSx.AllSystemCSSProperties[K]> | (theme : Theme): @mui/system.@mui/system/styleFunctionSx.ResponsiveStyleValue<@mui/system.@mui/system/styleFunctionSx.AllSystemCSSProperties[K]>} */
  @js.native
  trait SystemProps[Theme /* <: js.Object */] extends StObject {
    
    var alignContent: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
        ])
      ] = js.native
    
    var alignItems: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
        ])
      ] = js.native
    
    var alignSelf: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
        ])
      ] = js.native
    
    var bgcolor: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
        ])
      ] = js.native
    
    var border: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var borderColor: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    var boxShadow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]])
      ] = js.native
    
    var boxSizing: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
        ])
      ] = js.native
    
    var color: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var display: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
        ])
      ] = js.native
    
    var displayPrint: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    var flexDirection: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
        ])
      ] = js.native
    
    var flexGrow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
        ])
      ] = js.native
    
    var flexShrink: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
        ])
      ] = js.native
    
    var flexWrap: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
        ])
      ] = js.native
    
    var fontFamily: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var fontStyle: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
        ])
      ] = js.native
    
    var fontWeight: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[FontWeight | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[FontWeight | String]]])
      ] = js.native
    
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
      ] = js.native
    
    var gridArea: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var gridAutoFlow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var gridColumn: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
        ])
      ] = js.native
    
    var gridRow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
        ])
      ] = js.native
    
    var gridTemplateAreas: js.UndefOr[
        (ResponsiveStyleValue[
          js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
        ]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[
            js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
          ]
        ])
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    var justifyContent: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
        ])
      ] = js.native
    
    var justifyItems: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
        ])
      ] = js.native
    
    var justifySelf: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    var order: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
        ])
      ] = js.native
    
    var overflow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    var position: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    var textAlign: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
        ])
      ] = js.native
    
    var textOverflow: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var typography: js.UndefOr[
        ResponsiveStyleValue[js.UndefOr[String]] | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[String]]])
      ] = js.native
    
    var visibility: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]) | (js.Function1[
          /* theme */ Theme, 
          ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
        ])
      ] = js.native
    
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
      ] = js.native
    
    var zIndex: js.UndefOr[
        (ResponsiveStyleValue[js.UndefOr[ZIndex | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[ZIndex | String]]])
      ] = js.native
  }
  object SystemProps {
    
    @scala.inline
    def apply[Theme /* <: js.Object */](): SystemProps[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SystemProps[Theme]]
    }
    
    @scala.inline
    implicit class SystemPropsMutableBuilder[Self <: SystemProps[_], Theme /* <: js.Object */] (val x: Self with SystemProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setAlignContent(
        value: (ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
            ])
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]]]]
      ): Self = StObject.set(x, "alignContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignContentVarargs(
        value: (js.UndefOr[
              AlignContent | js.Array[NonNullable[js.UndefOr[AlignContent]]] | NonNullable[js.UndefOr[AlignContent]] | Null
            ])*
      ): Self = StObject.set(x, "alignContent", js.Array(value :_*))
      
      @scala.inline
      def setAlignItems(
        value: (ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
            ])
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]]]]
      ): Self = StObject.set(x, "alignItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAlignItemsVarargs(
        value: (js.UndefOr[
              AlignItems | js.Array[NonNullable[js.UndefOr[AlignItems]]] | NonNullable[js.UndefOr[AlignItems]] | Null
            ])*
      ): Self = StObject.set(x, "alignItems", js.Array(value :_*))
      
      @scala.inline
      def setAlignSelf(
        value: (ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
            ])
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]]]]
      ): Self = StObject.set(x, "alignSelf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignSelfVarargs(
        value: (js.UndefOr[
              AlignSelf | js.Array[NonNullable[js.UndefOr[AlignSelf]]] | NonNullable[js.UndefOr[AlignSelf]] | Null
            ])*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      @scala.inline
      def setBgcolor(
        value: (ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
            ])
      ): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgcolorFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]]]
      ): Self = StObject.set(x, "bgcolor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      @scala.inline
      def setBgcolorVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[BackgroundColor]]] | BackgroundColor | NonNullable[js.UndefOr[BackgroundColor]] | Null
            ])*
      ): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
      
      @scala.inline
      def setBorder(
        value: (ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]
            ])
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottom(
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
      
      @scala.inline
      def setBorderBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      @scala.inline
      def setBorderBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderBottom[Double | String]]]]) | (BorderBottom[Double | String]) | (NonNullable[js.UndefOr[BorderBottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderBottom", js.Array(value :_*))
      
      @scala.inline
      def setBorderColor(
        value: (ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
            ])
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BorderColor | js.Array[NonNullable[js.UndefOr[BorderColor]]]]]
      ): Self = StObject.set(x, "borderColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderColorVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[BorderColor]]] | BorderColor | NonNullable[js.UndefOr[BorderColor]] | Null
            ])*
      ): Self = StObject.set(x, "borderColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[(Border[String | `0`]) | Double]]): Self = StObject.set(x, "border", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderLeft(
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
      
      @scala.inline
      def setBorderLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      @scala.inline
      def setBorderLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderLeft[Double | String]]]]) | (BorderLeft[Double | String]) | (NonNullable[js.UndefOr[BorderLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderLeft", js.Array(value :_*))
      
      @scala.inline
      def setBorderRadius(
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
      
      @scala.inline
      def setBorderRadiusFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderRadius[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderRadius", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderRadiusVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderRadius[Double | String]]]]) | (BorderRadius[Double | String]) | (NonNullable[js.UndefOr[BorderRadius[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderRight(
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
      
      @scala.inline
      def setBorderRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      @scala.inline
      def setBorderRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderRight[Double | String]]]]) | (BorderRight[Double | String]) | (NonNullable[js.UndefOr[BorderRight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderRight", js.Array(value :_*))
      
      @scala.inline
      def setBorderTop(
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
      
      @scala.inline
      def setBorderTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (BorderTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "borderTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      @scala.inline
      def setBorderTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[BorderTop[Double | String]]]]) | (BorderTop[Double | String]) | (NonNullable[js.UndefOr[BorderTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "borderTop", js.Array(value :_*))
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: ((js.UndefOr[(Border[String | `0`]) | Double]) | Null)*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setBottom(
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
      
      @scala.inline
      def setBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Bottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "bottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Bottom[Double | String]]]]) | (Bottom[Double | String]) | (NonNullable[js.UndefOr[Bottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "bottom", js.Array(value :_*))
      
      @scala.inline
      def setBoxShadow(
        value: (ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]])
      ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxShadowFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BoxShadow | Double]]): Self = StObject.set(x, "boxShadow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      @scala.inline
      def setBoxShadowVarargs(value: ((js.UndefOr[BoxShadow | Double]) | Null)*): Self = StObject.set(x, "boxShadow", js.Array(value :_*))
      
      @scala.inline
      def setBoxSizing(
        value: (ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
            ])
      ): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSizingFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[BoxSizing | js.Array[NonNullable[js.UndefOr[BoxSizing]]]]]
      ): Self = StObject.set(x, "boxSizing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      @scala.inline
      def setBoxSizingVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[BoxSizing]]] | BoxSizing | NonNullable[js.UndefOr[BoxSizing]] | Null
            ])*
      ): Self = StObject.set(x, "boxSizing", js.Array(value :_*))
      
      @scala.inline
      def setColor(
        value: (ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
            ])
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Color | js.Array[NonNullable[js.UndefOr[Color]]]]]
      ): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Color]]] | Color | NonNullable[js.UndefOr[Color]] | Null
            ])*
      ): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setColumnGap(
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
      
      @scala.inline
      def setColumnGapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (ColumnGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "columnGap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setColumnGapVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[ColumnGap[Double | String]]]]) | (ColumnGap[Double | String]) | (NonNullable[js.UndefOr[ColumnGap[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "columnGap", js.Array(value :_*))
      
      @scala.inline
      def setDisplay(
        value: (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
            ])
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
      ): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayPrint(
        value: (ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
            ])
      ): Self = StObject.set(x, "displayPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayPrintFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Display | js.Array[NonNullable[js.UndefOr[Display]]]]]
      ): Self = StObject.set(x, "displayPrint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayPrintUndefined: Self = StObject.set(x, "displayPrint", js.undefined)
      
      @scala.inline
      def setDisplayPrintVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Display]]] | Display | NonNullable[js.UndefOr[Display]] | Null
            ])*
      ): Self = StObject.set(x, "displayPrint", js.Array(value :_*))
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDisplayVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Display]]] | Display | NonNullable[js.UndefOr[Display]] | Null
            ])*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      @scala.inline
      def setFlex(
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
      
      @scala.inline
      def setFlexBasis(
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
      
      @scala.inline
      def setFlexBasisFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (FlexBasis[Double | String]) | (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "flexBasis", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      @scala.inline
      def setFlexBasisVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[FlexBasis[Double | String]]]]) | (FlexBasis[Double | String]) | (NonNullable[js.UndefOr[FlexBasis[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "flexBasis", js.Array(value :_*))
      
      @scala.inline
      def setFlexDirection(
        value: (ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
            ])
      ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirectionFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexDirection | js.Array[NonNullable[js.UndefOr[FlexDirection]]]]]
      ): Self = StObject.set(x, "flexDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      @scala.inline
      def setFlexDirectionVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexDirection]]] | FlexDirection | NonNullable[js.UndefOr[FlexDirection]] | Null
            ])*
      ): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
      
      @scala.inline
      def setFlexFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Flex[Double | String]) | (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "flex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlexGrow(
        value: (ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
            ])
      ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGrowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexGrow | js.Array[NonNullable[js.UndefOr[FlexGrow]]]]]
      ): Self = StObject.set(x, "flexGrow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      @scala.inline
      def setFlexGrowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexGrow]]] | FlexGrow | NonNullable[js.UndefOr[FlexGrow]] | Null
            ])*
      ): Self = StObject.set(x, "flexGrow", js.Array(value :_*))
      
      @scala.inline
      def setFlexShrink(
        value: (ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
            ])
      ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexShrinkFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexShrink | js.Array[NonNullable[js.UndefOr[FlexShrink]]]]]
      ): Self = StObject.set(x, "flexShrink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      @scala.inline
      def setFlexShrinkVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexShrink]]] | FlexShrink | NonNullable[js.UndefOr[FlexShrink]] | Null
            ])*
      ): Self = StObject.set(x, "flexShrink", js.Array(value :_*))
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFlexVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Flex[Double | String]]]]) | (Flex[Double | String]) | (NonNullable[js.UndefOr[Flex[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      @scala.inline
      def setFlexWrap(
        value: (ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
            ])
      ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FlexWrap | js.Array[NonNullable[js.UndefOr[FlexWrap]]]]]
      ): Self = StObject.set(x, "flexWrap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setFlexWrapVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FlexWrap]]] | FlexWrap | NonNullable[js.UndefOr[FlexWrap]] | Null
            ])*
      ): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
      
      @scala.inline
      def setFontFamily(
        value: (ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
            ])
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontFamily | js.Array[NonNullable[js.UndefOr[FontFamily]]]]]
      ): Self = StObject.set(x, "fontFamily", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontFamilyVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FontFamily]]] | FontFamily | NonNullable[js.UndefOr[FontFamily]] | Null
            ])*
      ): Self = StObject.set(x, "fontFamily", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(
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
      
      @scala.inline
      def setFontSizeFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (FontSize[Double | String]) | (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "fontSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSizeVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[FontSize[Double | String]]]]) | (FontSize[Double | String]) | (NonNullable[js.UndefOr[FontSize[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      @scala.inline
      def setFontStyle(
        value: (ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
            ])
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontStyle | js.Array[NonNullable[js.UndefOr[FontStyle]]]]]
      ): Self = StObject.set(x, "fontStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontStyleVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[FontStyle]]] | FontStyle | NonNullable[js.UndefOr[FontStyle]] | Null
            ])*
      ): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
      
      @scala.inline
      def setFontWeight(
        value: (ResponsiveStyleValue[js.UndefOr[FontWeight | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[FontWeight | String]]])
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[FontWeight | String]]): Self = StObject.set(x, "fontWeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFontWeightVarargs(value: ((js.UndefOr[FontWeight | String]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      @scala.inline
      def setGap(
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
      
      @scala.inline
      def setGapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Gap[Double | String]) | (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGapVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Gap[Double | String]]]]) | (Gap[Double | String]) | (NonNullable[js.UndefOr[Gap[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gap", js.Array(value :_*))
      
      @scala.inline
      def setGridArea(
        value: (ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
            ])
      ): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridArea | js.Array[NonNullable[js.UndefOr[GridArea]]]]]
      ): Self = StObject.set(x, "gridArea", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGridAreaVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridArea]]] | GridArea | NonNullable[js.UndefOr[GridArea]] | Null
            ])*
      ): Self = StObject.set(x, "gridArea", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoColumns(
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
      
      @scala.inline
      def setGridAutoColumnsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridAutoColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridAutoColumns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      @scala.inline
      def setGridAutoColumnsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]]) | (GridAutoColumns[Double | String]) | (NonNullable[js.UndefOr[GridAutoColumns[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridAutoColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoFlow(
        value: (ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
            ])
      ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoFlowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridAutoFlow | js.Array[NonNullable[js.UndefOr[GridAutoFlow]]]]]
      ): Self = StObject.set(x, "gridAutoFlow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      @scala.inline
      def setGridAutoFlowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridAutoFlow]]] | GridAutoFlow | NonNullable[js.UndefOr[GridAutoFlow]] | Null
            ])*
      ): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoRows(
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
      
      @scala.inline
      def setGridAutoRowsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridAutoRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridAutoRows", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      @scala.inline
      def setGridAutoRowsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridAutoRows[Double | String]]]]) | (GridAutoRows[Double | String]) | (NonNullable[js.UndefOr[GridAutoRows[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridAutoRows", js.Array(value :_*))
      
      @scala.inline
      def setGridColumn(
        value: (ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
            ])
      ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridColumn | js.Array[NonNullable[js.UndefOr[GridColumn]]]]]
      ): Self = StObject.set(x, "gridColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      @scala.inline
      def setGridColumnVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridColumn]]] | GridColumn | NonNullable[js.UndefOr[GridColumn]] | Null
            ])*
      ): Self = StObject.set(x, "gridColumn", js.Array(value :_*))
      
      @scala.inline
      def setGridRow(
        value: (ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
            ])
      ): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[GridRow | js.Array[NonNullable[js.UndefOr[GridRow]]]]]
      ): Self = StObject.set(x, "gridRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      @scala.inline
      def setGridRowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridRow]]] | GridRow | NonNullable[js.UndefOr[GridRow]] | Null
            ])*
      ): Self = StObject.set(x, "gridRow", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateAreas(
        value: (ResponsiveStyleValue[
              js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
            ]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[
                js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
              ]
            ])
      ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateAreasFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[GridTemplateAreas | js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]]]
            ]
      ): Self = StObject.set(x, "gridTemplateAreas", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      @scala.inline
      def setGridTemplateAreasVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[GridTemplateAreas]]] | GridTemplateAreas | NonNullable[js.UndefOr[GridTemplateAreas]] | Null
            ])*
      ): Self = StObject.set(x, "gridTemplateAreas", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateColumns(
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
      
      @scala.inline
      def setGridTemplateColumnsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridTemplateColumns[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridTemplateColumns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      @scala.inline
      def setGridTemplateColumnsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]]) | (GridTemplateColumns[Double | String]) | (NonNullable[js.UndefOr[GridTemplateColumns[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridTemplateColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateRows(
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
      
      @scala.inline
      def setGridTemplateRowsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (GridTemplateRows[Double | String]) | (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "gridTemplateRows", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      @scala.inline
      def setGridTemplateRowsVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]]) | (GridTemplateRows[Double | String]) | (NonNullable[js.UndefOr[GridTemplateRows[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "gridTemplateRows", js.Array(value :_*))
      
      @scala.inline
      def setHeight(
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
      
      @scala.inline
      def setHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Height[Double | String]) | (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Height[Double | String]]]]) | (Height[Double | String]) | (NonNullable[js.UndefOr[Height[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setJustifyContent(
        value: (ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
            ])
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifyContent | js.Array[NonNullable[js.UndefOr[JustifyContent]]]]]
      ): Self = StObject.set(x, "justifyContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setJustifyContentVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[JustifyContent]]] | JustifyContent | NonNullable[js.UndefOr[JustifyContent]] | Null
            ])*
      ): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
      
      @scala.inline
      def setJustifyItems(
        value: (ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
            ])
      ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyItemsFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifyItems | js.Array[NonNullable[js.UndefOr[JustifyItems]]]]]
      ): Self = StObject.set(x, "justifyItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      @scala.inline
      def setJustifyItemsVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[JustifyItems]]] | JustifyItems | NonNullable[js.UndefOr[JustifyItems]] | Null
            ])*
      ): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
      
      @scala.inline
      def setJustifySelf(
        value: (ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
            ])
      ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifySelfFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[JustifySelf | js.Array[NonNullable[js.UndefOr[JustifySelf]]]]]
      ): Self = StObject.set(x, "justifySelf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      @scala.inline
      def setJustifySelfVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[JustifySelf]]] | JustifySelf | NonNullable[js.UndefOr[JustifySelf]] | Null
            ])*
      ): Self = StObject.set(x, "justifySelf", js.Array(value :_*))
      
      @scala.inline
      def setLeft(
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
      
      @scala.inline
      def setLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Left[Double | String]) | (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Left[Double | String]]]]) | (Left[Double | String]) | (NonNullable[js.UndefOr[Left[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setLetterSpacing(
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
      
      @scala.inline
      def setLetterSpacingFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (LetterSpacing[Double | String]) | (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "letterSpacing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLetterSpacingVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[LetterSpacing[Double | String]]]]) | (LetterSpacing[Double | String]) | (NonNullable[js.UndefOr[LetterSpacing[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "letterSpacing", js.Array(value :_*))
      
      @scala.inline
      def setLineHeight(
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
      
      @scala.inline
      def setLineHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (LineHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "lineHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLineHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[LineHeight[Double | String]]]]) | (LineHeight[Double | String]) | (NonNullable[js.UndefOr[LineHeight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
      
      @scala.inline
      def setM(
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
      
      @scala.inline
      def setMFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "m", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]]) | (Margin[Double | String]) | (NonNullable[js.UndefOr[Margin[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "m", js.Array(value :_*))
      
      @scala.inline
      def setMargin(
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
      
      @scala.inline
      def setMarginBottom(
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
      
      @scala.inline
      def setMarginBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]]) | (MarginBottom[Double | String]) | (NonNullable[js.UndefOr[MarginBottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "margin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginLeft(
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
      
      @scala.inline
      def setMarginLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginRight(
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
      
      @scala.inline
      def setMarginRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]]) | (MarginRight[Double | String]) | (NonNullable[js.UndefOr[MarginRight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(
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
      
      @scala.inline
      def setMarginTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]]) | (Margin[Double | String]) | (NonNullable[js.UndefOr[Margin[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMarginX(
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
      
      @scala.inline
      def setMarginXFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      @scala.inline
      def setMarginXVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      @scala.inline
      def setMarginY(
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
      
      @scala.inline
      def setMarginYFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "marginY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      @scala.inline
      def setMarginYVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      @scala.inline
      def setMaxHeight(
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
      
      @scala.inline
      def setMaxHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MaxHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "maxHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MaxHeight[Double | String]]]]) | (MaxHeight[Double | String]) | (NonNullable[js.UndefOr[MaxHeight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      @scala.inline
      def setMaxWidth(
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
      
      @scala.inline
      def setMaxWidthFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MaxWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "maxWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaxWidthVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MaxWidth[Double | String]]]]) | (MaxWidth[Double | String]) | (NonNullable[js.UndefOr[MaxWidth[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      @scala.inline
      def setMb(
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
      
      @scala.inline
      def setMbFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setMbVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]]) | (MarginBottom[Double | String]) | (NonNullable[js.UndefOr[MarginBottom[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      @scala.inline
      def setMinHeight(
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
      
      @scala.inline
      def setMinHeightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MinHeight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "minHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinHeightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MinHeight[Double | String]]]]) | (MinHeight[Double | String]) | (NonNullable[js.UndefOr[MinHeight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      @scala.inline
      def setMinWidth(
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
      
      @scala.inline
      def setMinWidthFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MinWidth[Double | String]) | (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "minWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinWidthVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MinWidth[Double | String]]]]) | (MinWidth[Double | String]) | (NonNullable[js.UndefOr[MinWidth[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      @scala.inline
      def setMl(
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
      
      @scala.inline
      def setMlFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "ml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      @scala.inline
      def setMlVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      @scala.inline
      def setMr(
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
      
      @scala.inline
      def setMrFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      @scala.inline
      def setMrVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]]) | (MarginRight[Double | String]) | (NonNullable[js.UndefOr[MarginRight[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      @scala.inline
      def setMt(
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
      
      @scala.inline
      def setMtFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setMtVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      @scala.inline
      def setMx(
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
      
      @scala.inline
      def setMxFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "mx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      @scala.inline
      def setMxVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]]) | (MarginLeft[Double | String]) | (NonNullable[js.UndefOr[MarginLeft[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      @scala.inline
      def setMy(
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
      
      @scala.inline
      def setMyFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "my", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setMyVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]]) | (MarginTop[Double | String]) | (NonNullable[js.UndefOr[MarginTop[Double | String]]]) | Null
            ])*
      ): Self = StObject.set(x, "my", js.Array(value :_*))
      
      @scala.inline
      def setOrder(
        value: (ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
            ])
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Order | js.Array[NonNullable[js.UndefOr[Order]]]]]
      ): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Order]]] | NonNullable[js.UndefOr[Order]] | Null | Order
            ])*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(
        value: (ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
            ])
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Overflow | js.Array[NonNullable[js.UndefOr[Overflow]]]]]
      ): Self = StObject.set(x, "overflow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverflowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Overflow]]] | NonNullable[js.UndefOr[Overflow]] | Null | Overflow
            ])*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      @scala.inline
      def setP(
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
      
      @scala.inline
      def setPFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "p", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]]) | (NonNullable[js.UndefOr[Padding[Double | String]]]) | Null | (Padding[Double | String])
            ])*
      ): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setPadding(
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
      
      @scala.inline
      def setPaddingBottom(
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
      
      @scala.inline
      def setPaddingBottomFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingBottom[Double | String]]]) | Null | (PaddingBottom[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingLeft(
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
      
      @scala.inline
      def setPaddingLeftFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingRight(
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
      
      @scala.inline
      def setPaddingRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingRight[Double | String]]]) | Null | (PaddingRight[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(
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
      
      @scala.inline
      def setPaddingTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]]) | (NonNullable[js.UndefOr[Padding[Double | String]]]) | Null | (Padding[Double | String])
            ])*
      ): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPaddingX(
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
      
      @scala.inline
      def setPaddingXFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingXVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      @scala.inline
      def setPaddingY(
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
      
      @scala.inline
      def setPaddingYFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "paddingY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setPaddingYVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      @scala.inline
      def setPb(
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
      
      @scala.inline
      def setPbFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      @scala.inline
      def setPbVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingBottom[Double | String]]]) | Null | (PaddingBottom[Double | String])
            ])*
      ): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      @scala.inline
      def setPl(
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
      
      @scala.inline
      def setPlFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPlVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      @scala.inline
      def setPosition(
        value: (ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
            ])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Position | js.Array[NonNullable[js.UndefOr[Position]]]]]
      ): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Position]]] | NonNullable[js.UndefOr[Position]] | Null | Position
            ])*
      ): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setPr(
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
      
      @scala.inline
      def setPrFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      @scala.inline
      def setPrVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingRight[Double | String]]]) | Null | (PaddingRight[Double | String])
            ])*
      ): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      @scala.inline
      def setPt(
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
      
      @scala.inline
      def setPtFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "pt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setPtVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      @scala.inline
      def setPx(
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
      
      @scala.inline
      def setPxFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "px", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      @scala.inline
      def setPxVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingLeft[Double | String]]]) | Null | (PaddingLeft[Double | String])
            ])*
      ): Self = StObject.set(x, "px", js.Array(value :_*))
      
      @scala.inline
      def setPy(
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
      
      @scala.inline
      def setPyFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "py", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      @scala.inline
      def setPyVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]]) | (NonNullable[js.UndefOr[PaddingTop[Double | String]]]) | Null | (PaddingTop[Double | String])
            ])*
      ): Self = StObject.set(x, "py", js.Array(value :_*))
      
      @scala.inline
      def setRight(
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
      
      @scala.inline
      def setRightFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Right[Double | String]) | (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Right[Double | String]]]]) | (NonNullable[js.UndefOr[Right[Double | String]]]) | Null | (Right[Double | String])
            ])*
      ): Self = StObject.set(x, "right", js.Array(value :_*))
      
      @scala.inline
      def setRowGap(
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
      
      @scala.inline
      def setRowGapFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (RowGap[Double | String]) | (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "rowGap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      @scala.inline
      def setRowGapVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[RowGap[Double | String]]]]) | (NonNullable[js.UndefOr[RowGap[Double | String]]]) | Null | (RowGap[Double | String])
            ])*
      ): Self = StObject.set(x, "rowGap", js.Array(value :_*))
      
      @scala.inline
      def setTextAlign(
        value: (ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
            ])
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[TextAlign | js.Array[NonNullable[js.UndefOr[TextAlign]]]]]
      ): Self = StObject.set(x, "textAlign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextAlignVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[TextAlign]]] | NonNullable[js.UndefOr[TextAlign]] | Null | TextAlign
            ])*
      ): Self = StObject.set(x, "textAlign", js.Array(value :_*))
      
      @scala.inline
      def setTextOverflow(
        value: (ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
            ])
      ): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]]]
      ): Self = StObject.set(x, "textOverflow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextOverflowVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[TextOverflow]]] | NonNullable[js.UndefOr[TextOverflow]] | Null | TextOverflow
            ])*
      ): Self = StObject.set(x, "textOverflow", js.Array(value :_*))
      
      @scala.inline
      def setTop(
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
      
      @scala.inline
      def setTopFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Top[Double | String]) | (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "top", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTopVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Top[Double | String]]]]) | (NonNullable[js.UndefOr[Top[Double | String]]]) | Null | (Top[Double | String])
            ])*
      ): Self = StObject.set(x, "top", js.Array(value :_*))
      
      @scala.inline
      def setTypography(
        value: ResponsiveStyleValue[js.UndefOr[String]] | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[String]]])
      ): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[String]]): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      @scala.inline
      def setTypographyVarargs(value: (js.UndefOr[String] | Null)*): Self = StObject.set(x, "typography", js.Array(value :_*))
      
      @scala.inline
      def setVisibility(
        value: (ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]) | (js.Function1[
              /* theme */ Theme, 
              ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
            ])
      ): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[Visibility | js.Array[NonNullable[js.UndefOr[Visibility]]]]]
      ): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setVisibilityVarargs(
        value: (js.UndefOr[
              js.Array[NonNullable[js.UndefOr[Visibility]]] | NonNullable[js.UndefOr[Visibility]] | Null | Visibility
            ])*
      ): Self = StObject.set(x, "visibility", js.Array(value :_*))
      
      @scala.inline
      def setWidth(
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
      
      @scala.inline
      def setWidthFunction1(
        value: /* theme */ Theme => ResponsiveStyleValue[
              js.UndefOr[
                (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])
              ]
            ]
      ): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(
        value: (js.UndefOr[
              (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]]) | (NonNullable[js.UndefOr[Width[Double | String]]]) | Null | (Width[Double | String])
            ])*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
      
      @scala.inline
      def setZIndex(
        value: (ResponsiveStyleValue[js.UndefOr[ZIndex | String]]) | (js.Function1[/* theme */ Theme, ResponsiveStyleValue[js.UndefOr[ZIndex | String]]])
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexFunction1(value: /* theme */ Theme => ResponsiveStyleValue[js.UndefOr[ZIndex | String]]): Self = StObject.set(x, "zIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZIndexVarargs(value: ((js.UndefOr[ZIndex | String]) | Null)*): Self = StObject.set(x, "zIndex", js.Array(value :_*))
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `boxBoxMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = default
}
